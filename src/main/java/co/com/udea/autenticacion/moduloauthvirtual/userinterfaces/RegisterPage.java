package co.com.udea.autenticacion.moduloauthvirtual.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage extends PageObject {
    public static final Target REGISTER_USERNAME_FIELD = Target.the("Register user name field").locatedBy("//*[@id='name']");
    public static final Target REGISTER_CELLPHONE_FIELD = Target.the("Register cellphone field").locatedBy("//*[@id='cellphone']");
    public static final Target REGISTER_EMAIL_FIELD = Target.the("Register email field").locatedBy("//*[@id='email']");
    public static final Target REGISTER_PASSWORD_FIELD = Target.the("Register password field").locatedBy("//*[@id='password']");
    public static final Target REGISTER_TERMS_CHECK = Target.the("Register terms check field").locatedBy("//*[@id='termino']");
    public static final Target REGISTER_POLITICS_CHECK = Target.the("Register politics check field").locatedBy("//*[@id='politicas']");
    public static final Target REGISTER_SUBMIT_BUTTON = Target.the("Register save button").locatedBy("//*[@type='submit']");
}
