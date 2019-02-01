package Java.DB;

public class ConnPool {
	
	/*
	@Author - Oriel
	*/
	
	private static ConnPool instance = new ConnPool();
	
	private ConnPool() {
	}
	
	public static ConnPool getInstance() {
		return instance;
	}
	
	

}