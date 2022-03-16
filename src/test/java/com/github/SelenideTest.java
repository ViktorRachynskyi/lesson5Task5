package com.github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @Test
    void searchJUnit5CodeBlockTest() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertion");
        $(byText("SoftAssertions")).click();
        sleep(3000);
        $("#user-content-3-using-junit5-extend-test-class").parent()
                .shouldHave(text("Using JUnit5 extend test class:"))  // search JUnit5 section
                .sibling(0).$("div pre").shouldBe(visible); // search visible code block
    }
}
