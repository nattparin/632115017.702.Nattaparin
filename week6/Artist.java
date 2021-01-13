package week6;

public class Artist extends Person{
    String genre;
    String genre1;
    String genre2;
    String genre3;
    String genre4;
    String genre5;
    public Artist(String name,int age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
        
    }
    public void playMusic(){
        System.out.println(name+" is playing"+genre+" music");
    }
    public void Jobsung1(){
        System.out.println("job is "+ genre1);
    }
    public void Jobsung2(){
        System.out.println("job is "+ genre2);
    }
    public void Jobsung3(){
        System.out.println("job is "+ genre3);
    }
    public void Jobsung4(){
        System.out.println("job is "+ genre4);
    }
    public void Jobsung5(){
        System.out.println("job is "+ genre5);
    }
}
