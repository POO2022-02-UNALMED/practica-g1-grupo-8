import tkinter as tk
ventana=tk.Tk()
ventana.title("Ventana de inicio")

menuBar=tk.Menu(ventana)
ventana.config(menu=menuBar)
menuBar.add_command(label="Salir",command=lambda : ventana.destroy())
menuBar.add_command(label="Descripcion del sistema")

P1=tk.Frame(ventana)
P1.pack(side="left",padx=10,pady=5,fill="both")

P3=tk.Frame(P1)
P3.pack(side="top")
saludo=tk.Label(P3,text="Bienvenido a este programa")

P4=tk.Frame(P1)
P4.pack(side="bottom")

botonventanprincipal=tk.Button(P4,text="Ir a la ventana principal")
botonventanprincipal.pack(side="bottom")

P2=tk.Frame(ventana)
P2.pack(side="right",padx=10,pady=5,fill="both")

P5=tk.Frame(P2)
P5.pack(side="top")


P6=tk.Frame(P1)
P6.pack(side="bottom")
ventana.mainloop()