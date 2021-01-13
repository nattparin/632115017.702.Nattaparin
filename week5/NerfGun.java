package week5;

//Nattaparin Somnuek 632115017
public class NerfGun {
    private int buLlet;
    private static int GunID;

    public NerfGun() {
        buLlet = 0;
        GunID++;
    }

    public NerfGun(int bullet) {
        this.buLlet = bullet;
        GunID++;
    }

    public void fire() {
        if (buLlet > 0) {
            System.out.println("BANG !!!");
            buLlet--;
        } else
            System.out.println("There is no ammuition");
    }

    public void displayNumOfAmmunition() {
        System.out.println(buLlet+ " bullet left");
    }

    public void reload(int bullet) {
        if (buLlet + bullet <= 15)
        buLlet += bullet;
        else
            System.out.println("Error!! the ammuition is overload");
    }

    public void displayGunID() {
        System.out.println("The ID of this gun is " + GunID);
    }

}