package api;

import org.testng.annotations.Test;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

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
        System.out.println(requestID.nameConverter("/Contract"));
        System.out.println(requestID.nameConverter("ContractId"));
    }

    @Test
    public void testCreateMapFields() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        RequestID requestID = new RequestID();
        requestID.setField("accountId", "hola");
        requestID.setField("assetId", "AssetAsset");
        requestID.setField("contactId", "Contacto123");
        Map myMap = requestID.createMapFields();
        System.out.println(myMap);
        Map map2 = new HashMap();
        map2.put("CrisMotin", true);
        Map map3 = new HashMap(myMap);
        map3.putAll(map2);
        System.out.println(map3);
    }
}