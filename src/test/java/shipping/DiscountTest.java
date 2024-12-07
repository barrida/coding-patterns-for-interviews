package shipping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author suleyman.yildirim
 */
class DiscountTest {

	private Map<ContainerType, Long> priceList;
	private ShipmentOrder order;

	@Test void calculateDiscount() {

		// Initialize price list with sample data
		priceList = new HashMap<>();
		priceList.put(ContainerType.TWENTY_FLEET, 5000L);
		priceList.put(ContainerType.FORTY_FLEET, 9000L);

		var order = new ShipmentOrder();
		Map<ContainerType, Long> orderMap = new HashMap<>();
		orderMap.put(ContainerType.TWENTY_FLEET, 2L);
		orderMap.put(ContainerType.TWENTY_FLEET_BIOFUEL, 3L);
		orderMap.put(ContainerType.FORTY_FLEET, 7L);
		order.setOrders(List.of(orderMap));

		// 10000 + 7*9000 = 63000 +

		var res = Discount.getSaveEnvironnmentDiscount(priceList, order);
		assertEquals(10L, res);



	}

	@Test void getSaveEnvironnmentDiscount() {
	}
}