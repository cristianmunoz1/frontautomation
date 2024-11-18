package co.com.udea.autenticacion.moduloauthvirtual.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/autenticacion",
        glue = "co.com.udea.autenticacion.moduloauthvirtual.stepdefinitions"
)
public class LoginRunner {

}