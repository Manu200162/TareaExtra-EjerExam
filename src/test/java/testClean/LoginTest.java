package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.TopBarTools;

public class LoginTest extends BaseTodoist{

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    TopBarTools topBarTools = new TopBarTools();
    String email = "manli2001@hotmail.es";
    String password="PruebaWeb123";

    @Test
    public void verifyLoginTest() throws InterruptedException {
        Thread.sleep(2000);
        mainPage.loginButton.click();
        Thread.sleep(2000);
        loginPage.emailTxtBox.setText(email);
        loginPage.passwordTxtBox.setText(password);
        loginPage.loginButton.click();
        topBarTools.avatarMenuButton.click();
        Thread.sleep(2000);
        Assertions.assertTrue(topBarTools.logoutButton.isControlDisplayed(),"ERROR, no se hizo el login");
        topBarTools.exitAvatarMenuButton.click();

    }
}
