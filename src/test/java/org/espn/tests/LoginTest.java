package org.espn.tests;

import org.testng.annotations.*;
import org.tinylog.Logger;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin(){
        Logger.info("Click on login");
        Logger.info("Type Username or email");
        Logger.info("Type Password");
        Logger.info("Click on Log In");
    }
}
