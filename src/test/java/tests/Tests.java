package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@Tag("Owner")
public class Tests extends TestBase {

     @Test
     @DisplayName("Элементы главной страници")
     void MainPageTest(){
         mainPage.openPage()
                 .checkStartProduct()
                 .checkTopTen()
                 .startFreeTrial();
    }
    @Test
    @DisplayName("Проверка регистрации")
    void FreeTrialTest(){
        freeTrial.openPage()
                .typeEmail(data.email)
                .typePassword(data.password)
                .agreementPrivate()
                .regNewAc()
                .typeCardNumber(data.cardNumber)
                .typeCardDate(data.cardDate)
                .typeCardCVV(data.cardCVV)
                .clickPayButton()
                .errorComplete();
    }
}
