package ru.stqa.pft.addressbook;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddGroupTest {
  private WebDriver driver;
  //private Map<String, Object> vars;
  //JavascriptExecutor js;

  @Before
  public void setUp() {
    System.setProperty("webdriver.gecko.driver", "C:/Devel/java_QA/addressbook-web-tests/geckodriver.exe");
    driver = new FirefoxDriver();
    //js = (JavascriptExecutor) driver;
    //vars = new HashMap<String, Object>();
    driver.get("http://localhost/addressbook/");
    login("admin", "secret");
  }

  private void login(String username, String password) {
    driver.findElement(By.name("user")).click();
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys(username);
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.cssSelector("input:nth-child(7)")).click();
  }

  @After
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void addGroup() {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    returnToGroupPage();
    logout();
  }

  private void logout() {
    driver.findElement(By.linkText("Logout")).click();
  }

  private void returnToGroupPage() {
    driver.findElement(By.linkText("group page")).click();
  }

  private void submitGroupCreation() {
    driver.findElement(By.name("submit")).click();
  }

  private void fillGroupForm(GroupData groupData) {
    driver.findElement(By.name("group_name")).click();
    driver.findElement(By.name("group_name")).clear();
    driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
    driver.findElement(By.name("group_header")).click();
    driver.findElement(By.name("group_header")).clear();
    driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    driver.findElement(By.name("group_footer")).click();
    driver.findElement(By.name("group_footer")).clear();
    driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  private void initGroupCreation() {
    driver.findElement(By.name("new")).click();
  }

  private void gotoGroupPage() {
    driver.findElement(By.linkText("groups")).click();
  }
}
