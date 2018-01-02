package com.myblog.po;

import java.util.List;

public class ContactExtend extends Contact {
	//Contact的扩展类，如果想添加Contact的属性，就在这个类中添加，尽量不要去改逆向工程生成的代码
	
	private List<Contact> contactList;

	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}
	
}
