package com.yhc.model;

/** 
 * @ClassName:     Address 
 * @Description:TODO(这里用一句话描述这个类的作用) 
 * @author:    zhou-jx
 * @date:        2017年12月11日 下午9:01:50 
 *  
 */
public class Address {
private int id;
private String name;
private String phone;
private String postcode;
//直接给user对象,来代替user_id
private User user;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getPhone() {
return phone;
}
public void setPhone(String phone) {
this.phone = phone;
}
public String getPostcode() {
return postcode;
}
public void setPostcode(String postcode) {
this.postcode = postcode;
}
public User getUser() {
return user;
}
public void setUser(User user) {
this.user = user;
}
}
