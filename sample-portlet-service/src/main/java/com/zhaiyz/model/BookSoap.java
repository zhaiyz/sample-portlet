package com.zhaiyz.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author zhaiyz
 * @generated
 */
public class BookSoap implements Serializable {
    private String _uuid;
    private long _bookId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _author;
    private String _title;

    public BookSoap() {
    }

    public static BookSoap toSoapModel(Book model) {
        BookSoap soapModel = new BookSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setBookId(model.getBookId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setAuthor(model.getAuthor());
        soapModel.setTitle(model.getTitle());

        return soapModel;
    }

    public static BookSoap[] toSoapModels(Book[] models) {
        BookSoap[] soapModels = new BookSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BookSoap[][] toSoapModels(Book[][] models) {
        BookSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BookSoap[models.length][models[0].length];
        } else {
            soapModels = new BookSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BookSoap[] toSoapModels(List<Book> models) {
        List<BookSoap> soapModels = new ArrayList<BookSoap>(models.size());

        for (Book model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BookSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _bookId;
    }

    public void setPrimaryKey(long pk) {
        setBookId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getBookId() {
        return _bookId;
    }

    public void setBookId(long bookId) {
        _bookId = bookId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getAuthor() {
        return _author;
    }

    public void setAuthor(String author) {
        _author = author;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        _title = title;
    }
}
