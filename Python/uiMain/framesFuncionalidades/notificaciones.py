import tkinter as tk
from framesFuncionalidades.fieldFrame import FieldFrame
from framesFuncionalidades.cargarUsuario import CargarUsuario
class Notificaciones:

    def __init__(self, frame: tk.Frame):
        self.frame = frame


    def fCrearNotificaciones(self):
        #Nombre y descripcion de la funcion

        nombreFuncion = tk.Label(self.frame, text="Notificaciones")
        nombreFuncion.pack(side="top")  
        
        descripcionFuncion = tk.Label(self.frame, text="Crear y lista todas las notificaciones de un usuario")
        descripcionFuncion.pack(fill="x")


        criterios = ["Titulo", "Cuerpo"]
        valores = ['', '']
        fp = FieldFrame("Criterios", criterios, "Valores", valores, None)
        fp.crearEntradas(self.frame)
    
        notificacionesText = tk.Text(self.frame, width=45, height=10)
        notificacionesText.pack(fill="x", padx=10, pady=10)
        
        def cargarNotificaciones():
            notificacionesText.delete('1.0', tk.END)
            notificaciones = CargarUsuario.usuario.getContactoUsuario().getNotificaciones()
            for i in range(len(notificaciones)):
                notificacionesText.insert(tk.END, f"{notificaciones[i]}\n")
                

        def crearNotificacion():
            CargarUsuario.usuario.getContactoUsuario().anadirNotificaciones(fp.getValue(criterios[0]), fp.getValue(criterios[1]))
            CargarUsuario.guardarUsario(CargarUsuario.usuario)
            cargarNotificaciones()

        cargarNotificaciones()

        #Botones de cancelar y aceptar
        cancelar = tk.Frame(self.frame, pady=5, padx=5, height=100)
        cancelar.pack(side="bottom", fill= "x")
        cancelarButton = tk.Button(cancelar, text="Cancelar", command= lambda : self.frame.destroy())
        cancelarButton.pack(side="left")
        aceptar = tk.Button(cancelar, text="Aceptar", command= lambda : crearNotificacion())
        aceptar.pack(side="right")

        

