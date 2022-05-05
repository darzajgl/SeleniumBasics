package com.herokuapp.theinternet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PositiveTests {

    @Test
    public void loginTest() {
        System.out.println("Starting loginTest");
        //Create driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //open test page
        String url = "https://the-internet.herokuapp.com/login";
        driver.get(url);
        System.out.println("Page is opened");
        //sleep
        sleep(3000);

        //maximize browser window
        driver.manage().window().maximize();
        sleep(2000);
//      enter username
//    enter password
//  click login button
//
//        verifications:
//        new url
//        logout button is visible
//        successful login message

        //close browser
        driver.quit();

    }

    private void sleep(long m) {
        try{
            Thread.sleep(m);
        } catch (InterruptedException e){
            //TODO Auto-generated catch block e
            e.printStackTrace();
        }
    }
}
