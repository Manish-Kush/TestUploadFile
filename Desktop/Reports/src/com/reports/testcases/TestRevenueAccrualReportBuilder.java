package com.reports.testcases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.reports.generics.BaseTest;
import com.reports.pages.BuiderElements;
import com.reports.pages.FinancialReports;


public class TestRevenueAccrualReportBuilder extends BaseTest
{

	TestLoginPage testLoginPage;
	FinancialReports financialReport;
	BuiderElements builderElements;
	TestBuilders testBuilder;
	
//	String[][] dateRangeOptions = new String[5][2];
	
	public void navigateToReportsBuilder()
	{
		financialReport = new FinancialReports(driver);
		financialReport.clickOnRevenueAccrualReportBuilder();
	}

	@DataProvider()
	public String[][] dateRangeDropDownOptions()
	{	
		return dateRangeOptions;
	}
	
	@DataProvider()
	public String[][] allowedReportDurationoption()
	{	
		return allowedReportDurationoption;
	}
	
	@BeforeClass
	public void setUp()
	{
		testBuilder = new TestBuilders(USERNAME,PASSWORD,"Y");
		navigateToReportsBuilder();
	}

	
	@Test(priority = 1)
	public void test3MonthPdf()
	{	
		boolean a	= testBuilder.test3MonthPdf("01-01-2019","01-05-2019");	//changes required for custom reports
		Assert.assertEquals(a, true);	 					
	}
	
	
	
//	@Test(priority = 2)
//	public void test3MonthCsv_Csv()
//	{
//		System.out.println("wdjnchwebxhw");
//		boolean a = testBuilder.test3MonthCsv();
//		System.out.println("a = "+a);
//		Assert.assertEquals(a, true);
//	}
	
	
	@Test(priority = 2)
     public void test3MonthCsv()
	{
		boolean a = testBuilder.test3MonthCsv();
		Assert.assertEquals(a, true);
	}
	
	
	@Test(priority = 3)
	public void test3MonthText()
	{
		boolean a	= testBuilder.test3MonthText();	
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 4)
	public void testDateFieldsBlank_pdf() 
	{
		boolean a	= testBuilder.testDateFieldsBlank_pdf();	
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 5)
	public void testDateFieldsBlank_csv() 
	{
		boolean a	= testBuilder.testDateFieldsBlank_csv();	
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 6)
	public void testDateFieldsBlank_text() 
	{
		boolean a	= testBuilder.testDateFieldsBlank_text();	
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 7)
	public void testFromDateFieldBlank_pdf() 
	{
		boolean a	= testBuilder.testFromDateFieldBlank_pdf();	
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 8)
	public void testToDateFieldBlank_pdf() 
	{
		boolean a	= testBuilder.testToDateFieldBlank_pdf();	
		Assert.assertEquals(a, true);	
    }
	
	@Test(priority = 9)
	public void testFromDateFieldBlank_cvs() 
	{
		boolean a	= testBuilder.testFromDateFieldBlank_cvs();	
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 10)
	public void testToDateFieldBlank_cvs() 
	{
		boolean a	= testBuilder.testToDateFieldBlank_cvs();	
		Assert.assertEquals(a, true);
	}
	

	@Test(priority = 11)
	public void testFromDateFieldBlank_text() 
	{
		boolean a	= testBuilder.testFromDateFieldBlank_text();	
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 12)
	public void testToDateFieldBlank_text() 
	{
		boolean a	= testBuilder.testToDateFieldBlank_text();	
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 13)
	public void testDateFieldsBlank_favSaveButton() 
	{
		boolean a	= testBuilder.testDateFieldsBlank_favSaveButton();	
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 14)
	public void testFromDateFieldBlank_favSaveButton() 
	{
		boolean a	= testBuilder.testFromDateFieldBlank_favSaveButton();	
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 15)
	public void testToDateFieldBlank_favSaveButton() 
	{
		boolean a	= testBuilder.testToDateFieldBlank_favSaveButton();	
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 16)
	public void checkForThisFinancialYear()
	{
		boolean a	= testBuilder.checkForThisFinancialYear();	
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 17)
	public void checkForPreviousFinancialYear()
	{
		boolean a	= testBuilder.checkForPreviousFinancialYear();	
		Assert.assertEquals(a, true);
	}
	
	
    
	@Test(priority = 18) //Should provide real time dates as argument####
	public void verifyDateFieldsForYesterdayOptions()
	{
		boolean a	= testBuilder.verifyDateFieldsForYesterdayOptions();	
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 19) //Should provide real time dates as argument####
	public void verifyDateFieldsForTodayOptions()
	{
		boolean a	= testBuilder.verifyDateFieldsForTodayOptions();	
		Assert.assertEquals(a, true);
	}

	
	
