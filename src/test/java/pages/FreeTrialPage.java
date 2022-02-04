package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.junit.SoftAsserts;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class FreeTrialPage {
    public ErrorPayPage errorPay = new ErrorPayPage();
    private SelenideElement
            trialText = $(byText("Зарегистрируйтесь и смотрите START 7 дней бесплатно")),
            cookieAccept = $x("//a[.='Использовать все cookies']"),
            emailFiled = $("#signField"),
            passwordField = $("#signPassword"),
            privatePolitic = $x("//label[@for='agreement']"),
            agreeConsent = $x("//button[.= 'Agree']"),
            regButton = $x("//span[@class='Button_button-text__3dENX']"),
            cardNumberField = $("#cardNumber"),
            cardDateField = $("#cc-exp"),
            cardCVVField = $("#cardCsc"),
            payButton = $("div[class='payment__button active']"),
            cardNumberError = $x("//div[@class='payment__card-error'][.= 'Некорректный номер карты']");

    public FreeTrialPage openPage() {
        open("https://start.ru/signup");
        trialText.shouldHave();
        cookieAccept.click();
        return this;
    }

    public FreeTrialPage typeEmail(String email) {
        emailFiled.shouldHave();
        emailFiled.setValue(email);
        return this;
    }

    public FreeTrialPage typePassword(String password) {
        passwordField.setValue(password);
        return this;
    }

    public FreeTrialPage agreementPrivate() {
        privatePolitic.scrollIntoView(true).click();
        return this;
    }

    public FreeTrialPage agreeConsent() {
        agreeConsent.click();
        return this;
    }

    public FreeTrialPage regNewAc() {
        regButton.scrollIntoView(true).click();
        return this;
    }

    public FreeTrialPage typeCardNumber(String cardNumber) {
        cardNumberField.shouldHave();
        cardNumberField.setValue(cardNumber);
        return this;
    }

    public FreeTrialPage typeCardDate(String cardDate) {
        cardDateField.setValue(cardDate);
        return this;
    }

    public FreeTrialPage typeCardCVV(String cardCVV) {
        cardCVVField.setValue(cardCVV);
        return this;
    }

    public FreeTrialPage clickPayButton() {
        payButton.click();
        return this;
    }

    public FreeTrialPage errorCardNumber() {
        cardNumberError.shouldHave();
        return this;
    }

    public FreeTrialPage errorComplete() {
        errorPay.validText();
        return this;
    }

    public FreeTrialPage openCheck() {
        trialText.shouldHave();
        return this;
    }


}
