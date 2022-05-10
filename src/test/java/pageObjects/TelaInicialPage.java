package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaInicialPage {
	
	//Cenario Extrato
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[3]/div[2]/div[3]")
    private WebElement botaoExtrato;

    public void acionarBotaoExtrato() throws Exception {
    	botaoExtrato.click();
    	
    }
    @FindBy(id = "btnBack")
    private WebElement botaoVoltar;

    public void acionarBotaoVoltar() {
    	botaoVoltar.click();
    	
    }
    
    //Cenario Saque
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[3]/div[2]/div[4]")
    private WebElement botaoSaque;

    public void acionarBotaoSaque() throws Exception {
    	botaoSaque.click();
    	
    }
    @FindBy(xpath = "//*[@id=\"btnCloseModal\"]")
    private WebElement botaoFechar;

    public void acionarBotaoFechar() throws Exception {
    	Thread.sleep(2000);
    	botaoFechar.click();
    	
    }
  //Cenario Pagamento
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[3]/div[2]/div[2]")
    private WebElement botaoPagamento;

    public void acionarBotaoPagamento() throws Exception {
    	botaoPagamento.click();
    	
    }
    
  //Cenario transferencia
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[3]/div[2]/div[1]")
    private WebElement botaoTransferencia;

    public void acionarBotaoTransferencia() throws Exception {
    	botaoTransferencia.click();
    	
    }
    
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[3]/form/div[1]/div[1]/input")
    private WebElement campoConta;

    public void informarCampoConta(String conta) throws Exception{
    	campoConta.click();
    	campoConta.sendKeys(conta);
    }
    
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[3]/form/div[1]/div[2]/input")
    private WebElement campoDigito;

    public void informarCampoDigitoConta(String digito) throws Exception{
    	campoDigito.click();
    	campoDigito.sendKeys(digito);
    }
    
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[3]/form/div[2]/input")
    private WebElement campoValor;

    public void informarCampoValorTransferencia(String valor) throws Exception{
    	campoValor.click();
    	campoValor.sendKeys(valor);
    }
    
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[3]/form/div[3]/input")
    private WebElement campoDescricao;

    public void informarCampoDescricaoConta(String descricao) throws Exception{
    	campoDescricao.click();
    	campoDescricao.sendKeys(descricao);
    }
    
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[3]/form/button")
    private WebElement botaoTransferirAgora;

    public void acionarBotaoTransferirAgora() throws Exception {
    	botaoTransferirAgora.click();
    	
    }
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div")
    private WebElement botaoSair;

    public void acionarBotaoSair() throws Exception {
    	Thread.sleep(2000);
    	botaoSair.click();
    	
    }
    
}
