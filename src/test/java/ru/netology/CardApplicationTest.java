package ru.netology;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Condition.*;

public class CardApplicationTest {
    @Test
    void shouldTest() {
        open("http://localhost:9999/");
        //
        SelenideElement form = $("[???]"); // Что писать здесь, если в коде страницы нет никакого текста?
        form.$("[data-test-id=name] input").setValue("Пушкин Александр");
        form.$("[data-test-id=phone] input").setValue("+71234567891");
//        SelenideElement form1 = $("[data-test-id=name]");
//        form1 = $("[data-test-id=name] input").setValue("Пушкин Александр");
//        SelenideElement form2 = $("[data-test-id=phone]");
//        form2 = $("[data-test-id=phone] input").setValue("+71234567891");
        form.$("[data-test-id=agreement]").click();
        form.$("[data-test-id=submit]").click();
        $(".order-success]").shouldHave(Condition.exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }
}
