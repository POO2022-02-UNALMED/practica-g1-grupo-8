import tkinter as tk
from gestorAplicacion.Hija.usuario import Usuario

class EditarPerfil:
    def __init__(self, frame):
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

        #Datos requeriodos
        frame2 = tk.Frame(self.frame, height=200, pady=5, padx=5)
        frame2.pack(fill= "x")
        lNombre = tk.Label(frame2, text="Nombre:")
        lNombre.grid(row=0, column=0, padx=10, pady=10, sticky="w")
        lEmail = tk.Label(frame2, text="Email:")
        lEmail.grid(row=1, column=0, padx=10, pady=10, sticky="w")
        lNombreCompleto = tk.Label(frame2, text="Nombre Completo:")
        lNombreCompleto.grid(row=2, column=0, padx=10, pady=10, sticky="w")
        lLogoNegocio = tk.Label(frame2, text="Logo Negocio:")
        lLogoNegocio.grid(row=3, column=0, padx=10, pady=10, sticky="w")
        lDescripcionNegocio = tk.Label(frame2, text="Descripcion Negocio:")
        lDescripcionNegocio.grid(row=4, column=0, padx=10, pady=10, sticky="w")
        lTerminosNegocio = tk.Label(frame2, text="Terminos Negocio:")
        lTerminosNegocio.grid(row=5, column=0, padx=10, pady=10, sticky="w")

        #Entrada de datos
        InNombre = tk.Entry(frame2, textvariable=tk.StringVar(frame2, value="Aqui Va Nombre"), width=55)
        InNombre.grid(row=0, column=1, columnspan=2, padx=10, pady=10)
        InEmail = tk.Entry(frame2, textvariable=tk.StringVar(frame2, value="Aqui Va Email"), width=55)
        InEmail.grid(row=1, column=1, columnspan=2, padx=10, pady=10)
        InNombreCompleto = tk.Entry(frame2, textvariable=tk.StringVar(frame2, value="Aqui Va Nombre Completo"), width=55)
        InNombreCompleto.grid(row=2, column=1, columnspan=2, padx=10, pady=10)
        InLogoNegocio = tk.Entry(frame2, textvariable=tk.StringVar(frame2, value="Aqui Va Logo Negocio"), width=55)
        InLogoNegocio.grid(row=3, column=1, columnspan=2, padx=10, pady=10)
        InDescripcionNegocio = tk.Entry(frame2, textvariable=tk.StringVar(frame2, value="Aqui Va Descripcion Negocio"), width=55)
        InDescripcionNegocio.grid(row=4, column=1, columnspan=2, padx=10, pady=10)
        InTerminosNegocio = tk.Entry(frame2, textvariable=tk.StringVar(frame2, value="Aqui Va Terminos Negocio"), width=55)
        InTerminosNegocio.grid(row=5, column=1, columnspan=2, padx=10, pady=10)

        #Funciones
        def fAceptar():
            print(InNombre.get())
            print(InEmail.get())
            print(InNombreCompleto.get())
            print(InLogoNegocio.get())
            print(InDescripcionNegocio.get())
            print(InTerminosNegocio.get())

        def fCancelar():
            InNombre.config(textvariable=tk.StringVar(frame2, value="Aqui va Nombre"))
            InEmail.config(textvariable=tk.StringVar(frame2, value="Aqui va Email"))
            InNombreCompleto.config(textvariable=tk.StringVar(frame2, value="Aqui Va Nombre Completo"))
            InLogoNegocio.config(textvariable=tk.StringVar(frame2, value="Aqui Va Logo Negocio"))
            InDescripcionNegocio.config(textvariable=tk.StringVar(frame2, value="Aqui Va Descripcion Negocio"))
            InTerminosNegocio.config(textvariable=tk.StringVar(frame2, value="Aqui Va Terminos Negocio"))

        #Botones de cancelar y aceptar
        frame3 = tk.Frame(self.frame, pady=5, padx=5, height=100)
        frame3.pack(side="bottom", fill= "x")
        cancelar = tk.Button(frame3, text="Cancelar", command=fCancelar)
        cancelar.pack(side="left")
        aceptar = tk.Button(frame3, text="Aceptar", command=fAceptar)
        aceptar.pack(side="right")