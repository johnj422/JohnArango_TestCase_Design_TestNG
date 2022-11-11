package org.espn.tests;

import org.testng.annotations.*;
import org.tinylog.Logger;

public class LogoutTest extends BaseTest {

    @BeforeMethod
    public void checkLogin(){
        Logger.info("User must be logged in");
    }

    @Test
    public void testLogout(){
        Logger.info("Logout from Espn");
    }
}
