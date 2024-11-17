package co.com.udea.autenticacion.moduloauthvirtual.questions;

import co.com.udea.autenticacion.moduloauthvirtual.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheLoginError implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LoginPage.ALERT_UNSUCCESSFUL_LOGIN).answeredBy(actor);
    }
}
