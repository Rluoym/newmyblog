package com.myblog.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myblog.po.Contact;
import com.myblog.po.ContactExtend;
import com.myblog.po.User;
import com.myblog.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired UserService userService;
	
	
	//用户登录
	@RequestMapping(value="/login", method={RequestMethod.POST, RequestMethod.GET})
	public String login(User user, Model model, HttpSession session) throws Exception{
		user=userService.login(user.getUserPassword(), user.getUserAccount());
		if(user!=null){
			session.setAttribute("userInfo", user);
			return "redirect:/jsp/admin/adminmain.jsp";
		}else
			return "forward:/adminUI/admin";
		
	}
	
	//修改用户信息
	@RequestMapping(value="/updateUserInfo", method={RequestMethod.POST, RequestMethod.GET})
	public String updateUserInfo(User user, Model model, HttpSession session) throws Exception{
		//这样更新的话因为传的是一个对象user，如果像密码
		//这样的不能为空字段不更新的话也必须传值，所以这里需要先读一下数据库以前的值填充给user对象
		User sessionUser=(User) session.getAttribute("userInfo");
		//User oldUserInfo=userService.findUserInfo(sessionUser.getUserAccount());
		user.setUserPassword(sessionUser.getUserPassword());
		user.setUserAccount(sessionUser.getUserAccount());
		//user.setUserContactId(oldUserInfo.getUserContactId());
		user=userService.updateInfo(user);
		session.setAttribute("userInfo", user);
		return "forward:/jsp/admin/admimain.jsp";
	}
	
	//异步判断，先判断原先的密码正不正确。
	@RequestMapping(value="/isPasswordRight", method={RequestMethod.POST, RequestMethod.GET})
	public @ResponseBody boolean isPasswordRight(String userPassword, Model model, HttpSession session) throws Exception{
		System.out.println("用户密码:"+userPassword);
		
		boolean isPasswordRight=userService.isPasswordRight(userPassword);
		System.out.println("密码是否正确:"+isPasswordRight);
		return isPasswordRight;
	}
	
	//修改用户密码
	@RequestMapping(value="/updatePassword", method={RequestMethod.POST, RequestMethod.GET})
	public String updatePassword(String userPasswordNew, String userPasswordNewConfirm ,Model model, HttpSession session) throws Exception{
		User user=(User)session.getAttribute("userInfo");
		if(!userPasswordNew.equals(userPasswordNewConfirm))
			return "密码不一致!";
		User oldUserInfo=userService.findUserInfo(user.getUserAccount());
		boolean isUpdateSuccess=userService.updatePassword(oldUserInfo, userPasswordNew);
		if(isUpdateSuccess)
			return "redirect:/adminUI/admin";
		else
			return "forward:/jsp/admin/user/updateuserpassword.jsp";
	}
	
	//添加用户联系方式
	@RequestMapping(value="/addUserContact", method={RequestMethod.POST, RequestMethod.GET})
	public String addUserContact(Contact contact, Model model, HttpSession session) throws Exception{
		userService.addContact(contact);
		return "forward:/jsp/admin/user/addusercontact.jsp";
	}
	
	//更新用户联系方式,页面的name属性定义为 name="contactList[${i.index }].userContactId"，参数绑定给同名为contactList的数组====》即UserExtend类中的private List<Contact> contactList;。
	@RequestMapping(value="/updateUserContact", method={RequestMethod.POST, RequestMethod.GET})
	public String updateUserContact(ContactExtend contactExtend, Model model, HttpSession session) throws Exception{

		userService.updateContact(contactExtend.getContactList());
		model.addAttribute("contactList", contactExtend.getContactList());
		return "forward:/jsp/admin/user/updateusercontact.jsp";
	}

	
	//删除联系方式
	@RequestMapping(value="/deleteContact", method={RequestMethod.POST, RequestMethod.GET})
	public String deleteContact(String userContactId, Model model, HttpSession session) throws Exception{
		userService.deleteContact(userContactId);
		
		return "forward:/jsp/user/test.jsp";
	}
	
	//批量删除联系方式
	@RequestMapping(value="/deleteContacts", method={RequestMethod.POST, RequestMethod.GET})
	public String deleteContacts(String [] userContactIds, Model model, HttpSession session) throws Exception{
		for(int i=0;i<userContactIds.length;i++)
			userService.deleteContact(userContactIds[i]);
		return "forward:/jsp/user/test.jsp";
	}
	
	//根据id查看联系信息
	@RequestMapping(value="/viewContacts", method={RequestMethod.POST, RequestMethod.GET})
	public String viewContacts(Contact contact, Model model, HttpSession session) throws Exception{
		List<Contact> contactList=userService.selectContacts();
		model.addAttribute("contactList", contactList);
		return "forward:/jsp/user/test.jsp";
	}
	
		
}
