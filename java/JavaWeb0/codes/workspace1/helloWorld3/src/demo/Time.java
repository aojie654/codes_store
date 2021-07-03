package demo;

public class Time {
	private static String time=""; 
	//得到当前系统时间。
	public static String showTime(){
		java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
		time =df.format(new java.util.Date());
		
		return time;
	}
}
