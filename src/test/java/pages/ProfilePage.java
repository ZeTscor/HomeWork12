package pages;
import data.DataStorage;
import data.DataStorage.*;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;


import static com.codeborne.selenide.Selenide.$x;

public class ProfilePage {
   private SelenideElement
            emailField = $x("//div[@class= 'Account_account__data__text__23ACf']");

   public ProfilePage openPage(){
      MainPage mainPage = new MainPage();
      mainPage.openProfile();
      return this;
   }

   public ProfilePage emailAssert(String email ){
       String profileEmail = emailField.text();
      Assertions.assertEquals(email, profileEmail);
      return this;
   }

}
