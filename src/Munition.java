public class Munition {
  public  Bullet bullet;
  public Munition nextBullet;

  public Munition(Bullet bullet, Munition nextBullet) {
    this.bullet = bullet;
    this.nextBullet = nextBullet;
  }
}
