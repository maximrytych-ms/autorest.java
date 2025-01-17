import { readFile, writeFile } from "fs/promises";
import pacote from "pacote";

const knownPackages = [
  "@typespec/compiler",
  "@typespec/rest",
  "@typespec/http",
  "@typespec/versioning",
  "@azure-tools/typespec-client-generator-core",
  "@azure-tools/typespec-azure-core",
  "@typespec/eslint-config-typespec",
];

async function getKnownPackageVersion(packageName) {
  return (await pacote.manifest(`${packageName}@next`)).version;
}

async function main() {
  const packageToVersionRecord = Object.fromEntries(
    await Promise.all(knownPackages.map(async (x) => [x, await getKnownPackageVersion(x)])),
  );
  // eslint-disable-next-line no-console
  console.log("The following is a mapping between packages and the versions we will update them to");
  // eslint-disable-next-line no-console
  console.log(packageToVersionRecord);
  const packageJsonPaths = process.argv.slice(2);
  for (const packageJsonPath of packageJsonPaths) {
    const content = await readFile(packageJsonPath);
    const packageJson = JSON.parse(content.toString());
    const depTypes = ["dependencies", "devDependencies", "peerDependencies", "overrides"];
    for (const depType of depTypes) {
      const deps = packageJson[depType];
      if (deps === undefined) continue;
      for (const dep of Object.keys(deps)) {
        if (packageToVersionRecord[dep] !== undefined) {
          deps[dep] = packageToVersionRecord[dep];
        }
      }
    }
    // eslint-disable-next-line no-console
    console.log(`Updated ${packageJsonPath}`);
    await writeFile(packageJsonPath, JSON.stringify(packageJson, null, 2));
  }
}

main().catch((error) => {
  // eslint-disable-next-line no-console
  console.log("Error", error);
  process.exit(1);
});
