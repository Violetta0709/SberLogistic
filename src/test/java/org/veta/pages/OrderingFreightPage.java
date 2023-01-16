package org.veta.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OrderingFreightPage {

    private SelenideElement
            order = $("a[href*='/business/freight/order']"),
            popup = $(".cookie-popup__button"),
            shipmentAddress = $("#shipment_address"),
            shipmentDate = $("#shipment_date"),
            shipmentTime = $("#shipment_time"),
            shipmentCompany = $("#shipment_company_name"),
            shipmentPhone = $("#shipment_phone"),
            shipmentName = $("#shipment_full_name"),
            deliveryAddress = $("#delivery_address"),
            deliveryDate = $("#delivery_date"),
            deliveryTime = $("#delivery_time"),
            deliveryCompany = $("#delivery_company_name"),
            deliveryPhone = $("#delivery_phone"),
            deliveryName = $("#delivery_full_name"),
            cargo = $("#cargo_description"),
            packType = $("#cargo_pack_type"),
            cargoQty = $("#cargo_places_quantity"),
            cargoWeight = $("#cargo_weight"),
            cargoVolume = $("#cargo_volume"),
            transportCapacity = $("#transport_capacity"),
            transportType = $("#transport_type"),
            transportLoadType = $("#transport_loading_type"),
            additionalEquip = $(".checkboxes-new__item"),
            desiredCost = $("#desired_cost"),
            docReturn = $("[for=documents_return]"),
            submit = $(byText("Оформить заявку")),
            confirmation = $("#freight_order");

    private final static String SUCCESS_TEXT = "Успешно отправлено!";

    public OrderingFreightPage openPage() {
        open("/business/freight");
        return this;
    }

    public OrderingFreightPage orderFreight() {
        order.click();
        return this;
    }

    public OrderingFreightPage popupClose() {
        popup.click();
        return this;
    }

    public OrderingFreightPage setShipmentAddress(String value) {
        shipmentAddress.setValue(value);
        return this;
    }

    public OrderingFreightPage setShipmentDate(String value) {
        shipmentDate.setValue(value);
        return this;
    }

    public OrderingFreightPage setShipmentTime(String value) {
        shipmentTime.setValue(value);
        return this;
    }

    public OrderingFreightPage setShipmentCompany(String value) {
        shipmentCompany.setValue(value);
        return this;
    }

    public OrderingFreightPage setShipmentPhone(String value) {
        shipmentPhone.setValue(value);
        return this;
    }

    public OrderingFreightPage setShipmentName(String value) {
        shipmentName.setValue(value);
        return this;
    }

    public OrderingFreightPage setDeliveryAddress(String value) {
        deliveryAddress.setValue(value);
        return this;
    }

    public OrderingFreightPage setDeliveryDate(String value) {
        deliveryDate.setValue(value);
        return this;
    }

    public OrderingFreightPage setDeliveryTime(String value) {
        deliveryTime.setValue(value);
        return this;
    }

    public OrderingFreightPage setDeliveryCompany(String value) {
        deliveryCompany.setValue(value);
        return this;
    }

    public OrderingFreightPage setDeliveryPhone(String value) {
        deliveryPhone.setValue(value);
        return this;
    }

    public OrderingFreightPage setDeliveryName(String value) {
        deliveryName.setValue(value);
        return this;
    }

    public OrderingFreightPage setCargoDescription(String value) {
        cargo.setValue(value);
        return this;
    }

    public OrderingFreightPage selectPackType(String value) {
        packType.selectOptionByValue(value);
        return this;
    }

    public OrderingFreightPage setCargoQty(String value) {
        cargoQty.setValue(value);
        return this;
    }

    public OrderingFreightPage setCargoWeight(String value) {
        cargoWeight.setValue(value);
        return this;
    }

    public OrderingFreightPage setCargoVolume(String value) {
        cargoVolume.setValue(value);
        return this;
    }

    public OrderingFreightPage selectTransportCapacity(String value) {
        transportCapacity.selectOptionByValue(value);
        return this;
    }

    public OrderingFreightPage selectTransportType(String value) {
        transportType.selectOption(value);
        return this;
    }

    public OrderingFreightPage selectTransportLoadType(String value) {
        transportLoadType.selectOption(value);
        return this;
    }

    public OrderingFreightPage checkExtraEquip() {
        additionalEquip.click();
        return this;
    }

    public OrderingFreightPage setDesiredCost(String value) {
        desiredCost.setValue(value);
        return this;
    }

    public OrderingFreightPage checkDocReturn() {
        docReturn.click();
        return this;
    }

    public OrderingFreightPage clickSubmit() {
        submit.click();
        return this;
    }

    public OrderingFreightPage checkResult() {
        confirmation.shouldHave(text(SUCCESS_TEXT));
        return this;
    }
}


