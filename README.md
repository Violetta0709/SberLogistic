
# Automated tests for SberLogistics project
<p align="left">
<img src="images/bannersber.png" width="800" height="250" > 
</p>

<a target="_blank" href="https://sberlogistics.ru/">sberlogistics.ru</a>
## :white_square_button: Content:

- [Tools and technologies](#earth_africa-технологии-и-инструменты)
- [Implemented tests](#earth_africa-Реализованные-проверки)
- [Tests run with Jenkins](#earth_africa-Jenkins-job)
- [Allure report](#earth_africa-Allure-отчет)
- [Integration with Allure TestOps](#earth_africa-Интеграция-с-Allure-TestOps)
- [Telegram notifications](#earth_africa-Уведомление-в-Telegram-при-помощи-бота)
- [Tests implementation vieo](#earth_africa-Примеры-видео-о-прохождении-тестов)

## :white_square_button: Tools and technologies

<p align="left">
<a href="https://www.jetbrains.com/idea/"><img src="images/idea.png" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/java.png" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/github.png" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/junit5.png" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/gradle.png" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/selenide.png" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/selenoid.png" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/allure.png" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/jenkins.png" width="50" height="50"  alt="Jenkins"/></a>
</p>

## :white_square_button: Implemented tests

- ✓ Checking form of ordering custom clearance services;
- ✓ Checking tracking status of parcels;
- ✓ Checking sending form of cooperation request;
- ✓ Checking sending form "To become a partner";
- ✓ Checking user agreement content;
- ✓ Checking "Regional offices" information;
- ✓ Checking sending form "Ordering freight".


## <img src="images/jenkins.png" width="25" height="25"  alt="Jenkins"/></a> Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/Logistics/">Tests run with Jenkins</a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/Logistics/"><img src="images/jenkinsjob.jpg" alt="Jenkins"/></a>
</p>

### Jenkins parameters:

- browser (chrome by default)
- browserVersion
- browserSize (1920x1080 by default)
- remoteDriverUrl (login, password and address of remote selenoid server)
- videoStorage (address to get video)


## :white_square_button: Launching tests with terminal

Local launching:
```bash
gradle clean test
```

## :white_square_button: Remote launching:
```bash
clean
test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DremoteDriverUrl=https://${LOGIN}:${PASSWORD}@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
```

## <img src="images/allure.png" width="25" height="25"  alt="Allure"/></a> Report <a target="_blank" href="https://jenkins.autotests.cloud/job/Logistics/allure/">Allure report</a>

### Dashboard

<p align="center">
<img title="Allure Overview Dashboard" src="images/allurereport.jpg">
</p>

### Tests

<p align="center">
<img title="Allure Tests" src="images/testscreen.jpg">
</p>

### Tests implementation graphs

<p align="center">
<img title="Allure Graphics" src="images/graphs.jpg">
</p>

## <img src="images/allure_testopslogo.svg" width="25" height="25"  alt="Allure"/></a>Integration with Allure TestOps

### Dashboard

<p align="center">
<img title="Allure TestOps Dashboard" src="images/testops.jpg">
</p>

### Test cases

<p align="center">
<img title="Allure TestOps Tests" src="images/testops1.jpg">
</p>

## <img src="images/telegram.png" width="25" height="25"  alt="Allure"/></a> Telegram tests results notifications

<p align="center">
<img title="Allure Overview Dashboard" src="images/telegram_notifications.jpg">
</p>



### <img src="images/selenoid.png" width="25" height="25"  alt="Allure"/></a> Video of tests implementation

<p align="center">
<img title="Selenoid Video" src="images/video_tests.gif" width="950" height="550"  alt="video"> </p>
