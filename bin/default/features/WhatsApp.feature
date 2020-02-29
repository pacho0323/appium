#Author: your.email@your.domain.com
#language: es

@tag
Feature: Mandar un mensaje
  Yo como usuario quiero enviar un mensaje por WhatsApp

  @tag1
  Scenario: Enviar mensaje
    Dado que yo me encuentre en WhatsApp
    Cuando busque el contacto
    Y le envie el mensaje
    Entonces yo verifico el mensaje enviado
