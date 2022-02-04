package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.$x;

public class FindPage {
    SelenideElement
            films = $x("//a[@class='VideoUnit_video_unit_content_cell__1AxPk'][1]");

    public FindPage foundedFilms(String name){
        Assertions.assertTrue(films.getText().contains(name));
        films.click();
        return this;
    }
}
