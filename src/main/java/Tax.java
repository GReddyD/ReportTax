import java.util.List;
import java.util.concurrent.atomic.LongAdder;

public class Tax {
	LongAdder income = new LongAdder();

	public long getCurrent() {
		return income.sum();
	}

	public void calcTax(List<Long> listTax) {
		if(listTax !=null && listTax.size()>0){
			for(Long tax : listTax){
				income.add(tax);
			}
		}
	}
}
