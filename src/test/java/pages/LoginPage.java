package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox emailTxtBox = new TextBox(By.id("email"));
    public TextBox passwordTxtBox = new TextBox(By.id("password"));
    public Button loginButton = new Button(By.xpath("//button[text()=\"Log in\"]"));
}
