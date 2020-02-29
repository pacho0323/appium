package steps;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.BuscarContacto;

import static Drivers.DriverWhatsapp.hisBrowserMovil;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepWhatsapp {

    @Managed(driver = "Appium", uniqueSession = true)
    WebDriver driver;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que (.*) se encuentre en Whatsapp$")
    public void queJuanSeEncuentreEnWhatsapp(String juan)  {
        // Write code here that turns the phrase above into concrete actions
        //theActorCalled(juan).can(BrowseTheWeb.with(hisBrowserMovil().Android()));
        theActorCalled(juan).can(BrowseTheWeb.with(driver));
    }


    @Cuando("^busque el contacto$")
    public void busqueElContacto()  {
        // Write code here that turns the phrase above into concrete actions
     theActorInTheSpotlight().attemptsTo(BuscarContacto.enWhatsapp());
    }


    @Cuando("^envie el mensaje$")
    public void envieElMensaje()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @Entonces("^vera que el mensaje fue enviado$")
    public void veraQueElMensajeFueEnviado()  {
        // Write code here that turns the phrase above into concrete actions

    }
}
