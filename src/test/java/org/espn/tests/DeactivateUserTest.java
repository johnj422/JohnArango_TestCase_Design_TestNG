package org.espn.tests;

import org.testng.annotations.Test;
import org.tinylog.Logger;

public class DeactivateUserTest extends LoginTest{

    @Test(priority = 4)
    public void deactivateUserTest(){
        Logger.info("Clicking profile link...");

    }
}
