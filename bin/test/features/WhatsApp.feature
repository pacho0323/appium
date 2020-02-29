#Author: your.email@your.domain.com
# encoding: iso-8859-1 
#language: es

Característica: Mandar un mensaje
  Yo como usuario quiero enviar un mensaje por WhatsApp

  Escenario: Enviar mensaje
    Dado que yo me encuentre en WhatsApp
    Cuando busque el contacto
    Y le envie el mensaje
    Entonces yo verifico el mensaje enviado

