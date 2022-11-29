import tkinter as tk

class MostrarChats:
    def __init__(self, frame):
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

        #Datos requeriodos
        frame2 = tk.Frame(self.frame, height=200, pady=5, padx=5)
        frame2.pack(fill= "x")
        lTitulo = tk.Label(frame2, text="Titulo:")
        lTitulo.grid(row=1, column=0, padx=10, pady=10, sticky="w")
        lCuerpo = tk.Label(frame2, text="Cuerpo:")
        lCuerpo.grid(row=2, column=0, padx=10, pady=10, sticky="w")

        #Entrada de datos
        chat = tk.Text(frame2, width=55, height=20)
        chat.grid(row=0, column=1, padx=10, pady=10, sticky="w")
        InTitulo = tk.Entry(frame2, textvariable=tk.StringVar(frame2, value="Aqui Va Titulo"), width=55)
        InTitulo.grid(row=1, column=1, columnspan=2, padx=10, pady=10)
        InCuerpo = tk.Entry(frame2, textvariable=tk.StringVar(frame2, value="Aqui Va Cuerpo"), width=55)
        InCuerpo.grid(row=2, column=1, columnspan=2, padx=10, pady=10)

        #Funciones
        def fAceptar():
            print(InTitulo.get())
            print(InCuerpo.get())

        def fCancelar():
            InTitulo.config(textvariable=tk.StringVar(frame2, value="Aqui va Titulo"))
            InCuerpo.config(textvariable=tk.StringVar(frame2, value="Aqui va Cuerpo"))


        #Botones de cancelar y aceptar
        frame3 = tk.Frame(self.frame, pady=5, padx=5, height=100)
        frame3.pack(side="bottom", fill= "x")
        cancelar = tk.Button(frame3, text="Cancelar", command=fCancelar)
        cancelar.pack(side="left")
        aceptar = tk.Button(frame3, text="Aceptar", command=fAceptar)
        aceptar.pack(side="right")