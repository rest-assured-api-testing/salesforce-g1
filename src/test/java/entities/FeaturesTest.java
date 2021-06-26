package entities;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

public class FeaturesTest {

    @Test
    public void testSetAllFields() {
        Account account = new Account();
        String jsonTest = "{\"city\":\"Chicago\",\"country\":\"United States\",\"state\":\"Chicago\"}";
        Map map = new HashMap();
        map.put("isDeleted", "false");
        map.put("annualRevenue", "1.0");
        map.put("numberOfEmployees", "1");
        map.put("name", "Prueba");
        map.put("billingAddress", jsonTest);
        account.setAllFields(map);
        System.out.println(account.getIsDeleted());
        System.out.println(account.getAnnualRevenue());
        System.out.println(account.getNumberOfEmployees());
        System.out.println(account.getName());
        System.out.println(account.getBillingAddress().toString());
    }
}