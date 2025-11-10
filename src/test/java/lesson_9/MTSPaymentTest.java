package lesson_9;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class MtsOnlinePaymentTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private final String BASE_URL = "https://www.mts.by/";

    @BeforeEach
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 15);
        driver.get(BASE_URL);
    }

    @Test
    public void testOnlinePaymentBlock() {

        testBlockTitle();

        testPaymentSystemLogos();

        testDetailsLink();

        testPaymentForm();
    }

    private void testBlockTitle() {
        System.out.println("\nПроверка названия блока");

            WebElement blockTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//*[contains(text(), 'Онлайн пополнение')]")));
            System.out.println("Название блока корректно");
    }

    private void testPaymentSystemLogos() {
        System.out.println("\nПроверка логотипов платёжных систем");

            List<WebElement> allLogos = driver.findElements(By.xpath(
                    "//img[contains(@src, 'visa') or contains(@src, 'mastercard') or " +
                            "contains(@src, 'belkart')]"));
            System.out.println("Найдено логотипов: " + allLogos.size());
    }

    private void testDetailsLink() {
        System.out.println("\nПроверка ссылки 'Подробнее о сервисе'");

            WebElement detailsLink = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(text(), 'Подробнее о сервисе')]")));

            String linkText = detailsLink.getText().trim();
            String href = detailsLink.getAttribute("href");

            System.out.println("URL ссылки: " + href);
    }

    private void testPaymentForm() {
        System.out.println("\n-Проверка формы оплаты");

            selectCommunicationServices();

            enterPhoneNumber("297777777");

            enterAmount("5");

            checkContinueButton();
    }

    private void selectCommunicationServices() {
        System.out.println("Выбор 'Услуги связи'...");

            WebElement servicesTab = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//label[contains(., 'Услуги связи')] | " +
                            "//span[contains(., 'Услуги связи')] | " +
                            "//div[contains(@class, 'tab') and contains(., 'Услуги связи')]")));

            servicesTab.click();
            System.out.println("Вкладка 'Услуги связи' успешно выбрана");
    }

    private void enterPhoneNumber(String phoneNumber) {
        System.out.println("Ввод номера телефона: " + phoneNumber);
            WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[contains(., 'phone')] | " )));

            phoneInput.sendKeys(phoneNumber);

            System.out.println("Номер телефона успешно введен");
    }

    private void enterAmount(String amount) {
        System.out.println("Ввод суммы: " + amount);

            WebElement amountInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.cssSelector("input[type='number'], " +
                            "input[placeholder*='сумм']")));

            amountInput.sendKeys(amount);

            System.out.println("Сумма успешно введена");
    }

    private void checkContinueButton() {
        System.out.println("Проверка кнопки 'Продолжить'...");

            WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(text(), 'Продолжить')]")));

            String buttonText = continueButton.getText().trim();
            System.out.println("Кнопка 'Продолжить' активна: '" + buttonText + "'");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
