package configfile;

import static configfile.Configuration.dotenv;

public enum EndPoints {
    ENDPOINT_ACCOUNTS(dotenv.get("ENDPOINT_ACCOUNTS")),
    ENDPOINT_ACCOUNT(dotenv.get("ENDPOINT_ACCOUNT")),
    ENDPOINT_ASSETS(dotenv.get("ENDPOINT_ASSETS")),
    ENDPOINT_ASSET(dotenv.get("ENDPOINT_ASSET")),
    ENDPOINT_CONTACTS(dotenv.get("ENDPOINT_CONTACTS")),
    ENDPOINT_CONTACT(dotenv.get("ENDPOINT_CONTACT")),
    ENDPOINT_CONTRACTS(dotenv.get("ENDPOINT_CONTRACTS")),
    ENDPOINT_CONTRACT(dotenv.get("ENDPOINT_CONTRACT")),
    ENDPOINT_ORDERS(dotenv.get("ENDPOINT_ORDERS")),
    ENDPOINT_ORDER(dotenv.get("ENDPOINT_ORDER"));

    private String name;

    EndPoints(String name) {
        this.name =  name;
    }

    public String toName() {
        return name;
    }
}
