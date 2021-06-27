package api;

import org.testng.annotations.Test;
import java.lang.reflect.InvocationTargetException;

public class RequestIDTest {

    @Test
    public void testSetAllFields() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        RequestID requestID = new RequestID();
        requestID.setField("accountId", "hola");
        System.out.println(requestID.getAccountId());
        requestID.setField("assetId", "AssetAsset");
        System.out.println(requestID.getAssetId());
        requestID.setField(requestID.nameConverter("/Account"), "Super Super");
        System.out.println(requestID.getField(requestID.nameConverter("/Account")));
    }

    @Test
    public void testNameConverter() {
        RequestID requestID = new RequestID();
        System.out.println(requestID.nameConverter("/Account"));
        System.out.println(requestID.nameConverter("AccountId"));
        System.out.println(requestID.nameConverter("/Asset"));
        System.out.println(requestID.nameConverter("AssetId"));
    }
}