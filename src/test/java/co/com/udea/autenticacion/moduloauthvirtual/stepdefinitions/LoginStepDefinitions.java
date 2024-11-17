package co.com.udea.autenticacion.moduloauthvirtual.stepdefinitions;

import co.com.udea.autenticacion.moduloauthvirtual.tasks.Login;
import co.com.udea.autenticacion.moduloauthvirtual.tasks.NavigateToLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.udea.autenticacion.moduloauthvirtual.userinterfaces.LoggedLandingPage.LANDING_USER_PERMISSIONS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinitions {
    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() {
        OnStage.theActorCalled("user").attemptsTo(
                NavigateToLogin.onThePage()
        );
    }

    @When("^I login with username \"(.*)\" and password \"(.*)\"$")
    public void iLoginWithCredentials(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.using(username, password)
        );
    }

    @Then("^I should see the dashboard$")
    public void iShouldSeeDashboard() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(TheLandingPage.hasUserPermissionsLink())
        );
    }
}