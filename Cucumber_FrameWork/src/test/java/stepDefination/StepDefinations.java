package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {
	WebDriver driver;
	String Exp_Eid="";
	@Given("user navigate Url {string} in a browser")
	public void user_navigate_Url_in_a_browser(String url) {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get(url);
	}

	@When("User Enter username as {string}")
	public void user_Enter_username_as(String user) {
	   driver.findElement(By.name("txtUsername")).sendKeys(user);
	}

	@When("User Enter password as {string}")
	public void user_Enter_password_as(String pass) {
		 driver.findElement(By.name("txtPassword")).sendKeys(pass);
	}

	@When("User click login button")
	public void user_click_login_button() throws Throwable {
		 driver.findElement(By.name("Submit")).click();
		 Thread.sleep(2000);
	}

	@Then("User validate login success")
	public void user_validate_login_success() {
	    String Expected ="dashboard";
	    String Actual = driver.getCurrentUrl();
	    if(Actual.contains(Expected))
	    {
	    	System.out.println("Login success");
	    }
	    else
	    {
	    	System.out.println("Login Fail");
	    }
	}

	@When("User close browser")
	public void user_close_browser() {
	    driver.quit();
	}

	@When("User navigates to Add Employee page")
	public void user_navigates_to_Add_Employee_page() throws Throwable {
	    driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
	    driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
	    Thread.sleep(2000);
	}

	@When("user Enter as{string} in firstname")
	public void user_Enter_as_in_firstname(String fname) {
	   driver.findElement(By.name("firstName")).sendKeys(fname);
	}

	@When("user Enter as {string} in middlename")
	public void user_Enter_as_in_middlename(String mname) {
		driver.findElement(By.name("middleName")).sendKeys(mname);
	}

	@When("user Enter as {string} in last name")
	public void user_Enter_as_in_last_name(String lname) {
		driver.findElement(By.name("lastName")).sendKeys(lname);
	}

	@When("user capture eid")
	public void user_capture_eid() {
	   Exp_Eid = driver.findElement(By.name("employeeId")).getAttribute("value"); 
	}

	@When("user click save button")
	public void user_click_save_button() {
	    driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	}

	@Then("user validate employee id after adding")
	public void user_validate_employee_id_after_adding() {
	    String Act_Eid = driver.findElement(By.name("personal[txtEmployeeId]")).getAttribute("value");
	    if(Act_Eid.equals(Exp_Eid))
	    {
	    	System.out.println("Add Eployee Success::"+Exp_Eid+"   "+Act_Eid);
	    }
	    else
	    {
	    	System.out.println("Add Eployee UnSuccess::"+Exp_Eid+"   "+Act_Eid);
	    }
	    
	}

}
