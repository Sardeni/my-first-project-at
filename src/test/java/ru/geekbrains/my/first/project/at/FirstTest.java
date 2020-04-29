package ru.geekbrains.my.first.project.at;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

public class FirstTest {

    @Test
    public void test() {
        Selenide.open("https://geekbrains.ru/events");
        Selenide.$("[id=\"nav\"] [href=\"/courses\"]").click();
        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Курсы"));
    }
}
