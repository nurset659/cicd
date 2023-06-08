package starter.stepdefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.PUT;

public class PutUser {


    @Steps
    PUT put;
    @Given("user on valid PUT endpoint")
    public void userSetValidPUTEndpoint() {
        put.setValidPutEndpoint();
    }

    @When("user send PUT HTTP request enponint")
    public void userSendPUTHTTPRequest() {
        put.sendPUTHTTPRequest();
    }

    @Then("user send update data user")
    public void userSendUpdateUserData() {
        put.validateValidPostDataUpdated();
    }

    @And("user received HTTP response code {int} ok")
    public void userReceivedHTTPResponseCode(int arg0) {
        put.esponseCode200();
    }
}

