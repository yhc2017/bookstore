package com.yhc.model;

import java.util.List;

/** 
 * @ClassName:     User 
 * @Description:TODO(这里用一句话描述这个类的作用) 
 * @author:    zhou-jx
 * @date:        2017年12月11日 下午9:02:02 
 *  
 */
public class User {
private int id;//id
private String username;
private String password;
private String nickname;//昵称
private int type;//1表示管理员,2表示注册用户
private List<Address> addresses;
public List<Address> getAddresses() {
return addresses;
}
public void setAddresses(List<Address> addresses) {
this.addresses = addresses;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getUsername() {
return username;
}
public void setUsername(String username) {
this.username = username;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}
public String getNickname() {
return nickname;
}
public void setNickname(String nickname) {
this.nickname = nickname;
}
public int getType() {
return type;
}
public void setType(int type) {
this.type = type;
}
}
