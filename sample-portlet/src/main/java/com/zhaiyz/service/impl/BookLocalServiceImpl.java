package com.zhaiyz.service.impl;

import java.util.Date;
import java.util.List;

import com.zhaiyz.model.Book;
import com.zhaiyz.service.base.BookLocalServiceBaseImpl;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the book local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.zhaiyz.service.BookLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author zhaiyz
 * @see com.zhaiyz.service.base.BookLocalServiceBaseImpl
 * @see com.zhaiyz.service.BookLocalServiceUtil
 */
public class BookLocalServiceImpl extends BookLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.zhaiyz.service.BookLocalServiceUtil} to access the book local service.
     */

    public Book addBook(long groupId, long companyId, long userId, String userName, String author, String title) throws PortalException, SystemException {
    	long bookId = CounterLocalServiceUtil.increment(Book.class.getName());
    	Date now = new Date();
    	Book book = bookPersistence.create(bookId);

		book.setGroupId(groupId);

    	book.setCompanyId(companyId);
    	book.setUserId(userId);
    	book.setUserName(userName);
    	book.setCreateDate(now);
    	book.setModifiedDate(now);

    	book.setAuthor(author);
    	book.setTitle(title);

    	return super.addBook(book);
    }

    public List<Book> findByC_G(long companyId, long groupId) throws PortalException, SystemException {
        return bookPersistence.findByC_G(companyId, groupId);
    }
}
