package com.myblog.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myblog.po.BlogAndCategoryView;
import com.myblog.po.BlogCategory;
import com.myblog.po.Contact;
import com.myblog.po.User;
import com.myblog.service.BlogAndCategoryViewService;
import com.myblog.service.BlogCategoryService;
import com.myblog.service.PageService;
import com.myblog.service.UserService;
import com.utils.PageUtil;

@Controller
@RequestMapping("/adminUI")
public class AdminUIController {
	
	@Autowired UserService userService;
	@Autowired PageService pageService;
	@Autowired BlogAndCategoryViewService viewService;
	@Autowired BlogCategoryService categoryService;
	
	//跳转到管理员登录页面
	@RequestMapping(value="/admin", method={RequestMethod.POST, RequestMethod.GET})
	public String adminLoginPage(User user, Model model, HttpSession session) throws Exception{
		return "forward:/jsp/admin/adminlogin.jsp";
		
	}
	
	//更新用户信息
	@RequestMapping(value="/updateUserInfo", method={RequestMethod.POST, RequestMethod.GET})
	public String updateUserInfo(User user, Model model, HttpSession session) throws Exception{
		return "forward:/jsp/admin/user/updateuserinfo.jsp";
		
	}
	
	//修改用户联系方式
	@RequestMapping(value="/updateUserContact", method={RequestMethod.POST, RequestMethod.GET})
	public String updateUserContact(Model model) throws Exception{
		List<Contact> contacts=userService.selectContacts();
		model.addAttribute("contactList", contacts);
		return "forward:/jsp/admin/user/updateusercontact.jsp";
	}
	
	//修改用户密码
	@RequestMapping(value="/updateUserPassword", method={RequestMethod.POST, RequestMethod.GET})
	public String updateUserPassword(User user, Model model, HttpSession session) throws Exception{
		return "forward:/jsp/admin/user/updateuserpassword.jsp";
		
	}
	
	//注销用户 blogbycategory.jsp
	@RequestMapping(value="/logout", method={RequestMethod.POST, RequestMethod.GET})
	public String logout(User user, Model model, HttpSession session) throws Exception{
		session.invalidate();
		return "redirect:/adminUI/admin";  
	}
	
	
	//博文UI，分页显示所有的博文
	@RequestMapping(value="/blog", method={RequestMethod.POST, RequestMethod.GET})
	public String blog(Model model, HttpSession session) throws Exception{
		PageUtil page=new PageUtil();  //当前页为第一页，一页显示6条
		page.setCurrentPage(1);
		page.setPageSize(5);
		List<BlogAndCategoryView> blogListByCreatetime=pageService.selectByPage(page); 
		int totalPage=pageService.countPage(page); //计算总的页数
		model.addAttribute("blogListByCreatetime", blogListByCreatetime);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("currentPage", 1);
		
		return "forward:/jsp/admin/blog/blogsbypage.jsp";  
	}
	
	//分页处理
	@RequestMapping(value="/page", method={RequestMethod.POST, RequestMethod.GET})
	public String page(PageUtil page, Model model, HttpSession session) throws Exception{
		page.setPageSize(5);
		List<BlogAndCategoryView> blogListByCreatetime=pageService.selectByPage(page); 
		int totalPage=pageService.countPage(page); //计算总的页数
		model.addAttribute("blogListByCreatetime", blogListByCreatetime);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("currentPage", page.getCurrentPage());
		return "forward:/jsp/admin/blog/blogsbypage.jsp";
	}
	
	//修改博文 ,这里还可以同时修改分类，所以还要把所有的分类显示出来
	@RequestMapping(value="/updateBlog", method={RequestMethod.POST, RequestMethod.GET})
	public String updateBlog(BlogAndCategoryView view, Model model, HttpSession session) throws Exception{
		String blogId=view.getBlogId();
		BlogAndCategoryView blogDetail=viewService.selectBolgAndCategoryViewByBlogId(blogId);
		List<BlogCategory> listBlogCategory=categoryService.selectCategories();//查找所有分类
		model.addAttribute("blogDetail",blogDetail);
		model.addAttribute("categoryList",listBlogCategory);
		return "forward:/jsp/admin/blog/updateblog.jsp";
	}
	
	//博文分类UI
	@RequestMapping(value="/blogCategory", method={RequestMethod.POST, RequestMethod.GET})
	public String blogCategory(Model model, HttpSession session) throws Exception{
		List<BlogCategory> listBlogCategory=categoryService.selectCategories();
		for(int i=0;i<listBlogCategory.size();i++){
			String categoryId=listBlogCategory.get(i).getBlogCategoryId();
			int count=categoryService.countBlogByCategoryId(categoryId);
			System.out.println("计数："+count);
			listBlogCategory.get(i).setBlogCategoryMemo(count+""); //将计算的每个分类下的博文数量暂存memo下
		}
		model.addAttribute("categoryList", listBlogCategory);
		model.addAttribute("totalCategories", listBlogCategory.size());
		
		return "forward:/jsp/admin/blog/category.jsp";
	}
	
	//添加博文UI
	@RequestMapping(value="/addBlog", method={RequestMethod.POST, RequestMethod.GET})
	public String addBlog(Model model, HttpSession session) throws Exception{
		List<BlogCategory> listBlogCategory=categoryService.selectCategories();
		model.addAttribute("categoryList", listBlogCategory);
		return "forward:/jsp/admin/blog/addblog.jsp";
	}
	
	
	//查看指定分类下的所有博文，返回分类下的博文标题
	@RequestMapping(value="/blogsByCategory", method={RequestMethod.POST, RequestMethod.GET})
	public String blogsByCategory(String categoryId, Model model, HttpSession session) throws Exception{
		List<BlogAndCategoryView> listBlogAndCategory=viewService.selectBolgAndCategoryViewByCategoryId(categoryId);
		model.addAttribute("listBlogAndCategory", listBlogAndCategory);
		model.addAttribute("category",listBlogAndCategory.get(0));
		return "forward:/jsp/admin/blog/blogbycategory.jsp";
	}
}
