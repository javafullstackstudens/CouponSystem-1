package Java.DB.DAO;
import java.util.Set;
import Java.JavaBeans.*;

public interface CompanyDAO {
	
	/*
	@Author - Oriel
	*/
      

		void insertCompany(Company company) throws Exception;

		void removeCompany(Company company) throws Exception;

		void updateCompany(Company company) throws Exception;

		Coupon getCompany(long id) throws Exception;
		
		Set<Coupon> getAllCompanies() throws Exception;

		
	}