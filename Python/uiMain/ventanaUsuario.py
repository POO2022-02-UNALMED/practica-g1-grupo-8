import tkinter as tk

window = tk.Tk()
window.geometry("500x500")
window.title("Mensajeria")

menuMain = tk.Menu(window)

menuArchivo = tk.Menu(menuMain)
menuArchivo.add_command(label="Aplicación")
menuArchivo.add_command(label="Salir")
menuMain.add_cascade(label="Archivo", menu=menuArchivo)

menuFuncion = tk.Menu(menuMain)
menuFuncion.add_command(label="Crear Nuevo Contacto")
menuFuncion.add_command(label="Empezar Chat")
menuFuncion.add_command(label="Mostrar Chat")
menuFuncion.add_command(label="Seguir Chat")
menuFuncion.add_command(label="Ver Notificaciones")
menuMain.add_cascade(label="Procesos y Consultas", menu=menuFuncion)

menuAyuda = tk.Menu(menuMain)
menuAyuda.add_command(label="Acerca de")
menuMain.add_cascade(label="Ayuda", menu=menuAyuda)

window.config(menu=menuMain)

frame = tk.Frame(window, pady=5, padx=5, bg="black")
frame.pack(fill="both", expand=True)

frame1 = tk.Frame(frame, pady=5, padx=5, bg="orange")
frame1.pack(side="left", fill="both", expand=True, ipadx=5, ipady=5)

frame2 = tk.Frame(frame, pady=5, padx=5, bg="purple")
frame2.pack(side="right", fill="both", expand=True, ipadx=5, ipady=5)

frame3 = tk.Frame(frame1, height=200, pady=5, padx=5, bg="blue")
frame3.pack(side="top", fill="x")

frame4 = tk.Frame(frame1, pady=5, padx=5, bg="red")
frame4.pack(fill= "both", expand=True) 

frame5 = tk.Frame(frame2, height=200, pady=5, padx=5, bg="green")
frame5.pack(side="top", fill="x")

frame6 = tk.Frame(frame2, pady=5, padx=5, bg="Yellow")
frame6.pack(fill = "both", expand=True)

window.mainloop()