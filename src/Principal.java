public static void main(String[] args) {
    int op;
    System.out.print(" \n MENU");
    System.out.print(" \n1. Adivina si un numero es par o Impar ");
    System.out.print(" \n2. Adivina si pasaste con tu promedio actual ");
    System.out.print(" \n3. Valida si tu contraseña es correcta ");
    System.out.print(" \n4. ¿Cual numero es mayor entre 2 numeors enteros?");
    System.out.print(" \n5. Valida si tu contraseña es correcta ");

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
            break;

        case 2:
            System.out.println("Ingrese la nota a identificar: ");
            double prom = scanner.nextDouble();
            Aprobacion promedio = new Aprobacion(prom);
            promedio.promedio();
            break;

        case 3:
            System.out.print("Ingrese la contraseña: ");
            String intentoContrasena = scanner.nextLine();
            Validar contrasena = new Validar("123123", intentoContrasena);
            contrasena.validacionpasw();
            break;

        case 4:
            System.out.println("Ingrese el primer número");
            int num1 = scanner.nextInt();
            System.out.println("Ingrese el segundo número");
            int num2 = scanner.nextInt();
            Comparacion enteros = new Comparacion(num1, num2);
            enteros.numMayor();
            break;
        case 5:
            System.out.println("Ingrese el valor de la compra: ");
            int valorCompra = scanner.nextInt();
            Descuento verificar = new Descuento(valorCompra);
            verificar.aplicarDcto();
    }

}
