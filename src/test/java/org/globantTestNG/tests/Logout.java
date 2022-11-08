package org.globantTestNG.tests;

import org.testng.annotations.*;
import org.testng.log4testng.Logger;

public class Logout extends BaseTests {
    Logger log = Logger.getLogger(Logout.class);

    @BeforeMethod
    public void checkLogin(){
        log.info("User must be logged in");
    }

    @Test
    public void testLogout(){
        log.info("Logout from Espn");
    }
}
