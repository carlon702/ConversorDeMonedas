import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int selector = 0;
       String quantity = "0";
        Scanner sc = new Scanner(System.in);
        RequestAPI req = new RequestAPI();
        while(selector != 7) {System.out.println("""
                ******************************************
                Bienvenido/a al conversor de Monedas!!
                 \
                1) Dolar =>> Peso argentino
                 \
                2) Peso argentino =>> Dolar
                 \
                3) Dolar =>> Real Brasileno
                 \
                4) Real brasileno =>> Dolar
                 \
                5) Dolar =>> Peso colombiano
                 \
                6) Peso colombiano =>> Dolar
                 \
                7) Salir
                Elija una opcion valida:
                ******************************************""");
            selector = sc.nextInt();
            if(selector != 7){
                System.out.println("Ingrese la cantidad de dinero que desea convertir:");
                quantity = sc.next();
            }

            switch (selector){
                case 1:
                    System.out.println(req.conversor("USD", "ARS", quantity).toString());
                    break;
                case 2:
                    System.out.println(req.conversor("ARS", "USD", quantity).toString());
                    break;
                case 3:
                    System.out.println(req.conversor("USD", "BRL", quantity).toString());
                    break;
                case 4:
                    System.out.println(req.conversor("BRL", "USD", quantity).toString());
                    break;
                case 5:
                    System.out.println(req.conversor("USD", "COP", quantity).toString());
                    break;
                case 6:
                    System.out.println(req.conversor("COP", "USD", quantity).toString());
                    break;
                case 7:  System.out.println("Saliendo... Hasta luego, gracias!.");
                    break;
                default:
                    System.out.println("El numero ingresado no corresponde a ninguna opcion");
            }

        }
    }
}