	@Test(priority = 20) //Should provide real time dates as argument####
	public void verifyDateFieldsForPreviousMonthOptions()
	{
		boolean a	= testBuilder.verifyDateFieldsForPreviousMonthOptions();	
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 21) //Should provide real time dates as argument####
	public void verifyDateFieldsForThisMonthOptions()
	{
		boolean a	= testBuilder.verifyDateFieldsForThisMonthOptions();	
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 22)
	public void verifyDateFieldsForFromPastToFuture_pdf()
	{
		boolean a	= testBuilder.verifyDateFieldsForFromPastToFuture_pdf();	
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 23)
	public void verifyDateFieldsForFromPastToFuture_csv()
	{
		boolean a	= testBuilder.verifyDateFieldsForFromPastToFuture_csv();	
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 24)
	public void verifyDateFieldsForFromPastToFuture_text()
	{
		boolean a	= testBuilder.verifyDateFieldsForFromPastToFuture_text();	
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 25)
	public void verifyDateFieldsForFromPastToFuture_fav()
	{
		boolean a	= testBuilder.verifyDateFieldsForFromPastToFuture_fav();	
		Assert.assertEquals(a, true);
	}
	
	
	@Test(priority = 26)//Should provide real time dates as argument####
	public void vreifyForYesterdaysDateOnReFreshing()
	{
		boolean a	= testBuilder.verifyForYesterdaysDateOnReFreshing();	
		Assert.assertEquals(a, true);
	}
	
	
	@Test(priority = 27)
	public void checkAutoCustomDateOption()
	{
		boolean a	= testBuilder.checkAutoCustomDateOption();	
		Assert.assertEquals(a, true);
	}
	
//Positive Cases
	

	@Test(priority = 28, dataProvider = "allowedReportDurationoption")
	public void verifyAllowedReportDurationDropdown(String option,String validationMessage)
	{
		boolean a = testBuilder.verifyAllowedReportDuration(option, validationMessage);
		Assert.assertEquals(a, true);
	}
	
	
	
	@Test(priority = 29,dataProvider = "dateRangeDropDownOptions")
	public void pdfTest(String options, String buttons)
	{
		boolean a = testBuilder.verifyPdfDateRange(options);
		Assert.assertEquals(a, true);
	}

	@Test(priority = 30,dataProvider = "allowedReportDurationoption")
	public void createFavouritesForAllowedReportDurationoption(String option,String validationMessage)
	{
		testBuilder.createFavourites(option);
	}

	
	@Test(priority = 31)
	public void checkFavouriteReportsForDefaultDate_option1() throws InterruptedException, AWTException
	{
		
		boolean a = testBuilder.checkFavForDefaultDate(favouriteNames.get(0));
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 32)
	public void checkFavouriteReportsForDefaultDate_option2() throws InterruptedException, AWTException
	{
		
		boolean a = testBuilder.checkFavForDefaultDate(favouriteNames.get(1));
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 33)
	public void checkFavouriteReportsForDefaultDate_option3() throws InterruptedException, AWTException
	{
		
		boolean a = testBuilder.checkFavForDefaultDate(favouriteNames.get(2));
		Assert.assertEquals(a, true);
	}
	
	
	
	@Test(priority = 34)
	public void checkFavouriteReportsForDefaultDate_optionSelect() throws InterruptedException, AWTException
	{
		
		boolean a = testBuilder.checkFavForDefaultDate(favouriteNames.get(3));
		Assert.assertEquals(a, true);
	}

	// switch user
	
		@Test(priority = 35)
		public void switchToTheUser()
		{
			testBuilder.loginAsUser2();
		}
	
	
	@Test(priority = 36)
	public void check1MonthFavPDFReport() throws AWTException, InterruptedException
	{
		boolean a = testBuilder.testRunFavReport(favouriteNames.get(0));
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 37)
	public void check2MonthFavPDFReport() throws AWTException, InterruptedException
	{
		boolean a = testBuilder.testRunFavReport(favouriteNames.get(1));
		Assert.assertEquals(a, true);
	}
	
	@Test(priority = 38)
	public void check3MonthFavPDFReport() throws AWTException, InterruptedException
	{
		boolean a = testBuilder.testRunFavReport(favouriteNames.get(2));
		Assert.assertEquals(a, true);
	}
	
	

	@Test(priority = 39,dataProvider = "dateRangeDropDownOptions")// Keep This Test Case At Last Always
	public void chekForCorporateOffice(String options, String buttons)
	{
		if(options.equals("Yesterday")) {
		testBuilder.loginAsAdmin();
		navigateToReportsBuilder();
		}
		boolean a = testBuilder.checkForCorporateOffice(options, buttons);
		Assert.assertEquals(a, true);
	}

//	@Test()
//	public void 
//	
	
//	@Test()
//	public void name ()
//	{
//		
//	}
	
	
	/*
	@Test(priority = 28,dataProvider = "dateRangeDropDownOptions")// Keep This Test Case At Last Always
	public void chekForCorporateOffice(String options, String buttons)
	{
		if(options.equals("Yesterday")) {
		testBuilder.loginAsAdmin();
		navigateToRevenueReports();
		}
		boolean a = testBuilder.checkForCorporateOffice(options, buttons);
		Assert.assertEquals(a, true);
	}
	
	
	@Test(priority = 28,dataProvider = "dateRangeDropDownOptions")// Keep This Test Case At Last Always
	public void chekForCorporateOffice(String options, String buttons)
	{
		if(options.equals("Yesterday")) {
		testBuilder.loginAsAdmin();
		navigateToRevenueReports();
		}
		boolean a = testBuilder.checkForCorporateOffice(options, buttons);
		Assert.assertEquals(a, true);
	}
 */
}
