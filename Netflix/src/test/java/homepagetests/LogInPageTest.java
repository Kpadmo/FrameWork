package homepagetests;

import base.CommonAPI;
import homepage.LogInPage;
import org.testng.annotations.Test;

public class LogInPageTest extends LogInPage {

    @Test
    public void checkLogin(){
        searchFieldClickableSignIn();
    }

    @Test
    public void checkTry30daysFree()
    {
        searchFieldClickableTry30daysFree();
    }

    @Test
    public void checkSignInButton(){
        searchFieldIsTypeAble();
    }

    @Test
    public void checkPassword(){
        searchFieldIsTypeAble();
        typePassward();
    }

    @Test
    public void clickSignIn(){
        //searchFieldIsTypeAble();
        //typePassward();
        clickSignIn();
    }


}
