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
import com.myblog.service.BlogService;
import com.myblog.service.PageService;
import com.myblog.service.UserService;
import com.utils.PageUtil;

@Controller
@RequestMapping("/UI")
public class UIController {
	
	@Autowired BlogService blogService;
	@Autowired PageService pageService;
	@Autowired BlogAndCategoryViewService viewService;
	@Autowired BlogCategoryService categoryService;
	@Autowired UserService userService;
	
	//跳转到首页
	@RequestMapping(value="/index", method={RequestMethod.POST, RequestMethod.GET})
	public String index(Model model, HttpSession session) throws Exception{
		PageUtil page=new PageUtil();  //默认当前页为第一页，页大小为10
		
		List<BlogAndCategoryView> blogListByCreatetime=pageService.selectByPage(page); 
		int totalPage=pageService.countPage(page); //计算总的页数
		model.addAttribute("blogListByCreatetime", blogListByCreatetime);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("currentPage", 1);
		
		//用于显示右边的posts categories tags 
		User userInfo=userService.findUserInfo("luoyumin"); //用户信息
		
		int totalCount=pageService.countAll();//总博文数
		int categories=categoryService.countCategories();//总的分类数
		userInfo.setUserMemo(totalCount+"");//临时存总的博文数
		userInfo.setUserAccount(categories+"");//临时存总的分类数
		
		session.setAttribute("userInfo", userInfo);
		
		return "forward:/jsp/index.jsp";
	}
	
	//分页处理
	@RequestMapping(value="/page", method={RequestMethod.POST, RequestMethod.GET})
	public String page(PageUtil page, Model model, HttpSession session) throws Exception{
		//System.out.println("当前页:"+page.getCurrentPage());
		//page.setPageSize(10);
		List<BlogAndCategoryView> blogListByCreatetime=pageService.selectByPage(page); 
		int totalPage=pageService.countPage(page); //计算总的页数
		model.addAttribute("blogListByCreatetime", blogListByCreatetime);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("currentPage", page.getCurrentPage());
		return "forward:/jsp/index.jsp";
	}
	
	//查看首页的详细博文 
	@RequestMapping(value="/detail", method={RequestMethod.POST, RequestMethod.GET})
	public String detail(BlogAndCategoryView view, Model model, HttpSession session) throws Exception{
		String blogId=view.getBlogId();
		BlogAndCategoryView blogDetail=viewService.selectBolgAndCategoryViewByBlogId(blogId);
		model.addAttribute("blogDetail",blogDetail);
		return "forward:/jsp/blog/detailblog.jsp";
	}
	
	//分类
	@RequestMapping(value="/category", method={RequestMethod.POST, RequestMethod.GET})
	public String category(Model model, HttpSession session) throws Exception{
		List<BlogCategory> listBlogCategory=categoryService.selectCategories();
		for(int i=0;i<listBlogCategory.size();i++){
			String categoryId=listBlogCategory.get(i).getBlogCategoryId();
			int count=categoryService.countBlogByCategoryId(categoryId);
			System.out.println("计数："+count);
			listBlogCategory.get(i).setBlogCategoryMemo(count+""); //将计算的每个分类下的博文数量暂存memo下
		}
		model.addAttribute("categoryList", listBlogCategory);
		model.addAttribute("totalCategories", listBlogCategory.size());
		
		return "forward:/jsp/blog/category.jsp";
	}
	
	//查看指定分类下的所有博文，返回分类下的博文标题
	@RequestMapping(value="/blogsByCategory", method={RequestMethod.POST, RequestMethod.GET})
	public String blogsByCategory(String categoryId, Model model, HttpSession session) throws Exception{
		List<BlogAndCategoryView> listBlogAndCategory=viewService.selectBolgAndCategoryViewByCategoryId(categoryId);
		model.addAttribute("listBlogAndCategory", listBlogAndCategory);
		model.addAttribute("category",listBlogAndCategory.get(0));
		return "forward:/jsp/blog/blogbycategory.jsp";
	}
	
	//联系方式
	@RequestMapping(value="/contact", method={RequestMethod.POST, RequestMethod.GET})
	public String contact(Model model, HttpSession session) throws Exception{
		List<Contact> contacts=userService.selectContacts();
		model.addAttribute("contacts", contacts);
		return "forward:/jsp/user/contact.jsp";
	}

	//关于我
	@RequestMapping(value="/aboutme", method={RequestMethod.POST, RequestMethod.GET})
	public String aboutme(Model model, HttpSession session) throws Exception{
		
		return "forward:/jsp/user/aboutme.jsp";
	}
	

	
	
}
