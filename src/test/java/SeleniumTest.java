import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
    @BeforeTest
    public void setup(){
        Selenium.setup();
    }
    @Test
        public void pridetiIrasaTest(){
        Selenium.pridetiIrasa("Baranauskas","Drama","Nelabai");
    }
    @Test
        public void blogasIrasasTest(){
        Selenium.blogasIrasas("@@@","@@","@");
    }
    @Test
        public void irasoTrynimasTest(){
        Selenium.irasoTrynimas("670");
    }
    @Test
        public void irasoRedagavimasTest(){
        Selenium.irasoRedagavimas("671","Hotel artemis","Veiksmo","Nezinomas");
    }
    @Test
    public void illegalRedagavimasTest(){
        Selenium.neleistinasIrasoRedagavimas("670","!!!!","!!!!!","!!!!!!");
    }
    @AfterTest
    public void close(){
        Selenium.close();
    }
}
