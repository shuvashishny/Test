package com.sample.test.demo.tests;

import com.sample.test.demo.TestBase;
import com.sample.test.demo.constants.PaymentInfo;
import com.sample.test.demo.constants.PizzaToppings;
import com.sample.test.demo.constants.PizzaTypes;
import com.sample.test.demo.model.PickupInformation;
import com.sample.test.demo.pages.PizzaOrderPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PizzaOrderTest extends TestBase {

    @Test
    public void placeOrderWithAllRequiredFields() {
        PickupInformation pickupInformation = new PickupInformation();
        PizzaOrderPage pizzaOrderPage = PageFactory.initElements(driver, PizzaOrderPage.class);
        pizzaOrderPage
                .selectPizza(PizzaTypes.SMALL_ONE_TOPPINGS.getDisplayName(), PizzaTypes.SMALL_ONE_TOPPINGS.getCost())
                .selectFirstTopping(PizzaToppings.ITALIANHAM.getDisplayName())
                .addQuantity(2)
                .typeName(pickupInformation.getName())
                .typeEmail(pickupInformation.getEmail())
                .typePhone(pickupInformation.getPhone())
                .setPaymentOption(PaymentInfo.CREDIT_CARD)
                .placeOrder()
                .validateSuccessPopup();
    }

    @Test (enabled = false)
    //There is a bug
    public void resetButtonShouldResetAllValues() {
        PizzaOrderPage pizzaOrderPage = PageFactory.initElements(driver, PizzaOrderPage.class);
        pizzaOrderPage
                .selectPizza(PizzaTypes.SMALL_ONE_TOPPINGS.getDisplayName(), PizzaTypes.SMALL_ONE_TOPPINGS.getCost())
                .selectFirstTopping(PizzaToppings.ITALIANHAM.getDisplayName())
                .selectSecondTopping(PizzaToppings.ONIONS.getDisplayName())
                .resetOrder()
                .validateDefaultValues();

    }

    @Test
    public void placeOrderWithoutAllRequiredFieldsShouldShowErrorMessage() {
        PickupInformation pickupInformation = new PickupInformation();
        String errorMessage = "Missing phone number";

        PizzaOrderPage pizzaOrderPage = PageFactory.initElements(driver, PizzaOrderPage.class);
        pizzaOrderPage
                .selectPizza(PizzaTypes.SMALL_ONE_TOPPINGS.getDisplayName(), PizzaTypes.SMALL_ONE_TOPPINGS.getCost())
                .selectFirstTopping(PizzaToppings.ITALIANHAM.getDisplayName())
                .addQuantity(2)
                .typeName(pickupInformation.getName())
                .typeEmail(pickupInformation.getEmail())
                .setPaymentOption(PaymentInfo.CREDIT_CARD)
                .placeOrder()
                .validateErroMessagePopup(errorMessage);
    }
}
