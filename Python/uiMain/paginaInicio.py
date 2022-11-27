import tkinter as tk
class ventana():
    #descripcion hoja de vida de los participantes, ya esta implementado solo es llenar
    juanpabloG=""""""
    alejandroA="hh"
    sebastianS=""
    juansimonZ="{"
    josemanuelM="++"
    lista=[juanpabloG,alejandroA,sebastianS,juansimonZ,josemanuelM]
    
    contador2=0
    lista2=["uiMain/imagenesdelsistema/imagen1.png","uiMain/imagenesdelsistema/imagen2.png","uiMain/imagenesdelsistema/imagen3.png","uiMain/imagenesdelsistema/imagen4.png","uiMain/imagenesdelsistema/imagen5.png"]
    def __init__(self) -> None:
        self.ventana=tk.Tk()
        self.ventana.title("Ventana de inicio")

        self.contador=0
        self.menuBar=tk.Menu(self.ventana)
        self.ventana.config(menu=self.menuBar)

        self.menuBar.add_command(label="Salir",command=lambda : self.ventana.destroy())
        
        self.menuBar.add_command(label="Descripcion del sistema",command=lambda:self.descripcionn())

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

        self.imagenesS=tk.Label(self.P4)
        self.imagenS=tk.PhotoImage(file=self.lista2[self.contador2])
        self.imagenesS.config(image=self.imagenS)
        self.imagenesS.subsample(100000000)
        self.imagenesS.pack(side="top")
        self.imagenesS.bind("<B1-Motion>",self.imasistemas1())
        self.imagenesS.bind("<B3-Motion>",self.imasistemas2())

        self.P2=tk.Frame(self.ventana)
        self.P2.pack(side="right",padx=10,pady=5,fill="both")

        self.P5=tk.Frame(self.P2)
        self.P5.pack(side="top")
       
        self.textovida=tk.Button(self.P5,text=self.lista[self.contador],command=self.boton)
        self.textovida.pack(fill="both")
        self.textovida.config(relief="flat")



        self.P6=tk.Frame(self.P1)
        self.P6.pack(side="bottom")

        self.ventana.mainloop()

    def descripcionn(self):
            self.descripcion.config(text="hola")

    def mas(self):
        if self.contador<4:
            self.contador=self.contador+1
        else:
            self.contador=0

    def boton(self):
        self.mas()
        self.textovida.config(text=self.lista[self.contador])

    def imasistemas1(self):
        if self.contador2<4:
            self.contador2=self.contador2+1
        else:
            self.contador2=0
    def cambiarimagsistemas1(self):
        self.imasistemas1()
        self.imagenS.config(file=self.lista2[self.contador2])

    def imasistemas2(self):
        if self.contador2>0:
            self.contador2=self.contador2-1
        else:
            self.contador2=4
    def cambiarimagsistemas2(self):
        self.imasistemas2()
        self.imagenS.config(file=self.lista2[self.contador2])


p=ventana()

