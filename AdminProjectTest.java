package com.example;

import junit.framework.TestCase;

public class AdminProjectTest extends TestCase {

    public Actionwords actionwords = new Actionwords();

    public void testVerifySuccessfulLogin() {
        // Given Open Chrome Browser
        actionwords.openChromeBrowser();
        // Then enter the url as "https://admin20m.active.ai/"
        actionwords.enterTheUrlAsP1("https://admin20m.active.ai/", "");
        // When workspaces login page is displayed
        actionwords.workspacesLoginPageIsDisplayed();
        // Then username field is visible
        actionwords.usernameFieldIsVisible();
        // And password field is visible
        actionwords.passwordFieldIsVisible();
        // Then enter the username as "morfeus@active.ai" and password as "m0rFeu5"
        actionwords.enterTheUsernameAsP1AndPasswordAsP2("morfeus@active.ai", "m0rFeu5");
        // And click on the login button
        actionwords.clickOnTheLoginButton();
        // And observe login success message is displayed
        actionwords.observeLoginSuccessMessageIsDisplayed();
        // And click on the logout button
        actionwords.clickOnTheLogoutButton();
        // And close Chrome Browser
        actionwords.closeChromeBrowser();
    }

    public void testVerifyFailedLoginAttemptWithInvalidCredentials() {
        // Given Open Chrome Browser
        actionwords.openChromeBrowser();
        // Then enter the url as "https://admin20m.active.ai/"
        actionwords.enterTheUrlAsP1("https://admin20m.active.ai/", "");
        // When workspaces login page is displayed
        actionwords.workspacesLoginPageIsDisplayed();
        // Then username field is visible
        actionwords.usernameFieldIsVisible();
        // And password field is visible
        actionwords.passwordFieldIsVisible();
        // Then enter the username as "morfeuss@active.ai" and password as "m0rFeu5s"
        actionwords.enterTheUsernameAsP1AndPasswordAsP2("morfeuss@active.ai", "m0rFeu5s");
        // And click on the login button
        actionwords.clickOnTheLoginButton();
        // And observe invalid credentials login message is displayed
        actionwords.observeInvalidCredentialsLoginMessageIsDisplayed();
        // And close Chrome Browser
        actionwords.closeChromeBrowser();
    }

    public void testVerifyFailedLoginAttemptWithEmptyPassword() {
        // Given Open Chrome Browser
        actionwords.openChromeBrowser();
        // Then enter the url as "https://admin20m.active.ai/"
        actionwords.enterTheUrlAsP1("https://admin20m.active.ai/", "");
        // When workspaces login page is displayed
        actionwords.workspacesLoginPageIsDisplayed();
        // Then username field is visible
        actionwords.usernameFieldIsVisible();
        // And password field is visible
        actionwords.passwordFieldIsVisible();
        // Then enter the username as "morfeuss@active.ai" and password as ""
        actionwords.enterTheUsernameAsP1AndPasswordAsP2("morfeuss@active.ai", "");
        // And click on the login button
        actionwords.clickOnTheLoginButton();
        // Then observe empty field validation appears in the password field
        actionwords.observeEmptyFieldValidationAppearsInThePasswordField();
        // And close Chrome Browser
        actionwords.closeChromeBrowser();
    }

    public void testVerifyFailedLoginAttemptWithEmptyUserName() {
        // Given Open Chrome Browser
        actionwords.openChromeBrowser();
        // Then enter the url as "https://admin20m.active.ai/"
        actionwords.enterTheUrlAsP1("https://admin20m.active.ai/", "");
        // When workspaces login page is displayed
        actionwords.workspacesLoginPageIsDisplayed();
        // Then username field is visible
        actionwords.usernameFieldIsVisible();
        // And password field is visible
        actionwords.passwordFieldIsVisible();
        // Then enter the username as "" and password as "m0rFeu5"
        actionwords.enterTheUsernameAsP1AndPasswordAsP2("", "m0rFeu5");
        // And click on the login button
        actionwords.clickOnTheLoginButton();
        // Then observe empty field validation appears in the username field
        actionwords.observeEmptyFieldValidationAppearsInTheUsernameField();
        // And close Chrome Browser
        actionwords.closeChromeBrowser();
    }

