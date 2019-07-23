package com.actions;

import java.io.PrintWriter;

import com.opensymphony.xwork2.Action;

import org.apache.struts2.ServletActionContext;

import com.bean.User;

public class UserAction {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String execute() {
		return "success";
	}	
	
    public String showHtml() throws Exception
    {
      PrintWriter out = ServletActionContext.getResponse().getWriter();
      out.write("Your String!");
      return Action.NONE;
    }
}
