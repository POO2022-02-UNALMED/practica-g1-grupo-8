import tkinter as tk
from framesFuncionalidades.ErrorAplicacion import Excetionc11,Excetionc13,Excetionc21,Excetionc22
class FieldFrame(tk.Frame):

    _entries = {}

    def __init__(self, tituloCriterios, criterios, tituloValores, valores, habilitado):
        self._tituloCriterios = tituloCriterios
        self._criterios = criterios
        self._tituloValores = tituloValores
        self._valores = valores
        self._habilitado = habilitado

    
    def crearEntradas(self, frame):
        criteriosFrame = tk.Frame(frame, height=200, pady=5, padx=5)
        criteriosFrame.pack(fill= "x")

        criterio = tk.Label(master=criteriosFrame, text=self._tituloCriterios)
        criterio.grid(row=0, column=0)

        valor = tk.Label(master=criteriosFrame, text=self._tituloValores)
        valor.grid(row=0, column=1)

        for i in range(len(self._criterios)):
            tk.Label(master=criteriosFrame, text=f"{self._criterios[i]}: ").grid(row=i + 1, column=0, padx=5, pady=5, sticky="w")
            entry = tk.Entry(master=criteriosFrame, textvariable=tk.StringVar(master=criteriosFrame, value=self._valores[i]), width=55)
            entry.grid(row=i + 1, column=1, columnspan=1, padx=5, pady=5)
            self._entries[self._criterios[i]] = entry
            
            
        
    def getValue(self, criterio):
        if len(self._criterios)==2:
            if self._entries[criterio].get() == None or self._entries[criterio].get() == '':
                raise Excetionc13()
            else:
                return self._entries[criterio].get()
        elif len(self._criterios)==3:
            if self._entries[criterio].get() == None or self._entries[criterio].get() == '':
                raise Excetionc21()
            else:
                return self._entries[criterio].get()
        elif len(self._criterios)==4:
            if self._entries[criterio].get() == None or self._entries[criterio].get() == '':
                raise Excetionc11()
            else:
                return self._entries[criterio].get()
        elif len(self._criterios)>=4:
            if self._entries[criterio].get() == None or self._entries[criterio].get() == '':
                raise Excetionc22()
            else:
                return self._entries[criterio].get()
