#language: es
#encoding: utf-8

@CreateAccount
Característica: Crear una cuenta atravez de los servicios de Reqres
  Yo como analista de automatización
  Quiero probar el proceso de creacion de cuenta
  Para verificar que funciona correctamente

  Antecedentes:
    Dado que existe un usuario

  Escenario: Realizar el proceso de creacion de cuenta exitosamente
    Cuando el usuario intenta crear una cuenta
    Entonces el usuario crea la cuenta de manera exitosa

  Escenario: Realizar el proceso de creacion de cuenta de manera fallida
    Cuando el usuario intenta crear una cuenta con credenciales no validas
    Entonces el usuario no crea la cuenta de manera exitosa

