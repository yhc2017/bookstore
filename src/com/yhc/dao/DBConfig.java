
package com.yhc.dao;

/**
 * ��Ŀ����: librarymanagesystem
 * ������: DBConfig
 * ������: MySql���ݿ����ýӿ�
 * ������: 
 * �޸���: 
 * �޸�ʱ��: 2017��6��18�� ����10:28:07
 * �޸ı�ע: 
 * @version 1.0.0
 */
public interface DBConfig {
	//MySql���ݿ�����
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/javaweb?useUnicode=true&characterEncoding=UTF-8";
	String user="root";
	String password="123456";

}
