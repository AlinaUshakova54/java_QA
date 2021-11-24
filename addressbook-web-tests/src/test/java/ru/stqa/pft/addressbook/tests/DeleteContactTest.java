package ru.stqa.pft.addressbook.tests;

import org.junit.Test;

public class DeleteContactTest extends TestBase{

    @Test
    public void deleteAllContact() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContacts();
    }
}
