package utp.programacion4.ejercicios;

import java.util.Scanner;

/*** Centro Especialista de Salud Jimenez S.A.S Controles Medicos*/
public class POO {

    /*** @param args */
    public static void main(String[] args) {
        //1. Construir un programa que permita leer e imprimir los datos de tres clientes.
        int i;
        customer p[] = new customer[1];
        Scanner sc = new Scanner(System.in);
        // 2) Construir un programa que permita calcular el área y el perímetro de cuatro triángulos.
        Triangulo t[] = new Triangulo[1];

        //3. Construir un programa que permita calcular el volumen, el área y el perímetro de seiscilindros
        Cilindro c[] = new Cilindro[1];
        
        //4. Construir un programa que permita ingresar los datos de los productos en 5 facturas
        //diferentes y muestre el subtotal y el total del valor incluyendo el IVA.
        int cant = 1;
        Factura Fact[] = new Factura[cant];
        
        //5. Construir un programa que permita leer y promediar las cinco notas de 10 estudiantes de programación IV.
        Student e[] = new Student[2];
        
        //Menu---------------------------------------
        boolean salir = false;
        int opcion;
        while (!salir){
            System.out.print("\nMenu\n");
            System.out.print(" \n1. Leer e Imprimir datos de 3 clientes ");
            System.out.print(" \n2. Area y Perimetro de Triangulos ");
            System.out.print(" \n3. Area, Volument y Perimetro de Cilindros ");
            System.out.print(" \n4. Facturas del Supermercado ");
            System.out.print(" \n5. Hallar el promedio de estudantes \n");

            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            /*Switch con cada uno de los casos para las diferentes opciones del menu*/
            switch (opcion) {
                case 1:
                    System.out.println("\nBienvenido estas en la Opcion 1! \n1. Leer e Imprimir datos de 3 clientes"); 
                    for (i = 0; i < p.length; i++) {
                        System.out.println("Customer " + (i + 1));
                        System.out.print("Ingresa el nombre: ");    String nombre = sc.next();
                        System.out.print("\nIngresa el id: ");      int id = sc.nextInt();
                        System.out.print("\nIngresa la edad: ");    int edad = sc.nextInt();
                        System.out.print("\nIngresa el peso: ");    float peso = sc.nextFloat();
                        System.out.print("\nIngresa la altura: ");  float altura = sc.nextFloat();
                        p[i] = new customer(nombre, id, edad, peso, altura);
                    }

                    for (i = 0; i < p.length; i++) {
                        System.out.println("\n" + (i + 1) + ". Customer Information");
                        System.out.println("Name: " + p[i].nombre);
                        System.out.println("Id: " + p[i].id);
                        System.out.println("Age: " + p[i].edad);
                        System.out.println("Peso: " + p[i].peso);
                        System.out.println("Altura: " + p[i].altura);
                    }
                    break;
                    
                case 2:
                    System.out.print("Bienvenido estas en la Opcion 2!\n");
                    System.out.println("AREA - PERIMETRO de Triangulos");
                    for (i = 0; i < t.length; i++) {
                        System.out.println("\nTriangulo " + (i + 1));
                        System.out.print("Ingresa La base ");      float base = sc.nextFloat();
                        System.out.print("\nIngresa la altura: "); float Altura = sc.nextFloat();
                        System.out.print("\nIngresa el lado 1: "); float L1 = sc.nextFloat();
                        System.out.print("\nIngresa el lado 2: "); float L2 = sc.nextFloat();
                        System.out.print("\nIngresa el lado 3: "); float L3 = sc.nextFloat();
                        t[i] = new Triangulo(L1, L2, L3, base, Altura);

                        System.out.print("\nArea: " + t[i].calcularArea());
                        System.out.print("\nPerimetro: " + t[i].calcularPerimetro() + "\n");
                    }
                    break;
                case 3:
                     System.out.println("\n3. AREA- VOLUMEN-PERIMETRO de Cilindros");
                    for (i = 0; i < c.length; i++) {
                        System.out.println("\n" + (i + 1) + ". Cilindro\n");
                        System.out.print("Ingresa el radio: ");    float radio = sc.nextFloat();
                        System.out.print("\nIngresa la altura: "); float altura = sc.nextFloat();
                        c[i] = new Cilindro(radio, altura);
                        System.out.print("\nArea: " + c[i].calcularA());
                        System.out.print("\nVolumen: " + c[i].calcularVol());
                        System.out.print("\nPerimetro: " + c[i].calcularPer() + "\n");
                    }
                case 4:
                    System.out.print("\n4.===FACTURA DEL SUPERMERCADO==\n");
                    for (i = 0; i < Fact.length; i++) // Factura
                    {
                        System.out.println("\nFactura " + (1 + i));
                        System.out.print("\nNombre del Cliente: " );   String NameCx = sc.next();
                        System.out.print("\nNombre del cajero:  ");    String NameCaja = sc.next();
                        System.out.print("\nFecha: ");                 String Fecha = sc.next();
                        Fact[i] = new Factura(NameCx, NameCaja, Fecha);

                        for (int j = 0; j < 2; j++) // Productos de la first bill
                        {
                            System.out.print("\nIngrese el nombre del producto: ");       String name = sc.next();
                            System.out.print("Ingrese el Codigo del producto: ");         long codigo = sc.nextLong();
                            System.out.print("Ingrese el precio del producto: ");         float precio = sc.nextFloat();
                            System.out.print("Ingrese las unidades del producto: ");      float unidad = sc.nextFloat();
                            Fact[i].products.add(new Productos(name, codigo, precio, unidad));
                        }
                    }
                    for (i = 0; i < cant; i++) 
                    {
                        float Subtotal = 0;
                        System.out.println("Factura " + (1 + i));
                        System.out.println("Nombre del Cliente: " + Fact[i].NameCx);
                        System.out.println("Nombre del Cajero: " + Fact[i].NameCajero);
                        System.out.println("Fecha: " + Fact[i].Fecha);
                        for (int j = 0; j < Fact[i].products.size(); j++) {
                            System.out.print("---------\n");  
                            System.out.print("Name: "  + Fact[i].products.get(j).NameProduct);
                            System.out.print("\ncodigo: "  + Fact[i].products.get(j).codigoProd);
                            System.out.print("\nprecio individual: "  + Fact[i].products.get(j).precio);
                            System.out.println("\nUnidades: "  + Fact[i].products.get(j).unidad);
                            System.out.println("\nValor: "  + (Fact[i].products.get(j).precio * Fact[i].products.get(j).unidad) );
                            Subtotal = Subtotal + Fact[i].products.get(j).precio * Fact[i].products.get(j).unidad;
                        }
                        System.out.print("Subtotal : " + Subtotal);
                        System.out.print("\nIVA: " + Subtotal * 0.19);
                        System.out.println("\nTotal with Iva: " + ((Subtotal * 0.19) + Subtotal));
                    }
                    break;
                case 5:
                    System.out.print("\n5.===ESTUDIANTES==\n");
                    for (i = 0; i < e.length; i++) 
                    {
                        System.out.println("Student " + (i + 1));
                        System.out.print("Ingresa el Nombre: ");   String name = sc.next();
                        System.out.print("Ingresa el id: ");       int id = sc.nextInt();
                        System.out.print("Ingresa la nota 1: ");   float nota = sc.nextFloat();
                        System.out.print("Ingresa la nota 2: ");   float not = sc.nextFloat();
                        System.out.print("Ingresa la nota 3: ");   float no = sc.nextFloat();

                        e[i] = new Student(name, id, nota, not, no);
                    }
                    System.out.print("\n Promedio de todos los estudiantes\n");
                    float promTotal = 0;
                    for (i = 0; i < e.length; i++) {
                        System.out.println("Name: " + e[i].name);
                        System.out.println("Id: " + e[i].id);
                        System.out.println("Promedio " + e[i].Promedio() + "\n");
                        promTotal = +e[i].Promedio();
                    }
                    promTotal = promTotal / e.length;
                    System.out.print("Promedio de estudiantes de Programacion IV: " + promTotal +"\n");
                    break;
                case 6:
                    System.out.print("Hasta luego!");
                    salir = true;//Se pone la variable salir en verdadero para salir del Bucle
                    break;
                default:
                    System.out.print("Opcion no valida!");
                }
        }
    }
}