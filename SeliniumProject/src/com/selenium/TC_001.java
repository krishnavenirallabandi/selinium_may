package com.selenium;

public class TC_001 extends BaseTest{
	public static void main(String[] args ) throws Exception {
		loadData();
		launcher("chromebrowser");
		navigateUrl("bestbuyurl");
		
	}

}
