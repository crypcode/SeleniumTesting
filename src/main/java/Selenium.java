import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
    static WebDriver browser;

    public static void setup(){
        System.setProperty("webdriver.chrome.driver",
                "webdrivers/chromedriver.exe");

        browser = new ChromeDriver();
        browser.get("http://algirdaskuslys.000webhostapp.com/selenium/filmai.php");
    }

    public static void close(){
        browser.close();
    }

    public static void pridetiIrasa(String keyword, String keyword2, String keyword3){
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword2);
        WebElement producerField = browser.findElement(By.name("rezisierius"));
        producerField.sendKeys(keyword3);
        WebElement sendfield = browser.findElement(By.name("insert"));
        sendfield.click();

    }
    public static void blogasIrasas(String keyword, String keyword2, String keyword3){
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword2);
        WebElement producerField = browser.findElement(By.name("rezisierius"));
        producerField.sendKeys(keyword3);
        WebElement sendfield = browser.findElement(By.name("insert"));
        sendfield.click();
        WebElement getInfo = browser.findElement(By.className("msg-bad"));

    }
    public static void irasoTrynimas(String keyword){
        WebElement idField = browser.findElement(By.name("id"));
        idField.sendKeys(keyword);
        WebElement deletefield = browser.findElement(By.name("delete"));
        deletefield.click();
        WebElement getInfo = browser.findElement(By.className("msg-good"));

    }
    public static void irasoRedagavimas(String keyword,String keyword2,String keyword3,String keyword4){
        WebElement idField = browser.findElement(By.name("id"));
        idField.sendKeys(keyword);
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword2);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword3);
        WebElement producerField = browser.findElement(By.name("rezisierius"));
        producerField.sendKeys(keyword4);
        WebElement updatefield = browser.findElement(By.name("update"));
        updatefield.click();
        WebElement getInfo = browser.findElement(By.className("msg-good"));

    }
    public static void neleistinasIrasoRedagavimas(String keyword,String keyword2,String keyword3,String keyword4){
        WebElement idField = browser.findElement(By.name("id"));
        idField.sendKeys(keyword);
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword2);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword3);
        WebElement producerField = browser.findElement(By.name("rezisierius"));
        producerField.sendKeys(keyword4);
        WebElement updatefield = browser.findElement(By.name("update"));
        updatefield.click();
        WebElement getInfo = browser.findElement(By.className("msg-bad"));

    }

    public static void main(String args[]) {
        System.out.println("Filmu formos testavimas");
        setup();
        pridetiIrasa("Baranauskas","Drama","nzn");
        blogasIrasas("@@@","@@","@");
        irasoTrynimas("672");
        irasoRedagavimas("671","Hotel artemis","Veiksmo","Nezinomas");
        neleistinasIrasoRedagavimas("670","!!!!","!!!!!","!!!!!!");
    }
}
