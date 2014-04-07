package com.zhaiyz.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Book}.
 * </p>
 *
 * @author zhaiyz
 * @see Book
 * @generated
 */
public class BookWrapper implements Book, ModelWrapper<Book> {
    private Book _book;

    public BookWrapper(Book book) {
        _book = book;
    }

    @Override
    public Class<?> getModelClass() {
        return Book.class;
    }

    @Override
    public String getModelClassName() {
        return Book.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("bookId", getBookId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("author", getAuthor());
        attributes.put("title", getTitle());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long bookId = (Long) attributes.get("bookId");

        if (bookId != null) {
            setBookId(bookId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String author = (String) attributes.get("author");

        if (author != null) {
            setAuthor(author);
        }

        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }
    }

    /**
    * Returns the primary key of this book.
    *
    * @return the primary key of this book
    */
    @Override
    public long getPrimaryKey() {
        return _book.getPrimaryKey();
    }

    /**
    * Sets the primary key of this book.
    *
    * @param primaryKey the primary key of this book
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _book.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this book.
    *
    * @return the uuid of this book
    */
    @Override
    public java.lang.String getUuid() {
        return _book.getUuid();
    }

    /**
    * Sets the uuid of this book.
    *
    * @param uuid the uuid of this book
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _book.setUuid(uuid);
    }

    /**
    * Returns the book ID of this book.
    *
    * @return the book ID of this book
    */
    @Override
    public long getBookId() {
        return _book.getBookId();
    }

    /**
    * Sets the book ID of this book.
    *
    * @param bookId the book ID of this book
    */
    @Override
    public void setBookId(long bookId) {
        _book.setBookId(bookId);
    }

    /**
    * Returns the group ID of this book.
    *
    * @return the group ID of this book
    */
    @Override
    public long getGroupId() {
        return _book.getGroupId();
    }

    /**
    * Sets the group ID of this book.
    *
    * @param groupId the group ID of this book
    */
    @Override
    public void setGroupId(long groupId) {
        _book.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this book.
    *
    * @return the company ID of this book
    */
    @Override
    public long getCompanyId() {
        return _book.getCompanyId();
    }

    /**
    * Sets the company ID of this book.
    *
    * @param companyId the company ID of this book
    */
    @Override
    public void setCompanyId(long companyId) {
        _book.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this book.
    *
    * @return the user ID of this book
    */
    @Override
    public long getUserId() {
        return _book.getUserId();
    }

    /**
    * Sets the user ID of this book.
    *
    * @param userId the user ID of this book
    */
    @Override
    public void setUserId(long userId) {
        _book.setUserId(userId);
    }

    /**
    * Returns the user uuid of this book.
    *
    * @return the user uuid of this book
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _book.getUserUuid();
    }

    /**
    * Sets the user uuid of this book.
    *
    * @param userUuid the user uuid of this book
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _book.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this book.
    *
    * @return the user name of this book
    */
    @Override
    public java.lang.String getUserName() {
        return _book.getUserName();
    }

    /**
    * Sets the user name of this book.
    *
    * @param userName the user name of this book
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _book.setUserName(userName);
    }

    /**
    * Returns the create date of this book.
    *
    * @return the create date of this book
    */
    @Override
    public java.util.Date getCreateDate() {
        return _book.getCreateDate();
    }

    /**
    * Sets the create date of this book.
    *
    * @param createDate the create date of this book
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _book.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this book.
    *
    * @return the modified date of this book
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _book.getModifiedDate();
    }

    /**
    * Sets the modified date of this book.
    *
    * @param modifiedDate the modified date of this book
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _book.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the author of this book.
    *
    * @return the author of this book
    */
    @Override
    public java.lang.String getAuthor() {
        return _book.getAuthor();
    }

    /**
    * Sets the author of this book.
    *
    * @param author the author of this book
    */
    @Override
    public void setAuthor(java.lang.String author) {
        _book.setAuthor(author);
    }

    /**
    * Returns the title of this book.
    *
    * @return the title of this book
    */
    @Override
    public java.lang.String getTitle() {
        return _book.getTitle();
    }

    /**
    * Sets the title of this book.
    *
    * @param title the title of this book
    */
    @Override
    public void setTitle(java.lang.String title) {
        _book.setTitle(title);
    }

    @Override
    public boolean isNew() {
        return _book.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _book.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _book.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _book.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _book.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _book.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _book.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _book.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _book.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _book.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _book.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BookWrapper((Book) _book.clone());
    }

    @Override
    public int compareTo(Book book) {
        return _book.compareTo(book);
    }

    @Override
    public int hashCode() {
        return _book.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Book> toCacheModel() {
        return _book.toCacheModel();
    }

    @Override
    public Book toEscapedModel() {
        return new BookWrapper(_book.toEscapedModel());
    }

    @Override
    public Book toUnescapedModel() {
        return new BookWrapper(_book.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _book.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _book.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _book.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BookWrapper)) {
            return false;
        }

        BookWrapper bookWrapper = (BookWrapper) obj;

        if (Validator.equals(_book, bookWrapper._book)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _book.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Book getWrappedBook() {
        return _book;
    }

    @Override
    public Book getWrappedModel() {
        return _book;
    }

    @Override
    public void resetOriginalValues() {
        _book.resetOriginalValues();
    }
}
