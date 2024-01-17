package screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroPage {
    public CadastroPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[contains(.,'Signup')]")
    public WebElement signup;

    @FindBy(xpath = "//*[@id='inputFirstName']")
    public WebElement nome;

    @FindBy(id = "inputLastName")
    public WebElement sobrenome;

    @FindBy(id = "inputEmail")
    public WebElement email;

    @FindBy(id = "inputPhone")
    public WebElement celular;

    @FindBy(xpath = "//*[@class='selected-dial-code']")
    public WebElement ddi;

    @FindBy(id = "inputCompanyName")
    public WebElement empresa;

    @FindBy(id = "inputCompanyName")
    public WebElement endereco;

    @FindBy(id = "inputCity")
    public WebElement cidade;

    @FindBy(id = "stateinput")
    public WebElement estado;

    @FindBy(id = "inputCountry")
    public WebElement pais;

    @FindBy(id = "inputNewPassword1")
    public WebElement senha;

    @FindBy(id = "inputNewPassword2")
    public WebElement confirsenha;

    @FindBy(xpath = "//*[@value='Registre-se']")
    public WebElement registrar;

}