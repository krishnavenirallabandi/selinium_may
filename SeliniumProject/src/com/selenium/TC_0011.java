package com.selenium;

public class TC_0011 extends BaseTest {

	public static void main(String[] args)throws Exception {
		loadData();
		launcher("chromebrowser");
		navigateUrl("amazonurl");
		
	}

}
