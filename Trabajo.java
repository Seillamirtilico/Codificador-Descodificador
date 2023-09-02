import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opciones = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Bienvenido a tu programa de codificacion y decodificacion");
        do {
            System.out.println("_____________________________\nIngresa la opcion que desees");
            System.out.println("(1)Codificar\n(2)Descodificar\n(3)Salir");
            opciones = lector.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println("Ingresa el mensaje que quieres codificar");
                    String mensaje = lector.next();
                    System.out.println("Cuántas veces quieres mover la letra");
                    int veces = lector.nextInt();

                    String mensajeCifrado = "";

                    for (int i = 0; i < mensaje.length(); i++) {
                        char letra = mensaje.charAt(i);
                        boolean minuscula = (letra >= 'a' && letra <= 'z');
                        boolean mayuscula = (letra >= 'A' && letra <= 'Z');
                        if (!(minuscula || mayuscula))
                            mensajeCifrado += letra;
                        else {
                            int ascii = (int) letra;
                            int baseAscii = (int) 'a';
                            if (mayuscula)
                                baseAscii = (int) 'A';
                            int nuevoAscii = (ascii - baseAscii + veces) % 26 + baseAscii;
                            char nuevaLetra = (char) nuevoAscii;
                            mensajeCifrado += nuevaLetra;
                        }
                    }
                    System.out.println("tu mensaje cifrado es "+mensajeCifrado);
                    break;
                case 2:
                    System.out.println("Ingresa el mensaje que quieras decodificar");
                    String mensaje2 = lector.next();
                    System.out.println("Cuál es tu llave");
                    int veces2 = lector.nextInt();

                    String mensajedesCifrado = "";

                    for (int i = 0; i < mensaje2.length(); i++) {
                        char letra = mensaje2.charAt(i);
                        boolean minuscula = (letra >= 'a' && letra <= 'z');
                        boolean mayuscula = (letra >= 'A' && letra <= 'Z');
                        if (!(minuscula || mayuscula))
                            mensajedesCifrado += letra;
                        else {
                            int ascii = (int) letra;
                            int baseAscii = (int) 'z';
                            if (mayuscula)
                                baseAscii = (int) 'Z';
                            int nuevoAscii = (ascii - baseAscii - veces2) % 26 + baseAscii;
                            char nuevaLetra = (char) nuevoAscii;
                            mensajedesCifrado += nuevaLetra;
                        }
                    }
                    System.out.println("tu mensaje descifrado es "+mensajedesCifrado);
                    break;
                case 3:
                    System.out.println("Adioooos");
                    break;
                default:
                    System.out.println("numero invalido");


            }

        } while (opciones != 3);

    }
}
