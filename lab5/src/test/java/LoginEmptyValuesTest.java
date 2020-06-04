import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

import static org.junit.Assert.*;

public class LoginEmptyValuesTest {

    @Test
    public void checkLoginFields()  {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.sixt.com/#/");


            WebElement loginLink = webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div/div[5]/div/span"));
            // //*[@id="select-member"]/span[2]
            loginLink.click();
            WebElement submit = webDriver.findElement(By.xpath("//*[@id=\"pageSlideWrapper\"]/div/div[2]/form/div[2]/div[1]/a[2]/p"));
            submit.click();
            //  //*[@id="header"]/div/div/div[2]/ul/li[2]/div/div/div
            // //*[@id="header"]/div/div/div[2]/ul/li[2]/div/div/div/form/div[4]/div[1]/button
            //*[@id="select-member"]/span[2]




    }
}