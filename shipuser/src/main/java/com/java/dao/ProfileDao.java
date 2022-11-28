package com.java.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.beans.Profile;

@Repository
public class ProfileDao {
	@Autowired
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
  this.template = template;
}
public int save(Profile p){
  String sql="insert into SRS_TBL_User_Profile(userId,firstName,lastName,dateOfBirth,gender,street,location,city,state,pincode,mobileNo,emailId) values('"+p.getUserId()+"','"+p.getFirstName()+"','"+p.getLastName()+"','"+p.getDateOfBirth()+"','"+p.getGender()+"','"+p.getStreet()+"','"+p.getLocation()+"','"+p.getCity()+"','"+p.getState()+"','"+p.getPincode()+"','"+p.getMobileNo()+"','"+p.getEmailId()+"')";
  return template.update(sql);
}
public int update(Profile p){
  String sql="update SRS_TBL_User_Profile set firstName='"+p.getFirstName()+"', lastName='"+p.getLastName()+"',dateOfBirth='"+p.getDateOfBirth()+"',gender='"+p.getGender()+"',street='"+p.getStreet()+"',location='"+p.getLocation()+"',city='"+p.getCity()+"',state='"+p.getState()+"',pincode='"+p.getPincode()+"',mobileNo='"+p.getMobileNo()+"',emailId='"+p.getEmailId()+"' where userId='"+p.getUserId()+"'";
  return template.update(sql);
}
public int delete(int userId){
  String sql="delete from SRS_TBL_User_Profile where userId="+userId+"";
  return template.update(sql);
}
public Profile getProfileByUserId(int userId){
  String sql="select * from SRS_TBL_User_Profile where userId=?";
  return template.queryForObject(sql, new Object[]{userId},new BeanPropertyRowMapper<Profile>(Profile.class));
}
public List<Profile> getUsers(){
  return template.query("select * from SRS_TBL_User_Profile",new RowMapper<Profile>(){
    public Profile mapRow(ResultSet rs, int row) throws SQLException {
      Profile e=new Profile();
      e.setUserId(rs.getInt(1));
      e.setFirstName(rs.getString(2));
      e.setLastName(rs.getString(3));
      e.setDateOfBirth(rs.getString(4));
      e.setGender(rs.getString(5));
      e.setStreet(rs.getString(6));
      e.setLocation(rs.getString(7));
      e.setCity(rs.getString(8));
      e.setState(rs.getString(9));
      e.setPincode(rs.getString(10));
      e.setMobileNo(rs.getString(11));
      e.setEmailId(rs.getString(12));
      
      return e;
    }
  });
}

}
