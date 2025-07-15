public static void main(String[] args) {
    int op;
    System.out.print(" \n MENU");
    System.out.print(" \n1. Adivina si un numero es par o Impar ");
    System.out.print(" \n2. Adivina si pasaste con tu promedio actual ");
    System.out.print(" \n3. Valida si tu contraseña es correcta ");
    System.out.print(" \n4. ¿Cual numero es mayor entre 2 numeors enteros?");
    System.out.print(" \n5. Valida si tu contraseña es correcta ");
    System.out.print(" \n6. Dias Habiles");
    System.out.print(" \n7. Confirmar Prestamo ");
    System.out.print(" \n8. Armando un triangulo juntoss");
    System.out.print(" \n9. Valida si tu contraseña es correcta ");

    Scanner scanner = new Scanner(System.in);
    System.out.println();
    System.out.print(" \n Ingresa la opcion deseada");
    op = scanner.nextInt();

    switch (op) {
        case 1:
            System.out.println("Ingrese el numero a identificar: ");
            int num = scanner.nextInt();
            Numeros numero = new Numeros(num);
            numero.espar();
            scanner.close();

            break;

        case 2:
            System.out.println("Ingrese la nota a identificar: ");
            double prom = scanner.nextDouble();
            Aprobacion promedio = new Aprobacion(prom);
            promedio.promedio();
            scanner.close();

            break;

        case 3:
            System.out.print("Ingrese la contraseña: ");
            String intentoContrasena = scanner.nextLine();
            Validar contrasena = new Validar("123123", intentoContrasena);
            contrasena.validacionpasw();
            scanner.close();

            break;

        case 4: //NO FUNCIONA BIEN
            System.out.println("Ingrese el primer número");
            int num1 = scanner.nextInt();
            System.out.println("Ingrese el segundo número");
            int num2 = scanner.nextInt();
            Comparacion enteros = new Comparacion(num1, num2);
            enteros.numMayor();
            scanner.close();

            break;

        case 5:
            System.out.println("Ingrese el valor de la compra: ");
            int valorCompra = scanner.nextInt();
            Descuento verificar = new Descuento(valorCompra);
            verificar.aplicarDcto();
            scanner.close();

            break;
        case 6:
            System.out.println("Ingrese el día de la semana (en minúsculas):");
            String diaSemana = scanner.nextLine();
            DiasHabiles comprobar = new DiasHabiles(diaSemana);
            comprobar.comprobar();
            scanner.close();
            break;
        case 7:
            System.out.println("Ingrese el valor del préstamo:");
            int valor  = scanner.nextInt();
            Intervalo verificarRango = new Intervalo(valor);
            verificarRango.confirmarRango();
            scanner.close();
            break;

        case 8:
            System.out.print("Ingrese el primer lado: ");
            int lado1 = scanner.nextInt();
            System.out.print("Ingrese el segundo lado: ");
            int lado2 = scanner.nextInt();
            System.out.print("Ingrese el tercer lado: ");
            int lado3 = scanner.nextInt();
            Triangulo verificarT= new Triangulo(lado1, lado2, lado3);
            verificarT.formarTriangulo();
            scanner.close();
            break;

        case 9:
            System.out.print("Ingrese la edad del donante: ");
            int edad = scanner.nextInt();
            System.out.print("Ingrese el peso del donante (en kg): ");
            double peso = scanner.nextDouble();
            Donante posibleDonante = new Donante(edad, peso);
            posibleDonante.donanteCompatible();
            scanner.close();
            break;

        case 10:
            System.out.print("Ingrese el código de acceso: ");
            int codigoDigitado = scanner.nextInt();
            System.out.print("Ingrese el nivel de permiso: ");
            int nivelPermiso = scanner.nextInt();
            Acceso validacionSeguridad = new Acceso(codigoDigitado, nivelPermiso);
            validacionSeguridad.validarAcceso();
    }

}
