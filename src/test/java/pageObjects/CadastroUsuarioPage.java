package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroUsuarioPage {

	@FindBy(xpath = "//button[text()='Registrar']")
	private WebElement botaoRegistrar;

    public void acionarBotaoRegistrar(){
        botaoRegistrar.click();
    }
    
    @FindBy(xpath = "//*[@id=\"__next\"]//div[2]/form/div[2]/input")
    private WebElement campoEmail;

    public void informarCampoEmail(String email) throws Exception{
    	campoEmail.click();
    	campoEmail.sendKeys(email);
    }
    
    @FindBy(xpath = "//*[@id=\"__next\"]//div[3]/input")
    private WebElement campoNome;

    public void informarCampoNome(String nome){
    	campoNome.click();
    	campoNome.sendKeys(nome);
    }
    @FindBy(xpath = "//*[@id=\"__next\"]//div[4]/div/input")
    private WebElement campoSenha;

    public void informarCampoSenha(String senha){
    	campoSenha.click();
    	campoSenha.sendKeys(senha);
    }
    @FindBy(xpath = "//*[@id=\"__next\"]//div[5]//input")
    private WebElement campoConfirmarSenha;

    public void informarCampoConfirmarSenha(String senha2){
    	campoConfirmarSenha.click();
    	campoConfirmarSenha.sendKeys(senha2);
    }
    
    @FindBy(id = "toggleAddBalance")
    private WebElement botaoContaSaldoSim;

    public void acionarbotaoContaSaldo(){
    	botaoContaSaldoSim.click();
    	
    }
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/button")
    private WebElement botaoCadastrar;

    public void acionarBotaoCadastrar(){
    	botaoCadastrar.click();
    	
    }
    @FindBy(xpath = "//*[@id=\"btnCloseModal\"]")
    private WebElement botaoFechar;

    public void acionarBotaoFechar() throws Exception{
    	Thread.sleep(1000);
    	botaoFechar.click();
    	
    
    }
    public void cadastrar(String email, String nome,String senha, String senha2) throws Exception {
    	acionarBotaoRegistrar();
    	informarCampoEmail(email);
    	informarCampoNome(nome);
    	informarCampoSenha(senha);
    	informarCampoConfirmarSenha(senha2);
    	acionarbotaoContaSaldo();
    	acionarBotaoCadastrar();
    	acionarBotaoFechar();
    }
    
}
