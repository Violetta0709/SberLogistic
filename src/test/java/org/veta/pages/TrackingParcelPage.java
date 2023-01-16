package org.veta.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TrackingParcelPage {

    private SelenideElement
            parcelNumber =  $("[name=number]"),
            submit = $("#button-parcel"),
            information = $("._shiptor_widget_information");

    private final static String TITLE_TEXT = "Партнерская программа";
    private final static String PICKUPNET = "Сеть партнерских пунктов выдачи заказов";
    private final static String THANKS_TEXT = "Спасибо за обращение!";

    public TrackingParcelPage openPage() {
        open("https://sblogistica.ru");
        return this;
    }

    public TrackingParcelPage setTrackingNumber(String value) {
        parcelNumber.setValue(value);
        return this;
    }

    public TrackingParcelPage clickSubmit() {
        submit.click();
        return this;
    }

    public TrackingParcelPage checkResult() {
        information.shouldHave(text("Информация о посылке"))
                .shouldHave(text("Получатель"))
                .shouldHave(text("Вес"))
                .shouldHave(text("Размер"))
                .shouldHave(text("Услуга"))
                .shouldHave(text("Телефон"))
                .shouldHave(text("Место выдачи"));
        return this;
    }
}


