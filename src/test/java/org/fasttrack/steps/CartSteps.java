package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps{

    @Step
    public void addProductToCart() {
        productPage.clickAddToCartButton();
    }
    @Step
    public void checkSuccessMessage(String productName){
        Assert.assertEquals(productName +" was added to your shopping cart.",cartPage.getSuccessMessage().getText());

    }

}
