package Advanced.Lessons.Week1.L141Method.src.Method;

public class Method {
    int[] array0 = new int[10];
    Method(){
    }
    Method(int num0){
        for (int i = 0; i < array0.length; i += 1) {
            array0[i] = num0;
        }
    }
    Method(double num0){
        for (int i = 0; i < array0.length; i += 1) {
            array0[i] = (int)num0;
        }
    }
    void print(){
        for (int i = 0; i < array0.length; i += 1) {
            System.out.print(array0[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Method m0 = new Method();
        Method m1 = new Method(1);
        Method m2 = new Method(2.0);
        m0.print();
        m1.print();
        m2.print();
    }
}
