package Lab11;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplePrinter a=new SimplePrinter();
		a.start();
		try {
			a.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		NumberPrinter b=new NumberPrinter();
		b.start();
		CharacterPrinter c=new CharacterPrinter();
		c.start();
		CountdownTimer d=new CountdownTimer();
		d.start();
		ClockDisplay e=new ClockDisplay();
		e.start();
		MultipleTimers f=new MultipleTimers();
		f.run();
		f.run1();
		f.run2();
	}
}