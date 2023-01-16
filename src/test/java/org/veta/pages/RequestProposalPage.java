package org.veta.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RequestProposalPage {

    private SelenideElement
            proposalGet = $(byText("Получить предложение")),
            userName = $("[name=fio]"),
            userPhone = $("#form_business_phone"),
            userEmail = $("[name=email]"),
            leadForm = $("#lead_amoform"),
            confirmBlock = $("#formblock");

    private final static String BYE_TEXT = "Ваше сообщение отправлено!";

    public RequestProposalPage openPage() {
        open("/online_stores");
        $(".cookie-popup__button").click();
        return this;
    }

    public RequestProposalPage askProposal() {
        proposalGet.click();
        return this;
    }

    public RequestProposalPage setUserName(String value) {
        userName.setValue(value);
        return this;
    }

    public RequestProposalPage setNumber(String value) {
        userPhone.setValue(value);
        return this;
    }

    public RequestProposalPage setEmail(String value) {
        userEmail.setValue(value);
        return this;
    }

    public RequestProposalPage clickSubmit() {
        leadForm.click();
        return this;
    }

    public RequestProposalPage checkResult() {
        confirmBlock.shouldHave(text(BYE_TEXT));
        return this;
    }
}


