package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.AuthentificationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition {

	private AuthentificationPage authentificationPage;

	public AuthentificationStepDefinition() {
		this.authentificationPage = new AuthentificationPage();
	}

	@Given("Je me connecte sur le site Mercury")
	public void jeMeConnecteSurLeSiteMercury() {
		authentificationPage.goToUrl();

	}

	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String name) {
		authentificationPage.fillUserName(name);
	}

	@When("Je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String password) {
		authentificationPage.fillPassword(password);
	}

	@When("Je clique sur le boutton submit")
	public void jeCliqueSurLeBouttonSubmit() {
		authentificationPage.clickOnBtnSubmit();
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		String message = AuthentificationPage.welcomeMessage.getText();
		Assert.assertEquals(text, message);
	}

}
