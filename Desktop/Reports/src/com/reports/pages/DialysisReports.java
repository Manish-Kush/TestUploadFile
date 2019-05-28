package com.reports.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class DialysisReports extends BaseTest{

    @FindBy(xpath = "//span[text() =\"Dialysis Reports\" ]")
    WebElement dialysisReportsDropDown;

    @FindBy(linkText = "Dialysis Session Report Favourites")
    WebElement dialysisSessionReportFavourites;

    @FindBy(linkText = "Dialysis Session Report Builder")
    WebElement dialysisSessionReportBuilder;


    @FindBy(linkText = "Dialysis Frequency Report Builder")
    WebElement dialysisFrequencyReportBuilder;
    
    @FindBy(linkText = "Clinical Outcomes Report")
    WebElement clinicalOutcomesReport;
    
    @FindBy(linkText = "Intra Dialysis Parameters Report Builder")
    WebElement intraDialysisParametersReportBuilder;


    public DialysisReports()
    {
    	PageFactory.initElements(driver, this);
    }




    public void clickOnDialysisReportsDropDown()
    {
    	dialysisReportsDropDown.click();
    }	

    public void clickOnDialysisSessionReportFavourites()
    {
    	dialysisSessionReportFavourites.click();
    }

    public void clickOnDialysisSessionReportBuilder()
    {
    	dialysisSessionReportBuilder.click();
    }

    public void clickOnDialysisFrequencyReportBuilder()
    {
    	dialysisFrequencyReportBuilder.click();
    }
    
    public void clickOnClinicalOutcomesReport()
    {
    	clinicalOutcomesReport.click();
    }
    
    public void clickOnIntraDialysisParametersReportBuilder()
    {
    	intraDialysisParametersReportBuilder.click();
    }
}
