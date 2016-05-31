// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.PetstoreV2AllSync
{
    using System;
    using System.Collections.Generic;
    using System.Net.Http;
    using System.Threading;
    using System.Threading.Tasks;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Models;

    /// <summary>
    /// This is a sample server Petstore server.  You can find out more about
    /// Swagger at &lt;a
    /// href="http://swagger.io"&gt;http://swagger.io&lt;/a&gt; or on
    /// irc.freenode.net, #swagger.  For this sample, you can use the api key
    /// "special-key" to test the authorization filters
    /// </summary>
    public partial interface ISwaggerPetstoreV2 : IDisposable
    {
        /// <summary>
        /// The base URI of the service.
        /// </summary>
        Uri BaseUri { get; set; }

        /// <summary>
        /// Gets or sets json serialization settings.
        /// </summary>
        JsonSerializerSettings SerializationSettings { get; }

        /// <summary>
        /// Gets or sets json deserialization settings.
        /// </summary>
        JsonSerializerSettings DeserializationSettings { get; }


            /// <summary>
        /// Add a new pet to the store
        /// </summary>
        /// <param name='body'>
        /// Pet object that needs to be added to the store
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse<Pet>> AddPetWithHttpMessagesAsync(Pet body, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Update an existing pet
        /// </summary>
        /// <param name='body'>
        /// Pet object that needs to be added to the store
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> UpdatePetWithHttpMessagesAsync(Pet body, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Finds Pets by status
        /// </summary>
        /// Multiple status values can be provided with comma seperated strings
        /// <param name='status'>
        /// Status values that need to be considered for filter
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse<IList<Pet>>> FindPetsByStatusWithHttpMessagesAsync(IList<string> status, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Finds Pets by tags
        /// </summary>
        /// Muliple tags can be provided with comma seperated strings. Use
        /// tag1, tag2, tag3 for testing.
        /// <param name='tags'>
        /// Tags to filter by
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse<IList<Pet>>> FindPetsByTagsWithHttpMessagesAsync(IList<string> tags, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Find pet by Id
        /// </summary>
        /// Returns a single pet
        /// <param name='petId'>
        /// Id of pet to return
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse<Pet>> GetPetByIdWithHttpMessagesAsync(long petId, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Updates a pet in the store with form data
        /// </summary>
        /// <param name='petId'>
        /// Id of pet that needs to be updated
        /// </param>
        /// <param name='fileContent'>
        /// File to upload.
        /// </param>
        /// <param name='fileName'>
        /// Updated name of the pet
        /// </param>
        /// <param name='status'>
        /// Updated status of the pet
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> UpdatePetWithFormWithHttpMessagesAsync(long petId, System.IO.Stream fileContent, string fileName = default(string), string status = default(string), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Deletes a pet
        /// </summary>
        /// <param name='petId'>
        /// Pet id to delete
        /// </param>
        /// <param name='apiKey'>
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> DeletePetWithHttpMessagesAsync(long petId, string apiKey = "", Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Returns pet inventories by status
        /// </summary>
        /// Returns a map of status codes to quantities
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse<IDictionary<string, int?>>> GetInventoryWithHttpMessagesAsync(Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Place an order for a pet
        /// </summary>
        /// <param name='body'>
        /// order placed for purchasing the pet
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse<Order>> PlaceOrderWithHttpMessagesAsync(Order body, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Find purchase order by Id
        /// </summary>
        /// For valid response try integer IDs with value &lt;= 5 or &gt; 10.
        /// Other values will generated exceptions
        /// <param name='orderId'>
        /// Id of pet that needs to be fetched
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse<Order>> GetOrderByIdWithHttpMessagesAsync(string orderId, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Delete purchase order by Id
        /// </summary>
        /// For valid response try integer IDs with value &lt; 1000. Anything
        /// above 1000 or nonintegers will generate API errors
        /// <param name='orderId'>
        /// Id of the order that needs to be deleted
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> DeleteOrderWithHttpMessagesAsync(string orderId, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Create user
        /// </summary>
        /// This can only be done by the logged in user.
        /// <param name='body'>
        /// Created user object
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> CreateUserWithHttpMessagesAsync(User body, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Creates list of users with given input array
        /// </summary>
        /// <param name='body'>
        /// List of user object
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> CreateUsersWithArrayInputWithHttpMessagesAsync(IList<User> body, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Creates list of users with given input array
        /// </summary>
        /// <param name='body'>
        /// List of user object
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> CreateUsersWithListInputWithHttpMessagesAsync(IList<User> body, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Logs user into the system
        /// </summary>
        /// <param name='username'>
        /// The user name for login
        /// </param>
        /// <param name='password'>
        /// The password for login in clear text
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse<string,LoginUserHeaders>> LoginUserWithHttpMessagesAsync(string username, string password, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Logs out current logged in user session
        /// </summary>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> LogoutUserWithHttpMessagesAsync(Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Get user by user name
        /// </summary>
        /// <param name='username'>
        /// The name that needs to be fetched. Use user1 for testing.
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse<User>> GetUserByNameWithHttpMessagesAsync(string username, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Updated user
        /// </summary>
        /// This can only be done by the logged in user.
        /// <param name='username'>
        /// name that need to be deleted
        /// </param>
        /// <param name='body'>
        /// Updated user object
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> UpdateUserWithHttpMessagesAsync(string username, User body, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Delete user
        /// </summary>
        /// This can only be done by the logged in user.
        /// <param name='username'>
        /// The name that needs to be deleted
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse> DeleteUserWithHttpMessagesAsync(string username, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

    }
}
