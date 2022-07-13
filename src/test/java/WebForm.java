import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class WebForm extends PageObject {


    private final String USERNAME = "niklogin";

    private final String PASSWORD = "nikpassword";

    private final String DEPARTDATE = "08/07/2016";

    private final String RETURNDATE = "01/01/2021";

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

    @FindBy(name = "departDate")
    private WebElement depart_date;

    @FindBy(name = "returnDate")
    private WebElement return_date;

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

    @FindBy(xpath = "/html/body/blockquote/form/center/table[1]/tbody/tr[5]/td[1]/input")
    private WebElement flight_1;

    @FindBy(xpath = "/html/body/blockquote/form/center/table[2]/tbody/tr[5]/td[1]/input")
    private WebElement flight_2;

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

    public void chooseDepartureCity() {
        Select dropdown = new Select(driver.findElement(By.name("depart")));
        dropdown.selectByVisibleText("Frankfurt");
    }

    public void chooseArrivalCity() {
        Select dropdown = new Select(driver.findElement(By.name("arrive")));
        dropdown.selectByVisibleText("Zurich");
    }

    public void chooseDEPARTUREDATE(){
        this.depart_date.clear();
        this.depart_date.sendKeys(DEPARTDATE);
    }

    public void chooseRETURNDATE(){
        this.return_date.clear();
        this.return_date.sendKeys(RETURNDATE);
    }

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

    public void chooseFLIGHT1(){
        this.flight_1.click();
    }

    public void chooseFLIGHT2(){
        this.flight_2.click();
    }

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

