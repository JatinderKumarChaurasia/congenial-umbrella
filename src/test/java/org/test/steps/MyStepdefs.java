package org.test.steps;

import io.cucumber.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyStepdefs {
    private static final Logger log = LoggerFactory.getLogger(MyStepdefs.class);
    public MyStepdefs() {
        log.info(String.format("running: %s",MyStepdefs.class.toString()));
    }

    @Given("Hello World")
    public void hello_world(String input1, String input2) {
        log.info(String.format("Hello World : %s : %s" , input1 ,input2));
    }

    @Given("Hello World \\{Name} \\{City}")
    public void helloWorldNameCity(String input1,String input2) {
        log.info(String.format("Hello World : %s : %s" , input1 ,input2));
    }
}
