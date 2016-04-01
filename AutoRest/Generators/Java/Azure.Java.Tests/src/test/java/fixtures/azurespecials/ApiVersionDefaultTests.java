package fixtures.azurespecials;

import com.microsoft.rest.ServiceResponse;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ApiVersionDefaultTests {
    private static AutoRestAzureSpecialParametersTestClient client;

    @BeforeClass
    public static void setup() {
        client = new AutoRestAzureSpecialParametersTestClientImpl("http://localhost.:3000", null);
    }

    @Test
    public void getMethodGlobalValid() throws Exception {
        ServiceResponse<Void> response = client.apiVersionDefaults().getMethodGlobalValid();
        Assert.assertEquals(200, response.getResponse().code());
    }

    @Test
    public void getMethodGlobalNotProvidedValid() throws Exception {
        ServiceResponse<Void> response = client.apiVersionDefaults().getMethodGlobalNotProvidedValid();
        Assert.assertEquals(200, response.getResponse().code());
    }

    @Test
    public void getPathGlobalValid() throws Exception {
        ServiceResponse<Void> response = client.apiVersionDefaults().getPathGlobalValid();
        Assert.assertEquals(200, response.getResponse().code());
    }

    @Test
    public void getSwaggerGlobalValid() throws Exception {
        ServiceResponse<Void> response = client.apiVersionDefaults().getSwaggerGlobalValid();
        Assert.assertEquals(200, response.getResponse().code());
    }
}
