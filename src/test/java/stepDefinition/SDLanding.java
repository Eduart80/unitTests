package stepDefinition;

import Page.LandingPAge.landingPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;


public class SDLanding {
        landingPage lp = new landingPage();

        @And("^open Zedy3d i get the title '(.+)'$")
        public void mut(String name){
                lp.kape(name);
        }
        @When("^click on the contact button$")
        public void searchWeb(){
                lp.webSearch();
        }
        @Then("^fill out the form with name '(.+)'$")
        public void fill(String name){
                lp.fillForm(name);
        }
        @Then("^fill email '(.+)'$")
        public void fillEmail(String name){
                lp.fillEmail(name);
        }
        @And("^go back to main page$")
        public void homePage(){
                lp.homePage();
        }
        @Then("^mouse over Other presentations$")
        public void mouseOver() throws IOException {
                lp.mouseOv();
        }




}