    public void testVerifyFailedLoginAttemptWithEmptyUsernameEmptyPassword() {
        // Given Open Chrome Browser
        actionwords.openChromeBrowser();
        // Then enter the url as "https://admin20m.active.ai/"
        actionwords.enterTheUrlAsP1("https://admin20m.active.ai/", "");
        // When workspaces login page is displayed
        actionwords.workspacesLoginPageIsDisplayed();
        // Then username field is visible
        actionwords.usernameFieldIsVisible();
        // And password field is visible
        actionwords.passwordFieldIsVisible();
        // Then enter the username as "" and password as ""
        actionwords.enterTheUsernameAsP1AndPasswordAsP2("", "");
        // And click on the login button
        actionwords.clickOnTheLoginButton();
        // Then observe empty field validation appears in the username and password field
        actionwords.observeEmptyFieldValidationAppearsInTheUsernameAndPasswordField();
        // And close Chrome Browser
        actionwords.closeChromeBrowser();
    }

    public void testVerifySuccessfulLoginWithDifferentUser() {
        // Given Open Chrome Browser
        actionwords.openChromeBrowser();
        // Then enter the url as "https://admin20m.active.ai/"
        actionwords.enterTheUrlAsP1("https://admin20m.active.ai/", "");
        // When workspaces login page is displayed
        actionwords.workspacesLoginPageIsDisplayed();
        // Then username field is visible
        actionwords.usernameFieldIsVisible();
        // And password field is visible
        actionwords.passwordFieldIsVisible();
        // Then enter the username as "morfeus@active.ai" and password as "m0rFeu5"
        actionwords.enterTheUsernameAsP1AndPasswordAsP2("morfeus@active.ai", "m0rFeu5");
        // And click on the login button
        actionwords.clickOnTheLoginButton();
        // And observe login success message is displayed
        actionwords.observeLoginSuccessMessageIsDisplayed();
        // Then Click on settings
        actionwords.clickOnSettings();
        // Then navigate to security
        actionwords.navigateToSecurity();
        // And change the session time as 10 sec
        actionwords.changeTheSessionTimeAs10Sec();
        // And click on Save
        actionwords.clickOnSave();
        // And click on the logout button
        actionwords.clickOnTheLogoutButton();
        // And Close Browser
        actionwords.closeBrowser();
        // Then Open Browser
        actionwords.openBrowser();
        // Then enter the url as "https://admin20m.active.ai/"
        actionwords.enterTheUrlAsP1("https://admin20m.active.ai/", "");
        // When workspaces login page is displayed
        actionwords.workspacesLoginPageIsDisplayed();
        // Then username field is visible
        actionwords.usernameFieldIsVisible();
        // And password field is visible
        actionwords.passwordFieldIsVisible();
        // Then enter the username as "manoj.ranganathan@active.ai" and password as "Manojkrish2025$"
        actionwords.enterTheUsernameAsP1AndPasswordAsP2("manoj.ranganathan@active.ai", "Manojkrish2025$");
        // And click on the login button
        actionwords.clickOnTheLoginButton();
        // And observe login success message is displayed
        actionwords.observeLoginSuccessMessageIsDisplayed();
        // And keep idle for 11 sec
        actionwords.keepIdleFor11Sec();
        // And Observe session timeout message is displayed
        actionwords.observeSessionTimeoutMessageIsDisplayed();
        // And close Chrome Browser
        actionwords.closeChromeBrowser();
        // Given Open Browser
        actionwords.openBrowser();
        // Then enter the url as "https://admin20m.active.ai/"
        actionwords.enterTheUrlAsP1("https://admin20m.active.ai/", "");
        // When workspaces login page is displayed
        actionwords.workspacesLoginPageIsDisplayed();
        // Then username field is visible
        actionwords.usernameFieldIsVisible();
        // And password field is visible
        actionwords.passwordFieldIsVisible();
        // Then enter the username as "morfeus@active.ai" and password as "m0rFeu5"
        actionwords.enterTheUsernameAsP1AndPasswordAsP2("morfeus@active.ai", "m0rFeu5");
        // And click on the login button
        actionwords.clickOnTheLoginButton();
        // And observe login success message is displayed
        actionwords.observeLoginSuccessMessageIsDisplayed();
        // Then Click on settings
        actionwords.clickOnSettings();
        // Then navigate to security
        actionwords.navigateToSecurity();
        // And change the session time as 36000000 sec
        actionwords.changeTheSessionTimeAs36000000Sec();
        // And click on Save
        actionwords.clickOnSave();
        // And click on the logout button
        actionwords.clickOnTheLogoutButton();
        // And close Chrome Browser
        actionwords.closeChromeBrowser();
    }

