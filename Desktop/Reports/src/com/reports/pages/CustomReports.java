package com.reports.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomReports 
{
	Select select;
	Actions action;
	WebDriver driver;
	
	//************** Custom Reports Links end ***********//
	
	@FindBy(xpath = "//span[text()=\"Custom Reports\"]")
	WebElement customReportsDropdown;

	@FindBy(linkText = "Report List")
	WebElement reportList;
	
	@FindBy(linkText = "Add Report")
	WebElement addReport;
	
	@FindBy(linkText = "Run")
	WebElement runLink;
	
	@FindBy(linkText = "Delete")
	WebElement deleteLink;
	
	@FindBy(linkText = "Add Custom Report")
	WebElement addCustomReport;
	
	//************* Custom Reports Links end *****************//
	
	public CustomReports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCustomReportsDropdown()
	{
		customReportsDropdown.click();
	}
	
	//************* Custom Reports Links start *****************//
	public void clickOnReportListLink()
	{
		reportList.click();
	}
	
	public void clickOnRunLink()
	{
		runLink.click();
	}
	
	//************* Custom Reports Links end *****************//
	
	public void actionEditReportRights( )
	{
		action = new Actions(driver);
		action.keyDown(Keys.ARROW_LEFT).click().build().perform();
	}

	
}
