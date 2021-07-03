package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Util.World;

public class tt extends World {
    private World world;

    public tt(World world) {
        this.world = world;
    }

    @When("I search for {string}")
    public void i_search_for(String string) {
       world.driver.get("https://www.facebook.com");

    }
}
