import tkinter as tk
class FieldFrame(tk.Frame):

    _entries = {}

    def __init__(self, tituloCriterios, criterios, tituloValores, valores, habilitado):
        self._tituloCriterios = tituloCriterios
        self._criterios = criterios
        self.tituloValores = tituloValores
        self._valores = valores
        self.habilitado = habilitado

    
    def crearEntradas(self, frame):
        criteriosFrame = tk.Frame(frame, height=200, pady=5, padx=5)
        criteriosFrame.pack(fill= "x")

        for i in range(len(self._criterios)):
            tk.Label(master=criteriosFrame, text=f"{self._criterios[i]}: ").grid(row=i, column=0, padx=5, pady=5, sticky="w")
            entry = tk.Entry(master=criteriosFrame, textvariable=tk.StringVar(master=criteriosFrame, value=self._valores[i]), width=55)
            entry.grid(row=i, column=1, columnspan=2, padx=5, pady=5)
            self._entries[self._criterios[i]] = entry.get
            
        
    def getValue(self, criterio):
        return self._entries[criterio]()

        
