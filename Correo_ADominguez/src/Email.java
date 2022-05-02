import java.sql.Date;

public class Email {

	String from;
	String subject;
	java.util.Date date;
	Priority priority;
	String text;

	public Email(String from, String subject, java.util.Date date, Priority priority, String text) {
		super();
		this.from = from;
		this.subject = subject;
		this.date = date;
		this.priority = priority;
		this.text = text;
		

	}

	
}
