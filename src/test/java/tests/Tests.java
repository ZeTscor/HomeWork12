package tests;

import data.DataStorage;
import io.qameta.allure.Flaky;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import pages.ProfilePage;

@Tag("Owner")
public class Tests extends TestBase {

    @Test
    @DisplayName("Элементы главной страници")
    void MainPageTest() {
        mainPage.openPage()
                .checkStartProduct()
                .checkTopTen()
                .startFreeTrial();
    }

    @Test
    @Flaky
    @DisplayName("Проверка регистрации")
    void FreeTrialTest() {
        freeTrial.openPage()
                .typeEmail(data.email)
                .typePassword(data.password)
                .agreementPrivate()
                .agreeConsent()
                .regNewAc()
                .typeCardNumber(data.cardNumber)
                .typeCardDate(data.cardDate)
                .typeCardCVV(data.cardCVV)
                .clickPayButton()
                .errorCardNumber();
    }

    @Test
    @DisplayName("Авторизация")
    void AuthorizationTest() {
        authorizationPage.openPage()
                .typeEmail(DataStorage.EMAIL)
                .typePassword(DataStorage.PASSWORD)
                .signButton();
    }
    @Test
    @DisplayName("Cтраничка фильма")
    void FilmTest(){
        filmPage.openPage()
                .ageAccept()
                .InfoFilms();
    }
    @ValueSource(strings = {"Маша и Медведь", "Шерлок"})
    @ParameterizedTest(name = "Поиск по фильмам {0}")
    @Flaky
    void FindFilmTest(String filmName){
        mainPage.openPage()
                .findFilm(filmName);
        findPage.foundedFilms(filmName);
        filmPage.InfoFilms();
    }
}
