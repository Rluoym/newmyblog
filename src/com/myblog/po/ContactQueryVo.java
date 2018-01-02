package com.myblog.po;

import java.util.List;

public class ContactQueryVo {
	//联系人信息
	private Contact contact;
	//联系人信息的扩展类
	private ContactExtend contactExtend;
	//批量的联系人信息，使用联系人信息的扩展类
	private List<ContactExtend> contactList;
	
	
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public ContactExtend getContactExtend() {
		return contactExtend;
	}
	public void setContactExtend(ContactExtend contactExtend) {
		this.contactExtend = contactExtend;
	}
	public List<ContactExtend> getContactList() {
		return contactList;
	}
	public void setContactList(List<ContactExtend> contactList) {
		this.contactList = contactList;
	}
	
	
}
