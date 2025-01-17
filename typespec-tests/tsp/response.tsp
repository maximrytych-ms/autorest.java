import "@typespec/rest";
import "@azure-tools/typespec-azure-core";
import "@azure-tools/typespec-client-generator-core";

using TypeSpec.Http;
using TypeSpec.Rest;
using TypeSpec.Versioning;
using Azure.Core;
using Azure.Core.Traits;
using Azure.ClientGenerator.Core;

@service({
  title: "Response",
  version: "1.0.0",
})
@useDependency(Azure.Core.Versions.v1_0_Preview_2)
namespace Cadl.Response;

@resource("resources")
model Resource {
  @visibility("read")
  id: string;

  @key
  @visibility("read")
  name: string;
  description?: string;
  type: string;
}

model ResourceArray is Resource[];

interface ResourceOperations
  extends Azure.Core.ResourceOperations<NoRepeatableRequests & NoConditionalRequests & NoClientRequestId> {}

// operation using Azure.Core
@Azure.ClientGenerator.Core.client({
  name: "CoreClient",
  service: Cadl.Response,
})
@route("/cadl-core")
@doc("Cadl Core")
interface CadlCoreOp {
  @doc("Creates a new resource or updates an existing one.")
  createOrUpdate is ResourceOperations.ResourceCreateOrReplace<Resource>;

  @doc("Gets the details of a resource.")
  get is ResourceOperations.ResourceRead<Resource>;

  @doc("Deletes a resource.")
  delete is ResourceOperations.ResourceDelete<Resource>;

  @doc("Lists the existing resources.")
  list is ResourceOperations.ResourceList<Resource>;
}

@Azure.ClientGenerator.Core.client({
  name: "ResponseClient",
  service: Cadl.Response,
})
@doc("Response")
@route("/response")
interface ResponseOp {
  // binary
  @route("/get-binary")
  @get
  getBinary(): OkResponse & {
    @header("content-type") contentType: "image/png";
    @body body: bytes;
  };

  @route("/get-array")
  getArray(): ResourceArray;

  @route("/get-another-array")
  getAnotherArray(): ResourceArray;

  // response with headers
  @route("/create-with-headers")
  @put
  createWithHeaders(): CreatedResponse & {
    @header("operation-location")
    operationLocation: ResourceLocation<Resource>;

    @body
    body: Resource;
  };

  @route("/delete-with-headers")
  @delete
  deleteWithHeaders(): NoContentResponse & {
    @header("operation-location")
    operationLocation: ResourceLocation<Resource>;
  };
}
