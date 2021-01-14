package week6;
//nattaparin somnuek 6302115017
public class Main {
    public static void main(String[] args) {
        Artist art = new Artist("ball", 20,"male");

        art.genre=" hip hop";
        art.introduce();
        art.playMusic();

        Jobsung1 job1 = new Jobsung1("smart", 18,"male");
        job1.introduce();
        job1.job1=" Demon salayer";
        job1.Jobsung1();

        Jobsung2 job2 = new Jobsung2("poom", 19,"male");
        job2.introduce();
        job2.job2=" Football player";
        job2.Jobsung2();

        Jobsung3 job3 = new Jobsung3("mark", 19,"male");
        job3.introduce();
        job3.job3=" sell man";
        job3.Jobsung3();

        Jobsung4 job4 = new Jobsung4("atom", 19,"male");
        job4.introduce();
        job4.job4=" Programer";
        job4.Jobsung4();

        Jobsung5 job5 = new Jobsung5("tan", 19,"male");
        job5.introduce();
        job5.job5=" youtuber";
        job5.Jobsung5();
    }
}
