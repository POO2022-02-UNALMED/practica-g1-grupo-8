import pickle, os, pathlib
from gestorAplicacion.Hija.usuario import Usuario
from framesFuncionalidades.ErrorAplicacion import ArchivoNoEncontrado
def cargar() -> Usuario:
        try:
            with open(os.path.join(pathlib.Path(__file__).parent, "temp\\data.pickle"), "rb") as infile:
                usuario: Usuario = pickle.load(infile)
                return usuario
        except:
            raise ArchivoNoEncontrado()
