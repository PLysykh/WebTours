import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import static org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.Conversions.toUpperCase;


public class WebForm extends PageObject {

    public void selectDepartCity(){
        List<WebElement> allDepart = driver.findElements(By.xpath("//*[@name='depart']/option"));
        int size = allDepart.size();
        int randomCITY = ThreadLocalRandom.current().nextInt(0, size);
        allDepart.get(randomCITY).click();
    }

    public void selectArrivalCity(){
        List<WebElement> allDepart = driver.findElements(By.xpath("//*[@name='arrive']/option"));
        int size = allDepart.size();
        int randomCITY = ThreadLocalRandom.current().nextInt(0, size);
        allDepart.get(randomCITY).click();
    }

    private final String USERNAME = "niklogin";

    private final String PASSWORD = "nikpassword";

    public void chooseDEPARTUREDATE() {
        driver.findElement(By.name("departDate")).clear();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/uuuu");
        LocalDate localDate = LocalDate.now();
        driver.findElement(By.name("departDate")).sendKeys(dtf.format(localDate));
    }

    public void chooseRETURNDATE() {
        driver.findElement(By.name("returnDate")).clear();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/uuuu");
        LocalDate localDate = LocalDate.now();
        LocalDate returnDATE = localDate.plusDays(1);
        driver.findElement(By.name("returnDate")).sendKeys(dtf.format(returnDATE));
    }

    public void chooseFLIGHT1(){
/*        List<WebElement> allFlights = driver.findElements(By.xpath("//*[contains(text(), 'outboundFlight')]"));
        int size = allFlights.size();
        int randomFLIGHT1 = ThreadLocalRandom.current().nextInt(0, 10);
        allFlights.get(randomFLIGHT1).click();*/

 /*       List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        Random ram=new random.nextInt(1,3);
        if(!checkboxes.get(ram).isSelected)
        {
            checkboxes.get(ram).click();
        }*/

        List<WebElement> allFlights = driver.findElements(By.xpath("//*[@type='radio']"));
        int size = allFlights.size();
        int randomFLIGHT = new Random().nextInt(0, size);
        allFlights.get(randomFLIGHT).click();

    }


    private final String NUMPASSENGERS = "2";

    private final String FIRSTNAME = "James";

    private final String LASTNAME = "Bond";

    private final String STREETADRESS = "20 Oktyabrya, 22-40";

    private final String CITYSTATEZIP = "ROME";

    private final String NAME1 = "John Doe";

    private final String NAME2 = "Jane Doe";

    private final String CREDITCARD = "946736666";

    private final String EXPDATE = "22/03";



    @FindBy(xpath = "//input[@type='text']")
    private WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@type='image']")
    private WebElement login;

    @FindBy(xpath = "//img[@alt='Search Flights Button']")
    private WebElement flights_button;

//    @FindBy(name = "departDate")
//    private WebElement depart_date;

//    @FindBy(name = "returnDate")
//    private WebElement return_date;

    @FindBy(name = "numPassengers")
    private WebElement num_passengers;

    @FindBy(name = "roundtrip")
    private WebElement round_trip;

    @FindBy(xpath = "//input[@value= 'Aisle']")
    private WebElement seating_preference;

    @FindBy(xpath = "//input[@value= 'First']")
    private WebElement type_of_seat;

    @FindBy(xpath = "/html/body/blockquote/form/table/tbody/tr[7]/td/input")
    private WebElement find_flights;

//    @FindBy(xpath = "/html/body/blockquote/form/center/table[1]/tbody/tr[5]/td[1]/input")
//    private WebElement flight_1;

 //   @FindBy(xpath = "/html/body/blockquote/form/center/table[2]/tbody/tr[5]/td[1]/input")
