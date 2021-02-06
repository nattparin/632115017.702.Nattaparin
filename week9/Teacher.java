package week9;

public class Teacher extends Person {
    String workState;

    public Teacher (String name, int bornYear, String workState) {
        super(name, bornYear);
        this.workState = workState;
    }

   
    public void introduce () {
        super.introduce();
        System.out.println("I’m a teacher and teach the students in " + 
                workState + ".");
    }

}
