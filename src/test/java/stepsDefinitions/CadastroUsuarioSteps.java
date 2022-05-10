package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastroUsuarioPage;

public class CadastroUsuarioSteps {

	@Quando("eu acionar o botao registrar")
	public void euAcionarOBotaoRegistrar() {
	    Aux(CadastroUsuarioPage.class).acionarBotaoRegistrar();
	}

	@Quando("informar o campo email {string}")
	public void informarOCampoEmail(String email) throws Exception {
		Aux(CadastroUsuarioPage.class).informarCampoEmail(email);
	}

	@Quando("informar o campo nome {string}")
	public void informarOCampoNome(String nome) {
		Aux(CadastroUsuarioPage.class).informarCampoNome(nome);
	}

	@Quando("informar o campo senha {string}")
	public void informarOCampoSenha(String senha) {
		Aux(CadastroUsuarioPage.class).informarCampoSenha(senha);
	}

	@Quando("informar no campo confirmacao senha {string}")
	public void informarNoCampoConfirmacaoSenha(String senha) {
		Aux(CadastroUsuarioPage.class).informarCampoConfirmarSenha(senha);
	}
	
	@Quando("acionar o botao conta saldo")
	public void acionarOBotaoContaSaldo() {
		Aux(CadastroUsuarioPage.class).acionarbotaoContaSaldo();
	}
	
	@Quando("clicar no botao cadastrar")
	public void clicarNoBotaoCadastrar() {
		Aux(CadastroUsuarioPage.class).acionarBotaoCadastrar();
	}

	@Quando("eu visualizo um modal apresentando cadastrado com sucesso")
	public void euVisualizoUmModalApresentandoCadastradoComSucesso() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    assertEquals("", driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[1]/a")).getText());
	}
	
	@Quando("acionar o botao fechar")
	public void acionarOBotaoFechar() throws Exception {
	    Aux(CadastroUsuarioPage.class).acionarBotaoFechar();
	}
	
}
