
package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

public class ExtratoSteps {

	
	@Quando("eu acionar o botao extrato")
	public void euAcionarOBotaoExtrato() throws Exception {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Aux(TelaInicialPage.class).acionarBotaoExtrato();
	}
	   
	@Quando("eu visualizo saldo disponivel")
	public void euVisualizoSaldoDisponivel() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		assertEquals("Saldo adicionado ao abrir conta", driver.findElement(By.id("textDescription")).getText());
	}

	@Quando("eu visualizo a data de abertura")
	public void euVisualizoADataDeAbertura() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		assertEquals("01/05/2022", driver.findElement(By.id("textDateTransaction")).getText());
	}

	@Quando("eu acionar botao voltar")
	public void euAcionarBotaoVoltar() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Aux(TelaInicialPage.class).acionarBotaoVoltar();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Entao("visualizo a tela principal")
	public void visualizoATelaPrincipal() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    assertEquals("Olá Stefanini Teste,", driver.findElement(By.xpath("//*[@id=\"textName\"]")).getText());
	}

}
