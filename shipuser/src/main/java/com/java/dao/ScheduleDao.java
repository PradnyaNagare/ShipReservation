package com.java.dao;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.java.beans.Schedule;

@Repository

public class ScheduleDao {
@Autowired
	JdbcTemplate template;
public void setTemplate(JdbcTemplate template) {
  this.template = template;
}
public int save(Schedule q){
  String sql="insert into srs_tbl_schedule(scheduleId,shipId,routeId,startDate) values('"+q.getScheduleId()+"','"+q.getShipId()+"','"+q.getRouteId()+"','"+q.getStartDate()+"')";
  return template.update(sql);
}
public int update(Schedule q){
  String sql="update srs_tbl_schedule set shipId='"+q.getShipId()+"', routeId='"+q.getRouteId()+"',startDate='"+q.getStartDate()+"' where scheduleId='"+q.getScheduleId()+"'";
  return template.update(sql);
}
public int delete(int scheduleId){
  String sql="delete from srs_tbl_schedule where scheduleId="+scheduleId+"";
  return template.update(sql);
}
public Schedule getScheduleByScheduleId(int scheduleId){
  String sql="select * from srs_tbl_schedule where scheduleId=?";
  return template.queryForObject(sql, new Object[]{scheduleId},new BeanPropertyRowMapper<Schedule>(Schedule.class));
}
public List<Schedule> getSchedules(){
  return template.query("select * from srs_tbl_schedule",new RowMapper<Schedule>(){
    public Schedule mapRow(ResultSet rs, int row) throws SQLException {
      Schedule e=new Schedule();
      e.setScheduleId(rs.getInt(1));
      e.setShipId(rs.getInt(2));
      e.setRouteId(rs.getInt(3));
      e.setStartDate(rs.getString(4));
      
      
      
      return e;
    }
  });
}
}
