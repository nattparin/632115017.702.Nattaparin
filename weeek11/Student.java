package weeek11;

public class Student {
    private Object name;
    private Object age;
    private Object gpa;

    public Student (String name, int age , double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public Object getName(){
        return this.name;
    }

    public Object getAge(){
        return this.age;
    }

    public Object getGPA(){
        return this.gpa;
    }


}

