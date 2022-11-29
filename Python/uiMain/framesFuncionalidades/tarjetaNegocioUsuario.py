class TarjetaNegocioUsuario:
    

    def __init__(
        self, 
        nombreNegocio: str, 
        descripcionNegocio: str,
        telefonoNegocio: str,
        direccionNegocio: str) -> None:
        self._nombreNegocio = nombreNegocio
        self._descripcionNegocio = descripcionNegocio
        self._telefonoNegocio = telefonoNegocio
        self._direccionNegocio = direccionNegocio

    def getNombreNegocio(self) -> str:
        return self._nombreNegocio

    def setNombreNegocio(self, nombreNegocio: str) -> None:
        self._nombreNegocio = nombreNegocio

    def getDescripcionNegocio(self) -> str:
        return self._descripcionNegocio

    def setDescripcionNegocio(self, descripcionNegocio: str) -> None:
        self._descripcionNegocio = descripcionNegocio

    def getTelefonoNegocio(self) -> str:
        return self._telefonoNegocio

    def setTelefonoNegocio(self, telefonoNegocio: str) -> None:
        self._telefonoNegocio = telefonoNegocio

    def getDireccionNegocio(self) -> str:
        return self._direccionNegocio

    def setDireccionNegocio(self, direccionNegocio: str) -> None:
        self._direccionNegocio = direccionNegocio

    def __str__(self) -> str:
        return "TarjetaNegocioUsuario{ \n" + "nombreNegocio='" + self.getNombreNegocio() + ",\ndescripcionNegocio='" + self.getDescripcionNegocio() + ",\ntelefonoNegocio='" + self.getTelefonoNegocio() + ",\ndireccionNegocio='" + self.getDescripcionNegocio() + '\n}'

    