import "@typespec/rest";
import "@azure-tools/typespec-azure-core";

using TypeSpec.Http;
using TypeSpec.Rest;
using TypeSpec.Versioning;
using Azure.Core;

@service({
  title: "Odata",
  version: "1.0.0",
})
@useDependency(Azure.Core.Versions.v1_0_Preview_2)
namespace Cadl.Odata;

@resource("resources")
model Resource {
  @visibility("read")
  id: string;

  @key
  @visibility("read")
  name: string;
  type: string;
}

model ResourceCollection is Page<Resource>;

@route("/odata")
interface OdataOp {
  list(
    @query filter?: string,
    @query orderby?: string,
    @query skip?: int32,
    @query top?: int32,
    @query maxpagesize?: int32,

    @query({
      format: "csv",
    })
    select?: string[],

    @query({
      format: "csv",
    })
    expand?: string[]
  ): ResourceCollection;
}
