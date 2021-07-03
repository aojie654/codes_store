package Advanced.Lessons.Week3.L321ForEach.src.ForEach;
class Value{

    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

}
public class ForEach {
    public static void main(String[] args) {
        Value[] a = new Value[10];
        for (int i = 0; i<a.length;i+=1){
            a[i] = new Value();
            a[i].setI(i);
        }
        for (Value v: a){
            System.out.print(v.getI()+" ");
            v.setI(9-v.getI());
        }
        System.out.println();
        for (Value v: a){
            System.out.print(v.getI()+" ");
        }
//        int[] ia = new int[10];
//        String[] a = new String[10];
//        for (int i =0;i<a.length;i+=1){
//            a[i] = ""+i;
//        }
//        for (int k: ia){
//            System.out.print(k+" ");
//        }
//        System.out.println(ia[0]+2);
//        System.out.println(a[0].length());
    }
}
