
import com.opencsv.exceptions.CsvValidationException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "WEBTOURS/NIKITA-TESTTESTTEST")
    public static void All_Site_Quick_RUN() throws InterruptedException, CsvValidationException, IOException {
        //Opening webpage and authorization
        driver.get(Utils.BASE_URL);
        driver.switchTo().frame("body");
        driver.switchTo().frame("navbar");
        WebForm webForm = new WebForm(driver);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        webForm.enterUSERNAMES();
        Thread.sleep(2000);

        //Clicking Flights button
        driver.switchTo().defaultContent();
        driver.switchTo().frame("body");
        driver.switchTo().frame("navbar");
        webForm.pressFLIGHTSBUTTON();

        //Selecting Departure City, Arrival City, Departure Date, Return Date, Number of Passengers, Roundtrip ticket option, Seating Preference, Type of Seat
        driver.switchTo().defaultContent();
        driver.switchTo().frame("body");
        driver.switchTo().frame("info");
        Thread.sleep(1000);
        webForm.selectDepartCity();
        Thread.sleep(2000);
        webForm.selectArrivalCity();
        Thread.sleep(2000);
        webForm.chooseDEPARTUREDATE();
        Thread.sleep(2000);
        webForm.chooseRETURNDATE();
        Thread.sleep(2000);
        webForm.chooseNumPassengers();
        Thread.sleep(2000);
        webForm.chooseRoundtrip();
        Thread.sleep(2000);
        webForm.chooseSeatingPreference();
        Thread.sleep(2000);
        webForm.chooseTypeOfSeat();
        Thread.sleep(2000);
        webForm.pressCONTINUE();

        //Choosing Departure and Return Flights
        driver.switchTo().defaultContent();
        driver.switchTo().frame("body");
        driver.switchTo().frame("info");
        Thread.sleep(1000);
        webForm.chooseFLIGHT1();
        Thread.sleep(2000);
        //       webForm.chooseFLIGHT2();
        Thread.sleep(2000);
        webForm.pressRESERVEFLIGHTS();
        Thread.sleep(2000);

        //Payment Details
        driver.switchTo().defaultContent();
        driver.switchTo().frame("body");
        driver.switchTo().frame("info");
        Thread.sleep(1000);
        webForm.enterFIRSTNAME();
        Thread.sleep(2000);
        webForm.enterLASTNAME();
        Thread.sleep(2000);
        webForm.enterSTREETADRESS();
        Thread.sleep(2000);
        webForm.enterCITYSTATEZIP();
        Thread.sleep(2000);
        webForm.enterNAME1();
        Thread.sleep(2000);
        webForm.enterNAME2();
        Thread.sleep(2000);
        webForm.enterCREDITCARD();
        Thread.sleep(2000);
        webForm.enterEXPDATE();
        Thread.sleep(2000);
        webForm.chooseSAVEINFO();
        Thread.sleep(2000);
        webForm.pressBUYFLIGHTS();
        Thread.sleep(2000);

        //Log Out
        driver.switchTo().defaultContent();
        driver.switchTo().frame("body");
        driver.switchTo().frame("navbar");
        webForm.pressLOGOUT();
        Thread.sleep(2000);
    }

    @AfterSuite
    public static void cleanup(){
        driver.manage().deleteAllCookies();
        driver.manage().window().minimize();
        driver.close();
    }
}