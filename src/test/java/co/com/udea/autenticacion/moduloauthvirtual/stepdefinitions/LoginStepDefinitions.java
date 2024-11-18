package co.com.udea.autenticacion.moduloauthvirtual.stepdefinitions;

import co.com.udea.autenticacion.moduloauthvirtual.userinterfaces.LoggedLandingPage;
import co.com.udea.autenticacion.moduloauthvirtual.userinterfaces.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class LoginStepDefinitions {

    private static final int WAIT_TIMEOUT = 3;
    private final Actor actor = Actor.named("Raúl");

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver driver;

    @Before
    public void setup() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_TIMEOUT));
        actor.can(BrowseTheWeb.with(driver));
        setTheStage(new OnlineCast());
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        actor.attemptsTo(
                Open.browserOn().the(LoginPage.class),
                WaitUntil.the(LoginPage.USERNAME_FIELD, isPresent()).forNoMoreThan(Duration.ofSeconds(WAIT_TIMEOUT)),
                WaitUntil.the(LoginPage.PASSWORD_FIELD, isPresent()).forNoMoreThan(Duration.ofSeconds(WAIT_TIMEOUT)),
                Ensure.that(LoginPage.USERNAME_FIELD).isDisplayed(),
                Ensure.that(LoginPage.PASSWORD_FIELD).isDisplayed()
        );
    }

    @When("I login with username {string} and password {string}")
    public void iLoginWithUsernameAndPassword(String password, String username) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginPage.USERNAME_FIELD),
                Enter.theValue(password).into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

    @Then("I should see the dashboard")
    public void iShouldSeeTheDashboard() {
        actor.attemptsTo(
                Ensure.that(LoggedLandingPage.LANDING_USER_PERMISSIONS).isDisplayed()
        );
    }

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
        Ensure.that(LoginPage.INVALID_CREDENTIALS_MESSAGE).isDisplayed();
    }

    @Then("I should see the empty email message")
    public void iShouldSeeTheEmptyEmailMessage() {
        Ensure.that(LoginPage.EMPTY_EMAIL_MESSAGE).isDisplayed();
    }

    @Then("I should see the empty password message")
    public void iShouldSeeTheEmptyPasswordMessage() {
        Ensure.that(LoginPage.EMPTY_PASSWORD_MESSAGE).isDisplayed();
    }
}