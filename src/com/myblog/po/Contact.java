package com.myblog.po;

public class Contact {
    private String userContactId;

    private String userContactTypeName;

    private String userContact;

    private String userContactMemo;

    public String getUserContactId() {
        return userContactId;
    }

    public void setUserContactId(String userContactId) {
        this.userContactId = userContactId == null ? null : userContactId.trim();
    }

    public String getUserContactTypeName() {
        return userContactTypeName;
    }

    public void setUserContactTypeName(String userContactTypeName) {
        this.userContactTypeName = userContactTypeName == null ? null : userContactTypeName.trim();
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact == null ? null : userContact.trim();
    }

    public String getUserContactMemo() {
        return userContactMemo;
    }

    public void setUserContactMemo(String userContactMemo) {
        this.userContactMemo = userContactMemo == null ? null : userContactMemo.trim();
    }
}