package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import stepDefinitions.Util.World;

public class login extends World{
    private World world;
    public login(World world) {
        this.world = world;
    }

    @Given("I open this url {string}")
    public void i_open_this_url(String url) {
        try {
            world.driver.get(url);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @When("I login with username and password {string} {string}")
    public void i_login_with_username_and_password(String username, String password) {
        world.find_element_by_xpath("//div/input[@id=\"email\"]").sendKeys(username);
        world.find_element_by_xpath("//div/input[@id=\"password\"]").sendKeys(password);
        world.find_element_by_xpath("//button[@data-testid=\"Log in\"]").click();
    }


    @Then("I check flightboard page")
    public void iCheckFlightboardPage() {
        world.find_element_by_xpath("//h1/span[contains(text(),'Flightboard')]");
        Assert.assertEquals("Manage work :: Field Nation", world.driver.getTitle());
    }
}
