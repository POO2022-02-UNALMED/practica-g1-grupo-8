from gestorAplicacion.Hija.usuario import Usuario
from gestorAplicacion.Hija.tarjetaNegocioUsuario import TarjetaNegocioUsuario

class CargarUsuario:
    usuario: Usuario

    @staticmethod
    def crearUsuario():
        tarjetaNegocio = TarjetaNegocioUsuario("Facebook", "Red Social", "0000000000", "Calle 0 # 0 - 0")
        CargarUsuario.usuario = Usuario("Andres", "andres@email.com", "Andres Gomez", tarjetaNegocio.getNombreNegocio(),tarjetaNegocio.getDescripcionNegocio(), "Prohibido usar informacion falsa", tarjetaNegocio)

    