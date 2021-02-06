package week9;

public class Student extends Person {
    String workState;

    public Student (String name, int bornYear, String workState) {
        super(name, bornYear);
        this.workState = workState;
    }

   
    public void introduce () {
        super.introduce();
        System.out.println("I'm a Student  study in  " + 
                workState + ".");
    }
}
