package co.com.udea.autenticacion.moduloauthvirtual.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoggedLandingPage extends PageObject {
    public static final Target LANDING_USER_PERMISSIONS = Target.the("Logged user landing permissions").locatedBy("/html/body/div[1]/div/header/div[1]/nav/div[2]/a[3]");
}
