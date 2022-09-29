package org.test.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyStepdefs {
    private static final Logger log = LoggerFactory.getLogger(MyStepdefs.class);
    public MyStepdefs() {
        log.info(String.format("running: %s", MyStepdefs.class));
    }

    @Given("Hello World")
    public void hello_world(String input1, String input2) {
        log.info(String.format("Hello World : %s : %s" , input1 ,input2));
    }

    @And("Go Now")
    public void goNow() {
        log.info("go now");
    }

    @Then("we are good")
    public void weAreGood() {
        log.info("we are good");
    }

    @Given("Hello World {int}")
    public void helloWorld(int arg0) {
        log.info(String.format("hello world 2 %s",arg0));
    }

    @And("Go Now Two")
    public void goNowTwo() {
        log.info("go now two");
    }

    @Then("we are good two")
    public void weAreGoodTwo() {
        log.info("we are good two");
    }
}
