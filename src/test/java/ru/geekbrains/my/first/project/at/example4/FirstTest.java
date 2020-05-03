package ru.geekbrains.my.first.project.at.example4;//package ru.geekbrains.my.first.project.at.example4;
//
//import com.codeborne.selenide.Condition;
//import com.codeborne.selenide.Configuration;
//import com.codeborne.selenide.Selenide;
//import com.codeborne.selenide.logevents.SelenideLogger;
//import io.qameta.allure.selenide.AllureSelenide;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
//import ru.geekbrains.my.first.project.at.example2.Page;
//
//public class FirstTest {
//
//    @BeforeEach
//    void setUp() {
//        Configuration.browserCapabilities.setCapability("enableVNC", true);
//        SelenideLogger.addListener("AllureSelenide",
//                new AllureSelenide().screenshots(true).savePageSource(false));
//    }
//
//
//    @ParameterizedTest
//    @ValueSource(strings = {
//            "Курсы",
//            "Вебинары",
//            "Форум",
//            "Блог",
//            "Тесты",
//            "Карьера"
//    })
//    public void button(String name) {
//        Selenide.open("https://geekbrains.ru/courses");
//        Page page = new Page();
//        page.getNavigation().getButton(name).click();
//        page.getHeader().getTitle().shouldHave(Condition.exactText(name));
//    }
//}