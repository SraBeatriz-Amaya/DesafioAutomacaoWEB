package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class TransferenciaInvalidaSteps {
	
	@Quando("eu acionar o botao tranferencia")
	public void euAcionarOBotaoTranferencia() throws Exception {
	    Aux(TelaInicialPage.class).acionarBotaoTransferencia();
	}

	@Quando("eu informar o numero da conta {string}")
	public void euInformarONumeroDaConta(String conta) throws Exception {
		Aux(TelaInicialPage.class).informarCampoConta(conta);
	}

	@Quando("eu informar o digito da conta {string}")
	public void euInformarODigitoDaConta(String digito) throws Exception {
		Aux(TelaInicialPage.class).informarCampoDigitoConta(digito);
	}

	@Quando("eu informar o valor da tranferencia {string}")
	public void euInformarOValorDaTranferencia(String valor) throws Exception {
		Aux(TelaInicialPage.class).informarCampoValorTransferencia(valor);
	}

	@Quando("eu informar a descricao {string}")
	public void euInformarADescricao(String descricao) throws Exception {
		Aux(TelaInicialPage.class).informarCampoDescricaoConta(descricao);
	}

	@Quando("eu acionar o botao transferir agora")
	public void euAcionarOBotaoTransferirAgora() throws Exception {
		Aux(TelaInicialPage.class).acionarBotaoTransferirAgora();
	}

	@Quando("eu visualizo um modal apresentando Conta inválida ou inexistente")
	public void euVisualizoUmModalApresentandoContaInválidaOuInexistente() {
		assertEquals("", driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[5]/div/div[2]")).getText());
	}

	@Entao("pressiono o botao fechar")
	public void pressionoOBotaoFechar() throws Exception {
		Aux(TelaInicialPage.class).acionarBotaoFechar();
	}
}
