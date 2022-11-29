import pickle
def guardar(lista):
    picklefile=open("temp","wb")
    pickle.dump(lista,picklefile)
    picklefile.close