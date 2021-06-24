package asset;

import api.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.ResponseObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssetTest extends AssetBaseTest{

    @Test(groups = {"createAsset", "deleteAsset"})
    public void getAssetTest() {
        requestBuilder
                .addEndpoint("/Asset/{assetID}")
                .addPathParams("assetID", responseObject.getId())
                .addMethod(ApiMethod.GET)
                .build();
        apiResponse = ApiManager.execute(requestBuilder.build());
        Assert.assertEquals(apiResponse.getStatusCode(), 200);
    }

    @Test(groups = {"createAsset", "deleteAsset"})
    public void updateAAssetTest() throws JsonProcessingException {
        assetToSend.setName("asset name from java updated");
        requestBuilder
                .addEndpoint("/Asset/{assetID}")
                .addPathParams("assetID", responseObject.getId())
                .addBody(new ObjectMapper().writeValueAsString(assetToSend))
                .addMethod(ApiMethod.PATCH)
                .build();
        ApiResponse apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        Assert.assertEquals(apiResponse.getStatusCode(), 204);
    }

    @Test(groups = "createAsset")
    public void deleteAAsset() {
        requestBuilder
                .addEndpoint("/Asset/{assetID}")
                .addPathParams("assetID", responseObject.getId())
                .addMethod(ApiMethod.DELETE)
                .build();
        apiResponse = ApiManager.execute(requestBuilder.build());
        Assert.assertEquals(apiResponse.getStatusCode(), 204);
    }

    @Test(groups = {"createAccount", "deleteAsset"})
    public void createAAssetTest() throws JsonProcessingException {
        assetToSend.setAccountId(responseObject.getId());
        assetToSend.setName("asset name from java");
        requestBuilder
                .addEndpoint("/Asset/")
                .addBody(new ObjectMapper().writeValueAsString(assetToSend))
                .addMethod(ApiMethod.POST)
                .build();
        ApiResponse apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        responseObject = apiResponse.getBody(ResponseObject.class);
        Assert.assertEquals(apiResponse.getStatusCode(), 201);
    }
}
