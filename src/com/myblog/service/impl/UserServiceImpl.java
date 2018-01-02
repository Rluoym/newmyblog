package com.myblog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.myblog.mapper.ContactExtendMapper;
import com.myblog.mapper.ContactMapper;
import com.myblog.mapper.UserMapper;
import com.myblog.po.Contact;
import com.myblog.po.ContactExtend;
import com.myblog.po.User;
import com.myblog.po.UserExample;
import com.myblog.service.UserService;
import com.utils.GenerateRandomID;
import com.utils.ServiceUtilsMD5;

public class UserServiceImpl implements UserService {

	@Autowired UserMapper userMapper;
	@Autowired ContactMapper contactMapper;
	@Autowired ContactExtendMapper contactExtendMapper;
	
	//用户登录
	/* (non-Javadoc)
	 * @see com.myblog.service.impl.UserService#login(java.lang.String, java.lang.String)
	 */
	@Override
	public User login(String password, String userAccount) throws Exception{
		UserExample conditon=new UserExample();
		UserExample.Criteria criteria=conditon.createCriteria();
		criteria.andUserAccountEqualTo(userAccount);
		criteria.andUserPasswordEqualTo(ServiceUtilsMD5.md5(password));
		List<User> listUser=userMapper.selectByExample(conditon);
		System.out.println("mima:"+ServiceUtilsMD5.md5(password));
		return listUser.isEmpty() ? null:listUser.get(0); //三元操作，true就返回null
	}

	//修改个人信息
	@Override
	public User updateInfo(User user) throws Exception {
		// TODO Auto-generated method stub
		int count=userMapper.updateByPrimaryKey(user);
		return count==0 ? null : user;
	}

	//修改密码
	@Override
	public boolean updatePassword(User user, String newPassword) throws Exception {
		// TODO Auto-generated method stub
		UserExample updateCondition=new UserExample();
		String oldPassword=user.getUserPassword(); //已经是md5加密的密码了
		user.setUserPassword(ServiceUtilsMD5.md5(newPassword));
		
		UserExample.Criteria criteria=updateCondition.createCriteria();
		criteria.andUserPasswordEqualTo(oldPassword);
		int updateCount=userMapper.updateByExample(user, updateCondition);
		return updateCount==0 ? false:true;
	}

	//匹配旧密码
	@Override
	public boolean isPasswordRight(String password) throws Exception {
		// TODO Auto-generated method stub
		UserExample condition =new UserExample();
		UserExample.Criteria criteria=condition.createCriteria();
		criteria.andUserPasswordEqualTo(ServiceUtilsMD5.md5(password));
		
		List<User> list=userMapper.selectByExample(condition);
		
		return list.isEmpty() ? false : true; //如果为空，则证明密码不正确
	}

	//查找用户的所有信息
	@Override
	public User findUserInfo(String userAccount) throws Exception {
		// TODO Auto-generated method stub
		
		return userMapper.selectByPrimaryKey(userAccount);
	}

	@Override
	public Contact addContact(Contact contactInfo) throws Exception {
		// TODO Auto-generated method stub
		contactInfo.setUserContactId(GenerateRandomID.generateRandomID());
		int addCount=contactMapper.insert(contactInfo);
		return addCount ==0 ? null:contactInfo;
	}

	@Override
	public void updateContact(List<Contact> contactList) throws Exception {
		// TODO Auto-generated method stub
		for(int i=0;i<contactList.size();i++)
			contactMapper.updateByPrimaryKey(contactList.get(i));
	}

	@Override
	public void deleteContact(String contactId) throws Exception {
		// TODO Auto-generated method stub
		contactMapper.deleteByPrimaryKey(contactId);
	}

	@Override
	public void deleteContacts(String[] contactIds) throws Exception {
		// TODO Auto-generated method stub
		for(int i=0;i<contactIds.length;i++){
			contactMapper.deleteByPrimaryKey(contactIds[i]);
		}
	}

	@Override
	public List<Contact> selectContacts() throws Exception {
		// TODO Auto-generated method stub
		return contactMapper.selectByExample(null); //相当于select * from contact
	}

	@Override
	public Contact selectContact(String contactId) throws Exception {
		// TODO Auto-generated method stub
		return contactMapper.selectByPrimaryKey(contactId);
	}

	@Override
	public List<ContactExtend> selectContacts2() throws Exception {
		// TODO Auto-generated method stub
		return contactExtendMapper.findContactsByContactExtend();//调用自己写的mapper
	}
}
