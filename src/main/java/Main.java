import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args) throws InterruptedException {
		List<Long> listTax1 = new ArrayList<>();
		List<Long> listTax2 = new ArrayList<>();
		List<Long> listTax3 = new ArrayList<>();
		listTax1.add(50L);
		listTax1.add(50L);
		listTax2.add(100L);
		listTax2.add(50L);
		listTax2.add(50L);
		listTax3.add(50L);
		listTax3.add(50L);
		listTax3.add(50L);
		listTax3.add(50L);
		listTax3.add(50L);
		listTax3.add(50L);


		Tax tax = new Tax();


		Thread magazine1 = new Thread(null, ()-> { tax.calcTax(listTax2); }, "Магазин 1");

		Thread magazine2 = new Thread(null, ()-> { tax.calcTax(listTax2); }, "Магазин 2");

		Thread magazine3 = new Thread(null, ()-> { tax.calcTax(listTax3); }, "Магазин 3");

		magazine1.start();
		magazine2.start();
		magazine3.start();

		magazine3.join();
		magazine2.join();
		magazine1.join();
		System.out.println("\nБаланс после всех поступлений от магазинов: " + tax.getCurrent());
	}
}