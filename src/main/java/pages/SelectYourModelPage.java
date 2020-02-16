package pages;

import org.openqa.selenium.WebDriver;
import utils.PropertiesReader;

public class SelectYourModelPage extends BasePage {

    public SelectYourModelPage(WebDriver driver) {
        super(driver);
    }
    private PropertiesReader propertiesReader = new PropertiesReader();

    public SelectYourModelPage goToSelectYourModelPage() {
        getDriver().get(propertiesReader.getUrl() + propertiesReader.getModuleBy() + propertiesReader.getPageModel());
        return this;
    }

}
