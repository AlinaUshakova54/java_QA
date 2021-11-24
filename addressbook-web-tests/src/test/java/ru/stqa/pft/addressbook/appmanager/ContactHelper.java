package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver driver) {
        super(driver);
    }
    public void returntoHomePage() {
        click(By.linkText("home page"));
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"),contactData.getName());
        type(By.name("middlename"),contactData.getMiddleName());
        type(By.name("lastname"),contactData.getLastName());
        type(By.name("nickname"),contactData.getNickName());
        type(By.name("title"),contactData.getTitle());
        type(By.name("company"),contactData.getCompany());
        type(By.name("address"),contactData.getAddress());
        type(By.name("home"),contactData.getHome());
        type(By.name("mobile"),contactData.getMobile());
        type(By.name("work"),contactData.getWork());
    }

    public void selectContact() { click(By.id("MassCB"));}

    public void deleteSelectedContacts() {
        click(By.cssSelector(".left:nth-child(8) > input"));
        driver.switchTo().alert().accept();
    }

    public void initContactModification() {
        click(By.cssSelector(".center:nth-child(8) img"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

}
