import tkinter as tk
from tkinter import ttk
from tkinter import messagebox
from framesFuncionalidades.editarPerfil import EditarPerfil
from framesFuncionalidades.crearContacto import CrearContacto
from framesFuncionalidades.notificaciones import Notificaciones

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
        self.menu2.add_command(label="Notificaciones", command=self.f3)

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
        CrearContacto(self.P3).fCrearNuevoContacto()

    def f3(self):
        self.P3.destroy()
        self.P3 = tk.Frame(self.ventana)
        self.P3.pack(padx=5,pady=5,fill="both")
        Notificaciones(self.P3).fCrearNotificaciones()
    

    

p=ventana2()