package com.tutorial.demo.steps;


import com.tutorial.demo.pages.HomePage;
import com.tutorial.demo.pages.LaptopAndNotebookPage;
import com.tutorial.demo.pages.ProductPage;
import com.tutorial.demo.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LaptopAndNotebookPageSteps {
    @And("^I click on show all laptop and notebook$")
    public void iClickOnShowAllLaptopAndNotebook() {
        new HomePage().clickOnShowAllLaptopAndNoteBook();
    }

    @Then("^I should see product arrange in price high to low order successfully$")
    public void iShouldSeeProductArrangeInPriceHighToLowOrderSuccessfully() {
        Assert.assertEquals("Product not sorted by price High to Low",new LaptopAndNotebookPage().priceHighToLow(), new LaptopAndNotebookPage().getPriceHighToLow());
    }

    @And("^I select product \"([^\"]*)\" from laptop and notebook page$")
    public void iSelectProductFromLaptopAndNotebookPage(String productName){
        new LaptopAndNotebookPage().clickOnProductMacBook(productName);
    }

    @Then("^I should navigate to \"([^\"]*)\" product$")
    public void iShouldNavigateToProduct(String productName){
        Assert.assertEquals("MacBook Product not display",productName, new ProductPage().getProductMacBookText());
    }

    @Then("^I should see product macbook added successfully message$")
    public void iShouldSeeProductMacbookAddedSuccessfullyMessage() throws InterruptedException{
        Thread.sleep(500);
        Assert.assertTrue("Product not added to cart", new ProductPage().getSuccessText().contains("Success: You have added MacBook to your shopping cart!"));
    }
    @And("^I should see \"([^\"]*)\" product$")
    public void iShouldSeeProduct(String productName){
        Assert.assertEquals("Product name not matched", "MacBook", new ShoppingCartPage().getProductText());
    }

    @And("^I change quantity \"([^\"]*)\" for product$")
    public void iChangeQuantityForProduct(String quantity){
        new ShoppingCartPage().changeQuantityForProduct(quantity);

    }

    @And("^I click on update quantity$")
    public void iClickOnUpdateQuantity() {
        new ShoppingCartPage().clickOnUpdateQuantity();
    }

    @Then("^I should see cart modified message$")
    public void iShouldSeeCartModifiedMessage() {
        Assert.assertTrue("Cart not modified",new ShoppingCartPage().getUpdateSuccessfullyText().contains("Success: You have modified your shopping cart!"));
    }
    @And("^I should see total price for macbook products$")
    public void iShouldSeeTotalPriceForMacbookProducts() {
        Assert.assertEquals("Total not matched", "£737.45", new ShoppingCartPage().getTotalPrice());
    }

    @And("^I click on checkout button$")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckoutButton();
    }

    @Then("^I should navigate to checkout page$")
    public void iShouldNavigateToCheckoutPage() {
        Assert.assertEquals("Not Navigate to checkout page","Checkout", new com.tutorial.demo.pages.CheckoutPage().getCheckoutText());
    }

    @And("^I should see new customer text$")
    public void iShouldSeeNewCustomerText() throws InterruptedException{
        Thread.sleep(500);
        Assert.assertEquals("New Customer Text not found","New Customer", new com.tutorial.demo.pages.CheckoutPage().getNewCustomerText());
    }

    @And("^I click on guest checkout button$")
    public void iClickOnGuestCheckoutButton() throws InterruptedException{
        Thread.sleep(500);
        new com.tutorial.demo.pages.CheckoutPage().clickOnGuestCheckOutRadioButton();
    }

    @And("^I click on continue button of guest checkout page$")
    public void iClickOnContinueButtonOfGuestCheckoutPage() {
        new com.tutorial.demo.pages.CheckoutPage().clickOnContinueButton();
    }

    @And("^I filled all mandatory field of checkout page$")
    public void iFilledAllMandatoryFieldOfCheckoutPage() {
        new com.tutorial.demo.pages.CheckoutPage().enterFirstName("Manisha");
        new com.tutorial.demo.pages.CheckoutPage().enterLastName("Mavani");
        new com.tutorial.demo.pages.CheckoutPage().enterEmailId("Manisha");
        new com.tutorial.demo.pages.CheckoutPage().enterTelephone("07878963869");
        new com.tutorial.demo.pages.CheckoutPage().enterAddressLine1("20,Birmingham road");
        new com.tutorial.demo.pages.CheckoutPage().enterCity("Birmingham");
        new com.tutorial.demo.pages.CheckoutPage().enterPostCode("CV0 10Ol");
        new com.tutorial.demo.pages.CheckoutPage().selectCountry("India");
        new com.tutorial.demo.pages.CheckoutPage().selectRegion("Gujarat");

    }

    @And("^I click on continue after fill all detail on checkout page$")
    public void iClickOnContinueAfterFillAllDetailOnCheckoutPage() {
        new com.tutorial.demo.pages.CheckoutPage().clickOnContinue();
    }

    @And("^I add comments to text area about product order$")
    public void iAddCommentsToTextAreaAboutProductOrder() {
        new com.tutorial.demo.pages.CheckoutPage().addCommentsToTextArea("Happy Christmas!");
    }

    @And("^I click checkbox of terms and condition$")
    public void iClickCheckboxOfTermsAndCondition() {
        new com.tutorial.demo.pages.CheckoutPage().checkTermsAndConditionCheckBox();
    }

    @And("^I click on continue of checkout$")
    public void iClickOnContinueOfCheckout() {
        new com.tutorial.demo.pages.CheckoutPage().clickContinue();
    }

    @Then("^I should see warning message regarding Payment method$")
    public void iShouldSeeWarningMessageRegardingPaymentMethod() {
        Assert.assertTrue("Warning message not displayed",new com.tutorial.demo.pages.CheckoutPage().getWarningMessage().contains("Warning: Payment method required!"));
    }


}
