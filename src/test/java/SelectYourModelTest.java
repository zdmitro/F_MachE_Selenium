import org.testng.annotations.Test;
import pages.SelectYourModelPage;

public class SelectYourModelTest extends BaseTest {

    @Test
    public void validateSelectYourModelPage() {
        SelectYourModelPage selectYourModelPage = new SelectYourModelPage(getDriver());

        selectYourModelPage
                .goToSelectYourModelPage();
    }
}
