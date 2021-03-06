package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void gotoGroupPage() {
      click(By.linkText("groups"));
    }

    public void gotoAddPage() {
        click(By.linkText("add new"));
    }

    public void gotoHomePage() {click(By.linkText("home"));}
}
