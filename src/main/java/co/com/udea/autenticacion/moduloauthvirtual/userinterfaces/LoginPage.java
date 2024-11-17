package co.com.udea.autenticacion.moduloauthvirtual.userinterfaces;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("http://localhost:3000/authentication/login/login")
public class LoginPage extends PageObject {
    public static final Target USERNAME_FIELD = Target.the("User name field").locatedBy("//*[@id='email']");
    public static final Target PASSWORD_FIELD = Target.the("Password field").locatedBy("//*[@id='password']");
    public static final Target LOGIN_BUTTON = Target.the("Login button").locatedBy("//*[@value='Acceder']");
    public static final Target FORGOT_PASSWORD_LINK = Target.the("Forgot password link").locatedBy("//*[@href='/authentication/login/login#']");
    public static final Target REGISTER_FORM_BUTTON = Target.the("Register form button").locatedBy("//*[@value='Registrar usuario']");
    public static final Target ALERT_UNSUCCESSFUL_LOGIN = Target.the("Invalid credentials message").locatedBy("//*[@value='Usuario o contraseña incorrectos']");
}