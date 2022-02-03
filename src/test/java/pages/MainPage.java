package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;


public class MainPage {
    public FreeTrialPage freeTrial = new FreeTrialPage();
    private SelenideElement
    newFilms = $("#NewFeatured_slide__3yot_"),
    topTen = $("h2[data-testid='title_label']"),
    starProduct = $("h2[data-testid='title_label1']"),
    trialButton = $("span[data-testid='try_free_button_text']");

    public MainPage openPage(){
        open("https://start.ru");
        newFilms.shouldBe();
        return this;
    }
    public MainPage checkTopTen(){
        topTen.shouldBe(Condition.text("Топ-10 на STAR"));
        return this;
    }
    public MainPage checkStartProduct(){
        starProduct.shouldBe(Condition.text("STAR представляет"));
        return this;
    }
    public MainPage startFreeTrial(){
        trialButton.shouldHave().click();
        freeTrial.openCheck();
        return this;

    }



}
