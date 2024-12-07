package shipping;

import java.util.List;
import java.util.Map;

/**
 * @author suleyman.yildirim
 */

public class ShipmentOrder {

	private List<Map<ContainerType, Long>> orders;

	public List<Map<ContainerType, Long>> getOrders() {
		return orders;
	}

	public void setOrders(List<Map<ContainerType, Long>> orders) {
		this.orders = orders;
	}
}
