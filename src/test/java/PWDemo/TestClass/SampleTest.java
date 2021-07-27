package PWDemo.TestClass;

import PWDemo.BaseClass.BasePage;

import com.microsoft.playwright.options.ScreenshotType;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




    public class SampleTest extends BasePage {


       @Step @Attachment
       @BeforeClass
        public void userVisitSite(){
            samplePage.launchURL();
        }

//        @Step @Test @Attachment
//        public void userClickLogin()
//        {
//            samplePage.clickLogin();
//
//        }

        @Step @Test @Attachment
        public void userEnterCredentials(){
            samplePage.EnterCredentials();
        }

//        @Step  @Test
//        public void userVerifyLoggedInPage(){
//            samplePage.verifyLoggedIn();
//        }

    }

