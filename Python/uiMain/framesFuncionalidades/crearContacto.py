import tkinter as tk
from tkinter import messagebox
from framesFuncionalidades.fieldFrame import FieldFrame
from framesFuncionalidades.cargarUsuario import CargarUsuario

class CrearContacto:
    def __init__(self, frame: tk.Frame):
        self.frame = frame

    #Funcionalidades
    def fCrearNuevoContactoG(self):
        #Nombre y descripcion de la funcion
        frame1 = tk.Frame(self.frame, height=200, pady=5, padx=5)
        frame1.pack(fill="x")
        nombreFuncion = tk.Label(frame1, text="Crear Nuevo Contacto")
        nombreFuncion.pack(side="top")
        descripcionFuncion = tk.Label(frame1, text="Descripcion")
        descripcionFuncion.pack()

        criterios = ["Nombre", "Email", "Nombre Completo"]
        valores = ['', '', '']
        fp = FieldFrame("Criterios", criterios, "Valores", valores, None)
        fp.crearEntradas(self.frame)


        #Funciones
        def fAceptar():
            CargarUsuario.usuario.crearNuevoContacto(fp.getValue(criterios[0]), fp.getValue(criterios[1]), fp.getValue(criterios[2]))
            CargarUsuario.guardarUsario(CargarUsuario.usuario)
            messagebox.showinfo("Crear Nuevo Contacto", "Contacto almacenado correctamente.")




        #Botones de cancelar y aceptar
        frame3 = tk.Frame(self.frame, pady=5, padx=5, height=100)
        frame3.pack(side="bottom", fill= "x")
        cancelar = tk.Button(frame3, text="Cancelar", command= lambda : self.frame.destroy())
        cancelar.pack(side="left")
        aceptar = tk.Button(frame3, text="Aceptar", command= lambda : fAceptar())
        aceptar.pack(side="right")