import tkinter as tk
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

        self.menu=tk.Menubutton(self.P2)
        self.menu1=tk.Menu(self.menu)
        self.menu1.add_command(label="Salir",command=lambda : self.ventana2.destroy())
        self.menu1.add_command(label="Descripcion del sistema",command=lambda:print("dd"))



        self.P3=tk.Frame(self.ventana)
        self.P3.pack(side="top",padx=5,pady=5,fill="both")


        self.ventana.mainloop()
p=ventana2()