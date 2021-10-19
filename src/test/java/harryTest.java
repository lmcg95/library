import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;


public class harryTest {
    private String title;
    private String actualAnswer;

    @Given("The book is called Verity")
    public void calledVerity(){
        title = "Verity";
    }
    @Given("The book is called Harry Potter")
    public void calledHarry(){
        title = "Harry Potter";
    }

    @When("I ask if the book is called Harry Potter")
    public void askHarry(){
        actualAnswer = IsItHarry.isItHarry(title);
    }

    @Then("I should be told {string}")
    public void shouldBe(String expectedAnswer){
        assertEquals(expectedAnswer, actualAnswer);
    }


}


