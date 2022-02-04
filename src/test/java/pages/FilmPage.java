package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class FilmPage {
    private SelenideElement
            ageAccept = $x("//div[@class='popups_check-age__button-agree__23TZ2'][.='Да']"),
            freeView = $x("//div[@class='TopBlock_TopBlock__button-play__28Kv- '][.= 'Смотреть бесплатно']"),
            trellis = $x("//div[@class='Trailers_product__trailers-item-title__34jyB'][.= 'Трейлер']"),
            castInfo = $x("//h2[@class='Product_product__linked__2HnP4 '][.= 'Актеры и съемочная группа']");

    public FilmPage openPage(){
//        MainPage mainPage = new MainPage();
//        mainPage.openPage()
//                //.acceptCookie()
//                .openFilm();
        open("https://start.ru/watch/nadezhda");
        return this;
    }
    public FilmPage InfoFilms() {
        ageAccept.click();
        freeView.shouldHave(Condition.visible);
        trellis.scrollIntoView(true).shouldHave(Condition.visible);
        castInfo.scrollIntoView(true).shouldHave(Condition.visible);
        return this;
    }

}
