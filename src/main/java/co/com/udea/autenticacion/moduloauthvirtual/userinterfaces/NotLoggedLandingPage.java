package co.com.udea.autenticacion.moduloauthvirtual.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class NotLoggedLandingPage extends PageObject {
    public static final Target LANDING_USER_PHOTO = Target.the("Logged user photo").locatedBy("//*[@alt='@shadcn']");
}
