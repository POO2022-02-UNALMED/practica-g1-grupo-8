import tkinter as tk
from tkinter import ttk
from tkinter import messagebox
import os
class ventana2():
    def __init__(self) :
        
        self.ventana=tk.Tk()
        self.ventana.title("Ventana Principal")

        self.P1=tk.Frame(self.ventana)
        self.P1.pack(side="top",padx=5,pady=5,fill="both")

        self.nombreA=tk.Label(self.P1,text="Kontakte",font=("Roman",30))
        self.nombreA.pack(side="left",padx=5,pady=5)

        self.P2=tk.Frame(self.ventana)
        self.P2.pack(side="top",padx=5,pady=5,fill="both")
        self.P2.config(relief="ridge")

        self.menu=ttk.Menubutton(self.P2,text="Archivo")
        self.menu1=tk.Menu(self.menu,tearoff=False)
        self.menu["menu"]=self.menu1
        self.menu.pack()
        self.menu1.add_command(label="Aplicacion",command=lambda:print("funciona1"))
        self.menu1.add_command(label="Salir",command=lambda:self.ventana.destroy())

        self.P3=tk.Frame(self.ventana)
        self.P3.pack(side="top",padx=5,pady=5,fill="both")


        self.ventana.mainloop()
    
    def ventanadialogo1():
        messagebox.showinfo("""Aplicacion de 
        """
        )
p=ventana2()