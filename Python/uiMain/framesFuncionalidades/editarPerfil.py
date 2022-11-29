import tkinter as tk
from tkinter import messagebox
from framesFuncionalidades.cargarUsuario import CargarUsuario
from framesFuncionalidades.fieldFrame import FieldFrame

class EditarPerfil:
    def __init__(self, frame: tk.Frame):
        self.frame = frame

    #Funcionalidades
    def fEditarPerfilG(self):
        #Nombre y descripcion de la funcion
        frame1 = tk.Frame(self.frame, height=200, pady=5, padx=5)
        frame1.pack(fill="x")
        nombreFuncion = tk.Label(frame1, text="Editar Perfil")
        nombreFuncion.pack(side="top")
        descripcionFuncion = tk.Label(frame1, text="Descripcion")
        descripcionFuncion.pack()

        perfil = CargarUsuario.usuario.getContactoUsuario()

        criterios = ["Nombre", "Email", "Nombre Completo", "Logo Negocio", "Descripcion Negocio", "Terminos Negocio"]
        valores = [perfil.getNombre(), perfil.getEmail(), perfil.getNombreCompleto(), perfil.getLogoNegocio(), perfil.getDescripcionNegocio(), perfil.getTerminosNegocio()]
        fp = FieldFrame("Criterios", criterios, "Valores", valores, None)
        fp.crearEntradas(self.frame)

        #Funciones
        def fAceptar():
            perfil.setNombre(fp.getValue(criterios[0]))
            perfil.setEmail(fp.getValue(criterios[1]))
            perfil.setNombreCompleto(fp.getValue(criterios[2]))
            perfil.setLogoNegocio(fp.getValue(criterios[3]))
            perfil.setDescripcionNegocio(fp.getValue(criterios[4]))
            perfil.setTerminosNegocio(fp.getValue(criterios[5]))
            messagebox.showinfo("Editar Perfil", "Perfil guardado exitosamente")

        def fCancelar():
            self.frame.destroy()

        #Botones de cancelar y aceptar
        frame3 = tk.Frame(self.frame, pady=5, padx=5, height=100)
        frame3.pack(side="bottom", fill= "x")
        cancelar = tk.Button(frame3, text="Cancelar", command=fCancelar)
        cancelar.pack(side="left")
        aceptar = tk.Button(frame3, text="Aceptar", command=fAceptar)
        aceptar.pack(side="right")