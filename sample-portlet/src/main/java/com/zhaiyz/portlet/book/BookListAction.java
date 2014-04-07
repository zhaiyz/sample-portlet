package com.zhaiyz.portlet.book;

import java.util.List;

import com.zhaiyz.model.Book;
import com.zhaiyz.service.BookLocalServiceUtil;

public class BookListAction extends LiferayActionSupport {

    private static final long serialVersionUID = -2616157384385874155L;
    
    private List<Book> books;

	public String input() throws Exception {
		books = BookLocalServiceUtil.findByC_G(getCompanyId(), getScopeGroupId());
		return INPUT;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}
}