package com.sample.test.demo.tests;

import com.sample.test.demo.TestBase;
import com.sample.test.demo.pages.PizzaOrderPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PizzaOrderTest extends TestBase {

    @Test
    public void firstTest() {
        PizzaOrderPage pizzaOrderPage = PageFactory.initElements(driver, PizzaOrderPage.class);
        //pizzaOrderPage.
    }
}
