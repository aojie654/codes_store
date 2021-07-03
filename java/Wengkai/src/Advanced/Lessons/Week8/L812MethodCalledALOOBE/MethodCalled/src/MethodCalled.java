package Advanced.Lessons.Week8.L812MethodCalledALOOBE.MethodCalled.src;public class MethodCalled {
    public static void f(){
        int[] a = new int[1];
        a[1] = 1;
        System.out.println("f() is running.");
    }
    public static void g(){
        f();
    }
    public static void h(){
        int i=10;
        if (i<100){
            g();
        }
    }
    public static void k(){
        try {
            h();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("k()");
//            throw e;
        }
    }
    public static void main(String[] args) {
//        f();
        try{
            k();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catch ArrayIndexOutOfBoundsException in k()");
            System.out.println("Error occurs in line "+e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("Running...");
    }
}
