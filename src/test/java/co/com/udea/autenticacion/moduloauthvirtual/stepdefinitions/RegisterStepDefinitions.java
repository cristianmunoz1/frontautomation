package co.com.udea.autenticacion.moduloauthvirtual.stepdefinitions;

import co.com.udea.autenticacion.moduloauthvirtual.userinterfaces.LoginPage;
import co.com.udea.autenticacion.moduloauthvirtual.userinterfaces.RegisterPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

public class RegisterStepDefinitions {
    private static final int WAIT_TIMEOUT = 3;
    private final Actor actor = Actor.named("Raul");

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver driver;

    @Before
    public void setup() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_TIMEOUT));
        actor.can(BrowseTheWeb.with(driver));
        setTheStage(new OnlineCast());
    }

    @Given("I am on the register page")
    public void iAmOnTheRegisterPage() {
        actor.attemptsTo(
                Open.browserOn().the(RegisterPage.class),
                Ensure.that(RegisterPage.REGISTER_USERNAME_FIELD).isDisplayed(),
                Ensure.that(RegisterPage.REGISTER_PASSWORD_FIELD).isDisplayed(),
                Ensure.that(RegisterPage.REGISTER_CELLPHONE_FIELD).isDisplayed(),
                Ensure.that(RegisterPage.REGISTER_EMAIL_FIELD).isDisplayed(),
                Ensure.that(RegisterPage.REGISTER_PASSWORD_FIELD).isDisplayed(),
                Ensure.that(RegisterPage.REGISTER_TITLE_HEADING).isDisplayed()
        );
    }

    @When("I type the name {string} and phone number {string} and email {string} and password {string} and check the terms and conditions and privacy policy")
    public void iTypeTheNameAndPhoneNumberAndEmailAndPasswordAndCheckTheTermsAndConditionsAndPrivacyPolicy(String username, String cellphone, String email, String password) {
        actor.attemptsTo(
                Enter.theValue(username).into(RegisterPage.REGISTER_USERNAME_FIELD),
                Enter.theValue(cellphone).into(RegisterPage.REGISTER_CELLPHONE_FIELD),
                Enter.theValue(email).into(RegisterPage.REGISTER_EMAIL_FIELD),
                Enter.theValue(password).into(RegisterPage.REGISTER_PASSWORD_FIELD),
                Click.on(RegisterPage.REGISTER_TERMS_CHECK),
                Click.on(RegisterPage.REGISTER_POLITICS_CHECK),

                Click.on(RegisterPage.REGISTER_SUBMIT_BUTTON)
        );
    }

    @Then("I should see the correct register alert")
    public void iShouldSeeTheCorrectRegisterAlert() {
        String expectedMessage = "La información se ha guardado correctamente.";
        Target registerMessage = Target.the("Message information").locatedBy("/html/body/div[4]/div[1]/p");

        String actualError =registerMessage.resolveFor(actor).getText();
        assertEquals(expectedMessage, actualError);
    }

    @Then("I should see the incorrect register alert")
    public void iShouldSeeTheIncorrectRegisterAlert() {
        String expectedMessage = "Ocurrió un error al guardar la información. Por favor, intente nuevamente.";
        Target registerMessage = Target.the("Message information").locatedBy("/html/body/div[4]/div[1]/p");

        String actualError =registerMessage.resolveFor(actor).getText();
        assertEquals(expectedMessage, actualError);
    }
}
