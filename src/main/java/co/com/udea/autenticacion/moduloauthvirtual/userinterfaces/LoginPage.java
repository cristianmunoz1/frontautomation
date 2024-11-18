package co.com.udea.autenticacion.moduloauthvirtual.userinterfaces;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("http://localhost:3000/authentication/login/login")
public class LoginPage extends PageObject {
    public static final Target USERNAME_FIELD = Target.the("User name field").locatedBy("//*[@id=\"password\"]");
    public static final Target PASSWORD_FIELD = Target.the("Password field").locatedBy("//*[@id=\"email\"]");
    public static final Target LOGIN_BUTTON = Target.the("Login button").locatedBy("/html/body/div[1]/div/main/div/div/form/div[2]/div/div[6]/button");
    public static final Target FORGOT_PASSWORD_LINK = Target.the("Forgot password link").locatedBy("//*[@id=\"__next\"]/div/main/div/div/div/div/a");
    public static final Target REGISTER_BUTTON = Target.the("Register button in login page").locatedBy("//*[@id=\"__next\"]/div/main/div/div/div/div/button");
    public static final Target INVALID_CREDENTIALS_MESSAGE = Target.the("Invalid credentials message").locatedBy("/html/body/div[1]/div/main/div/div/form/div[2]/div/div[5]/p");
}