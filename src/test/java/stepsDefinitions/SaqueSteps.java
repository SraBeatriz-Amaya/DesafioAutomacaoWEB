package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

public class SaqueSteps {

	@Quando("eu acionar o botao saque")
	public void euAcionarOBotaoSaque() throws Exception {
	    Aux(TelaInicialPage.class).acionarBotaoSaque();
	}
	@Quando("eu visualizo Funcionalidade em desenvolvimento")
	public void euVisualizoFuncionalidadeEmDesenvolvimento() {
		assertEquals("", driver.findElement(By.xpath("//*[@id=\"modalText\"]")).getText());
	}

	@Quando("eu acionar botao fechar")
	public void euAcionarBotaoFechar() throws Exception {
	    Aux(TelaInicialPage.class).acionarBotaoFechar();
	}

	@Entao("visualizo a tela inicial")
	public void visualizoATelaInicial() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    assertEquals("Olá Stefanini Teste,", driver.findElement(By.xpath("//*[@id=\"textName\"]")).getText());
	}

}
