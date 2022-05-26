package io.tonnioo_owner;

import io.tonnioo_owner.config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {

    private WebDriver driver = new WebDriverProvider().get();

    @Test
    public void testGitHubTitle(){
//        // настройка Chrome Driver
//       WebDriverManager.chromedriver().setup();
//
//       //конфигурация запуска browser=chrome, base url = http://github.com
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://github.com");

       //код выполнения теста
        String title = driver.getTitle();
        assertEquals(title,"GitHub: Where the world builds software · GitHub");

    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }
}
