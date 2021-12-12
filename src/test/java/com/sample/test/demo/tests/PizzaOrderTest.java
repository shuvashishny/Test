package com.sample.test.demo.tests;

import com.sample.test.demo.TestBase;
import com.sample.test.demo.constants.PizzaToppings;
import com.sample.test.demo.constants.PizzaTypes;
import com.sample.test.demo.pages.PizzaOrderPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PizzaOrderTest extends TestBase {

    @Test
    public void firstTest() {
        PizzaOrderPage pizzaOrderPage = PageFactory.initElements(driver, PizzaOrderPage.class);
        pizzaOrderPage
                .selectPizza(PizzaTypes.SMALL_ONE_TOPPINGS.getDisplayName(), String.valueOf(PizzaTypes.SMALL_ONE_TOPPINGS.getCost()))
                .selectFirstTopping(PizzaToppings.ITALIANHAM.getDisplayName())
                .addQuantity(2)
                .validatePizzaCost(2, PizzaTypes.SMALL_ONE_TOPPINGS.getCost());
    }
}
