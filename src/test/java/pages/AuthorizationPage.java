package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import data.DataStorage;
import data.DataStorage.*;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class AuthorizationPage {
    private SelenideElement
            signPage = $x("//div[@class='Sign_sign__form-title__3BM85'][.='Вход в аккаунт']"),
            signEmailField = $x("//input[@id='signField']"),
            signPasswordField = $x("//input[@id='signPassword']"),
            buttonSign = $x("//*[@class='Button_button-text__3dENX'][.='Войти']"),
            capchaField = $x("//input[@id='signFieldCapcha']");

    public AuthorizationPage openPage(){
        open("https://start.ru/signin");
        signPage.shouldHave();
        return this;
    }

    public AuthorizationPage typeEmail(String email){
        signEmailField.setValue(email);
        return this;
    }
    public AuthorizationPage typePassword(String password){
        signPasswordField.setValue(password);
        return this;
    }
    public AuthorizationPage signButton(){
        buttonSign.click();
        capchaField.shouldHave(Condition.visible);
        return this;
    }


}
