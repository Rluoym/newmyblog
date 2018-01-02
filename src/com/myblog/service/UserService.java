package com.myblog.service;

import java.util.List;

import com.myblog.po.Contact;
import com.myblog.po.ContactExtend;
import com.myblog.po.User;

public interface UserService {

	//用户登录
	User login(String password, String userAccount) throws Exception;
	
	//修改个人资料
	User updateInfo(User user) throws Exception;
	
	//修改密码
	boolean updatePassword(User user, String password2) throws Exception;
	
	//匹配旧密码
	boolean isPasswordRight(String password) throws Exception;
	
	//查找用户的所有信息
	User findUserInfo(String userAccount) throws Exception;
	
	//添加用户联系方式
	Contact addContact(Contact contactInfo) throws Exception;
	
	//修改联系方式
	void updateContact(List<Contact> contactList) throws Exception;
	
	//删除联系方式
	void deleteContact(String contactId) throws Exception;
	
	//批量删除联系方式
	void deleteContacts(String [] contactIds) throws Exception;
	
	//查看用户所有的联系信息
	List<Contact> selectContacts() throws Exception;
	
	//查看用户所有的联系信息2，返回ContactExtend List
	List<ContactExtend> selectContacts2() throws Exception;
	
	//根据id查看用户信息
	Contact selectContact(String contactId) throws Exception;
}