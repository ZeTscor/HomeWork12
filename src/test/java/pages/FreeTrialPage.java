package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FreeTrialPage {
    public ErrorPayPage errorPay = new ErrorPayPage();
    private SelenideElement
    trialText = $(byText("Зарегистрируйтесь и смотрите START 7 дней бесплатно")),
    emailFiled = $("#signField"),
    passwordField = $("#signPassword"),
    privatePolitic = $("input[id='agreement']"),
    regButton = $("div[class='Button_fullWidth__3hW2V']"),
    cardNumberField = $("#cardNumber"),
    cardDateField = $("#cc-exp"),
    cardCVVField = $("#cardCsc"),
    payButton = $("div[class='payment__button active']");

    public FreeTrialPage openPage(){
        open("https://start.ru/signup");
        trialText.shouldHave();
        return this;
    }
    public FreeTrialPage typeEmail(String email){
        emailFiled.shouldHave();
        emailFiled.setValue(email);
        return this;
    }
    public FreeTrialPage typePassword(String password){
        passwordField.setValue(password);
        return this;
    }
    public FreeTrialPage agreementPrivate(){
        privatePolitic.click();
        return this;
    }
    public FreeTrialPage regNewAc(){
        regButton.click();
        return this;
    }

    public FreeTrialPage typeCardNumber(String cardNumber){
        cardNumberField.shouldHave();
        cardNumberField.setValue(cardNumber);
        return this;
    }
    public FreeTrialPage typeCardDate(String cardDate){
        cardDateField.setValue(cardDate);
        return this;
    }
    public FreeTrialPage typeCardCVV(String cardCVV){
        cardCVVField.setValue(cardCVV);
        return this;
    }

    public  FreeTrialPage clickPayButton(){
        payButton.click();
        return this;
    }
    public FreeTrialPage errorComplete(){
        errorPay.validText();
        return this;
    }

    public FreeTrialPage openCheck(){
        trialText.shouldHave();
        return this;
    }






}
