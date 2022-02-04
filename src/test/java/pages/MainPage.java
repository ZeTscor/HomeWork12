package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;


public class MainPage {
    public FreeTrialPage freeTrial = new FreeTrialPage();
    private SelenideElement
            newFilms = $("#NewFeatured_slide__3yot_"),
            topTen = $x("//div[@class='VideoUnit_vline__header__2alTs'][.= 'Топ-10 на START']"),
            starProduct = $x("//div[@class='VideoUnit_vline__header__2alTs'][.= 'START представляет']"),
            trialButton = $("span[data-testid='try_free_button_text']"),
            filmHref = $x("//div[@class='VideoUnit_vline__slider__3uu_U'][4]"),
            profileIco = $x("//div[@class='HeaderMenu_header-menu-authorized__2K3x5'");

    public MainPage openPage() {
        open("https://start.ru");
        newFilms.shouldBe();
        return this;
    }

    public MainPage checkTopTen() {
        topTen.scrollIntoView(true).shouldHave();
        return this;
    }

    public MainPage checkStartProduct() {
        starProduct.shouldHave();
        return this;
    }

    public MainPage startFreeTrial() {
        trialButton.shouldHave().click();
        freeTrial.openCheck();
        return this;

    }

    public MainPage openFilm() {
        filmHref.click();
        return this;
    }

    public MainPage openProfile(){
        profileIco.click();
        return this;
    }


}
