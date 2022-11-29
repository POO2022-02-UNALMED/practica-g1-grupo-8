
import pickle


class Contacto:
    _SERIALVERSIONUID = 1
    #Cada contacto debe tener nombre, email y nombre completo 
    def __init__(self, nombre, email, nombreCompleto):
        #instance fields found by Java to Python Converter:
        self._nombre = nombre
        self._email = email
        self._nombreCompleto = nombreCompleto

    #Descripcion contacto 
    def toString(self):
        return "Contacto [nombre=" + self._nombre + ", email=" + self._email + ", nombreCompleto=" + self._nombreCompleto + "]"

    def getNombre(self):
        return self._nombre

    def setNombre(self, nombre):
        self._nombre = nombre

    def getEmail(self):
        return self._email

    def setEmail(self, email):
        self._email = email

    def getNombreCompleto(self):
        return self._nombreCompleto

    def setNombreCompleto(self, nombreCompleto):
        self._nombreCompleto = nombreCompleto

    def getUsuario(self):
        return self._usuario

    def setUsuario(self, usuario):
        self._usuario = usuario

    def enlazarUsuario(self, usuario):
        self.setUsuario(usuario)
