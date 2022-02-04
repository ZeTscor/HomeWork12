package tests;

import data.DataStorage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
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
    void FilmTest(){
        filmPage.openPage()
                .ageAccept()
                .InfoFilms();
    }
    @Test
    void FindFilmTest(){
        mainPage.findFilm(DataStorage.NAME);
        filmPage.InfoFilms();
    }
}
