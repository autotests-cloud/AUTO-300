package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Проверка надписей на сайте")
    void generatedTest() {
        step("Открыть https://tradesanta.com/ru", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить Автоматизированная торговля криптовалютой", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://tradesanta.com/ru'", () ->
            open("https://tradesanta.com/ru"));

        step("Page title should have text 'TradeSanta: Торговые боты для Binance, Huobi, Okex & Hitbtc'", () -> {
            String expectedTitle = "TradeSanta: Торговые боты для Binance, Huobi, Okex & Hitbtc";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://tradesanta.com/ru'", () ->
            open("https://tradesanta.com/ru"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}