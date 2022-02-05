package tests;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.CredentialsConfig;
import data.DataGen;
import helpers.Attach;
import io.qameta.allure.Description;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.*;
import data.DataStorage.*;


public class TestBase {
    public static DataGen data = new DataGen();
    public MainPage mainPage = new MainPage();
    public FreeTrialPage freeTrial = new FreeTrialPage();
    public AuthorizationPage authorizationPage = new AuthorizationPage();
    public ProfilePage profilePage = new ProfilePage();
    public FilmPage filmPage = new FilmPage();
    public FindPage findPage = new FindPage();
    public static CredentialsConfig credentials =
            ConfigFactory.create(CredentialsConfig.class);
    static String login = credentials.login();
    static String password = credentials.password();
    static String selenoid = System.getProperty("selenoid","selenoid.autotests.cloud/wd/hub");
    @BeforeAll
    static void setup(){
        Configuration.startMaximized = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.remote = "https://"+selenoid;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC",true);
        capabilities.setCapability("enableVideo",true);
        Configuration.browserCapabilities = capabilities;

    }
    @AfterEach
    public void teaedDown(){
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

    }

}

