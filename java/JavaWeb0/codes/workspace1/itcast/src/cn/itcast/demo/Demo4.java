package cn.itcast.demo;


public class Demo4 {

	public static void main(String[] args) {

		String str = "192,168,1,100";
		String[] strs = str.split(",");
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}
