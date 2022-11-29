import tkinter as tk
from tkinter import messagebox
class ErrorAplicacion(Exception):
    def __init__(self, error):
        self.error = messagebox.showerror("Ventana Emergente","Manejo errores aplicacion :" + error)


class Excetionc1(ErrorAplicacion):
    def __init__(self,error1):
        error = "Dejaste vacio el requerimiento"+error1
        super().__init__(error)

class Excetionc11(Excetionc1):
    def __init__(self):
        error1 =" nombre del negocio o descripcion del negocio" 
        super().__init__(error1)

class Excetionc12(Excetionc1):
    def __init__(self):
        error1 =" telefono o direccion" 
        super().__init__(error1)

class Excetionc13(Excetionc1):
    def __init__(self):
        error1 =" titulo o cuerpo" 
        super().__init__(error1)

class Excetionc2(ErrorAplicacion):
    def __init__(self,error1):
        error = "Posiblemente no llenaste alguno de los campos "+error1
        super().__init__(error)

class Excetionc21(Excetionc2):
    def __init__(self):
        error1 = "nombre, email o nombre completo"
        super().__init__(error1)

class Excetionc22(Excetionc2):
    def __init__(self):
        error1 = "logo negocio, descripcion negocio o terminos negocio"
        super().__init__(error1)

class Excetionc23(Excetionc2):
    def __init__(self):
        error1 = "de codigo, perdon error nuestro sigue usando el programa"
        super().__init__(error1)