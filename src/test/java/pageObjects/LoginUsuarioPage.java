package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginUsuarioPage {

	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[1]/input")
    private WebElement campoEmail;

    public void informarCampoEmail(String email) throws Exception{
    	Thread.sleep(10000);
    	campoEmail.click();
    	campoEmail.sendKeys(email);
    }
    
    @FindBy(xpath = "//*[@id=\"__next\"]//div[2]/div/input")
    private WebElement campoSenha;

    public void informarCampoSenha(String senha){
    	campoSenha.click();
    	campoSenha.sendKeys(senha);
    }
    
    @FindBy(xpath = "//*[@id=\"__next\"]//div[1]/form/div[3]/button[1]")
    private WebElement botaoAcessar;

    public void acionarBotaoAcessar() throws Exception{
    	botaoAcessar.click();
    	Thread.sleep(10000);
    	
    }
    public void realizarLogin(String email, String senha) throws Exception{
        informarCampoEmail(email);
        informarCampoSenha(senha);
        acionarBotaoAcessar();
        
    }
}
