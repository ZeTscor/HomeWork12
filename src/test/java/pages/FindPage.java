package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.$x;

public class FindPage {
    SelenideElement
            cookieAcceptButton = $x("//a[.='Использовать все cookies']");


    public FindPage foundedFilms(String name){
        cookieAcceptButton.click();
        SelenideElement
                films = $x("(//*[contains(text(), '"+name+"')])[2]");
        Assertions.assertTrue(films.getText().contains(name));

        films.click();
        return this;
    }
}
