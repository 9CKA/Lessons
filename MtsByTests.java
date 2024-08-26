import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsByTests {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.mts.by/");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testBlockTitle() {
        WebElement blockTitle = driver.findElement(By.cssSelector("css-selector-заголовка-блока"));
        assertEquals("Онлайн пополнение без комиссии", blockTitle.getText(), "Название блока не совпадает");
    }

    @Test
    public void testPaymentSystemsLogos() {
        WebElement logosBlock = driver.findElement(By.cssSelector("css-selector-блока-с-логотипами"));
        assertTrue(logosBlock.isDisplayed(), "Блок с логотипами платёжных систем не отображается");

        // Проверяем наличие конкретных логотипов
        assertTrue(driver.findElement(By.cssSelector("css-selector-логотипа-1")).isDisplayed(), "Логотип 1 не отображается");
        assertTrue(driver.findElement(By.cssSelector("css-selector-логотипа-2")).isDisplayed(), "Логотип 2 не отображается");
        // Добавьте проверки для других логотипов по аналогии
    }

    @Test
    public void testLearnMoreLink() {
        WebElement learnMoreLink = driver.findElement(By.cssSelector("css-selector-ссылки-подробнее"));
        assertTrue(learnMoreLink.isDisplayed(), "Ссылка 'Подробнее о сервисе' не отображается");
        
        learnMoreLink.click();
        
        // Проверяем переход на новую страницу или появление модального окна
        wait.until(ExpectedConditions.urlContains("ожидаемый-url-после-перехода"));
        assertTrue(driver.getCurrentUrl().contains("ожидаемый-url-после-перехода"), "Ссылка 'Подробнее о сервисе' не работает");
    }

    @Test
    public void testFormSubmission() {
        WebElement serviceTypeDropdown = driver.findElement(By.cssSelector("css-selector-дропдауна-услуг"));
        serviceTypeDropdown.click();
        WebElement serviceOption = driver.findElement(By.xpath("xpath-опции-услуги-связи"));
        serviceOption.click();

        WebElement phoneNumberInput = driver.findElement(By.cssSelector("css-selector-поля-номера"));
        phoneNumberInput.sendKeys("297777777");

        WebElement continueButton = driver.findElement(By.cssSelector("css-selector-кнопки-продолжить"));
        continueButton.click();

        // Проверка перехода на следующую страницу или появления следующего шага
        WebElement nextStep = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("css-selector-следующего-шагa")));
        assertTrue(nextStep.isDisplayed(), "Кнопка 'Продолжить' не работает");
    }
}
