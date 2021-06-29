package configfile;

import static configfile.Configuration.dotenv;

public enum Setup {
    SETUP_AUTHORIZATION(dotenv.get("SETUP_AUTHORIZATION")),
    BASE_URL(dotenv.get("BASE_URL")),
    AUTH_URL(dotenv.get("AUTH_URL")),
    SETUP_OAUTH_TOKEN(dotenv.get("SETUP_OAUTH_TOKEN")),
    GRANT_TYPE(dotenv.get("GRANT_TYPE")),
    PASSWORD(dotenv.get("PASSWORD")),
    SETUP_CLIENT_ID(dotenv.get("SETUP_CLIENT_ID")),
    SETUP_CLIENT_SECRET(dotenv.get("SETUP_CLIENT_SECRET")),
    SETUP_USERNAME(dotenv.get("SETUP_USERNAME")),
    SETUP_PASSWORD(dotenv.get("SETUP_PASSWORD")),
    ACCEPT(dotenv.get("ACCEPT")),
    APPLICATION_JSON(dotenv.get("APPLICATION_JSON")),
    CONTENT_TYPE(dotenv.get("CONTENT_TYPE")),
    APPLICATION_WWW_FORM(dotenv.get("APPLICATION_WWW_FORM")),
    TOKEN_TYPE(dotenv.get("TOKEN_TYPE")),
    ACCESS_TOKEN(dotenv.get("ACCESS_TOKEN")),
    CLIENT_ID(dotenv.get("CLIENT_ID")),
    CLIENT_SECRET(dotenv.get("CLIENT_SECRET")),
    SALESFORCE_USERNAME(dotenv.get("SALESFORCE_USERNAME")),
    PASSWORD_TOKEN(dotenv.get("PASSWORD_TOKEN"));

    private String name;

    Setup(String name) {
        this.name =  name;
    }

    public String toName() {
        return name;
    }

}
