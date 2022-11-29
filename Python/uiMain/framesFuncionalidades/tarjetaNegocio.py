import tkinter as tk

class TarjetaNegocio:
    def __init__(self, frame):
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

        #Datos requeriodos
        frame2 = tk.Frame(self.frame, height=200, pady=5, padx=5)
        frame2.pack(fill= "x")
        lNombre = tk.Label(frame2, text="Nombre del negocio:")
        lNombre.grid(row=0, column=0, padx=10, pady=10, sticky="w")
        ldescripcion = tk.Label(frame2, text="Descripcion del negocio:")
        ldescripcion.grid(row=1, column=0, padx=10, pady=10, sticky="w")
        lTelefono = tk.Label(frame2, text="Telefono:")
        lTelefono.grid(row=2, column=0, padx=10, pady=10, sticky="w")
        ldireccion = tk.Label(frame2, text="Direccion:")
        ldireccion.grid(row=3, column=0, padx=10, pady=10, sticky="w")

        #Entrada de datos
        InNombre = tk.Entry(frame2, textvariable=tk.StringVar(frame2), width=55)
        InNombre.grid(row=0, column=1, columnspan=2, padx=10, pady=10)
        Indescripcion = tk.Entry(frame2, textvariable=tk.StringVar(frame2), width=55)
        Indescripcion.grid(row=1, column=1, columnspan=2, padx=10, pady=10)
        InTelefono = tk.Entry(frame2, textvariable=tk.StringVar(frame2), width=55)
        InTelefono.grid(row=2, column=1, columnspan=2, padx=10, pady=10)
        Indireccion = tk.Entry(frame2, textvariable=tk.StringVar(frame2), width=55)
        Indireccion.grid(row=3, column=1, columnspan=2, padx=10, pady=10)

        #Funciones
        def fAceptar():
            print(InNombre.get())
            print(Indescripcion.get())
            print(InTelefono.get())
            print(Indireccion.get())

        def fCancelar():
            InNombre.config(textvariable=tk.StringVar(frame2, value=""))
            Indescripcion.config(textvariable=tk.StringVar(frame2, value=""))
            InTelefono.config(textvariable=tk.StringVar(frame2, value=""))
            Indireccion.config(textvariable=tk.StringVar(frame2, value=""))


        #Botones de cancelar y aceptar
        frame3 = tk.Frame(self.frame, pady=5, padx=5, height=100)
        frame3.pack(side="bottom", fill= "x")
        cancelar = tk.Button(frame3, text="Cancelar", command=fCancelar)
        cancelar.pack(side="left")
        aceptar = tk.Button(frame3, text="Aceptar", command=fAceptar)
        aceptar.pack(side="right")