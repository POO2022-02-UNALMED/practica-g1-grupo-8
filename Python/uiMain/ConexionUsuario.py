
#import gestorAplicacion.Hija.*;
#import java.util.Scanner;


class ConexionUsuario:


    def __init__(self, usuario):
        self._usuario = usuario

    #Permite al Usuario crear un contacto de este tipo por consola.
    def crearNuevoContacto(self):
        print(self._usuario.getContactosPendientes())
        print("Crear Contacto")
        print("Nombre: ", end = '')
        nombre = (input())
        print("Email: ", end = '')
        email = input()
        print("Nombre completo: ", end = '')
        nombreCompleto = input()
        self._usuario.crearNuevoContacto(nombre, email, nombreCompleto)

		#Todo falta serializar
		#Permite seleccionar un contacto para iniciar una conversacion.

def empezarChat(self, sc):
		opcion = None
		condition = True
		while condition:
			print("Elige un contacto")
			print("0 cancelar")
			#Imprime todos los contactos locales con un indce al principio
			i = 0
			while i < self._usuario.getContactosPendientes().size():
				print(str(i+1) + " " + str(self._usuario.getContactoPendiente(i)))
				i += 1
			opcion = int(input())

	
			#Revisa si se selecciono un contacto y se realiza en cambio.
			if (opcion > 0) and (opcion <= self._usuario.getContactosPendientes().size()):
				self._usuario.volverContactoLocal(opcion - 1)
				crearMensaje(sc)
	
			elif opcion != 0:
				print("Seleccione un numero entre 0 y " + str(self._usuario.getContactosPendientes().size()))
	
			else:
				print("Termino empezar chat")
	
	
			condition = opcion != 0

def crearMensaje(self):
		print("Titulo: ", end = '')
		titulo = input()
		print("Cuerpo: ", end = '')
		cuerpo = input()
		print("Elige el tipo de mensaje:\n0 negocios\n1 Social")
		opcion = input()
		condition = True
		while condition:
			if opcion == 0:
				#crea y añade un mesaje de negocios al contacto recien creado
				usuario.anadirMensajeNegocio(titulo, cuerpo)
	
			elif opcion == 1:
				#crea y añade un mesaje social al contacto recien creado
				usuario.anadirMensajeSocial(titulo, cuerpo)
	
			else:
				print("Seleccione un numero entre 0 o 1")
			condition = opcion != 0 and opcion != 1
	
	
	#Muestra los chats 
def mostrarChats(self):
		print(usuario.mostrarChats())
	
	#Permite elegir a que contacto local enviarle un mensaje adicional
def seguirChat(self):
		opcion = None
		condition = True
		while condition:
			print("Elige un contacto")
			print("0 cancelar")
			#Imprime todos los contactos locales con un indce al principio
			i = 0
			while i < usuario.getContactosLocales().size():
				print(str(i+1) + " " + str(usuario.getContactoLocal(i)))
				i += 1
			opcion = int(input())
	
	
			#Revisa si se selecciono un contacto y se realiza en cambio.
			if (opcion > 0) and (opcion <= usuario.getContactosLocales().size()):
				self.crearMensaje(opcion - 1, sc)
	
			elif opcion != 0:
				print("Seleccione un numero entre 0 y " + str(usuario.getContactosLocales().size()))
	
			else:
				print("Termino empezar chat")
	
	
			condition = opcion != 0
	
			#Crea un mensaje en el contacto de la pocision i, socila o de negocios
			def crearMensaje(self, i):
				opcion = None
				titulo = None
				cuerpo = None
				print("Titulo: ", end = '')
				titulo = input()
				print("Cuerpo: ", end = '')
				cuerpo = input()
				print("Elige el tipo de mensaje:\n0 negocios\n1 Social")
				opcion = int(input())
	
				condition = True
				while condition:
					if opcion == 0:
						#crea y añade un mesaje de negocios al contacto recien creado
						usuario.anadirMensajeNegocio(i, titulo, cuerpo)
			
					elif opcion == 1:
						#crea y añade un mesaje social al contacto recien creado
						usuario.anadirMensajeSocial(i, titulo, cuerpo)
			
					else:
						print("Seleccione un numero entre 0 o 1")
					condition = opcion != 0 and opcion != 1
			def crearTarjetaNegocio(self):
				print("Nombre negocio")
				nombreNegocio = input()
				print("Descripcion negocio:")
				descripcionNegocio = input()
				print("Telefono negocio")
				telefonoNegocio = input()
				print("Direccion negocio")
				direccionNegocio = input()
			
				tarjetaNegocioUsuario = TarjetaNegocioUsuario(nombreNegocio, descripcionNegocio, telefonoNegocio, direccionNegocio)
				usuario.anadirTarjetaNegocio(tarjetaNegocioUsuario)
			
			def imprimirTarjetaNegocio(self):
				if self.usuario.getTarjetaNegocio() is not None and str(self.usuario.getTarjetaNegocio()) is not None:
					print(str(self.usuario.getTarjetaNegocio()))
					return
				print("No tienes ninguna tarjeta de negocio")
			
			def crearNotificacion(self, usuario):
				print("Titulo: ")
				titulo = input()
				print("Cuerpo: ")
				cuerpo = input()
				if not usuario.getListaUsuario().isEmpty():
					usuario.usuario(0).getContactoUsuario().anadirNotificaciones(titulo, cuerpo)
				else:
					print("Debes crear un usuario para poder crear notificaciones")
			
def listarMensajesDeUsuarios(self, usuario):
		if not len(usuario.getListaUsuario()) == 0:
			A = usuario.usuario(0).getContactoUsuario().getNotificaciones()
			for a in A: 
				print(notificacion.toString())
			
		else:
			print("Debes crear un usuario para poder crear notificaciones")


def getUsuario(self):
    return usuario

