package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class FilmPage {
    private SelenideElement
            freeView = $x("//div[@class='TopBlock_TopBlock__button-play__28Kv- '][.= 'Смотреть бесплатно']"),
            trellis = $x("//div[@class='Trailers_product__trailers__2TSWA'][.= 'Трейлер']"),
            castInfo = $x("//div[@class='Cast_product__cast__Fppd9'][.= 'Актеры и съемочная группа']");

    public FilmPage openPage(){
        MainPage mainPage = new MainPage();
        mainPage.openPage()
                .openFilm();
        return this;
    }
    public FilmPage InfoFilms() {
        freeView.shouldHave();
        trellis.shouldHave();
        castInfo.shouldHave();
        return this;
    }

}
