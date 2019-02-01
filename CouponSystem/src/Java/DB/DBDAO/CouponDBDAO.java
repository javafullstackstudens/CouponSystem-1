package Java.DB.DBDAO;

import java.sql.Connection;


import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Set;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Java.DB.Database;
import Java.DB.DAO.CouponDAO;
import Java.JavaBeans.Coupon;
import Java.JavaBeans.CouponType;
import Java.Main.Utils;

/**
@Author - Oriel
*/

public class CouponDBDAO implements CouponDAO {
	
	
	//Attributes
	
	JPanel panel = new JPanel();
	private Connection conn;
	
	
	
	// Methods that DBDAO Must use from DAO

	@Override
        public void createCoupon(Coupon coupon) throws Exception{
		conn = DriverManager.getConnection(Utils.getDBUrl());
		String query = "INSERT INTO COUPON (TITLE,START_DATE,END_DATE,AMOUNT,TYPE,MESSAGE,PRICE,IMAGE) VALUES(?,?,?,?,?,?,?,?)";
        try{
        	PreparedStatement pstmt = conn.prepareStatement(query);
        
        	pstmt.setString(1, coupon.getTitle());
			pstmt.setDate(2, (Date) coupon.getStartDate());
			pstmt.setDate(3, (Date) coupon.getEndDate());
			pstmt.setInt(4, coupon.getAmount());
			pstmt.setString(5, coupon.getType().name());	
			pstmt.setString(6, coupon.getMessage());
			pstmt.setDouble(7, coupon.getPrice());
			pstmt.setString(8, coupon.getImage());	
		    pstmt.executeUpdate();
		    pstmt.close();
		    // Getting Coupon ID
		    
		    System.out.println("Coupon " + coupon.getTitle() + " created successfully");
			
        }catch(SQLException e) {
        	System.out.println(e.getLocalizedMessage());
        	System.out.println(e.getMessage());
        } finally {
        	conn.close();
        }
	}

	
	
	@Override
	public void removeCoupon(Coupon coupon) throws Exception {
		conn = DriverManager.getConnection(Utils.getDBUrl());
		try {
			String query = 
					"DELETE FROM Customer_Coupon WHERE COUPON_ID=?;"
					+ "DELETE FROM Company_Coupon WHERE COUPON_ID=?;"
					+ "DELETE FROM Coupon WHERE ID=?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setLong(1, coupon.getId());
			pstmt.setLong(2, coupon.getId());
			pstmt.setLong(3, coupon.getId());
			pstmt.executeUpdate();
			pstmt.close();
			System.out.println("Coupon was removed from all 3 tables.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			conn.close();
		}
	}
	

	@Override
	public void updateCoupon(Coupon coupon) throws Exception {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public Set<Coupon> getAllCoupouns() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Coupon getCoupon(long id) throws Exception {
		conn = DriverManager.getConnection(Utils.getDBUrl());
		Coupon coupon = new Coupon();
		try (Statement stm = conn.createStatement()) {
			String query = "SELECT * FROM Coupon WHERE ID=" + id;
			ResultSet rs = stm.executeQuery(query);
			rs.next();

			coupon.setId(rs.getLong(1));
			coupon.setTitle(rs.getString(2));
			coupon.setStartDate(rs.getDate(3));
			coupon.setEndDate(rs.getDate(4));
			coupon.setAmount(rs.getInt(5));
			coupon.setType(CouponType.valueOf(rs.getString("Type")));
			coupon.setMessage(rs.getString(7));
			coupon.setPrice(rs.getDouble(8));
			coupon.setImage(rs.getString(9));
			
		
		JOptionPane.showMessageDialog(panel, coupon.toString());
      
		} catch (SQLException e) {
			// Handle exception !!!
			throw new Exception("Unable to get coupon data");
		} finally {
			conn.close();
		}
		return coupon;
	}



}