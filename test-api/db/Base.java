package db;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Base {

	protected Date getBirthday() throws ParseException{
		SimpleDateFormat fd = new SimpleDateFormat("yyyy-MM-dd");
		return fd.parse("1990-01-01");
	}
	
	protected Time getBirthTime() throws ParseException{
		SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
		return new Time(ft.parse("01:01:01").getTime());
	}
	
	protected Timestamp getEnrollmentTime() throws ParseException{
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return new Timestamp(ft.parse("2000-01-01 01:01:01").getTime());
	}
}