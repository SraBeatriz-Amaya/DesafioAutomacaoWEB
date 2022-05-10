package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import pageObjects.LoginUsuarioPage;

public class LoginUsuarioSteps {

	@Quando("informo o campo email {string}")
	public void informoOCampoEmail(String email) throws Exception {
		 Aux(LoginUsuarioPage.class).informarCampoEmail(email);
	}

	@Quando("preencho o campo senha {string}")
	public void preenchoOCampoSenha(String senha) {
		Aux(LoginUsuarioPage.class).informarCampoSenha(senha);
	}

	@Quando("clicar no botao acessar")
	public void clicarNoBotaoAcessar() throws Exception {
		Aux(LoginUsuarioPage.class).acionarBotaoAcessar();
	}

	@Entao("o sistema apresenta {string}")
	public void oSistemaApresenta(String string) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    assertEquals("Olá Stefanini Teste,", driver.findElement(By.xpath("//*[@id=\"textName\"]")).getText());
	  
	}
}
