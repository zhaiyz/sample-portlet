package com.zhaiyz.portlet.book;

import com.zhaiyz.model.Book;
import com.zhaiyz.service.BookLocalServiceUtil;

import com.opensymphony.xwork2.Preparable;

public class BookEditAction extends LiferayActionSupport implements Preparable{

	private long bookId;

	private Book book;

	@Override
    public void prepare() throws Exception {
        book = BookLocalServiceUtil.fetchBook(bookId);
    }

	@Override
	public String input() throws Exception{
		return INPUT;
	}

	@Override
	public String execute() throws Exception{
		BookLocalServiceUtil.updateBook(book);
		return SUCCESS;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Book getBook() {
		return book;
	}
}