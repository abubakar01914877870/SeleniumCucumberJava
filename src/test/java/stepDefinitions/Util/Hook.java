package stepDefinitions.Util;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends World{
    private World world;
    public Hook(World world) {
        this.world = world;
    }

    @Before
    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        world.driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        if (world.driver != null) {
            world.driver.quit();
        }
    }
}
