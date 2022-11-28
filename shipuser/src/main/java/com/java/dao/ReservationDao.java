package com.java.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.java.beans.Reservation;

@Repository
public class ReservationDao {
	@Autowired
JdbcTemplate template;
public void setTemplate(JdbcTemplate template) {
  this.template = template;
}
public int save(Reservation r){
  String sql="insert into SRS_TBL_Reservation(reservationId,scheduleId,userId,bookingDate,journeydate,noOfSeats,totalFare,bookingStatus) values('"+r.getReservationId()+"','"+r.getScheduleId()+"','"+r.getUserId()+"','"+r.getBookingDate()+"','"+r.getJourneyDate()+"','"+r.getNoOfSeats()+"','"+r.getTotalFare()+"','"+r.getBookingStatus()+"')";
  return template.update(sql);
}
public int update(Reservation r){
  String sql="update SRS_TBL_Reservation set scheduleId='"+r.getScheduleId()+"', userId='"+r.getUserId()+"',bookingDate='"+r.getBookingDate()+"',journeyDate='"+r.getJourneyDate()+"',noOfSeats='"+r.getNoOfSeats()+"',totalFare='"+r.getTotalFare()+"',bookingStatus='"+r.getBookingStatus()+"' where reservationId='"+r.getReservationId()+"'";
  return template.update(sql);
}
public int delete(int reservationId){
  String sql="delete from SRS_TBL_Reservation where reservationId="+reservationId+"";
  return template.update(sql);
}
public Reservation getReservationById(String reservationId){
  String sql="select * from SRS_TBL_Reservation where reservationId=?";
  return template.queryForObject(sql, new Object[]{reservationId},new BeanPropertyRowMapper<Reservation>(Reservation.class));
}
public List<Reservation> getReservations(){
  return template.query("select * from SRS_TBL_Reservation",new RowMapper<Reservation>(){
    public Reservation mapRow(ResultSet rs, int row) throws SQLException {
    	Reservation e=new Reservation();
      e.setReservationId(rs.getInt(1));
      e.setScheduleId(rs.getInt(2));
      e.setUserId(rs.getInt(3));
      e.setBookingDate(rs.getString(4));
      e.setJourneyDate(rs.getString(5));
      e.setNoOfSeats(rs.getString(6));
      e.setTotalFare(rs.getString(7));
      e.setBookingStatus(rs.getString(8));
      
      
      return e;
    }
  });
}
}