import java.util.ArrayList;
import java.util.Collections;

public class Mailbox {

	private SortStrategy strategy;
	protected ArrayList<Email> email = new ArrayList<Email>();

	public void sort(SortStrategy st) {
		strategy = st;
		for (int i = 1; i < email.size(); i++)
			for (int j = email.size() - 1; j >= i; j--)
				if (before(email.get(j), email.get(j - 1)))
					Collections.swap(email, j, j - 1);

	}

	public String show() {
		String orden = "";
		for (int i = 0; i <= email.size() - 1; i++) {

			orden += "Email " + i + " From:" + email.get(i).from + " Subject:" + email.get(i).subject + " Date:"
					+ email.get(i).date.toString() + " Priority:" + email.get(i).priority.toString() + " Text:"
					+ email.get(i).text + System.getProperty("line.separator");
		}

		return orden;

	}

	public boolean before(Email m1, Email m2) {
		return strategy.before(m1, m2);
	}

	public Mailbox() {
		super();
	}

}
