import tkinter as tk
import os
from paginaPrincipal import ventana2
class ventana():
    #descripcion hoja de vida de los participantes, ya esta implementado solo es llenar
    juanpabloG="""-Estudiante de ingeniería de sistemas e informática
    -Bachiller técnico de sistemas por parte del Sena
    Persona proactiva, respetuosa y trabajadora que le gusta velar por el bien del equipo,
    le gusta aprender temas nuevos,la tecnología y  como funcionan las cosas,
    curioso y dispuesto a aceptar retos."""

    alejandroA="Hoja de vida no agregada por el participante, imágenes por defecto añadidas por el grupo."

    sebastianS="""Me considero una persona responable,
    dinánmica y creativa, con facilidad de
    adaptación y capacidad de trabajar en
    equipo, en condiciones de alta presión,
    con iniciativa para resolver problemas
    eficientemente y lograr las metas y
    objetivos trazados por la empreza"""

    juansimonZ="Hoja de vida no agregada por el participante, imágenes por defecto añadidas por el grupo."

    josemanuelM="""Soy estudiante de ingeniería de sistemas e infórmatica, sobresalgo por mi proactividad, mi resiliencia 
    y capacidad de mantener la calma bajo presión, me interesa la investigación, el desarrollo de tecnología y la adquisición 
    de conocimientos propios de la carrera e intereses varios"""

    lista=[juanpabloG,alejandroA,sebastianS,juansimonZ,josemanuelM]
    
    contador2=0
    lista2=["\\uiMain\\imagenesdelsistema\\imagen1.png","\\uiMain\\imagenesdelsistema\\imagen2.png","\\uiMain\\imagenesdelsistema\\imagen3.png","\\uiMain\\imagenesdelsistema\\imagen4.png","\\uiMain\\imagenesdelsistema\\imagen5.png"]

    juanpabloG1=["\\uiMain\\imageneshojadevida\\juanpabloG\\imagen1.png","\\uiMain\\imageneshojadevida\\juanpabloG\\imagen2.png","\\uiMain\\imageneshojadevida\\juanpabloG\\imagen3.png","\\uiMain\\imageneshojadevida\\juanpabloG\\imagen4.png"]
    alejandroA1=["\\uiMain\\imageneshojadevida\\alejandroA\\imagen1.png","\\uiMain\\imageneshojadevida\\alejandroA\\imagen2.png","\\uiMain\\imageneshojadevida\\alejandroA\\imagen3.png","\\uiMain\\imageneshojadevida\\alejandroA\\imagen4.png"]
    sebastianS1=["\\uiMain\\imageneshojadevida\\sebastianS\\imagen1.png","\\uiMain\\imageneshojadevida\\sebastianS\\imagen2.png","\\uiMain\\imageneshojadevida\\sebastianS\\imagen3.png","\\uiMain\\imageneshojadevida\\sebastianS\\imagen4.png"]
    juansimonZ1=["\\uiMain\\imageneshojadevida\\juansimonZ\\imagen1.png","\\uiMain\\imageneshojadevida\\juansimonZ\\imagen2.png","\\uiMain\\imageneshojadevida\\juansimonZ\\imagen3.png","\\uiMain\\imageneshojadevida\\juansimonZ\\imagen4.png"]
    josemanuelM1=["\\uiMain\\imageneshojadevida\\josemanuelM\\imagen1.png","\\uiMain\\imageneshojadevida\\josemanuelM\\imagen2.png","\\uiMain\\imageneshojadevida\\josemanuelM\\imagen1.png","\\uiMain\\imageneshojadevida\\josemanuelM\\imagen4.png"]
    lista3=[juanpabloG1,alejandroA1,sebastianS1,juansimonZ1,josemanuelM1]

    def __init__(self) :
        
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

        self.botonventanprincipal=tk.Button(self.P4,text="Ventana principal",command=self.paginaprincipal)
        self.botonventanprincipal.pack(side="bottom")

        self.imagenesS=tk.Label(self.P4)
        imagen=tk.PhotoImage(file= os.getcwd() + self.lista2[self.contador2])
        imagen=imagen.subsample(8)
        self.imagenesS.config(image=imagen)
        self.imagenesS.pack(side="top")
        self.imagenesS.bind("<Motion>",self.imasistemas1())
        self.imagenesS.bind("<B3-Motion>",self.imasistemas2())

        self.P2=tk.Frame(self.ventana)
        self.P2.pack(side="right",padx=10,pady=5,fill="both")

        self.P5=tk.Frame(self.P2)
        self.P5.pack(side="top")
       
        self.textovida=tk.Button(self.P5,text=self.lista[self.contador],command=self.boton)
        self.textovida.pack(fill="both")
        self.textovida.config(relief="flat")



        self.P6=tk.Frame(self.P2)
        self.P6.pack(side="bottom")

        imagen1=tk.PhotoImage(file=os.getcwd() + self.lista3[self.contador][0])
        imagen1=imagen1.subsample(8)
        self.imagen1=tk.Label(self.P6,image=imagen1)
        self.imagen1.grid(row=0,column=0)

        imagen2=tk.PhotoImage(file=os.getcwd() + self.lista3[self.contador][1])
        imagen2=imagen2.subsample(8)
        self.imagen2=tk.Label(self.P6,image=imagen2)
        self.imagen2.grid(row=0,column=1)

        imagen3=tk.PhotoImage(file=os.getcwd() + self.lista3[self.contador][2])
        imagen3=imagen3.subsample(8)
        self.imagen3=tk.Label(self.P6,image=imagen3)
        self.imagen3.grid(row=1,column=0)

        imagen4=tk.PhotoImage(file=os.getcwd() + self.lista3[self.contador][3])
        imagen4=imagen4.subsample(8)
        self.imagen4=tk.Label(self.P6,image=imagen4)
        self.imagen4.grid(row=1,column=1)

        self.ventana.mainloop()

    def descripcionn(self):
            texto1="""Este programa esta hecho para ser una forma de comunicacion privada,
                    realizado para ser usado en un mismo pc, 
                    en el cual los datos no pueden ser enviados por ninguna red,
                    sino que solo pueden verse de forma local por medio de Kontakte
            """
            self.descripcion.config(text=texto1)

    def mas(self):
        if self.contador<4:
            self.contador=self.contador+1
        else:
            self.contador=0

    def boton(self):
        global imagen
        global imagen1
        global imagen2
        global imagen3
        self.mas()
        self.textovida.config(text=self.lista[self.contador])

        imagen=tk.PhotoImage(file= os.getcwd() + self.lista3[self.contador][0])
        imagen=imagen.subsample(8)
        self.imagen1.config(image=imagen)

        imagen1=tk.PhotoImage(file= os.getcwd() + self.lista3[self.contador][1])
        imagen1=imagen1.subsample(8)
        self.imagen2.config(image=imagen1)

        imagen2=tk.PhotoImage(file= os.getcwd() + self.lista3[self.contador][2])
        imagen2=imagen2.subsample(8)
        self.imagen3.config(image=imagen2)

        imagen3=tk.PhotoImage(file= os.getcwd() + self.lista3[self.contador][3])
        imagen3=imagen3.subsample(8)
        self.imagen4.config(image=imagen3)


    def imasistemas1(self):
        if self.contador2<4:
            self.contador2=self.contador2+1
        else:
            self.contador2=0

    def cambiarimagsistemas1(self):
        global imagen
        self.imasistemas1()
        imagen=tk.PhotoImage(file= os.getcwd() + self.lista2[self.contador2])
        imagen=imagen.subsample(10)
        self.imagenesS.config(image=imagen)

    def imasistemas2(self):
        if self.contador2>0:
            self.contador2=self.contador2-1
        else:
            self.contador2=4

    def cambiarimagsistemas2(self):
        global imagen
        self.imasistemas2()
        imagen=tk.PhotoImage(file= os.getcwd() + self.lista2[self.contador2])
        imagen=imagen.subsample(10)
        self.imagenesS.config(image=imagen)

    def paginaprincipal(self):
        self.ventana.destroy()
        ventana2()
p=ventana()