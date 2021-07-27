package PWDemo.PageClass;

import com.microsoft.playwright.Page;

import java.nio.file.Paths;

public class SamplePage {


    private Page page;

    public SamplePage(Page page){
        this.page = page;
    }


    public  void launchURL(){
        page.navigate("http://amazon.com/");
    }


    public  void clickLogin(){
        page.click("#btnOpenLogin");
    }


    public  void EnterCredentials(){
        page.fill("#username","");
        page.fill("#password","");
        page.click("button.login__form__submit-btn");
    }


    public  void verifyLoggedIn(){
        page.waitForSelector("figure.icon-user-account.amb-trackeable-event");
        page.isVisible("figure.icon-user-account.amb-trackeable-event");
    }

    public void screenShot(){

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshots1/" +  ".png"))) ;
    }
}
