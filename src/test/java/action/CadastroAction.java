package action;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import screen.CadastroPage;

import static core.DriverFactory.getDriver;
import static core.BasePage.*;
import static utils.Relatorio.EvidenceReport.*;
public class CadastroAction extends CadastroPage {

    public CadastroAction() {
        super(getDriver());
    }

    public CadastroAction que_clico_em_Signup() {
        clicar(signup);
        return this;
    }
    public CadastroAction preencho_as_informações_necessárias() {
            escreverTexto(nome,"João");
            escreverTexto(sobrenome,"Teste");
            escreverTexto(email,userAleatorio("joaoteste","@teste.com"));
                //Selecionar o DDI do telefone
                Select codebrazil= new Select(ddi);
                codebrazil.selectByVisibleText("55");
            escreverTexto(celular,"11 90001-0001");
            escreverTexto(empresa,"JP Technology");
            escreverTexto(endereco,"Rua do Teste 2024");
                 //Selecionar o pais
                Select coutry = new Select(pais);
                coutry.selectByVisibleText("Brazil");
                //Selecionar o estado
                Select state = new Select(estado);
                state.selectByVisibleText("SP");
            escreverTexto(cidade,"QACity");
            escreverTexto(senha,"Pwd123@");
            escreverTexto(confirsenha,"Pwd123@");
            gerarRelatorio("Formulario Preenchido","Preenchimento do formulario para Cadastro");
            return this;
    }

    public CadastroAction clico_em_Register()  {
        clicar(registrar);
        return this;
    }

    public CadastroAction sou_direcionado_a_tela_de_homepage()  {
        gerarRelatorio("HomePage", "Tela Inicial de Login");
        return this;
    }

}