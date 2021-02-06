package week9;

public class Main {
    public static void main(String[] args) {
        
        Person person1, person2, person3,person4,person5,person6,person7;
        person1 = new Person("Mark", 1980);
        person2 = new Sheriff("Mateo", 1981, "California");
        person3 = new Teacher("Ball", 1977, "CMU");
        person4 = new Student("Smart", 2002, "CMU");
        person5 = new Student("Donny", 2001, "CMU");
        person6 = new Student("Idea", 2002, "CMU");
        person7 = new Student("Poom", 2002, "CMU");


        person1.introduce();
        person2.introduce();
        person3.introduce(); 
        person4.introduce(); 
        person5.introduce(); 
        person6.introduce(); 
        person7.introduce(); 
    }    
}
