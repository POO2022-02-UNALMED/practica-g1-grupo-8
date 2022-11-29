import tkinter as tk
from framesFuncionalidades.fieldFrame import FieldFrame
class Notificaciones:

    def __init__(self, frame: tk.Frame):
        self.frame = frame


    def fCrearNotificaciones(self):
        #Nombre y descripcion de la funcion
        frame1 = tk.Frame(self.frame, height=200, pady=5, padx=5)
        frame1.pack(fill="x")
        nombreFuncion = tk.Label(frame1, text="Notificaciones")
        nombreFuncion.pack(side="top")
        
        descripcionFuncion = tk.Label(frame1, text="Crear y lista todas las notificaciones de un usuario")
        descripcionFuncion.pack(fill="x")

        criterios = ["Titulo", "Cuerpo"]
        valores = ['', '']
        fp = FieldFrame("Criterios", criterios, "Valores", valores, None)
        fp.crearEntradas(self.frame)


        def crearNotificacion():
            for criterio in criterios:
                print(f"{criterio}: {fp.getValue(criterio)}")

        #Botones de cancelar y aceptar
        cancelar = tk.Frame(self.frame, pady=5, padx=5, height=100)
        cancelar.pack(side="bottom", fill= "x")
        cancelarButton = tk.Button(cancelar, text="Cancelar", command= lambda : self.frame.destroy())
        cancelarButton.pack(side="left")
        aceptar = tk.Button(cancelar, text="Aceptar", command= lambda : crearNotificacion())
        aceptar.pack(side="right")

