package pages;

import control.Label;
import org.openqa.selenium.By;

public class CentralSection {
    public Label actualProjectLabel = new Label(By.xpath("//div[@class=\"view_header__content\"]//span[@class]"));
}
