/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.requiredoptional;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.requiredoptional.models.ArrayOptionalWrapper;
import fixtures.requiredoptional.models.ArrayWrapper;
import fixtures.requiredoptional.models.ClassOptionalWrapper;
import fixtures.requiredoptional.models.ClassWrapper;
import fixtures.requiredoptional.models.Error;
import fixtures.requiredoptional.models.ErrorException;
import fixtures.requiredoptional.models.IntOptionalWrapper;
import fixtures.requiredoptional.models.IntWrapper;
import fixtures.requiredoptional.models.Product;
import fixtures.requiredoptional.models.StringOptionalWrapper;
import fixtures.requiredoptional.models.StringWrapper;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in Explicits.
 */
public interface Explicits {
    /**
     * Test explicitly required integer. Please put null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the int value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> postRequiredIntegerParameter(int bodyParameter) throws ErrorException, IOException;

    /**
     * Test explicitly required integer. Please put null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postRequiredIntegerParameterAsync(int bodyParameter, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly optional integer. Please put null.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalIntegerParameter() throws ErrorException, IOException;

    /**
     * Test explicitly optional integer. Please put null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalIntegerParameterAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Test explicitly optional integer. Please put null.
     *
     * @param bodyParameter the Integer value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalIntegerParameter(Integer bodyParameter) throws ErrorException, IOException;

    /**
     * Test explicitly optional integer. Please put null.
     *
     * @param bodyParameter the Integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalIntegerParameterAsync(Integer bodyParameter, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly required integer. Please put a valid int-wrapper with 'value' = null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the IntWrapper value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> postRequiredIntegerProperty(IntWrapper bodyParameter) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Test explicitly required integer. Please put a valid int-wrapper with 'value' = null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the IntWrapper value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postRequiredIntegerPropertyAsync(IntWrapper bodyParameter, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly optional integer. Please put a valid int-wrapper with 'value' = null.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalIntegerProperty() throws ErrorException, IOException;

    /**
     * Test explicitly optional integer. Please put a valid int-wrapper with 'value' = null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalIntegerPropertyAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Test explicitly optional integer. Please put a valid int-wrapper with 'value' = null.
     *
     * @param bodyParameter the IntOptionalWrapper value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalIntegerProperty(IntOptionalWrapper bodyParameter) throws ErrorException, IOException;

    /**
     * Test explicitly optional integer. Please put a valid int-wrapper with 'value' = null.
     *
     * @param bodyParameter the IntOptionalWrapper value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalIntegerPropertyAsync(IntOptionalWrapper bodyParameter, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly required integer. Please put a header 'headerParameter' =&gt; null and the client library should throw before the request is sent.
     *
     * @param headerParameter the int value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> postRequiredIntegerHeader(int headerParameter) throws ErrorException, IOException;

    /**
     * Test explicitly required integer. Please put a header 'headerParameter' =&gt; null and the client library should throw before the request is sent.
     *
     * @param headerParameter the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postRequiredIntegerHeaderAsync(int headerParameter, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly optional integer. Please put a header 'headerParameter' =&gt; null.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalIntegerHeader() throws ErrorException, IOException;

    /**
     * Test explicitly optional integer. Please put a header 'headerParameter' =&gt; null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalIntegerHeaderAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Test explicitly optional integer. Please put a header 'headerParameter' =&gt; null.
     *
     * @param headerParameter the Integer value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalIntegerHeader(Integer headerParameter) throws ErrorException, IOException;

    /**
     * Test explicitly optional integer. Please put a header 'headerParameter' =&gt; null.
     *
     * @param headerParameter the Integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalIntegerHeaderAsync(Integer headerParameter, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly required string. Please put null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the String value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> postRequiredStringParameter(String bodyParameter) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Test explicitly required string. Please put null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postRequiredStringParameterAsync(String bodyParameter, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly optional string. Please put null.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalStringParameter() throws ErrorException, IOException;

    /**
     * Test explicitly optional string. Please put null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalStringParameterAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Test explicitly optional string. Please put null.
     *
     * @param bodyParameter the String value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalStringParameter(String bodyParameter) throws ErrorException, IOException;

    /**
     * Test explicitly optional string. Please put null.
     *
     * @param bodyParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalStringParameterAsync(String bodyParameter, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly required string. Please put a valid string-wrapper with 'value' = null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the StringWrapper value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> postRequiredStringProperty(StringWrapper bodyParameter) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Test explicitly required string. Please put a valid string-wrapper with 'value' = null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the StringWrapper value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postRequiredStringPropertyAsync(StringWrapper bodyParameter, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly optional integer. Please put a valid string-wrapper with 'value' = null.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalStringProperty() throws ErrorException, IOException;

    /**
     * Test explicitly optional integer. Please put a valid string-wrapper with 'value' = null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalStringPropertyAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Test explicitly optional integer. Please put a valid string-wrapper with 'value' = null.
     *
     * @param bodyParameter the StringOptionalWrapper value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalStringProperty(StringOptionalWrapper bodyParameter) throws ErrorException, IOException;

    /**
     * Test explicitly optional integer. Please put a valid string-wrapper with 'value' = null.
     *
     * @param bodyParameter the StringOptionalWrapper value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalStringPropertyAsync(StringOptionalWrapper bodyParameter, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly required string. Please put a header 'headerParameter' =&gt; null and the client library should throw before the request is sent.
     *
     * @param headerParameter the String value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> postRequiredStringHeader(String headerParameter) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Test explicitly required string. Please put a header 'headerParameter' =&gt; null and the client library should throw before the request is sent.
     *
     * @param headerParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postRequiredStringHeaderAsync(String headerParameter, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly optional string. Please put a header 'headerParameter' =&gt; null.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalStringHeader() throws ErrorException, IOException;

    /**
     * Test explicitly optional string. Please put a header 'headerParameter' =&gt; null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalStringHeaderAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Test explicitly optional string. Please put a header 'headerParameter' =&gt; null.
     *
     * @param bodyParameter the String value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalStringHeader(String bodyParameter) throws ErrorException, IOException;

    /**
     * Test explicitly optional string. Please put a header 'headerParameter' =&gt; null.
     *
     * @param bodyParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalStringHeaderAsync(String bodyParameter, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly required complex object. Please put null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the Product value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> postRequiredClassParameter(Product bodyParameter) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Test explicitly required complex object. Please put null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the Product value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postRequiredClassParameterAsync(Product bodyParameter, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly optional complex object. Please put null.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalClassParameter() throws ErrorException, IOException;

    /**
     * Test explicitly optional complex object. Please put null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalClassParameterAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Test explicitly optional complex object. Please put null.
     *
     * @param bodyParameter the Product value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalClassParameter(Product bodyParameter) throws ErrorException, IOException;

    /**
     * Test explicitly optional complex object. Please put null.
     *
     * @param bodyParameter the Product value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalClassParameterAsync(Product bodyParameter, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly required complex object. Please put a valid class-wrapper with 'value' = null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the ClassWrapper value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> postRequiredClassProperty(ClassWrapper bodyParameter) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Test explicitly required complex object. Please put a valid class-wrapper with 'value' = null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the ClassWrapper value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postRequiredClassPropertyAsync(ClassWrapper bodyParameter, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly optional complex object. Please put a valid class-wrapper with 'value' = null.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalClassProperty() throws ErrorException, IOException;

    /**
     * Test explicitly optional complex object. Please put a valid class-wrapper with 'value' = null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalClassPropertyAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Test explicitly optional complex object. Please put a valid class-wrapper with 'value' = null.
     *
     * @param bodyParameter the ClassOptionalWrapper value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalClassProperty(ClassOptionalWrapper bodyParameter) throws ErrorException, IOException;

    /**
     * Test explicitly optional complex object. Please put a valid class-wrapper with 'value' = null.
     *
     * @param bodyParameter the ClassOptionalWrapper value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalClassPropertyAsync(ClassOptionalWrapper bodyParameter, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly required array. Please put null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the List&lt;String&gt; value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> postRequiredArrayParameter(List<String> bodyParameter) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Test explicitly required array. Please put null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postRequiredArrayParameterAsync(List<String> bodyParameter, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly optional array. Please put null.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalArrayParameter() throws ErrorException, IOException;

    /**
     * Test explicitly optional array. Please put null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalArrayParameterAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Test explicitly optional array. Please put null.
     *
     * @param bodyParameter the List&lt;String&gt; value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalArrayParameter(List<String> bodyParameter) throws ErrorException, IOException;

    /**
     * Test explicitly optional array. Please put null.
     *
     * @param bodyParameter the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalArrayParameterAsync(List<String> bodyParameter, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly required array. Please put a valid array-wrapper with 'value' = null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the ArrayWrapper value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> postRequiredArrayProperty(ArrayWrapper bodyParameter) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Test explicitly required array. Please put a valid array-wrapper with 'value' = null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the ArrayWrapper value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postRequiredArrayPropertyAsync(ArrayWrapper bodyParameter, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly optional array. Please put a valid array-wrapper with 'value' = null.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalArrayProperty() throws ErrorException, IOException;

    /**
     * Test explicitly optional array. Please put a valid array-wrapper with 'value' = null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalArrayPropertyAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Test explicitly optional array. Please put a valid array-wrapper with 'value' = null.
     *
     * @param bodyParameter the ArrayOptionalWrapper value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalArrayProperty(ArrayOptionalWrapper bodyParameter) throws ErrorException, IOException;

    /**
     * Test explicitly optional array. Please put a valid array-wrapper with 'value' = null.
     *
     * @param bodyParameter the ArrayOptionalWrapper value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalArrayPropertyAsync(ArrayOptionalWrapper bodyParameter, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly required array. Please put a header 'headerParameter' =&gt; null and the client library should throw before the request is sent.
     *
     * @param headerParameter the List&lt;String&gt; value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> postRequiredArrayHeader(List<String> headerParameter) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Test explicitly required array. Please put a header 'headerParameter' =&gt; null and the client library should throw before the request is sent.
     *
     * @param headerParameter the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postRequiredArrayHeaderAsync(List<String> headerParameter, final ServiceCallback<Error> serviceCallback) throws IllegalArgumentException;

    /**
     * Test explicitly optional integer. Please put a header 'headerParameter' =&gt; null.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalArrayHeader() throws ErrorException, IOException;

    /**
     * Test explicitly optional integer. Please put a header 'headerParameter' =&gt; null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalArrayHeaderAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;
    /**
     * Test explicitly optional integer. Please put a header 'headerParameter' =&gt; null.
     *
     * @param headerParameter the List&lt;String&gt; value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> postOptionalArrayHeader(List<String> headerParameter) throws ErrorException, IOException;

    /**
     * Test explicitly optional integer. Please put a header 'headerParameter' =&gt; null.
     *
     * @param headerParameter the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postOptionalArrayHeaderAsync(List<String> headerParameter, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

}
