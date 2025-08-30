package ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import ui.models.User;

import java.util.Random;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CreateAccountPage extends BasePage {
    private final String RELATIVE_URL = "/index.php?rt=account/create";

    private SelenideElement firstName = $("#AccountFrm_firstname");
    private SelenideElement lastName = $("#AccountFrm_lastname");
    private SelenideElement email = $("#AccountFrm_email");
    private SelenideElement address = $("#AccountFrm_address_1");
    private SelenideElement city = $("#AccountFrm_city");
    private SelenideElement region = $("#AccountFrm_zone_id");
    private SelenideElement zipCode = $("#AccountFrm_postcode");
    private SelenideElement loginName = $("#AccountFrm_loginname");
    private SelenideElement password = $("#AccountFrm_password");
    private SelenideElement confirmPassword = $("#AccountFrm_confirm");
    private SelenideElement agreeButton = $("#AccountFrm_agree");
    private SelenideElement continueButton = $(Selectors.byTitle("Continue"));

    @Override
    public CreateAccountPage open() {
        Selenide.open(RELATIVE_URL);
        return this;
    }

    public CreateAccountPage register(User user) {
        firstName.sendKeys(user.getFirstName());
        lastName.sendKeys(user.getLastName());
        email.sendKeys(user.getEmail());
        address.sendKeys(user.getAddress());
        city.sendKeys(user.getCity());
        region.selectOption(new Random().nextInt(10) + 1);
        zipCode.sendKeys(user.getZipCode());
        loginName.sendKeys(user.getLoginName());
        password.sendKeys(user.getPassword());
        confirmPassword.sendKeys(user.getPassword());
        agreeButton.click();
        continueButton.click();
        return this;
    }

    public CreateAccountPage validate() {
        $(".maintext").shouldHave(text("Your Account Has Been Created!"));
        return this;
    }
}
