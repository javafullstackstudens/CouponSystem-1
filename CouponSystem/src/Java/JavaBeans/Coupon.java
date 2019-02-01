package Java.JavaBeans;
import java.util.Date;

/*
 * @Author - Oriel
 */


public class Coupon {

	// Attributes 
	
	private long id;
	private String title;
	private Date startDate;
	private Date endDate;
	private int amount;
	private CouponType type;
	private String message;
	private double price;
	private String image;
	private String getStringType;
	
	// Ctors
	
	public Coupon() {
	}
	
	public Coupon(long id, String title, Date startdate, Date enddate, int amount, CouponType CouponType, String message, double price, String image) {
		this.id = id;
		this.title = title;
		this.startDate = startdate;
		this.endDate = enddate;
		this.amount = amount;
		this.type = CouponType;
		this.message = message;
		this.price = price;
		this.image = image;
	}
	
	
	// Methods
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getStartDate() {
		return  startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public CouponType getType() {
		return type;
	}
	public void setType(CouponType couponType) {
		this.type = couponType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	

	@Override
	// ToString to display coupon's details
		public String toString() {
			return "Id:"+getId()+
					", Title:"+getTitle()+
					", Type:"+getType()+
					", Start:"+getStartDate()+
					", End:"+getEndDate()+
					", Amount:"+getAmount()+
					", Price:"+getPrice();
		}

	
	public String getGetStringType() {
		return getStringType;
	}

	public void setGetStringType(String getStringType) {
		this.getStringType = getStringType;
	}
	
	

	
	
}