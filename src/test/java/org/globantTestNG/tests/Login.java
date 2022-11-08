package org.globantTestNG.tests;

import org.testng.annotations.*;
import org.tinylog.Logger;

public class Login extends BaseSteps {

    @Test
    public void testLogin(){
        Logger.info("Click on login");
        Logger.info("Type Username or email");
        Logger.info("Type Password");
        Logger.info("Click on Log In");
    }
}
