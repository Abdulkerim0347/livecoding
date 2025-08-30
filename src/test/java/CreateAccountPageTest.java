import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ui.models.User;
import ui.pages.CreateAccountPage;

public class CreateAccountPageTest {
    @BeforeAll
    public static void setup() {
        Configuration.baseUrl = "https://automationteststore.com";
    }

    @Test
    public void userCanCreateAccountWithValidDataTest() {
        User user = User.generate();
        new CreateAccountPage().open()
                .register(user).validate();
    }
}
