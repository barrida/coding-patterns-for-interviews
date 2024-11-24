package shipping;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author suleyman.yildirim
 */
public class Discount {

	public static double calculateDiscount(Map<ContainerType, Long> priceList, ShipmentOrder order){

		var environnmentDiscount = getSaveEnvironnmentDiscount(priceList, order);
		//var buyTwoGetOneFreeDiscount =  buyTwoGetOneFreeDiscount();
		return 0.0;

	}

//	private static double buyTwoGetOneFreeDiscount() {
//	}

	public static long getSaveEnvironnmentDiscount(Map<ContainerType, Long> priceList, ShipmentOrder order) {

		var orders = order.getOrders();
		AtomicLong total = new AtomicLong();
		for (Map<ContainerType, Long> o: orders) {
				o.forEach((key, value) -> {
					var isMatch = priceList.containsKey(key);
					if (isMatch) {
						total.addAndGet(value * priceList.get((key)));
					}
				});
		}
		return total.get();
	}

	public static void main(String[] args) {


	}
}
