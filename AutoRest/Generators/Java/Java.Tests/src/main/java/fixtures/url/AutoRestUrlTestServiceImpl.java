/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.url;

import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.AutoRestBaseUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the AutoRestUrlTestService class.
 */
public final class AutoRestUrlTestServiceImpl extends ServiceClient implements AutoRestUrlTestService {
    /**
     * The URL used as the base for all cloud service requests.
     */
    private final AutoRestBaseUrl baseUrl;

    /**
     * Gets the URL used as the base for all cloud service requests.
     *
     * @return The BaseUrl value.
     */
    public AutoRestBaseUrl getBaseUrl() {
        return this.baseUrl;
    }

    /** A string value 'globalItemStringPath' that appears in the path. */
    private String globalStringPath;

    /**
     * Gets A string value 'globalItemStringPath' that appears in the path.
     *
     * @return the globalStringPath value.
     */
    public String getGlobalStringPath() {
        return this.globalStringPath;
    }

    /**
     * Sets A string value 'globalItemStringPath' that appears in the path.
     *
     * @param globalStringPath the globalStringPath value.
     */
    public void setGlobalStringPath(String globalStringPath) {
        this.globalStringPath = globalStringPath;
    }

    /** should contain value null. */
    private String globalStringQuery;

    /**
     * Gets should contain value null.
     *
     * @return the globalStringQuery value.
     */
    public String getGlobalStringQuery() {
        return this.globalStringQuery;
    }

    /**
     * Sets should contain value null.
     *
     * @param globalStringQuery the globalStringQuery value.
     */
    public void setGlobalStringQuery(String globalStringQuery) {
        this.globalStringQuery = globalStringQuery;
    }

    /**
     * Gets the Paths object to access its operations.
     * @return the Paths object.
     */
    public Paths paths() {
        return new PathsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the Queries object to access its operations.
     * @return the Queries object.
     */
    public Queries queries() {
        return new QueriesImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the PathItems object to access its operations.
     * @return the PathItems object.
     */
    public PathItems pathItems() {
        return new PathItemsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Initializes an instance of AutoRestUrlTestService client.
     */
    public AutoRestUrlTestServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestUrlTestService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestUrlTestServiceImpl(String baseUrl) {
        super();
        this.baseUrl = new AutoRestBaseUrl(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestUrlTestService client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building up an {@link OkHttpClient}
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestUrlTestServiceImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder retrofitBuilder) {
        super(clientBuilder, retrofitBuilder);
        this.baseUrl = new AutoRestBaseUrl(baseUrl);
        initialize();
    }

    @Override
    protected void initialize() {
        super.initialize();
        this.retrofitBuilder.baseUrl(baseUrl);
    }
}
