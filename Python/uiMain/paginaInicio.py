import tkinter as tk
class ventana():
    
    def __init__(self) -> None:
        self.ventana=tk.Tk()
        self.ventana.title("Ventana de inicio")

        self.contador=0
        self.menuBar=tk.Menu(self.ventana)
        self.ventana.config(menu=self.menuBar)

        self.menuBar.add_command(label="Salir",command=lambda : self.ventana.destroy())
        def descripcion(self):
            self.textdescripcion.config(text="hola")
        self.menuBar.add_command(label="Descripcion del sistema",command=lambda:descripcion())

        self.P1=tk.Frame(self.ventana)
        self.P1.pack(side="left",padx=10,pady=5,fill="both")

        self.P3=tk.Frame(self.P1)
        self.P3.pack(side="top")
        self.saludo=tk.Label(self.P3,text="Bienvenido a este programa",font=("Roman",30))
        self.saludo.pack(side="top",padx=5,pady=5)
        self.descripcion=tk.Label(self.P3,text="")
        self.descripcion.pack(side="bottom",padx=5,pady=5)

        self.P4=tk.Frame(self.P1)
        self.P4.pack(side="bottom")

        self.botonventanprincipal=tk.Button(self.P4,text="Ventana principal")
        self.botonventanprincipal.pack(side="bottom")

        self.P2=tk.Frame(self.ventana)
        self.P2.pack(side="right",padx=10,pady=5,fill="both")

        self.P5=tk.Frame(self.P2)
        self.P5.pack(side="top")
        juanpabloG="sss"
        alejandroA="hh"
        sebastianS=""
        juansimonZ="{"
        josemanuelM="++"

        lista=[juanpabloG,alejandroA,sebastianS,juansimonZ,josemanuelM]
        def mas(self):
            self.contador=+1
        def boton(self):
            mas()
            self.textovida.config(text=lista[self.contador])
        self.textovida=tk.Button(self.P5,text=lista[self.contador],command=boton)
        self.textovida.pack(fill="both")
        self.textovida.config(relief="flat")



        self.P6=tk.Frame(self.P1)
        self.P6.pack(side="bottom")

        self.ventana.mainloop()

p=ventana()

