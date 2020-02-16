package utils;

import java.util.ResourceBundle;

public class PropertiesReader {

    private ResourceBundle resourceBundle = ResourceBundle.getBundle("config");

    public String getUrl() {
        return this.resourceBundle.getString("url");
    }

    public String getModuleBy() {
        return this.resourceBundle.getString("moduleBy");
    }

    public String getPageModel() {
        return this.resourceBundle.getString("pageModel");
    }

//    public String getLogin() {
//        return this.resourceBundle.getString("login");
//    }
//
//    public String getPassword() {
//        return this.resourceBundle.getString("password");
//    }
//
//    public String getChromeDriver() {
//        return this.resourceBundle.getString("chrome_driver");
//    }

}
