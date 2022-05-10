package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

public class TransferenciaSucessoSteps {

	@Quando("eu pressionar o botao tranferencia")
	public void euPressionarOBotaoTranferencia() throws Exception {
		Aux(TelaInicialPage.class).acionarBotaoVoltar();
		Aux(TelaInicialPage.class).acionarBotaoTransferencia();
	}

	@Quando("eu preencher o valor da tranferencia {string}")
	public void euPreencherOValorDaTranferencia(String valor) throws Exception {
		Aux(TelaInicialPage.class).informarCampoValorTransferencia(valor);
	}

	@Quando("eu preencher a descricao {string}")
	public void euPreencherADescricao(String descricao) throws Exception { 
		Aux(TelaInicialPage.class).informarCampoDescricaoConta(descricao);
	}

	@Quando("eu pressionar o botao transferir agora")
	public void euPressionarOBotaoTransferirAgora() throws Exception { 
		Aux(TelaInicialPage.class).acionarBotaoTransferirAgora();
	}

	@Quando("eu visualizo um modal apresentando Transferencia realizada com sucesso")
	public void euVisualizoUmModalApresentandoTransferenciaRealizadaComSucesso() { 
		assertEquals("", driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[5]/div/div[2]")).getText());
	}

	@Quando("eu pressionar o botao fechar")
	public void euPressionarOBotaoFechar() throws Exception {
		Aux(TelaInicialPage.class).acionarBotaoFechar();
	}

	@Quando("eu pressionar o botao sair")
	public void euPressionarOBotaoSair() throws Exception {
		Aux(TelaInicialPage.class).acionarBotaoSair();
	}

	@Entao("o sistema apresenta a tela de login")
	public void oSistemaApresentaATelaDeLogin() {
		assertEquals("E-mail", driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[1]/label")).getText());
	}
}
