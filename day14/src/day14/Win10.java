package day14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Win10 extends Login{
	private String version;
	Date date = new Date();
	
	public String getVersion() { return version; }
	SimpleDateFormat simple = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
	
	
	public Win10(SimpleDateFormat simple, Date date, String version) throws Exception {
		super(simple, date);
		super.tentimer();
		super.LoginProgram();
		this.version = version;
		System.out.println("windows10 �Դϴ�.");
		
	}
	
	//public void setVersion(String version) { this.version = version; }
}
