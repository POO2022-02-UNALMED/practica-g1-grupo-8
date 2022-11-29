import pickle
def cargar():
    picklefile=open("temp","rb")
    lista=pickle.load(picklefile)
    picklefile.close
    return lista