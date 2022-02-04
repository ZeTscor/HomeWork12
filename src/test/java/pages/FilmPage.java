package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class FilmPage {
    private SelenideElement
            ageAccept = $x("//div[@class='popups_check-age__button-agree__23TZ2'][.='Да']"),
            freeView = $x("//div[@class='TopBlock_TopBlock__button-play__28Kv- '][.= 'Смотреть бесплатно']"),
            trellis = $x("//div[@class='Trailers_product__trailers__2TSWA'][.= 'Трейлер']"),
            castInfo = $x("//div[@class='Cast_product__cast__Fppd9'][.= 'Актеры и съемочная группа']");

    public FilmPage openPage(){
        MainPage mainPage = new MainPage();
        mainPage.openPage()
                .acceptCookie()
                .openFilm();
        return this;
    }
    public FilmPage InfoFilms() {
        ageAccept.click();
        freeView.shouldHave(Condition.visible);
        trellis.shouldHave(Condition.visible);
        castInfo.shouldHave(Condition.visible);
        return this;
    }

}
