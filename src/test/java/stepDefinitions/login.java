package stepDefinitions;

import io.cucumber.java.en.Given;
import stepDefinitions.Util.World;

public class login{
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


}
