package steps;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static driver.DriverAndroid.hisBrowserMovil;

public class Step {
	private Actor actor;
	
	@Dado("^que yo me encuentre en WhatsApp$")
	public void queYoMeEncuentreEnWhatsApp() {
	    // Write code here that turns the phrase above into concrete actions
		actor = Actor.named("juan");
	   actor.can(BrowseTheWeb.with(hisBrowserMovil().Android())); 
	}


	@Cuando("^busque el contacto$")
	public void busqueElContacto() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Cuando("^le envie el mensaje$")
	public void leEnvieElMensaje()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Entonces("^yo verifico el mensaje enviado$")
	public void yoVerificoElMensajeEnviado()  {
	    // Write code here that turns the phrase above into concrete actions
	  
	}
}
