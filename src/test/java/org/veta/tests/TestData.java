package org.veta.tests;

import com.github.javafaker.Faker;
import org.veta.helpers.BoxKind;
import org.veta.helpers.LoadType;
import org.veta.helpers.TransportType;

import java.util.Locale;

public class TestData {
    private static final Faker faker = new Faker(new Locale("en"));
    public static String
            fullName = faker.name().fullName(),
            email = faker.internet().emailAddress(),
            phone = "9995556667",
            city = faker.address().cityName(),
            address = faker.address().fullAddress(),
            companyName = faker.company().name(),
            filePath = "pdf/3.pdf",
            shipDate = "20" + "01" + "2023",
            shipTime = "11" + "00",
            delDate = "27" + "01" + "2023",
            delTime = "11" + "00",
            packType = BoxKind.BOX.toString(),
            transpCapacity = "1т / 7м3 / 3пал.", 
            transpType = TransportType.VAN.toString(),
            loadType = LoadType.BACK.toString(),
            cargoType = faker.funnyName().name(),
            cargoQty = String.valueOf(faker.number().numberBetween(1, 1000)),
            cargoWeight = String.valueOf(faker.number().numberBetween(1, 1000000)),
            cargoVolume = String.valueOf(faker.number().numberBetween(1, 1000000)),
            cost = String.valueOf(faker.number().numberBetween(1, 10000000)),
            tracknumber = "123456789",
            info = "ПОЛЬЗОВАТЕЛЬСКОЕ СОГЛАШЕНИЕ";
}
