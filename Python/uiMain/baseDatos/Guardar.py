import pickle, pathlib, os
from framesFuncionalidades.ErrorAplicacion import ErrorAplicacion
def guardar(obj):
    try:
        print()
        with open(os.path.join(pathlib.Path(__file__).parent, "temp\\data.pickle"), "wb") as outfile:
            pickle.dump(obj, outfile)
    except Exception as ex:
        raise ErrorAplicacion(f"Error guardado el archivo: {ex}")