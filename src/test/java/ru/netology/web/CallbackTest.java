package ru.netology.web;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class CallbackTest {
    @Test
    void shouldTestAllFieldsCorrectly() {
        open("http://localhost:9999");

        $("[data-test-id=name] input").setValue("Василий");
        $("[data-test-id=phone] input").setValue("+79270000000");
        $("[data-test-id=agreement]").click();
        $(".button").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }

/*
    @Test
    void shouldTestNameFieldEngTextNoCorrectly() {

        open("http://localhost:9999");

        $("[data-test-id=name] input").setValue("Ivan Petrov");
        $(".button").click();
        $(".input_invalid").shouldHave(exactText("Èìÿ è Ôàìèëèÿ óêàçàíûå íåâåðíî. Äîïóñòèìû òîëüêî ðóññêèå áóêâû, ïðîáåëû è äåôèñû."));
    }
*/
}
