package com.zhaiyz.portlet.book;

import com.zhaiyz.service.BookLocalServiceUtil;

public class BookDeleteAction extends LiferayActionSupport {

	private long bookId;

	@Override
	public String execute() throws Exception{
		BookLocalServiceUtil.deleteBook(bookId);
		return SUCCESS;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public long getBookId() {
		return bookId;
	}
}