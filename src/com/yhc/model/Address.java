package com.yhc.model;

/** 
 * @ClassName:     Address 
 * @Description:TODO(������һ�仰��������������) 
 * @author:    zhou-jx
 * @date:        2017��12��11�� ����9:01:50 
 *  
 */
public class Address {
private int id;
private String name;
private String phone;
private String postcode;
//ֱ�Ӹ�user����,������user_id
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
