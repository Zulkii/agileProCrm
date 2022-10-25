package com.cydeo.agileProCrm.step_definitions;

/*
In the class we will be able to pass pre- & post- conditions to
 each scenario and each step
 */


import com.cydeo.agileProCrm.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {



    @After  // import from io.cucumber.java, not from junit
    public void tearDownScenario(Scenario scenario){

        // scenario.isFailed() --> if scenario fails this method will return TRUE boolean value

        if (scenario.isFailed()){
            byte[] screenShot = ( (TakesScreenshot) Driver.getDriver() ).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }

        //BrowserUtils.sleep(5);
        Driver.closeDriver();

        //System.out.println("====Closing browser using cucumber @Before");
        //System.out.println("====Scenario ended/ take screen shot if failed");
    }




}
