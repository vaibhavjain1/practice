package accolite;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Employee{
public int id;
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("hashcode");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Equals");
		return super.equals(obj);
	}
	
}
public class Testing {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
		SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	    Date strDate = formatter.parse("Wed Sep 02 14:20:35 IST 2020");  
	    System.out.println("Date Format with MM/dd/yyyy : "+formatter1.format(strDate));  
	}

}
