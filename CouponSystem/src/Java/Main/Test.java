package Java.Main;



import Java.DB.DBDAO.*;
import Java.Facade.CompanyFacade;
import Java.JavaBeans.*;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
//		CouponDBDAO couponDB = new CouponDBDAO();
//        Coupon c3 = new Coupon(415,"Fedrik 50% less" , Utils.getCurrentDate() , Utils.getExpiredDate(), 500, CouponType.RESTURANTS , "This coupon bla bla", 200, "image.png");
		Company c1 = new Company(445, "Mac", "1234", "mac@mac.com");
        
        System.out.println(Utils.getCurrentDate());
        System.out.println( Utils.getExpiredDate());
       // couponDB.createCoupon(c3);
      
        CompanyFacade cf = new CompanyFacade();
        
        cf.insertCompany(c1);
        
   
      
		
	}

}
