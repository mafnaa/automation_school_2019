import java.text.SimpleDateFormat;
import java.util.*;

public class Homework2 {
	public static void main(String[] args) {
		String name = args[0];
		String surname = args[1];
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-YYYY, E, HH:mm:ss");
		String date = dateFormat.format(new Date());
		
		System.out.println((String.format("%s %s, lesson 2 is finished.", name, surname)));
		System.out.println(date);
	}
}