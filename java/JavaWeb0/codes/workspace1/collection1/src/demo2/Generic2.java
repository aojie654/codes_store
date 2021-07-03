package demo2;

// 泛型类 Generic2 有两个类型可以泛型使用！
public class Generic2<T, V> {

	private T t1;
	private T t2;
	private V v;

	public Generic2(T t, V v) {
		this.t1 = t;
		t2 = t1;
		this.v = v;
	}

	public String toString() {
		return t1.toString() + t2.toString() + v.toString();
	}

	public static void main(String[] args) {
		Generic2<Double, Integer> g2 = 
				new Generic2<>(12.00, 1);
		System.out.println(g2.toString());
	}

}
