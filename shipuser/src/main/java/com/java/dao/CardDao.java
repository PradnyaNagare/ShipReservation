package com.java.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.java.beans.Card;

@Repository
public class CardDao {
	@Autowired
JdbcTemplate template;
public void setTemplate(JdbcTemplate template) {
  this.template = template;
}
public int save(Card c){
  String sql="insert into SRS_TBL_CreditCard(creditCardNumber,validFrom,validTo,balance,userId) values('"+c.getCreditCardNumber()+"','"+c.getValidFrom()+"','"+c.getValidTo()+"','"+c.getBalance()+"','"+c.getUserId()+"')";
  return template.update(sql);
}
public int update(Card c){
  String sql="update SRS_TBL_CreditCard set creditCardNumber='"+c.getCreditCardNumber()+"', validFrom='"+c.getValidFrom()+"',validTo='"+c.getValidTo()+"',balance='"+c.getBalance()+"' where userId='"+c.getUserId()+"'";
  return template.update(sql);
}
public int delete(int userId){
  String sql="delete from SRS_TBL_CreditCard where userId="+userId+"";
  return template.update(sql);
}
public Card getCardById(String userId){
  String sql="select * from SRS_TBL_CreditCard where userId=?";
  return template.queryForObject(sql, new Object[]{userId},new BeanPropertyRowMapper<Card>(Card.class));
}
public List<Card> getCards(){
  return template.query("select * from SRS_TBL_CreditCard",new RowMapper<Card>(){
    public Card mapRow(ResultSet rs, int row) throws SQLException {
    	Card e=new Card();
      e.setCreditCardNumber(rs.getString(1));
      e.setValidFrom(rs.getString(2));
      e.setValidTo(rs.getString(3));
      e.setBalance(rs.getString(4));
      e.setUserId(rs.getString(5));
      
      
      
      return e;
    }
  });
}
}