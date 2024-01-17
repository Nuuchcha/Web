import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WebTest {
//    WebDriver driver;
//
//    @BeforeAll
//    static void setupAll() {
//        WebDriverManager.chromedriver().setup();
//    }
//
//    @BeforeEach
//    void setUp() {
//        driver = new ChromeDriver();
//    }
//
//    @AfterEach
//    void tearDown(){
//        driver.quit();
//        driver = null;
//    }

    @Test
    void applicationMustPass() throws InterruptedException {
        open ("http://localhost:9999");

        SelenideElement form = $(".form");
        form.$("[data-test-id=name] input").setValue("Королев Евгений");
        form.$("[data-test-id=phone] input").setValue("+79876543210");
        form.$("[data-test-id=agreement]").click();
        form.$(".button").click();
        $(".order-success");

        Thread.sleep(5000);
    }
}
