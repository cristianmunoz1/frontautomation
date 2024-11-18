package co.com.udea.autenticacion.moduloauthvirtual.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;

public class LocalStorageHelper {
    public static String getItem(Actor actor, String key) {
        JavascriptExecutor js = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
        return (String) js.executeScript(String.format(
                "return window.localStorage.getItem('%s');", key));
    }

    public static boolean hasItem(Actor actor, String key) {
        String item = getItem(actor, key);
        return item != null && !item.isEmpty();
    }
}
