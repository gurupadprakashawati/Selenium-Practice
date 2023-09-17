package stepdefinationfile;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import reusable.BaseCode;

public class Hooks {
    @Before()
    public void setUp(){
        System.out.println("Browser starts....");
        BaseCode.browserInvocation();

    }

    @After()
    public void tearDown(){
        System.out.println("Browser close....");

    }
}
