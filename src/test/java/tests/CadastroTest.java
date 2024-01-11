package tests;

import core.Setup;
import io.qameta.allure.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import utils.Relatorio.ReportFail;

import static io.qameta.allure.SeverityLevel.CRITICAL;

@ExtendWith(ReportFail.class)
public class CadastroTest extends Setup {

    @Test
    @Severity(CRITICAL)
    @Tags(value = {@Tag("add-cliente"),@Tag("regressivo")})
    @Epic("Cadastar novo usuário no banco")
    @Story("Usuarios Cadastrados")
    @Feature("Inclusao de novos Clientes")
    @Description("Realizar a inclusão do cliente atraves do preenchimento do formulario")

    public void CadastrarNovosUsuarios() {

    }
}
