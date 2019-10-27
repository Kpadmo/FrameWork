package homepage;

import base.CommonAPI;

public class LogInPage extends CommonAPI {

    public void searchFieldClickableSignIn() {

        clickOnElementByXpath("//a[@href='/login']");
    }

    public void searchFieldClickableTry30daysFree() {

        clickOnElementByXpath("//div[@class='our-story-card-footer-text']");
    }

    public void searchFieldIsTypeAble() {

        clickOnElementByXpath("//a[@href='/login']");
        typeOnElementByXpath("//input[@id='id_userLoginId']", "ipodmenu@outlook.com");
    }

    public void typePassward() {

        typeOnElementByXpath("//input[@id='id_password']", "flixnet321");
    }
}
