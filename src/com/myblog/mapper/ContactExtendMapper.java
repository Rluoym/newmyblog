package com.myblog.mapper;

import java.util.List;

import com.myblog.po.ContactExtend;

public interface ContactExtendMapper {
	//查询联系人信息，返回一个List<ContactExtend>
	List<ContactExtend> findContactsByContactExtend();
}
