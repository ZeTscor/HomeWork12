package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ErrorPayPage {
    SelenideElement
            eroPay = $("div[class='popup__title']"),
            eroPayButton = $("div[class='popup__button']");

    public  ErrorPayPage validText(){
        eroPay.shouldHave(Condition.visible);
        return this;
    }
    public  ErrorPayPage closeForm(){
        eroPayButton.click();
        return this;
    }
}
