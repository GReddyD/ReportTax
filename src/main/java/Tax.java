import java.util.List;
import java.util.concurrent.atomic.LongAdder;

public class Tax {
	LongAdder income = new LongAdder();

	public long getCurrent() {
		return income.longValue();
	}

	public void calcTax(List<Long> listTax) {
		long fullTax = 0;
		if(listTax !=null && listTax.size()>0){
			for(Long tax : listTax){
				fullTax = fullTax + tax;
			}
		}
		income.add(fullTax);
		System.out.printf("\n" + Thread.currentThread().getName() + " добавил данные в отчетность. Общая сумма внесения: " + fullTax);
	}
}