//   private WebElement flight_2;

    @FindBy(xpath = "/html/body/blockquote/form/center/center/table/tbody/tr/td[1]/input")
    private WebElement reserve_Flights;

    @FindBy(xpath = "//input[@value = 'Nikita']")
    private WebElement first_name;

    @FindBy(name = "lastName")
    private WebElement last_name;

    @FindBy(name = "address1")
    private WebElement street_adress;

    @FindBy(name = "address2")
    private WebElement city_state_zip;

    @FindBy(name = "pass1")
    private WebElement name_1;

    @FindBy(name = "pass2")
    private WebElement name_2;

    @FindBy(name = "creditCard")
    private WebElement credit_card;

    @FindBy(name = "expDate")
    private WebElement exp_date;

    @FindBy(name = "saveCC")
    private WebElement save_info;

    @FindBy(xpath = "/html/body/blockquote/form/center/table/tbody/tr/td[1]/input")
    private WebElement buy_flights;

    @FindBy(xpath = "//img[@alt='SignOff Button']")
    private WebElement log_out;




    public WebForm(WebDriver driver) {
        super(driver);
    }


    public void frameOne() {
        driver.switchTo().frame("body");
        driver.switchTo().frame("navbar");
    }

    public void frameNavbar() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("body");
        driver.switchTo().frame("navbar");
    }

    public void frameInfo() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("body");
        driver.switchTo().frame("info");
    }

    public void enterUSERNAME() {
        this.username.sendKeys(USERNAME);
    }

    public void enterPASSWORD() {
        this.password.sendKeys(PASSWORD);
    }

    public void pressLOGINBUTTON() {
        this.login.click();
    }

    public void pressFLIGHTSBUTTON() {
        this.flights_button.click();
    }

    /*public void chooseDepartureCity() {
        Select dropdown = new Select(driver.findElement(By.name("depart")));
        dropdown.selectByVisibleText("Frankfurt");
    }*/

    /*public void chooseArrivalCity() {
        Select dropdown = new Select(driver.findElement(By.name("arrive")));
        dropdown.selectByVisibleText("Zurich");
    }*/

//    public void chooseDEPARTUREDATE(){
//        this.depart_date.clear();
//        this.depart_date.sendKeys(DEPARTDATE);
//    }

//    public void chooseRETURNDATE(){
//        this.return_date.clear();
//        this.return_date.sendKeys(RETURNDATE);
//    }

    public void chooseNumPassengers(){
        this.num_passengers.clear();
        this.num_passengers.sendKeys(NUMPASSENGERS);
    }

    public void chooseRoundtrip(){
        this.round_trip.click();
    }

    public void chooseSeatingPreference(){
        this.seating_preference.click();
    }

    public void chooseTypeOfSeat(){
        this.type_of_seat.click();
    }

    public void pressCONTINUE(){
        this.find_flights.click();
    }

//    public void chooseFLIGHT1(){
//        this.flight_1.click();
//    }

//    public void chooseFLIGHT2(){
//        this.flight_2.click();
//    }

    public void pressRESERVEFLIGHTS(){
        this.reserve_Flights.click();
    }

    public void enterFIRSTNAME(){
        this.first_name.clear();
        this.first_name.sendKeys(FIRSTNAME);
    }

    public void enterLASTNAME(){
        this.last_name.clear();
        this.last_name.sendKeys(LASTNAME);
    }

    public void enterSTREETADRESS(){
        this.street_adress.clear();
        this.street_adress.sendKeys(STREETADRESS);
    }

    public void enterCITYSTATEZIP(){
        this.city_state_zip.clear();
        this.city_state_zip.sendKeys(CITYSTATEZIP);
    }

    public void enterNAME1(){
        this.name_1.clear();
        this.name_1.sendKeys(NAME1);
    }

    public void enterNAME2(){
        this.name_2.sendKeys(NAME2);
    }

    public void enterCREDITCARD(){
        this.credit_card.sendKeys(CREDITCARD);
    }

    public void enterEXPDATE(){
        this.exp_date.sendKeys(EXPDATE);
    }

    public void chooseSAVEINFO(){
        this.save_info.click();
    }

    public void pressBUYFLIGHTS(){
        this.buy_flights.click();
    }

    public void pressLOGOUT(){
        this.log_out.click();
    }
}

