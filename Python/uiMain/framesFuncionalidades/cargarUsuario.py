from gestorAplicacion.Hija.usuario import Usuario
class CargarUsuario:
    usuario: Usuario

    @staticmethod
    def crearUsuario():
        CargarUsuario.usuario = Usuario("Andres", "andres@email.com", "Andres Gomez", "Facebook", "Red Social", "Prohibido usar informacion falsa")

    