# re-build java-client-emitter
cd ../cadl-extension/
# rm -rf node_modules
# rm package-lock.json
npm install
npm run build
npm pack

# re-install
cd ../cadl-project/
rm -rf node_modules
rm package-lock.json
npm install

# delete output
rm -rf cadl-output