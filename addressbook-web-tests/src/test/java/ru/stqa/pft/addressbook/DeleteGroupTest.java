package ru.stqa.pft.addressbook;// Generated by Selenium IDE
import org.junit.Test;

public class DeleteGroupTest extends TestBase {

  @Test
  public void deleteGroup() {
    gotoGroupPage();
    //driver.findElement(By.cssSelector(".group:nth-child(5)")).click();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}
