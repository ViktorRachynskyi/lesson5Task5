package com.github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @Test
    void test (){
        open("https://github.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $(".repo-list a").click();
        $("#wiki-tab").click();
        $(byText("Soft assertions")).click();
        $("#user-content-3-using-junit5-extend-test-class").parent()
                        .shouldHave(text("Using JUnit5 extend test class:"))  // search section
                        .sibling(0).$("div pre").shouldBe(visible); // search code block
    }

}
