package org.fasttrack.features;

import org.junit.Test;

public class LoginTest extends BaseTest{


    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail("vultur_eca@yahoo.com");
        loginSteps.setPassword("123456");
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn("Ecaterina Ada Muntean");
    }

    @Test
    public void loginWithInvalidPasswordTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail("vultur_eca@yahoo.com");
        loginSteps.setPassword("12345a");
        loginSteps.clickLogin();
        loginSteps.verifyUserNotLoggedIn();
    }


}
