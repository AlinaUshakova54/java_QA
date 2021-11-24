package ru.stqa.pft.addressbook.tests;

import org.junit.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ModificationContactTest extends TestBase{

    @Test
    public void contactModification() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("alina", "test1", "ushakova2", "test2", "test3", "test4", "test5", "test6", "12345678", "test7"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returntoHomePage();
    }
}
