package com.utils;

/**
 * 
 * @author Mr Luo
 * 分页工具类
 */
public class PageUtil {
	 
	// 当前页  
	private int currentPage = 1;
	
	// 每页显示记录的条数  
	private int pageSize = 10; 
	
	// 总的记录条数   
	private int totalCount; 
	
	// 总的页数    
	private int totalPageCount; 

/************************************各种构造方法****************************/	
	
	
	public PageUtil(int pageCurrent) {
		super();
		this.currentPage = pageCurrent;
	}
	
	public PageUtil() {
		super();
	}

	public PageUtil(int pageCurrent, int totalPageCount) {
		super();
		this.currentPage = pageCurrent;
		this.totalPageCount = totalPageCount;
	}


/************************************get set 方法****************************/	
	

	

	public int getPageSize() {
		return pageSize;
	}

	public int getCurrentPage() {
	return currentPage;
}

public void setCurrentPage(int currentPage) {
	this.currentPage = currentPage;
}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
/************************************end  --get set 方法****************************/	
    
}
