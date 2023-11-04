import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ListMunition munition = new ListMunition();
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("Seleccione una opción:");
      System.out.println("1. Recargar arma \n" + "2. Disparar \n" + "3. Salir");
      int option = sc.nextInt();
      switch (option) {
        case 1:
          munition.reload();
          break;
        case 2:
          munition.shoot();
          break;
        case 3:
          System.out.println("Saliendo...");
          System.exit(0);
          break;
        default:
          System.out.println("Opción inválida");
          break;
      }
    }
  }

}