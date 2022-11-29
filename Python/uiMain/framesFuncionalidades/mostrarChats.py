import tkinter as tk
from tkinter import ttk
from framesFuncionalidades.fieldFrame import FieldFrame
class MostrarChats:
    def __init__(self, frame: tk.Frame):
        self.frame = frame

    #Funcionalidades
    def fMostrarChatsG(self):
        #Nombre y descripcion de la funcion
        frame1 = tk.Frame(self.frame, height=200, pady=5, padx=5)
        frame1.pack(fill="x")
        nombreFuncion = tk.Label(frame1, text="Mostrar Chats")
        nombreFuncion.pack(side="top")
        descripcionFuncion = tk.Label(frame1, text="Descripcion")
        descripcionFuncion.pack()

        frame2 = tk.Frame(self.frame, height=200, pady=5, padx=5)
        frame2.pack(fill= "x")
        CContacto = ttk.Combobox(
            frame2,
            #Aqui va lista de contactos
            values=["contacto 1", "contacto 2", "contacto 3"],
            textvariable=tk.StringVar(frame2, value="Contactos")
            )


        def eleccionContacto(e):
            chat.config(state="normal")
            chat.delete('1.0','end')
            chat.insert('end', CContacto.get()+"\n")
            chat.insert('end', "\n")
            chat.insert('end', "mensaje 1\n")
            chat.insert('end', "\n")
            chat.insert('end', "mensaje 2\n")
            chat.insert('end', "\n")
            chat.insert('end', "mensaje 3\n")
            chat.insert('end', "\n")
            chat.config(state="disabled")

        CContacto.bind('<<ComboboxSelected>>', eleccionContacto)
        CContacto.grid(row=0, column=0, padx=10, pady=10, sticky="w")

        criterios = ["Titulo", "Cuerpo"]
        valores = ['', '']
        fp = FieldFrame("Criterios", criterios, "Valores", valores, None)
        fp.crearEntradas(self.frame)

        #Entrada de datos
        chat = tk.Text(frame2, width=45, height=10, state="disabled")
        chat.grid(row=0, column=1, padx=10, pady=10, sticky="w")

        #Funciones
        def fAceptar():
            for criterio in criterios:
                print(f"{criterio}: {fp.getValue(criterio)}")

        def fCancelar():
            self.frame.destroy()
            

        #Botones de cancelar y aceptar
        frame3 = tk.Frame(self.frame, pady=5, padx=5, height=100)
        frame3.pack(side="bottom", fill= "x")
        cancelar = tk.Button(frame3, text="Cancelar", command= lambda : fCancelar())
        cancelar.pack(side="left")
        aceptar = tk.Button(frame3, text="Aceptar", command= lambda : fAceptar())
        aceptar.pack(side="right")


