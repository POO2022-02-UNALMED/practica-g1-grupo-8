class ListaUsuario():
    def __init__(self):
        self._listaUsuario = []

    def getListaUsuario(self):
        return self._listaUsuario
	
    def añadirUsuario(self, usuario):
        self._listaUsuario.add(usuario)
	
    def __str__(self):
        p = ""
        for i in range(len(self._listaUsuario)):
            p="\n"+(i+1)+"Nombre"+ListaUsuario.get(i).getContactoUsuario().getNombre()
            
        return p

    def getUsuario(self, i):
        return self._listaUsuario.get(i)