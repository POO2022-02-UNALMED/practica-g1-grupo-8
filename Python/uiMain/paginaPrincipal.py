import tkinter as tk
from tkinter import ttk
from tkinter import messagebox
from framesFuncionalidades.editarPerfil import EditarPerfil
from framesFuncionalidades.crearContacto import CrearContacto
from framesFuncionalidades.notificaciones import Notificaciones
from framesFuncionalidades.mostrarChats import MostrarChats
from framesFuncionalidades.tarjetaNegocio import TarjetaNegocio

class ventana2():
    def __init__(self) :
        self.ventana=tk.Tk()    
        self.ventana.title("Ventana Principal")
        self.ventana.configure(bg="blue")
             
        self.P1=tk.Frame(self.ventana)
        self.P1.pack(side="top",padx=5,pady=5,fill="both")

        self.nombreA=tk.Label(self.P1,text="Kontakte",font=("Roman",30))
        self.nombreA.pack(side="left",padx=5,pady=5)

        self.P2=tk.Frame(self.ventana)
        self.P2.pack(side="top",padx=5,pady=5,fill="both")
        self.P2.config(relief="ridge")

        self.P3=tk.Frame(self.ventana)
        self.P3.pack(padx=5,pady=5,fill="both")

        self.titulo=tk.Label(self.P3,text="Editar perfil",font=("Helvetica",10))
        self.titulo.grid(row=0,column=0)

        self.titulo2=tk.Label(self.P3,text="Crear contacto",font=("Helvetica",10))
        self.titulo2.grid(row=1,column=0)

        self.titulo3=tk.Label(self.P3,text="Mostrat chats",font=("Helvetica",10))
        self.titulo3.grid(row=2,column=0)

        self.titulo4=tk.Label(self.P3,text="Notificaciones",font=("Helvetica",10))
        self.titulo4.grid(row=3,column=0)

        self.titulo5=tk.Label(self.P3,text="Tarjeta Negocios",font=("Helvetica",10))
        self.titulo5.grid(row=4,column=0)

        texto="""Opción para modificar las los datos dados cuando se creó el usuario,
        tales como el nombre o el email"""
        self.text=tk.Label(self.P3,text=texto,font=("Helvetica",10))
        self.text.grid(row=0,column=1)

        texto1="""Crear contacto con el cual guardar informacion importante,
        escribir mensajes y reciba notificaciones creadas"""

        self.text1=tk.Label(self.P3,text=texto1,font=("Helvetica",10))
        self.text1.grid(row=1,column=1)

        texto2="""Muestra conversaciones y permite crear nuevas,
        hechas por nosotros y otros contactos"""

        self.text2=tk.Label(self.P3,text=texto2,font=("Helvetica",10))
        self.text2.grid(row=2,column=1)

        texto3="""Permite ver notificaciones hechas por nosotros o nuestros contactos"""

        self.text3=tk.Label(self.P3,text=texto3,font=("Helvetica",10))
        self.text3.grid(row=3,column=1)

        texto4="""Permite crear las tarjetas de negocios,
        que tienen informacion de contacto útil para contactar contigo o tu empresa"""

        self.text4=tk.Label(self.P3,text=texto4,font=("Helvetica",10))
        self.text4.grid(row=4,column=1)

        self.menu=ttk.Menubutton(self.P2,text="Archivo")
        self.menu1=tk.Menu(self.menu,tearoff=False)
        self.menu["menu"]=self.menu1
        self.menu.grid(row=0,column=0)
        self.menu1.add_command(label="Aplicacion",command=lambda:self.ventanadialogo1())
        self.menu1.add_command(label="Salir",command=lambda:self.ventana.destroy())

        self.menu11=ttk.Menubutton(self.P2,text="Procesos y Consultas")
        self.menu2=tk.Menu(self.menu11,tearoff=False)
        self.menu11["menu"]=self.menu2
        self.menu11.grid(row=0,column=1)
        self.menu2.add_command(label="Editar Perfil", command=self.f1)
        self.menu2.add_command(label="Crear Nuevo Contacto", command=self.f2)
        self.menu2.add_command(label="Mostrar Chats", command=self.f3)
        self.menu2.add_command(label="Notificaciones", command=self.f4)
        self.menu2.add_command(label="Tarjeta de negocios", command=self.f5)

        self.menu12=ttk.Menubutton(self.P2,text="Ayuda")
        self.menu3=tk.Menu(self.menu12,tearoff=False)
        self.menu12["menu"]=self.menu3
        self.menu12.grid(row=0,column=2)
        self.menu3.add_command(label="Acerca de",command=self.ventanadialogo2)

        self.ventana.mainloop()
    
    def ventanadialogo1(self):
        messagebox.showinfo("Funcionalidad de la aplicacion","""Programa de comunicación privada por medio de mensajes a contacto de manera simple y sencillo, en el cual solo se usa texto básico, para mensajería rápida de manera local 
        """)
    def ventanadialogo2(self):
        messagebox.showinfo("Autores","""
        Alejandro Aristizábal Pérez
       Juan Simon Zapata Monsalve
        Sebastián Soto Arcila
        Juan Pablo Garcia Carballo
        Jose Manuel Molina Vásquez
        """)

    def f1(self):
        self.P3.destroy()
        self.P3=tk.Frame(self.ventana)
        self.P3.pack(padx=5,pady=5,fill="both")
        EditarPerfil(self.P3).fEditarPerfilG()

    def f2(self):
        self.P3.destroy()
        self.P3=tk.Frame(self.ventana)
        self.P3.pack(padx=5,pady=5,fill="both")
        CrearContacto(self.P3).fCrearNuevoContactoG()

    def f3(self):
        self.P3.destroy()
        self.P3=tk.Frame(self.ventana)
        self.P3.pack(padx=5,pady=5,fill="both")
        MostrarChats(self.P3).fMostrarChatsG()
    
    def ff(self):
        self.P3.destroy()
        self.P3 = tk.Frame(self.ventana)
        self.P3.pack(padx=5,pady=5,fill="both")
        Notificaciones(self.P3).fCrearNotificaciones()

    def f5(self):
        self.P3.destroy()
        self.P3=tk.Frame(self.ventana)
        self.P3.pack(padx=5,pady=5,fill="both")
        TarjetaNegocio(self.P3).fTarjetadeNegocio()
    
p=ventana2()
