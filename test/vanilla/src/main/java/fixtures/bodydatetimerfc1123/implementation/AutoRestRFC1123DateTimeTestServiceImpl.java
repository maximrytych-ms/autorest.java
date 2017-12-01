/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydatetimerfc1123.implementation;

import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceClient;
import com.microsoft.rest.v2.http.HttpPipeline;
import fixtures.bodydatetimerfc1123.AutoRestRFC1123DateTimeTestService;
import fixtures.bodydatetimerfc1123.Datetimerfc1123s;

/**
 * Initializes a new instance of the AutoRestRFC1123DateTimeTestService class.
 */
public class AutoRestRFC1123DateTimeTestServiceImpl extends ServiceClient implements AutoRestRFC1123DateTimeTestService {

    /**
     * The Datetimerfc1123s object to access its operations.
     */
    private Datetimerfc1123s datetimerfc1123s;

    /**
     * Gets the Datetimerfc1123s object to access its operations.
     *
     * @return the Datetimerfc1123s object.
     */
    public Datetimerfc1123s datetimerfc1123s() {
        return this.datetimerfc1123s;
    }

    /**
     * Initializes an instance of AutoRestRFC1123DateTimeTestService client.
     */
    public AutoRestRFC1123DateTimeTestServiceImpl() {
        this(RestProxy.createDefaultPipeline());
    }

    /**
     * Initializes an instance of AutoRestRFC1123DateTimeTestService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AutoRestRFC1123DateTimeTestServiceImpl(HttpPipeline httpPipeline) {
        super(httpPipeline);

        this.datetimerfc1123s = new Datetimerfc1123sImpl(this);
    }
}
