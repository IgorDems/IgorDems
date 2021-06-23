package com.aspiration;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductsPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"content-area\"]/div/spend-save-plans/div/div/div[1]/div[2]/div[2]/button")
    WebElementFacade aspiretion_but;
    @FindBy(xpath = "//*[@id=\"content-area\"]/div/spend-save-plans/div/div/div[2]/div[2]/div[2]/button")
    WebElementFacade aspiretionplus_but;

    @FindBy(xpath = "//*[@id=\"content-area\"]/div/spend-save-plans/div/div/div[1]/div[1]")
    WebElementFacade aspiretion_pic;
    @FindBy(xpath = "//*[@id=\"content-area\"]/div/spend-save-plans/div/div/div[1]/div[2]/div[1]")
    WebElementFacade aspiretion_pic2;

    @FindBy(xpath = "//*[@id=\"content-area\"]/div/spend-save-plans/div/div/div[2]/div[1]")
    WebElementFacade aspiretionplus_pic;
    @FindBy(xpath = "//*[@id=\"content-area\"]/div/spend-save-plans/div/div/div[2]/div[2]/div[1]")
    WebElementFacade aspiretionplus_pic2;

    //flex 1

    @FindBy(xpath = "//*[@id=\"join-waitlist-input\"]")
    WebElementFacade aspiretion_email;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/form/fieldset/div[3]/button")
    WebElementFacade aspiretiongetstart_but;

    //flex2

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[1]")
    WebElementFacade aspplusyearly;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]")
    WebElementFacade aspplusmonsly;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/button")
    WebElementFacade aspiretionplusgetstart_but;


    public void productPage() {
        waitForTextToAppear("Spend & Save Plans");
    }

    public void aspiretionProdDispl() {
        aspiretion_pic.isVisible();
        aspiretion_pic2.isVisible();
    }

    public void aspiretionPlusProdDispl() {
        aspiretionplus_pic.isVisible();
        aspiretionplus_pic2.isVisible();
    }

    public void navigateToAsp() {
        aspiretion_but.click();
    }

    public void navigateToAspPlus() {
        aspiretionplus_but.click();
    }



}
