import java.text.Collator;

public class FromSortStrategy implements SortStrategy {

	@Override
	public boolean before(Email m1, Email m2) {
		Collator comparador = Collator.getInstance();
		comparador.setStrength(Collator.PRIMARY);
		if (comparador.compare(m1.from, m2.from) < 0) {
			return true;
		}
		return false;
	}

}
