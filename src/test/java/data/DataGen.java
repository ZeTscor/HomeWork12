package data;
import com.github.javafaker.Faker;

public class DataGen {
    Faker faker = new Faker();
    public String email = faker.internet().emailAddress();
    public String password = faker.internet().password();
    public String cardNumber = faker.business().creditCardNumber();
    public String cardDate = faker.business().creditCardExpiry();
    public String cardCVV = "545";

}