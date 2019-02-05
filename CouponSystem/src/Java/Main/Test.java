package Java.Main;

import Java.DB.Database;
import Java.DB.DBDAO.*;
import Java.Facade.CompanyFacade;
import Java.JavaBeans.*;

public class Test {

	public static void main(String[] args) throws Exception {
		
		
		// Database.getDatabase();
		
		Coupon coupon3 = new Coupon(2, "Fedrik 50% less", Utils.getCurrentDate(), Utils.getExpiredDate(), 500,	CouponType.RESTURANTS, "This coupon bla bla", 200, "image.png", 1);
		
		CouponDBDAO couponDB = new CouponDBDAO();
		
		Company company1 = new Company(445, "Mac", "1234", "mac@mac.com");
		
		CompanyFacade cf = new CompanyFacade();

		// System.out.println(Utils.getCurrentDate());
		// System.out.println( Utils.getExpiredDate());
      //  cf.createCompany(company1);
		couponDB.createCoupon(coupon3);

		// cf.createCompany(c1);

	}

}
