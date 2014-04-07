package com.zhaiyz.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.zhaiyz.model.Book;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Book in entity cache.
 *
 * @author zhaiyz
 * @see Book
 * @generated
 */
public class BookCacheModel implements CacheModel<Book>, Externalizable {
    public String uuid;
    public long bookId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String author;
    public String title;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", bookId=");
        sb.append(bookId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", author=");
        sb.append(author);
        sb.append(", title=");
        sb.append(title);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Book toEntityModel() {
        BookImpl bookImpl = new BookImpl();

        if (uuid == null) {
            bookImpl.setUuid(StringPool.BLANK);
        } else {
            bookImpl.setUuid(uuid);
        }

        bookImpl.setBookId(bookId);
        bookImpl.setGroupId(groupId);
        bookImpl.setCompanyId(companyId);
        bookImpl.setUserId(userId);

        if (userName == null) {
            bookImpl.setUserName(StringPool.BLANK);
        } else {
            bookImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            bookImpl.setCreateDate(null);
        } else {
            bookImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            bookImpl.setModifiedDate(null);
        } else {
            bookImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (author == null) {
            bookImpl.setAuthor(StringPool.BLANK);
        } else {
            bookImpl.setAuthor(author);
        }

        if (title == null) {
            bookImpl.setTitle(StringPool.BLANK);
        } else {
            bookImpl.setTitle(title);
        }

        bookImpl.resetOriginalValues();

        return bookImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        bookId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        author = objectInput.readUTF();
        title = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(bookId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (author == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(author);
        }

        if (title == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(title);
        }
    }
}
