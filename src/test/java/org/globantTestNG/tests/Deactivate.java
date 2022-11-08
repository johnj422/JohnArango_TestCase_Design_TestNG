package org.globantTestNG.tests;

import org.testng.annotations.*;
import org.tinylog.Logger;

public class Deactivate extends BaseTests{

    @BeforeMethod
    public void checkLogin(){
        Logger.info("User must be logged in");
    }
    @Test
    public void testDeactivate(){
        Logger.info("User Deactivated");
    }

}
