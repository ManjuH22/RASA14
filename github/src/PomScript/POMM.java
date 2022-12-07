package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMM
{
	//Declaration
			@FindBy (id="email")
			private WebElement emailtextfield;
			
			@FindBy(id="pass")
			private WebElement unTextfield;
			
			@FindBy(xpath = "//button[@name='login']")
			private WebElement loginbtn;
			
			//initialization
			public  POMM(WebDriver driver) 
			{
				
				
				PageFactory.initElements(driver, this);
			}
			
			//Utilization
			public void emailadd(String un) 
			{
				
				emailtextfield.sendKeys(un);
			}
			
			public void pwdadd(String pw) 
			{
				
				unTextfield.sendKeys(pw);
			}
			
			public void clickk()
			{
				
				loginbtn.click();
			}
			
			

}
