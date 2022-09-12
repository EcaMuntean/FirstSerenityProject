package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class CartPage extends BasePage{
    @FindBy(css= ".success-msg")
    private WebElementFacade successMessage;

    public WebElementFacade getSuccessMessage() {
        return successMessage;
    }
}
