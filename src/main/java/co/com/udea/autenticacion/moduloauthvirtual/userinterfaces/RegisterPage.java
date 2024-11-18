package co.com.udea.autenticacion.moduloauthvirtual.userinterfaces;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("http://localhost:3000/authentication/register/register")
public class RegisterPage extends PageObject {
    public static final Target REGISTER_USERNAME_FIELD = Target.the("Register user name field").locatedBy("//*[@id='name']");
    public static final Target REGISTER_CELLPHONE_FIELD = Target.the("Register cellphone field").locatedBy("//*[@id='cellphone']");
    public static final Target REGISTER_EMAIL_FIELD = Target.the("Register email field").locatedBy("//*[@id='email']");
    public static final Target REGISTER_PASSWORD_FIELD = Target.the("Register password field").locatedBy("//*[@id='password']");
    public static final Target REGISTER_TERMS_CHECK = Target.the("Register terms check field").locatedBy("/html/body/div[1]/div/main/div/form/div/div[2]/div/div[4]/div[1]/button");
    public static final Target REGISTER_POLITICS_CHECK = Target.the("Register politics check field").locatedBy("/html/body/div[1]/div/main/div/form/div/div[2]/div/div[5]/div[1]/button");
    public static final Target REGISTER_SUBMIT_BUTTON = Target.the("Register save button").locatedBy("//*[@type='submit']");
    public static final Target REGISTER_TITLE_HEADING = Target.the("Heading register").locatedBy("/html/body/div[1]/div/main/div/form/div/div[1]/h3");
    public static final Target INCORRECT_PHONE_ALERT = Target.the("Incorrect phone Alert").locatedBy("/html/body/div[1]/div/main/div/form/div/div[2]/div/div[1]/div[2]/div/p");
    public static final Target INCORRECT_EMAIL_ALERT = Target.the("Incorrect email Alert").locatedBy("/html/body/div[1]/div/main/div/form/div/div[2]/div/div[2]/div/p");
    public static final Target INCORRECT_PASSWORD_ALERT = Target.the("Incorrect password alert").locatedBy("/html/body/div[1]/div/main/div/form/div/div[2]/div/div[3]/div/p");
    public static final Target NO_TERMS_ACCEPTED_ALERT = Target.the("No terms accepted alert").locatedBy("/html/body/div[1]/div/main/div/form/div/div[2]/div/div[4]/div[2]/p");
    public static final Target NO_PRIVACY_ACCEPTED_ALERT = Target.the("No terms accepted alert").locatedBy("/html/body/div[1]/div/main/div/form/div/div[2]/div/div[5]/div[2]/p");
}
