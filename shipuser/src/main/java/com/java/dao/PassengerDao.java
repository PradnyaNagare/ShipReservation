package com.java.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.java.beans.Passenger;

@Repository
public class PassengerDao {
	@Autowired
JdbcTemplate template1;
public void setTemplate(JdbcTemplate template1) {
  this.template1 = template1;
}
public int save(Passenger q){
  String sql="insert into SRS_TBL_Passenger(reservationId,scheduleId,name,age,gender) values('"+q.getReservationId()+"','"+q.getScheduleId()+"','"+q.getName()+"','"+q.getAge()+"','"+q.getGender()+"')";
  return template1.update(sql);
}
public int update(Passenger q){
  String sql="update SRS_TBL_Passenger set scheduleId='"+q.getScheduleId()+"', name='"+q.getName()+"',age='"+q.getAge()+"',gender='"+q.getGender()+"' where reservationId='"+q.getReservationId()+"'";
  return template1.update(sql);
}
public int delete(int reservationId){
  String sql="delete from SRS_TBL_Passenger where reservationId="+reservationId+"";
  return template1.update(sql);
}
public Passenger getPassengerById(String reservationId){
  String sql="select * from SRS_TBL_Passenger where reservationId=?";
  return template1.queryForObject(sql, new Object[]{reservationId},new BeanPropertyRowMapper<Passenger>(Passenger.class));
}
public List<Passenger> getPassengers(){
  return template1.query("select * from SRS_TBL_Passenger",new RowMapper<Passenger>(){
    public Passenger mapRow(ResultSet rs, int row) throws SQLException {
      Passenger e=new Passenger();
      e.setReservationId(rs.getInt(1));
      e.setScheduleId(rs.getInt(2));
      e.setName(rs.getString(3));
      e.setAge(rs.getString(4));
      e.setGender(rs.getString(5));
      
      
      return e;
    }
  });
}
}