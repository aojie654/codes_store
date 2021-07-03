package Advanced.Lessons.Week3.L322Object.src.Object;

public class Object {
    public static void main(String[] args) {
        int[] ia = new int[10];
        String[] a = new String[10];
        for (int i =0;i<a.length;i+=1){
            a[i] = ""+i;
        }
        System.out.println(ia[0]+2);
        System.out.println(a[0].length());
//        String s = null;
//        System.out.println(s.length());
    }
}
