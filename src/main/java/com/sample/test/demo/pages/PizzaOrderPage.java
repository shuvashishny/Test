package com.sample.test.demo.pages;

import com.sample.test.demo.TestBase;
import com.sample.test.demo.constants.PizzaToppings;
import com.sample.test.demo.constants.PizzaTypes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PizzaOrderPage {

    private WebDriver driver;

    @FindBy(how = How.ID, using = "pizza1Pizza")
    private WebElement selectPizza;
    @FindBy(how = How.XPATH, using = "//div[@id='pizza1']//select[@class='toppings1']")
    private WebElement selectFirstTopping;
    @FindBy(xpath = "//div[@id='pizza1']//select[@class='toppings2']")
    private WebElement selectSecondTopping;

    @FindBy(id = "pizza1Qty")
    private WebElement quantity;
    @FindBy(how = How.XPATH, using = "pizza1Cost")
    private WebElement cost;
    @FindBy(how = How.XPATH, using = "//div[@id='pizza1']//select[@class='toppings1']")
    private WebElement name;
    @FindBy(how = How.XPATH, using = "//div[@id='pizza1']//select[@class='toppings2']")
    private WebElement email;
    @FindBy(how = How.XPATH, using = "//div[@id='pizza1']//select[@class='toppings1']")
    private WebElement phone;

    @FindBy(how = How.XPATH, using = "ccpayment")
    private WebElement credidCardRadio;
    @FindBy(how = How.XPATH, using = "cashpayment")
    private WebElement cashRadio;
    @FindBy(how = How.XPATH, using = "//div[@id='pizza1']//select[@class='toppings2']")
    private WebElement buttonPlaceOrder;
    @FindBy(how = How.XPATH, using = "//div[@id='pizza1']//select[@class='toppings1']")
    private WebElement firstTopping;
    @FindBy(how = How.XPATH, using = "//div[@id='pizza1']//select[@class='toppings2']")
    private WebElement buttonReset;

    public PizzaOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public PizzaOrderPage orderPizza() {
        PizzaToppings.EXTRACHEESE.getDisplayName();
        PizzaTypes.LARE_NOTOPPINGS.getCost();
        return this;
    }

}
