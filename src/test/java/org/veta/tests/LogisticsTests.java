package org.veta.tests;

import com.codeborne.pdftest.PDF;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.veta.pages.*;

import java.io.File;

import static com.codeborne.pdftest.assertj.Assertions.assertThat;
import static io.qameta.allure.Allure.step;
import static org.veta.tests.TestData.*;

public class LogisticsTests extends TestBase {
    RequestProposalPage request = new RequestProposalPage();
    RegionalOfficesPage regional = new RegionalOfficesPage();
    BecomingPartnerPage partner = new BecomingPartnerPage();
    CustomClearancePage services = new CustomClearancePage();
    OrderingFreightPage freight = new OrderingFreightPage();
    TrackingParcelPage tracking = new TrackingParcelPage();
    UserAgreementPage content = new UserAgreementPage();

    @Disabled
    @Test
    @Owner("Veta")
    @DisplayName("Request proposal for business")
    void fillFormForProposalTest() {
        step("Open page", () -> {
            request.openPage();
        });
        step("Filling form", () -> {
            request.askProposal()
                    .setUserName(fullName)
                    .setNumber(phone)
                    .setEmail(email)
                    .clickSubmit();
        });
        step("Checking form successfully sent", () -> {
            request.checkResult();
        });
    }

    @Disabled
    @Test
    @Owner("Veta")
    @DisplayName("Checking info about regional offices")
    void checkRegionalOfficesInfoTest() {
        step("Open page", () -> {
            regional.openPage();
        });
        step("Choose region", () -> {
            regional.checkTitle();
        });
        step("Checking required info exist", () -> {
            regional.chooseCity()
                    .checkResult();
        });
    }

    @Disabled
    @Test
    @Owner("Veta")
    @DisplayName("Becoming partner")
    void fillFormBecomePartnerTest() {
        step("Open page", () -> {
            partner.openPage();
        });
        step("Open and fill form", () -> {
            partner.checkTitle()
                    .clickConnectButton()
                    .checkPickup()
                    .becomePartner()
                    .setUserName(fullName)
                    .setNumber(phone)
                    .setCity(city)
                    .setEmail(email)
                    .setAddress(address)
                    .clickSubmit();
        });
        step("Checking form successfully sent", () -> {
            partner.checkResult();
        });
    }

    @Disabled
    @Test
    @Owner("Veta")
    @DisplayName("Ordering custom clearance services")
    void fillFormCustomClearanceTest() {
        step("Open page", () -> {
            services.openPage();
        });
        step("Filling application", () -> {
            services.checkTitle()
                    .makeApplication()
                    .checkForm()
                    .setUserName(fullName)
                    .setNumber(phone)
                    .setEmail(email)
                    .uploadFile(filePath)
                    .clickSubmit();
        });
        step("Checking form successfully sent", () -> {
            services.checkResult();
        });
    }

    @Test
    @Owner("Veta")
    @DisplayName("Ordering freight")
    void fillFormForFreightTest() {
        step("Open page", () -> {
            freight.openPage()
                    .orderFreight();
                    //.popupClose();

        });
        step("Filling form", () -> {
            freight.setShipmentAddress(address)
                    .setShipmentDate(shipDate)
                    .setShipmentTime(shipTime)
                    .setShipmentCompany(companyName)
                    .setShipmentPhone(phone)
                    .setShipmentName(fullName)
                    .setDeliveryAddress(address)
                    .setDeliveryDate(delDate)
                    .setDeliveryTime(delTime)
                    .setDeliveryCompany(companyName)
                    .setDeliveryPhone(phone)
                    .setDeliveryName(fullName)
                    .setCargoDescription(cargoType)
                    .selectPackType(packType)
                    .setCargoQty(cargoQty)
                    .setCargoWeight(cargoWeight)
                    .setCargoVolume(cargoVolume)
                    .selectTransportCapacity(transpCapacity)
                    .selectTransportType(transpType)
                    .selectTransportLoadType(loadType)
                    .checkExtraEquip()
                    .setDesiredCost(cost)
                    .checkDocReturn();
        });
        step("Checking form successfully sent", () -> {
            freight.clickSubmit()
                    .checkResult();
        });
    }

    @Disabled
    @Test
    @Owner("Veta")
    @DisplayName("Check user agreement content")
    void checkUserAgreementTest() throws Exception {
        content.openPage();
        File downloadedFile = content.getLink().download();
        PDF pdf = new PDF(downloadedFile);
        assertThat(pdf.text).contains(info);
    }

    @Disabled
    @Test
    @Owner("Veta")
    @DisplayName("Tracking parcel")
    void trackParcelTest() {
        step("Open page", () -> {
            tracking.openPage();
        });
        step("Insert tracking number", () -> {
            tracking.setTrackingNumber(tracknumber);
        });
        step("Checking tracking info", () -> {
            tracking.clickSubmit()
                    .checkResult();
        });
    }
}

