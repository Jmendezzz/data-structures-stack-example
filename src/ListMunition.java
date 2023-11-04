public class ListMunition {
  Munition head;

  public ListMunition() {
    this.head = null;
  }

  public void reload() {
    System.out.println("Recargando...");
    if (head == null) {
      head = new Munition(new Bullet(10, 10, 10), null);
    } else {
      Munition newMunition = new Munition(new Bullet(10, 10, 10), null);
      newMunition.nextBullet = head;
      head = newMunition;
    }
    printMunitionAvailable();
  }
  public  void shoot(){
    if(head == null){
      System.out.println("No hay munición disponible, recargue.");
    }else if(head.nextBullet == null){
      System.out.println("Disparando... ");
      head = null;
    }else{
      System.out.println("Disparando...");
      Munition aux = head;
      head = head.nextBullet;
      aux = null;
    }
    printMunitionAvailable();
  }
  public void printMunition(){
    Munition movil = head;
    while (movil != null){
      System.out.println(movil.bullet.damage);
      movil = movil.nextBullet;
    }
  }
  public void printMunitionAvailable(){
    Munition movil = head;
    int count = 0;
    while (movil != null){
      movil = movil.nextBullet;
      count++;
    }
    System.out.println("Munición restante: " + count);
  }
}
