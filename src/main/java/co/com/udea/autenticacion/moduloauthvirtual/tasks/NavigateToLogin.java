package co.com.udea.autenticacion.moduloauthvirtual.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import co.com.udea.autenticacion.moduloauthvirtual.userinterfaces.LoginPage;

public class NavigateToLogin implements Task {

    private LoginPage loginPage;

    public static NavigateToLogin onThePage() {
        return Tasks.instrumented(NavigateToLogin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(loginPage)
        );
    }
}