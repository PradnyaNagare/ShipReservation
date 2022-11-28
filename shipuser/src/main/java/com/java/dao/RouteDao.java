package com.java.dao;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.java.beans.Route;

@Repository
public class RouteDao {
	@Autowired
JdbcTemplate template;
public void setTemplate(JdbcTemplate template) {
  this.template = template;
}
public int save(Route p){
  String sql="insert into srs_tbl_route(routeId,source,destination,travelDuration,fare) values('"+p.getRouteId()+"','"+p.getSource()+"','"+p.getDestination()+"','"+p.getTravelDuration()+"','"+p.getFare()+"')";
  return template.update(sql);
}
public int update(Route p){
  String sql="update srs_tbl_route set source='"+p.getSource()+"', destination='"+p.getDestination()+"',travelDuration='"+p.getTravelDuration()+"',fare='"+p.getFare()+"' where routeId='"+p.getRouteId()+"'";
  return template.update(sql);
}
public int delete(int routeId){
  String sql="delete from srs_tbl_route where routeId="+routeId+"";
  return template.update(sql);
}
public Route getRouteByRouteId(int routeId){
  String sql="select * from srs_tbl_route where routeId=?";
  return template.queryForObject(sql, new Object[]{routeId},new BeanPropertyRowMapper<Route>(Route.class));
}
public List<Route> getRouteDetails(){
  return template.query("select * from srs_tbl_route",new RowMapper<Route>(){
    public Route mapRow(ResultSet rs, int row) throws SQLException {
    	Route e=new Route();
      e.setRouteId(rs.getString(1));
      e.setSource(rs.getString(2));
      e.setDestination(rs.getString(3));
      e.setTravelDuration(rs.getString(4));
      e.setFare(rs.getString(5));
      
      return e;
    }

	
  });
}
 
}
