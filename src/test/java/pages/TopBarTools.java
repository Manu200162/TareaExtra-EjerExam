package pages;

import control.Button;
import control.Image;
import org.openqa.selenium.By;

public class TopBarTools {
public Image avatarMenuButton = new Image(By.xpath("//img[@alt='Manuel']"));
public Button logoutButton = new Button(By.xpath("//button[contains(@id,'9')]"));
public Button exitAvatarMenuButton = new Button(By.xpath("//div[@data-dialog-ref]"));
}
