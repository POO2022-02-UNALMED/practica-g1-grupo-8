
#import gestorAplicacion.Hija


#from gestorAplicacion.Hija import *

class ConexionContactoUsuario:

    def __init__(self, contactoUsuario):
        #instance fields found by Java to Python Converter:
        self.contactoUsuario = contactoUsuario

    #Cambia los atributos del contacto de usuario, menos notificaciones
    def editarPerfil(self):
        opcion = 0
        condition = True
        while condition:
            print(self.contactoUsuario)
            print("Cambiar:\n0 Cancela\n1 nombre\n2 email\n3 nombreCompleto\n4 logoNegocio\n5 descripcionNegocio" + "\n6 terminosNegocio")
            opcion = input()
 
            if opcion == 0:
                print("Termino modificacion de Perfil")

            elif opcion == 1:
                print("Nombre actual: " + self.contactoUsuario.getNombre())
                print("Nuevo nombre: ", end = '')
                self.contactoUsuario.setNombre(sc.nextLine())

            elif opcion == 2:
                print("Email actual: " + self.contactoUsuario.getEmail())
                print("Nuevo Email: ", end = '')
                self.contactoUsuario.setEmail(sc.next())
                sc.nextLine()

            elif opcion == 3:
                print("Nombre completo actual: " + self.contactoUsuario.getNombreCompleto())
                print("Nuevo nombre completo: ", end = '')
                self.contactoUsuario.setNombreCompleto(sc.nextLine())

            elif opcion == 4:
                print("Logo de negocio actual: " + self.contactoUsuario.getLogoNegocio())
                print("Nuevo logo de negocio: ", end = '')
                self.contactoUsuario.setLogoNegocio(sc.nextLine())

            elif opcion == 5:
                print("Descripcion de negocio actual: " + self.contactoUsuario.getDescripcionNegocio())
                print("Nueva descripcion de negocio: ", end = '')
                self.contactoUsuario.setDescripcionNegocio(sc.nextLine())

            elif opcion == 6:
                print("Terminos de negocio actual: " + self.contactoUsuario.getTerminosNegocio())
                print("Nuevo terminos de negocio: ", end = '')
                self.contactoUsuario.setTerminosNegocio(sc.nextLine())

            else:
                print("Seleccione un numero entre 0 y 6")
            condition = opcion != 0
    #permite ver las notificaciones del contacto de usurio y crear nuevas
    def verNotificaciones(self, sc):
        opcion = None
        titulo = None
        cuerpo = None
        condition = True
        while condition:
            print("Notificaciones: ")
            for n in self.contactoUsuario.getNotificaciones():
                print(n)
            print("Crear una nueva:\n0 no\n1 si")
            opcion = input()

            if opcion == 0:
                print("Termino  modificacion de Perfil")
            elif opcion == 1:
                print("titulo: ", end = '')
                titulo = sc.nextLine()
                print("cuerpo: ", end = '')
                cuerpo = sc.nextLine()
                self.contactoUsuario.anadirNotificaciones(titulo, cuerpo)

            if opcion != 0:
                print("Seleccione un numero entre 0 o 1")
            condition = opcion != 0
