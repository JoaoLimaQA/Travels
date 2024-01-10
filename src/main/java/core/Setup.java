package core;

import utils.Enums.Navegadores;
import utils.Relatorio.*;
import utils.Relatorio.ReportFail;
import com.google.common.collect.ImmutableMap;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import java.lang.reflect.Method;
import static core.DriverFactory.*;
import static utils.Relatorio.AllureEnvironmentWriter.allureEnvironmentWriter;
import static utils.Relatorio.EvidenceReport.*;



@ExtendWith(ReportFail.class)
public class Setup {
    /**
     *  Ex: Run Handless
     openBrowser(Navegadores.HEADLESS,"https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");

     */
    @BeforeAll
    public static void inicializarBrowser() {

        openBrowser(Navegadores.CHROME,"https://phptravels.com/demo/");


    }



    @BeforeEach
    public void setupScenario(TestInfo testInfo) {
        Method[] methods = getClass().getMethods();
        Method method = methods[0];
        Description description = method.getAnnotation(Description.class);
        Story story = method.getAnnotation(Story.class);
        Epic epic = method.getAnnotation(Epic.class);
        Severity severity = method.getAnnotation(Severity.class);
        EvidenceReport.nomeCenario =  description.value();
        EvidenceReport.story = story.value();
        EvidenceReport.epic = epic.value();
        EvidenceReport.severity = String.valueOf(severity.value());
        EvidenceReport.novoCenario = true;


    }

    @AfterAll
    public static void fecharBrowser() {
        setAllureEnvironment();
        killDriver();

    }

    public static void setAllureEnvironment() {
        allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Browser", setBrowser())
                        .put("API.Version", "1.0")
                        .put("Ambiente ", "Homologação")
                        .put("Responsavel ", "Equipe de Automação")
                        .build());


    }


}
