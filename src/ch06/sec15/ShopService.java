package ch06.sec15;

public class ShopService {
	
	private static ShopService ShopService = new ShopService();

	private ShopService() {
		
	}
	
	public static ShopService getInstance() {
		return ShopService;
	}
}
