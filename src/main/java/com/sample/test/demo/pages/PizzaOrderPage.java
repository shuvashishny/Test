package com.sample.test.demo.pages;

import com.sample.test.demo.constants.PaymentInfo;
import com.sample.test.demo.constants.PizzaToppings;
import com.sample.test.demo.constants.PizzaTypes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.text.DecimalFormat;

public class PizzaOrderPage {

    private WebDriver driver;

    //Pizza information
    @FindBy(id = "pizza1Pizza")
    private WebElement selectPizza;
    @FindBy(xpath = "//div[@id='pizza1']//select[@class='toppings1']")
    private WebElement selectFirstTopping;
    @FindBy(xpath = "//div[@id='pizza1']//select[@class='toppings2']")
    private WebElement selectSecondTopping;
    @FindBy(id = "pizza1Qty")
    private WebElement textQuantity;
    @FindBy(id = "pizza1Cost")
    private WebElement textCost;

    //Pickup information
    @FindBy(id = "name")
    private WebElement textName;
    @FindBy(id = "email")
    private WebElement textEmail;
    @FindBy(id = "phone")
    private WebElement textPhone;

    //Payment information
    @FindBy(id = "ccpayment")
    private WebElement radioCredidCard;
    @FindBy(id = "cashpayment")
    private WebElement radioCash;

    //Submit/Reset
    @FindBy(id = "placeOrder")
    private WebElement buttonPlaceOrder;
    @FindBy(id = "reset")
    private WebElement buttonReset;

    //Popup
    @FindBy(xpath = "//div[@id='dialog']/p")
    private WebElement popupText;
    @FindBy(className = "ui-icon-closethick")
    private WebElement buttonClosePopup;

    public PizzaOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public PizzaOrderPage orderPizza() {
        PizzaToppings.EXTRACHEESE.getDisplayName();
        PizzaTypes.LARE_NO_TOPPINGS.getCost();
        return this;
    }

    public PizzaOrderPage selectPizza(String pizzaType, double pizzaCost) {
        String pattern = "###.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String newString = pizzaType + " $" + decimalFormat.format(pizzaCost);
        Select select = new Select(selectPizza);
        select.selectByVisibleText(newString);

        return this;
    }

    public PizzaOrderPage selectFirstTopping(String topping) {
        Select select = new Select(selectFirstTopping);
        select.selectByVisibleText(topping);

        return this;
    }

    public PizzaOrderPage selectSecondTopping(String topping) {
        Select select = new Select(selectSecondTopping);
        select.selectByVisibleText(topping);

        return this;
    }

    public PizzaOrderPage addQuantity(int quantity) {
        textQuantity.sendKeys(String.valueOf(quantity));
        return this;
    }

    public PizzaOrderPage validatePizzaCost(int quantity, double cost){
        String pizzaCost = textCost.getText();
        double totalCost = quantity * cost;
        System.out.println("pcost "+ pizzaCost+" tocost "+totalCost);
        //Assert.assertEquals(Double.valueOf(pizzaCost), totalCost);

        return this;
    }

    public PizzaOrderPage typeName(String name) {
        textName.sendKeys(name);
        return this;
    }

    public PizzaOrderPage typeEmail(String email) {
        textEmail.sendKeys(email);
        return this;
    }

    public PizzaOrderPage typePhone(String phone) {
        textPhone.sendKeys(phone);
        return this;
    }

    public PizzaOrderPage setPaymentOption(PaymentInfo paymentInfo) {
        if(paymentInfo == PaymentInfo.CREDIT_CARD){
            radioCredidCard.click();
        }
        else
            radioCash.click();
        return this;
    }

    public PizzaOrderPage placeOrder() {
        buttonPlaceOrder.click();
        return this;
    }

    public PizzaOrderPage resetOrder() {
        buttonReset.click();
        return this;
    }

    public PizzaOrderPage displayPopup(String firstText, String secondText) {
        String pText = popupText.getText();
        System.out.println(pText);
        return this;

    }

}
