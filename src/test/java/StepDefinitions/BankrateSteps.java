package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BankrateSteps {

    WebDriver driver = new ChromeDriver();

    @Given("browser is open")
    public void browser_is_open() {
        driver.get("https://www.bankrate.com/");
        driver.manage().window().maximize();
        System.out.println("Inside step - Browser opened");

    }
    @And("user navigates to bankrate website")
    public void user_navigates_to_bankrate_website() {
        String bankrateHomepageUrl = driver.getCurrentUrl();
        System.out.println("The bankrate website url is: " + bankrateHomepageUrl);
        System.out.println("Inside step - user navigates to bankrate website");


    }
    @When("user clicks on the mortgage calculator page")
    public void user_clicks_on_the_mortgage_calculator_page() throws InterruptedException {
        driver.findElement(By.xpath("//span[normalize-space()='Mortgage calculator']")).click();
        Thread.sleep(3000);
        System.out.println("Inside step - user clicks on the mortgage calculator page");

    }
    @And("user updates the value on boxes for: Home Price, Downpayment, Loan term, Interest Rate, and Zip Code")
    public void user_updates_the_value_on_boxes_for_home_price_downpayment_loan_term_interest_rate_and_zip_code() throws InterruptedException {
        driver.findElement(By.id("homePrice")).clear();
        driver.findElement(By.id("homePrice")).sendKeys("500000");
        Thread.sleep(2000);
        driver.findElement(By.id("down-payment")).clear();
        driver.findElement(By.id("down-payment")).sendKeys("200000");
        Thread.sleep(2000);
        WebElement dropdown = driver.findElement(By.id("text22"));
        Select selectObject = new Select(dropdown); selectObject.selectByValue("387");
        Thread.sleep(2000);
        driver.findElement(By.id("interestRate")).sendKeys("6.00");
        Thread.sleep(2000);
        driver.findElement(By.id("__br_el_29")).sendKeys("11218");
        Thread.sleep(3000);
        System.out.println("Inside Step - user updates the value on boxes for: Home Price, Downpayment, Loan term, Interest Rate, and Zip Code");


    }
    @Then("user clicks on Taxes, Insurance, HOA fees text to expand more fields")
    public void user_clicks_on_taxes_insurance_hoa_fees_text_to_expand_more_fields() throws InterruptedException {
        driver.findElement(By.id("__br_el_31")).click();
        Thread.sleep(2000);
        System.out.println("Inside Step - user clicks on Taxes, Insurance, HOA fees text to expand more fields");

    }
    @And("user locates and enters values in the boxes for: Credit Score, Property Tax per Month, Homeowner's Insurance per month, PMI per month, and HOA fees per month")
    public void user_locates_and_enters_values_in_the_boxes_for_credit_score_property_tax_per_month_homeowner_s_insurance_per_month_pmi_per_month_and_hoa_fees_per_month() throws InterruptedException {
        WebElement creditScoreBox = driver.findElement(By.id("text33"));
        Select objSelect = new Select(creditScoreBox);
        objSelect.selectByValue("740+");
        Thread.sleep(2000);
        driver.findElement(By.id("propertyTax")).sendKeys("500");
        Thread.sleep(2000);
        driver.findElement(By.id("homeInsurance")).sendKeys("100");
        Thread.sleep(2000);
        driver.findElement(By.id("pmi")).sendKeys("0");
        Thread.sleep(2000);
        driver.findElement(By.id("hoa")).sendKeys("200");
        Thread.sleep(2000);
        System.out.println("Inside Step - user locates and enters values in the boxes for: Credit Score, Property Tax per Month, Homeowner's Insurance per month, PMI per month, and HOA fees per month");

    }
    @Then("user locates and clicks on the Update button")
    public void user_locates_and_clicks_on_the_update_button() throws InterruptedException {
        driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
        Thread.sleep(5000);
        System.out.println("Inside Step - user locates and clicks on the Update button");
        driver.close();
    }

}
