package com.zhaiyz.portlet.book;

import com.zhaiyz.service.BookLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class BookAddAction extends LiferayActionSupport {

    private static final long serialVersionUID = 2223827331370725415L;

    private String author;

	private String title;

	@Override
	public String execute() throws Exception{
		try {
			BookLocalServiceUtil.addBook(getScopeGroupId(), getCompanyId(), getUserId(), getUserName(), author, title);
		} catch (PortalException e) {
			addActionError("Error:" + e.getMessage());
			return ERROR;
		} catch (SystemException e) {
			addActionError("Error:" + e.getMessage());
			return ERROR;
		}
		
		addActionMessage("Successfully added a book");
		return SUCCESS;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
}