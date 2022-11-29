import tkinter as tk
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
        if self._entries[criterio].get() == None or self._entries[criterio].get() == '':
            raise Exception("")
        else:
            return self._entries[criterio].get()
        
