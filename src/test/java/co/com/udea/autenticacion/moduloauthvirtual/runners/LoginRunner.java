package co.com.udea.autenticacion.moduloauthvirtual.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = "com.tudominio.stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class LoginRunner {}