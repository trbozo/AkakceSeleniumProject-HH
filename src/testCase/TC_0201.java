package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utility.BaseDriver;

public class TC_0201 extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.akakce.com/");

        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"H_rl_v8\"]/a [2]"));
        loginBtn.click();
        delay(1);

        WebElement emailLogin = driver.findElement(By.xpath("//*[@id='life']"));
        emailLogin.sendKeys("ayilmaz86@gmail.com");
        delay(1);

        WebElement passwordLogin = driver.findElement(By.xpath("//*[@id='lifp']"));
        passwordLogin.sendKeys("Qwerty12");
        delay(1);

        WebElement submit = driver.findElement(By.xpath("//*[@id='lfb' and @value='Giriş yap']"));
        submit.click();
        delay(1);

        WebElement profile = driver.findElement(By.cssSelector("[title='Hesabım']"));
        profile.click();
        delay(1);

        WebElement profileName = driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/']"));
        profileName.click();
        delay(1);

        WebElement accountName = driver.findElement(By.cssSelector("span.welcome_user > span > b"));
        System.out.println("accountName.getText() = " + accountName.getText());
        Assert.assertTrue(accountName.getText().contains("Ayşe Yılmaz"));

        delayQuit();
    }
}
