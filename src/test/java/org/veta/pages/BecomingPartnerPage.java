package org.veta.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BecomingPartnerPage {

    private SelenideElement
            title = $("h1"),
            connectButton = $("#connectBtn"),
            pickUp = $(".top-pickup-point"),
            intro = $("#intro"),
            userName = $("#name"),
            userPhone = $("#phone"),
            userCity = $("#city"),
            userEmail = $("#mail"),
            address = $("#address"),
            submit = $("[type=submit]"),
            confirmation = $(".popup");

    private final static String TITLE_TEXT = "Партнерская программа";
    private final static String PICKUPNET = "Сеть партнерских пунктов выдачи заказов";
    private final static String THANKS_TEXT = "Спасибо за обращение!";

    public BecomingPartnerPage openPage() {
        open("https://sblogistica.ru/partners/");
        return this;
    }

    public BecomingPartnerPage checkTitle() {
        title.shouldHave(text(TITLE_TEXT));
        return this;
    }

    public BecomingPartnerPage clickConnectButton() {
        connectButton.click();
        return this;
    }

    public BecomingPartnerPage checkPickup() {
        pickUp.shouldHave(text(PICKUPNET));
        return this;
    }

    public BecomingPartnerPage becomePartner() {
        intro.click();
        return this;
    }

    public BecomingPartnerPage setUserName(String value) {
        userName.setValue(value);
        return this;
    }

    public BecomingPartnerPage setNumber(String value) {
        userPhone.setValue(value);
        return this;
    }

    public BecomingPartnerPage setCity(String value) {
        userCity.setValue(value);
        return this;
    }

    public BecomingPartnerPage setEmail(String value) {
        userEmail.setValue(value);
        return this;
    }


    public BecomingPartnerPage setAddress(String value) {
        address.setValue(value);
        return this;
    }

    public BecomingPartnerPage clickSubmit() {
        submit.click();
        return this;
    }

    public BecomingPartnerPage checkResult() {
        confirmation.shouldHave(text(THANKS_TEXT));
        return this;
    }
}


