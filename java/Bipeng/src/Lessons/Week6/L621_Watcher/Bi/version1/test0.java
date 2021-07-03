package Lessons.Week6.L621_Watcher.Bi.version1;

public class test0 {
    public static void main(String[] args) {
        Monitor MR_Bi = new Monitor();
        Student yyh0 = new Student("Dc.Yang");
        Student lzn0 = new Student("ZhenNan Li");

        MR_Bi.attach(yyh0);
        MR_Bi.attach(lzn0);

        MR_Bi.inform("tn");
        MR_Bi.dettach(yyh0);
        MR_Bi.inform("ty");
    }
}
