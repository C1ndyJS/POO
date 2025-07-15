public class Acceso {

    int nivelPermiso;
    int codigoDigitado;

    public Acceso(int codigoDigitado, int nivelPermiso ) {
        this.codigoDigitado = codigoDigitado;
        this.nivelPermiso =nivelPermiso;
    }

    public void validarAcceso(){
        int codigoCorrecto = 2023;
        int nivelPermisoMinimo = 1;
        int nivelPermisoMaximo = 3;
        boolean codigoValido = codigoDigitado == codigoCorrecto;
        boolean permisoValido = nivelPermiso >= nivelPermisoMinimo && nivelPermiso <= nivelPermisoMaximo;

        if (codigoValido && permisoValido) {
            System.out.println("Acceso permitido. ¡Bienvenido al sistema!");
        } else {
            System.out.println("Acceso denegado. Motivo(s):");
            if (!codigoValido) {
                System.out.println("- Código de acceso incorrecto.");
            }
            if (!permisoValido) {
                System.out.println("- Nivel de permiso inválido.");
            }
        }
    }
}
