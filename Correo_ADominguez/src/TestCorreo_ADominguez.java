import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCorreo_ADominguez {

	private Mailbox mb;

	@BeforeEach
	void TestCorreo() {
		mb = new Mailbox();
	}

	@Test
	public void PrioritySortStrategy() {
		// Comprobamos que teniendo tres mails con distintas prioridades los ordena
		// correctamente ( ALTA, MEDIA, BAJA )
		PrioritySortStrategy str = new PrioritySortStrategy();
		Date d1 = new Date();
		d1.setHours(15);
		Date d2 = new Date();
		Email m2 = new Email("Pedro", "ISA", d2, Priority.MEDIA, "PruebaEmailPedro");
		Email m1 = new Email("Alejandro", "ISA", d1, Priority.ALTA, "PruebaEmailAlejandro");
		Email m3 = new Email("Isabel", "ISA", d2, Priority.BAJA, "PruebaEmailPedro");
		mb.email.add(m1);
		mb.email.add(m2);
		mb.email.add(m3);
		mb.sort(str);
		assertEquals("Alejandro", mb.email.get(0).from);
		assertEquals("Pedro", mb.email.get(1).from);
		assertEquals("Isabel", mb.email.get(2).from);
	}
	
	@Test
	public void DateSortStrategy() {
		// Comprobamos que teniendo tres mails con distintas fechas los ordena
		// correctamente ( 11:xx, 12:xx, 13:xx )
		DateSortStrategy str = new DateSortStrategy();
		Date d1 = new Date();
		d1.setHours(11);
		Date d2 = new Date();
		d2.setHours(12);
		Date d3 = new Date();
		d3.setHours(13);
		Email m2 = new Email("Pedro", "ISA", d2, Priority.MEDIA, "PruebaEmailPedro");
		Email m1 = new Email("Alejandro", "ISA", d1, Priority.ALTA, "PruebaEmailAlejandro");
		Email m3 = new Email("Isabel", "ISA", d3, Priority.BAJA, "PruebaEmailPedro");
		mb.email.add(m1);
		mb.email.add(m2);
		mb.email.add(m3);
		mb.sort(str);
		assertEquals("Isabel", mb.email.get(0).from);
		assertEquals("Pedro", mb.email.get(1).from);
		assertEquals("Alejandro", mb.email.get(2).from);
	}
	
	@Test
	public void FromSortStrategy() {
		// Comprobamos que teniendo tres mails con distintas nombres los ordena
		// correctamente ( "Alejandro", "Isabel", "Pedro" )
		FromSortStrategy str = new FromSortStrategy();
		Date d1 = new Date();
		d1.setHours(11);
		Date d2 = new Date();
		d2.setHours(12);
		Date d3 = new Date();
		d3.setHours(13);
		Email m2 = new Email("Pedro", "ISA", d2, Priority.MEDIA, "PruebaEmailPedro");
		Email m1 = new Email("Alejandro", "ISA", d1, Priority.ALTA, "PruebaEmailAlejandro");
		Email m3 = new Email("Isabel", "ISA", d3, Priority.BAJA, "PruebaEmailPedro");
		mb.email.add(m1);
		mb.email.add(m2);
		mb.email.add(m3);
		mb.sort(str);
		assertEquals("Isabel", mb.email.get(1).from);
		assertEquals("Pedro", mb.email.get(2).from);
		assertEquals("Alejandro", mb.email.get(0).from);
	}
	

}
