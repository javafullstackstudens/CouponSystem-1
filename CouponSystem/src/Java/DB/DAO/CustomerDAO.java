package Java.DB.DAO;
import java.util.Set;
import Java.JavaBeans.*;

public interface CustomerDAO {

	/*
	@Author - Oriel
	*/
	
	void insertCustomer(Customer customer) throws Exception;

	void removeCustomer(Customer customer) throws Exception;

	void updateCustomer(Customer customer) throws Exception;

	Coupon getCustomer(long id) throws Exception;
	
	Set<Coupon> getAllCustomers() throws Exception;
	
	
}