import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Cine cine = new Cine("PROYECCIONES X", 100, 5, 10, 10);

        int eleccion;
        String correo = "";
        int fila;
        int col;
        int nsala;

        do {
            System.out.println(cine.getNombre());
            System.out.println();
            System.out.print("1. VER SALAS Y SUS PELICULAS\n"
                    + "2. ELEGIR SALA Y ASIENTO\n"
                    + "3. DISTRIBUCION DE LOS ASIENTOS\n"
                    + "4. SALIR\n"
                    + ">>");
            eleccion =  in.nextInt();

            switch (eleccion){
                case 1:
                    cine.mostrarsalas();
                    break;

                case 2:
                    System.out.println("CORREO: ");
                    correo = in.next();

                    System.out.println("NUMERO DE SALA: ");
                    nsala = in.nextInt();

                    System.out.println("FILA: ");
                    fila = in.nextInt();

                    System.out.println("COLUMNA: ");
                    col = in.nextInt();

                    cine.compra(nsala,fila,col,correo);
                    break;

                case 3:
                    System.out.print("SALA: ");
                    cine.mostrarmatriz(in.nextInt(), correo);
                    break;

                case 4:
                    System.out.println("VUELVA PRONTO.");
                    break;

                default:
                    System.out.println("OPCION INVALIDA");
                    break;

            }
        } while (eleccion != 4);
    }
}