package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

public class PagamentoSteps {

	
	@Quando("eu acionar o botao pagamento")
	public void euAcionarOBotaoPagamento() throws Exception {
		Aux(TelaInicialPage.class).acionarBotaoPagamento();
	}

	@Quando("eu visualizar Funcionalidade em desenvolvimento")
	public void euVisualizarFuncionalidadeEmDesenvolvimento() {
		assertEquals("", driver.findElement(By.xpath("//*[@id=\"modalText\"]")).getText());
	}

	@Quando("eu clicar no botao fechar")
	public void euClicarNoBotaoFechar() throws Exception {
		Aux(TelaInicialPage.class).acionarBotaoFechar();
	}

	@Entao("visualizo a pagina inicial")
	public void visualizoAPaginaInicial() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    assertEquals("Olá Stefanini Teste,", driver.findElement(By.xpath("//*[@id=\"textName\"]")).getText());
	}

}
