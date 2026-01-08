package io.github.christiangarciaqa.automation.runner.demoqa;
//00. Aqui empezaran a correr nuestras automatizaciones de demoqa, por lo que debemos decirle que es una clase ejecutable y debe ejecutrarse desde cucumber

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;


//1. Le debemos decir a nuestro programa queque usaremos cucumber, tambien debemos decirle en donde va buscar nuestros escenarios de prueba (features) y donde estaran las implementaciones de cada uno de los pasos de nuestros escenarios (los steps/hooks) y adicional (pero opcional que nos devuelva un informe en un html mediante un plugin)
//2. De aqui nos vamos a la feature
@Suite //“Esto es una suite de pruebas”
@IncludeEngines("cucumber")     //“JUnit 5, usa el motor de Cucumber”
@SelectClasspathResource("features/demoqa")     //“Los .feature están en src/test/resources/features/demoqa”
@ConfigurationParameter(
        key = GLUE_PROPERTY_NAME,
        value = "io.github.christiangarciaqa.automation.hooks," +
                "io.github.christiangarciaqa.automation.sites.demoqa.steps"
)
//“Cucumber: buscame los Steps/Hooks en este paquete raíz”

@ConfigurationParameter(
        key = PLUGIN_PROPERTY_NAME,
        value = "pretty, html:target/cucumber-report-demoqa.html"
)
//Y dame una salida linda + reporte HTML

public class DemoQARunner {
}
