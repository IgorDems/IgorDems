package com.aspiration;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;


@DefaultUrl("https://www.aspiration.com/")

public class HomePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"__next\"]/header/ul[1]/li[1]/a")
    WebElementFacade spandsave;

    public void navigateToProductPage(){
        getDriver().get("https://www.aspiration.com/");
        waitForTextToAppear("You can change Climate Change");
        waitFor(spandsave).click();

    }


}
