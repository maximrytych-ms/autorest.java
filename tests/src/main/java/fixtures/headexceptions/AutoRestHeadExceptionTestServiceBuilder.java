package fixtures.headexceptions;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.implementation.RestProxy;

/**
 * A builder for creating a new instance of the AutoRestHeadExceptionTestService type.
 */
@ServiceClientBuilder(serviceClients = AutoRestHeadExceptionTestService.class)
public final class AutoRestHeadExceptionTestServiceBuilder {
    /*
     * http://localhost:3000
     */
    private String host;

    /**
     * Sets http://localhost:3000.
     * 
     * @param host the host value.
     * @return the AutoRestHeadExceptionTestServiceBuilder.
     */
    public AutoRestHeadExceptionTestServiceBuilder host(String host) {
        this.host = host;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     * 
     * @param pipeline the pipeline value.
     * @return the AutoRestHeadExceptionTestServiceBuilder.
     */
    public AutoRestHeadExceptionTestServiceBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of AutoRestHeadExceptionTestService with the provided parameters.
     * 
     * @return an instance of AutoRestHeadExceptionTestService.
     */
    public AutoRestHeadExceptionTestService build() {
        if (host == null) {
            this.host = "http://localhost:3000";
        }
        if (pipeline == null) {
            this.pipeline = RestProxy.createDefaultPipeline();
        }
        AutoRestHeadExceptionTestService client = new AutoRestHeadExceptionTestService(pipeline);
        if (this.host != null) {
            client.setHost(this.host);
        }
        return client;
    }
}
