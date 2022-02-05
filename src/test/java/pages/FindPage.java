package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class FindPage {
    SelenideElement
            cookieAcceptButton = $x("//a[.='Использовать все cookies']"),
            films = $x("(//div[@class='VideoUnit_video_unit_content_cell_title__6hv5g'])[1]");



    public FindPage foundedFilms(String name){
        Assertions.assertTrue(films.getText().contains(name));
        return this;
    }

    public FindPage redirectAsFilm(){
        cookieAcceptButton.click();
        sleep(200);
        films.click();
        return this;
    }
}