    public void testVerifyLoginAsPerInvalidLoginAttemptsConfigurationInAdmin() {
        // Given Open Chrome Browser
        actionwords.openChromeBrowser();
        // Then enter the url as "https://admin20m.active.ai/"
        actionwords.enterTheUrlAsP1("https://admin20m.active.ai/", "");
        // When workspaces login page is displayed
        actionwords.workspacesLoginPageIsDisplayed();
        // Then username field is visible
        actionwords.usernameFieldIsVisible();
        // And password field is visible
        actionwords.passwordFieldIsVisible();
        // Then enter the username as "morfeus@active.ai" and password as "m0rFeu5"
        actionwords.enterTheUsernameAsP1AndPasswordAsP2("morfeus@active.ai", "m0rFeu5");
        // And click on the login button
        actionwords.clickOnTheLoginButton();
        // And observe login success message is displayed
        actionwords.observeLoginSuccessMessageIsDisplayed();
        // Then Click on settings
        actionwords.clickOnSettings();
        // Then navigate to security
        actionwords.navigateToSecurity();
        // When Configuration page is displayed
        actionwords.configurationPageIsDisplayed();
        // Then Set "InActive Change Password Interval (days)" as "0"
        actionwords.setP1AsP2("InActive Change Password Interval (days)", "0");
        // And click on Save
        actionwords.clickOnSave();
        // And click on the logout button
        actionwords.clickOnTheLogoutButton();
        // And Close Browser
        actionwords.closeBrowser();
        // Then Open Browser
        actionwords.openBrowser();
        // Then enter the url as "https://admin20m.active.ai/"
        actionwords.enterTheUrlAsP1("https://admin20m.active.ai/", "");
        // When workspaces login page is displayed
        actionwords.workspacesLoginPageIsDisplayed();
        // Then username field is visible
        actionwords.usernameFieldIsVisible();
        // And password field is visible
        actionwords.passwordFieldIsVisible();
        // Then enter the username as "manoj.ranganathan@active.ai" and password as "Manojkrish2025$"
        actionwords.enterTheUsernameAsP1AndPasswordAsP2("manoj.ranganathan@active.ai", "Manojkrish2025$");
        // And click on the login button
        actionwords.clickOnTheLoginButton();
        // And system should prompt for force change password page
        actionwords.systemShouldPromptForForceChangePasswordPage();
        // Then Enter new password as "Manojkrish2026$" and Re Enter new password as "Manojkrish2026$"
        actionwords.enterNewPasswordAsP1AndReEnterNewPasswordAsP2("Manojkrish2026$", "Manojkrish2026$");
        // And click on submit
        actionwords.clickOnSubmit();
        // Then Password should be changed successfully message should be displayed
        actionwords.passwordShouldBeChangedSuccessfullyMessageShouldBeDisplayed();
        // And close Chrome Browser
        actionwords.closeChromeBrowser();
        // Given Open Browser
        actionwords.openBrowser();
        // Then enter the url as "https://admin20m.active.ai/"
        actionwords.enterTheUrlAsP1("https://admin20m.active.ai/", "");
        // When workspaces login page is displayed
        actionwords.workspacesLoginPageIsDisplayed();
        // Then username field is visible
        actionwords.usernameFieldIsVisible();
        // And password field is visible
        actionwords.passwordFieldIsVisible();
        // Then enter the username as "morfeus@active.ai" and password as "m0rFeu5"
        actionwords.enterTheUsernameAsP1AndPasswordAsP2("morfeus@active.ai", "m0rFeu5");
        // And click on the login button
        actionwords.clickOnTheLoginButton();
        // And observe login success message is displayed
        actionwords.observeLoginSuccessMessageIsDisplayed();
        // Then Click on settings
        actionwords.clickOnSettings();
        // Then navigate to security
        actionwords.navigateToSecurity();
        // When Configuration page is displayed
        actionwords.configurationPageIsDisplayed();
        // Then Set "InActive Change Password Interval (days)" as "90"
        actionwords.setP1AsP2("InActive Change Password Interval (days)", "90");
        // And click on Save
        actionwords.clickOnSave();
        // And click on the logout button
        actionwords.clickOnTheLogoutButton();
        // And close Chrome Browser
        actionwords.closeChromeBrowser();
    }
}