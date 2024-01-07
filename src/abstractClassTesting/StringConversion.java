package abstractClassTesting;

import java.sql.Timestamp;

public class StringConversion {

	public static void main(String[] args) {
		Timestamp yy = new Timestamp(2020, 07, 07, 8, 9, 10, 0);
		System.out.println(String.valueOf(yy));
	}

}
