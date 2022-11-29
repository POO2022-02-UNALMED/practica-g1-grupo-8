import tkinter as tk
from tkinter import messagebox
from framesFuncionalidades.fieldFrame import FieldFrame 
from framesFuncionalidades.cargarUsuario import CargarUsuario

class TarjetaNegocio:
    def __init__(self, frame: tk.Frame):
        self.frame = frame

    #Funcionalidades
    def fTarjetadeNegocio(self):
        #Nombre y descripcion de la funcion
        frame1 = tk.Frame(self.frame, height=200, pady=5, padx=5)
        frame1.pack(fill="x")
        nombreFuncion = tk.Label(frame1, text="Tarjeta de Negocio")
        nombreFuncion.pack(side="top")
        descripcionFuncion = tk.Label(frame1, text="Descripcion")
        descripcionFuncion.pack()

        tarjetaNegocio = CargarUsuario.usuario.getTarjetaNegocio()

        criterios = ["Nombre del negocio", "Descripcion del negocio", "Telefono", "Direccion"]
        valores = [
            tarjetaNegocio.getNombreNegocio(), 
            tarjetaNegocio.getDescripcionNegocio(), 
            tarjetaNegocio.getTelefonoNegocio(), 
            tarjetaNegocio.getDireccionNegocio()
        ]

        fp = FieldFrame("Criterios", criterios, "Valores", valores, None)
        fp.crearEntradas(self.frame)



        #Funciones
        def fAceptar():
            tarjetaNegocio.setNombreNegocio(fp.getValue(criterios[0]))
            tarjetaNegocio.setDescripcionNegocio(fp.getValue(criterios[1]))
            tarjetaNegocio.setTelefonoNegocio(fp.getValue(criterios[2]))
            tarjetaNegocio.setDireccionNegocio(fp.getValue(criterios[3]))
            messagebox.showinfo("Gurdado", "Tarjeta de negocio guardada exitosamente.")

                
        def fCancelar():
            self.frame.destroy()


        #Botones de cancelar y aceptar
        frame3 = tk.Frame(self.frame, pady=5, padx=5, height=100)
        frame3.pack(side="bottom", fill= "x")
        cancelar = tk.Button(frame3, text="Cancelar", command= lambda : fCancelar())
        cancelar.pack(side="left")
        aceptar = tk.Button(frame3, text="Aceptar", command=lambda : fAceptar())
        aceptar.pack(side="right")