package org.globantTestNG.tests;

import org.testng.annotations.*;
import org.testng.log4testng.Logger;

public class Login extends BaseTests {
    Logger log = Logger.getLogger(Login.class);

    @Test
    public void testLogin(){
        log.info("Clicked on login");
    }

}
