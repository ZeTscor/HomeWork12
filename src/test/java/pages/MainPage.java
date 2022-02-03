package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;


public class MainPage {
    private SelenideElement
    newFilms = $("#NewFeatured_slide__3yot_"),
    topTen = $("h2[data-testid='title_label']"),
    starProduct = $("h2[data-testid='title_label1']"),
    trialButton = $("span[data-testid='try_free_button_text']");

    public MainPage openPage(){
        open("star.ru");
        newFilms.shouldBe();
        topTen.shouldBe(Condition.text("Топ-10 на STAR"));
        starProduct.shouldBe(Condition.text("STAR представляет"));
        trialButton.shouldHave();
        return this;
    }



}
