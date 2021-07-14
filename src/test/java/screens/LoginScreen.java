package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import screens.Base.BaseScreen;

import java.util.concurrent.TimeUnit;

public class LoginScreen extends BaseScreen {
    @WithTimeout(time = 5000, unit = TimeUnit.SECONDS)
    @AndroidFindBy(id = "login_button")
    @iOSXCUITFindBy(accessibility = "login_button")
    private MobileElement botaologin;

    @AndroidFindBy(id = "login_username")
    @iOSXCUITFindBy(accessibility = "login_username")
    private MobileElement campoemail;

    @AndroidFindBy(id = "login_password")
    @iOSXCUITFindBy(accessibility = "login_password")
    private MobileElement camposenha;

    @AndroidFindBy(id = "mensagem2")
    @iOSXCUITFindBy(accessibility = "welcome_txt")
    private MobileElement mensagem;


    public void EstounoLogin() {
        botaologin.isDisplayed();
    }

    public void Logar() {
        campoemail.sendKeys("leandrodomingos68@gmail.com");
        camposenha.sendKeys("123456");
        botaologin.click();
    }

    public void estounahome(){
        mensagem.isDisplayed();
    }
}
