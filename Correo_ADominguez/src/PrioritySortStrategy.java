
public class PrioritySortStrategy implements SortStrategy{

	@Override
	public boolean before(Email m1, Email m2) {
		if(m2.priority.compareTo(m1.priority) < 0) {
			return true;
		}
		return false;
	}

}
