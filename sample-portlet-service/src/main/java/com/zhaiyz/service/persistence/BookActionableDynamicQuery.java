package com.zhaiyz.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.zhaiyz.model.Book;

import com.zhaiyz.service.BookLocalServiceUtil;

/**
 * @author zhaiyz
 * @generated
 */
public abstract class BookActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BookActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BookLocalServiceUtil.getService());
        setClass(Book.class);

        setClassLoader(com.zhaiyz.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("bookId");
    }
}
