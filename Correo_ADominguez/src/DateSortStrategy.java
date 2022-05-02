
public class DateSortStrategy implements SortStrategy {

	@Override
	public boolean before(Email m1, Email m2) {
		if (m2.date.compareTo(m1.date) < 0) {
			return true;
		}
		return false;
	}

}
