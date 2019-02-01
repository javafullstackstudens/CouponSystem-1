package Java.DB.DAO;

import java.util.Set;

import Java.JavaBeans.Coupon;

public interface CouponDAO {


	void insertCoupon(Coupon coupon) throws Exception;

	void removeCoupon(Coupon coupon) throws Exception;

	void updateCoupon(Coupon coupon) throws Exception;

	Coupon getCoupon(int id) throws Exception;
	
	Set<Coupon> getAllCoupouns() throws Exception;
	
	
}