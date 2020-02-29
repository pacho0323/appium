package tasks;


import interactions.Mover;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;
import pages.PageWhatsapp;

import java.util.HashMap;
import java.util.NoSuchElementException;

import static Drivers.DriverWhatsapp.hisBrowserMovil;
import static io.appium.java_client.touch.offset.ElementOption.element;


public class BuscarContacto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        // TODO Auto-generated method stub
        actor.attemptsTo(Click.on(PageWhatsapp.NUEVOCHAT)

        );
        boolean a=true;
        while(a){
      //  for (int i = 0; i < 5; i++) {
            actor.attemptsTo(Mover.scroll());
            if(PageWhatsapp.BUSCARCONTACTO.resolveFor(actor).isCurrentlyVisible()){
               actor.attemptsTo(Click.on(PageWhatsapp.BUSCARCONTACTO));
               a=false;
                break;
            }

        }
        if(!PageWhatsapp.BUSCARCONTACTO.resolveFor(actor).isCurrentlyVisible()) {
            throw new NoSuchElementException(PageWhatsapp.BUSCARCONTACTO.getName() + " no encontrado");
        }
        actor.attemptsTo(Enter.theValue("No de mis labios, Te amo y eres muy importante para mi").into(PageWhatsapp.MENSAJE),
                Click.on(PageWhatsapp.ENVIAR)

                );
    }

    public static BuscarContacto enWhatsapp() {
        return Tasks.instrumented(BuscarContacto.class);
    }
}