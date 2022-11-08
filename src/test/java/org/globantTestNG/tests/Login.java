package org.globantTestNG.tests;

import org.testng.annotations.*;
import org.tinylog.Logger;

public class Login extends BaseTests {

    @Test
    public void testLogin(){
        Logger.info("Clicked on login");
    }

}
