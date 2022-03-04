package org.runewriters.stepdefs;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.runewriters.pom.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class InventoryStepDefs {

    private WebDriver webDriver;
    private static ChromeDriverService service;
    private LoginPage loginPage;
    private InventoryPage inventoryPage;
    private InventoryItemPage inventoryItemPage;
    private CartPage cartPage;
    private String productPrice;
    private String productName;
    private String imageSource;
    private String productDescription;

    @Before
    public void setUps(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.saucedemo.com");
    }

    @Given("I am in inventory page")
    public void iAmInInventoryPage(){
        loginPage = new LoginPage(webDriver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogInButton();
        webDriver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
        inventoryPage = new InventoryPage(webDriver);
    }

    @When("I click the product name{int}")
    public void iClickTheProductName(int name_index){
         productPrice = inventoryPage.getPriceAtIndex(name_index/2);
         productName = inventoryPage.getItemNameAtIndex(name_index/2);
         imageSource = inventoryPage.getItemImageSourceAtIndex(name_index/2);
        productDescription = inventoryPage.getItemDescriptionAtIndex(name_index/2);
         System.out.println(productPrice);
         inventoryPage.clickItemImageAtIndex(name_index);
    }

    @When("I click the product image{int}")
    public void iClickTheProduct(int image_index){
        inventoryPage = new InventoryPage(webDriver);
        productPrice = inventoryPage.getPriceAtIndex(image_index/2);
        productName = inventoryPage.getItemNameAtIndex(image_index/2);
        imageSource = inventoryPage.getItemImageSourceAtIndex(image_index/2);
        productDescription = inventoryPage.getItemDescriptionAtIndex(image_index/2);
        System.out.println(productPrice);
        inventoryPage.clickItemImageAtIndex(image_index);
    }

    @Then("I get into the product information page")
    public void iGetIntoTheProductInformationPage(){
        inventoryItemPage = new InventoryItemPage(webDriver);
    }

    @And("The price is match with the product")
    public void thePriceIsMatchWithTheProduct(){
        Assertions.assertEquals(productPrice, inventoryItemPage.getItemPrice());
    }

    @And("The product name is match with the link")
    public void theProductNameIsMatchWithTheLink(){
        Assertions.assertEquals(productName, inventoryItemPage.getItemName());
    }

    @And("The product image is match with the link")
    public void theProductImageIsMatchWithTheLink(){
        Assertions.assertEquals(imageSource, inventoryItemPage.getItemImageSource());
    }

    @And("The product description is match with the link")
    public void theProductDescriptionIsMatchWithTheLink(){
        Assertions.assertEquals(productDescription, inventoryItemPage.getItemDescription());
    }

    @When("I select sort Z to A from the dropdown list")
    public void iSelectSortZToAFromTheDropdownList(){
        inventoryPage.filterPageByNameZToA();
    }

    @When("I select sort A to Z from the dropdown list")
    public void iSelectSortAToZFromTheDropdownList(){
        inventoryPage.filterPageByNameAToZ();
    }

    @Then("All item sort in ascending order with its name")
    public void allItemSortInAscendingOrderWithItsName() {
        ArrayList<String> sortProductArray = new ArrayList<>();
        for(int i=0;i<6;i++){
            sortProductArray.add(inventoryPage.getItemNameAtIndex(i));
        }
        Collections.sort(sortProductArray);
        for(int i=0;i<6;i++){
            Assumptions.assumeTrue(sortProductArray.get(i).equals(inventoryPage.getItemNameAtIndex(i)));
        }
    }

    @Then("All item sort in descending order with its name")
    public void allItemSortInDescendingOrderWithItsName() {
        ArrayList<String> sortProductArray = new ArrayList<>();
       for(int i=0;i<6;i++){
           sortProductArray.add(inventoryPage.getItemNameAtIndex(i));
        }
        Collections.sort(sortProductArray, Collections.reverseOrder());
        for(int i=0;i<6;i++){
            Assumptions.assumeTrue(sortProductArray.get(i).equals(inventoryPage.getItemNameAtIndex(i)));
        }
    }

    @When("I select sort price low to high from the dropdown list")
    public void iSelectSortPriceLowToHighFromTheDropdownList(){
        inventoryPage.filterPageByPrizeLowToHigh();
    }

    @When("I select sort price high to low from the dropdown list")
    public void iSelectSortPriceHighToLowFromTheDropdownList(){
        inventoryPage.filterPageByPriceHighToLow();
    }

    @Then("All item sort in ascending order with its price")
    public void allItemSortInAscendingOrderWithItsPrice(){
        ArrayList<Double> sortedPriceArrayList = new ArrayList<>();
        for(int i=0;i<6;i++){
            //sortPriceArray.add(Double.parseDouble(inventoryPage.getPriceAtIndex(i).replaceAll("[$]","")));
            sortedPriceArrayList.add(Double.parseDouble(inventoryPage.getPriceAtIndex(i).replaceAll("[$]","")));
        }
        Collections.sort(sortedPriceArrayList);
        for(int i=0;i<6;i++){
            Assumptions.assumeTrue(sortedPriceArrayList.get(i).equals(Double.parseDouble(inventoryPage.getPriceAtIndex(i).replaceAll("[$]",""))));
        }
    }

    @Then("All item sort in descending order with its price")
    public void allItemSortInDescendingOrderWithItsPrice(){
        ArrayList<Double> sortedPriceArrayList = new ArrayList<>();
        for(int i=0;i<6;i++){
            //sortPriceArray.add(Double.parseDouble(inventoryPage.getPriceAtIndex(i).replaceAll("[$]","")));
            sortedPriceArrayList.add(Double.parseDouble(inventoryPage.getPriceAtIndex(i).replaceAll("[$]","")));
        }
        Collections.sort(sortedPriceArrayList, Collections.reverseOrder());
        for(int i=0;i<6;i++){
            Assumptions.assumeTrue(sortedPriceArrayList.get(i).equals(Double.parseDouble(inventoryPage.getPriceAtIndex(i).replaceAll("[$]",""))));
        }
    }

    @When("I click add to cart or remove button {int}")
    public void iClickAddToCart(int i){
        inventoryPage.clickAddToCartOrRemoveButtonAtIndex(i);
    }

    @Then("{int} button shows remove")
    public void buttonShowsRemove(int i){
       Assertions.assertEquals("REMOVE",inventoryPage.getButtonNameAtIndex(i));
   }

    @Then("{int} button shows add to chart")
    public void buttonShowsAddToChart(int i){
        Assertions.assertEquals("ADD TO CART",inventoryPage.getButtonNameAtIndex(i));
    }

    @And("I click add to cart or remove button in inventory page")
    public void iClickIntAddToCartOrRemoveButtonInInventoryPage(){
        inventoryItemPage.clickAddToCartOrRemoveButton();
    }

    @Then("The button in inventory page shows remove")
    public void theButtonInInventoryPageShowsRemove(){
        Assertions.assertEquals("REMOVE",inventoryItemPage.getAddToCartOrRemoveButtonName());
    }

    @And("I click back to products button")
    public void iClickBackToProductsButton(){
        inventoryItemPage.clickBackToProductsButton();
    }


    @Then("I get into the inventory page")
    public void iGetIntoTheInventoryPage(){
        Assertions.assertEquals("https://www.saucedemo.com/inventory.html", inventoryPage.getCurrentURL());
    }

    @When("I click {int} add to cart or remove button")
    public void iClickAddToCartOrRemoveButton(int i ){
        inventoryPage.clickAddToCartOrRemoveButtonAtIndex(i);
    }

    @Then("The cart icon show plus one product")
    public void theCartIconSHowPlusOneProduct(){
        Assertions.assertEquals("1",inventoryPage.getShoppingCartBadge());
    }

    @When("I click all product add to cart or remove button")
    public void whenIClickAllProductAddToCartOrRemoveButton(){
        for(int i =0; i <6;i++){
            inventoryPage.clickAddToCartOrRemoveButtonAtIndex(i);
        }
    }

    @Then("The cart icon shows all product amount")
    public void theCartIconShowsAllProductAmount(){
        Assertions.assertEquals("6",inventoryPage.getShoppingCartBadge());
    }

    @After
    public void tearDown(){
      webDriver.quit();
    }

}
