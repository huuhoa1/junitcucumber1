package junitcucumber;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
 
    private User user = new User();

    @Given("^that the user Vinod is given a task to clear Java certification exam$")
    public void that_the_user_Vinod_is_given_a_task_to_clear_Java_certification_exam() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        user.setName("Vinod");
        user.setCertification("Java");
    }

    @When("^Vinod got (\\d+) marks in exam$")
    public void vinod_got_marks_in_exam(int marks) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        user.setName("Vinod");
        user.setMarks(marks);
    }

    @Then("^Vinod is known as Java certified$")
    public void vinod_is_known_as_Java_certified() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertThat("Vinod", is(user.getName()));
        assertThat(user.getCertification(), equalTo("Java"));
        assertThat(user.getResult(), is(true));
    }

}
