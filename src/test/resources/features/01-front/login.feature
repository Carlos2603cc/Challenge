#language: es
#encoding: utf-8

@Login
Característica: Loguearse en SawagLabs
  Yo como usuario de SawagLabs
  Quiero iniciar sesion en la aplicacion
  Para poder ver el home de SawagLabs

  Antecedentes:
    Dado que el usuario quiere ingresar a Login

  Escenario: Login Exitoso
    Cuando ingresa las credenciales correctas
    Entonces podra ver el home de la SawagLabs

  Escenario:  Login usuario bloqueado
    Cuando ingresa las credenciales bloqueadas
    Entonces el usuario no podra acceder