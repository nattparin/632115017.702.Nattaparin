package week7;

public class Mian {
    public static void main(String[] args) {
        Dog dog = new Dog("shabu", 5,"labador ", "brown");
        System.out.println("Mydog");
        dog.size = "medium";
        dog.introduce();
        dog.Run();
        dog.Size();
        dog.bark=" Box Box";
        dog.Bark();
        dog.longhair = true;
        dog.Hair();

        Fish fish = new Fish("Bob", 5,"Shark", "black");
        System.out.println("My fish");
        fish.size = "medium";
        fish.introduce();
        fish.Size();
        fish.speed=" Fast";
        fish.Swimspeed();
        fish.swimtothesea();
        fish.Saltwater = true;
        fish.Salwater();

        Bird bird = new Bird("Bobby", 5,"owl", "brown");
        System.out.println("My Brid");
        bird.introduce();
        bird.country=true;
        bird.Country();
        bird.speak=" owl owl ";
        bird.Speak();
        bird.CanFly();
    }
}
