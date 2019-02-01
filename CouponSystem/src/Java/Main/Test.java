package Java.Main;



import Java.DB.DBDAO.CouponDBDAO;
import Java.JavaBeans.Coupon;
import Java.JavaBeans.CouponType;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
		CouponDBDAO couponDB = new CouponDBDAO();
        Coupon c3 = new Coupon(415,"Fedrik 50% less" , Utils.getCurrentDate() , Utils.getExpiredDate(), 500, CouponType.RESTURANTS , "This coupon bla bla", 200, "image.png");
		
        
        System.out.println(Utils.getCurrentDate());
        System.out.println( Utils.getExpiredDate());
       // couponDB.createCoupon(c3);
       couponDB.getCoupon(15);
		
	}

}
