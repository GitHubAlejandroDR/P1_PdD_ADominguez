import java.util.Date;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrioritySortStrategy str = new PrioritySortStrategy();
		Date d1 = new Date();
		d1.setHours(15);
		Email m1 = new Email("Alejandro","ISA",d1,Priority.BAJA, "PruebaEmailAlejandro");
		Date d2 = new Date();
		Email m2 = new Email("Pedro","ISA",d2,Priority.MEDIA, "PruebaEmailPedro");
		Mailbox mb = new Mailbox();
		Email m3 = new Email("Isabel","ISA",d2,Priority.MEDIA, "PruebaEmailPedro");
		mb.email.add(m1);
		mb.email.add(m2);
		mb.email.add(m3);
		mb.sort(str);
		System.out.print(mb.show());

	}

}
