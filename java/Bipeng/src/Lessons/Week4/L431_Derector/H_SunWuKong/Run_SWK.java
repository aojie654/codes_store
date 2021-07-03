package Lessons.Week4.L431_Derector.H_SunWuKong;

public class Run_SWK {
    public static void main(String[] args) {
        Monkey swk0 = new Monkey("Sun Wu Kong");
        SWK_Deformation sd0 = new SWK_Deformation();
        SWK_Diving sdi0 = new SWK_Diving();
        SWK_Fly sf0 = new SWK_Fly();
        SWK_Speak ss0 = new SWK_Speak();

        ss0.discribe(swk0);
        sf0.discribe(ss0);
        sdi0.discribe(sf0);
        sd0.discribe(sdi0);

        sd0.function();
    }
}
