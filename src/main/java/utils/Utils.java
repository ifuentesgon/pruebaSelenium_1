package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

    public static boolean esperarElemento(WebElement elemento, int segudos){
        try {
            System.out.println("[Utils - esperarElemento] Se busca elemento: "+elemento);
            WebDriver driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.visibilityOf(elemento));
            return true;
        }catch (Exception e){
            System.out.println("[Utils - esperarElemento] Elemento: "+elemento+" no se econtro.");
            return false;
        }

    }
}
