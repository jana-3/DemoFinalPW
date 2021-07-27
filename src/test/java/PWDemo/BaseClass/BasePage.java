package PWDemo.BaseClass;

import PWDemo.PageClass.SamplePage;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePage {

    private static Browser browser;
    protected Page page;
    protected SamplePage samplePage;


    @BeforeClass
    public void setUp(){
        browser = Playwright
                .create()
                .chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false));

        page = browser.newPage();
        samplePage = new SamplePage(page);

    }

    @AfterClass
    static void browserClose(){
        browser.close();
    }


}
