package configfile;

import static configfile.Configuration.dotenv;

public enum Params {
    PARAM_ACCOUNT_ID(dotenv.get("PARAM_ACCOUNT_ID")),
    PARAM_ASSET_ID(dotenv.get("PARAM_ASSET_ID")),
    PARAM_CONTACT_ID(dotenv.get("PARAM_CONTACT_ID")),
    PARAM_CONTRACT_ID(dotenv.get("PARAM_CONTRACT_ID")),
    PARAM_ORDER_ID(dotenv.get("PARAM_ORDER_ID"));

    private String name;

    Params(String name) {
        this.name =  name;
    }

    public String toName() {
        return name;
    }

}
