package date.main;

import java.util.Date;

public class TestApp {

	public static void main(String[] args) {
		// java.util.Data -> used  to store date object
		
		Date date = new Date();
		System.out.println(date);
		
		java.sql.Date sdate = new java.sql.Date(date.getTime());
		System.out.println(sdate);
	}

}
