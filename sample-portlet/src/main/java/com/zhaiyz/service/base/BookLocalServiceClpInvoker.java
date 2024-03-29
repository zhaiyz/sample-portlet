package com.zhaiyz.service.base;

import com.zhaiyz.service.BookLocalServiceUtil;

import java.util.Arrays;

/**
 * @author zhaiyz
 * @generated
 */
public class BookLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName16;
    private String[] _methodParameterTypes16;
    private String _methodName17;
    private String[] _methodParameterTypes17;
    private String _methodName18;
    private String[] _methodParameterTypes18;
    private String _methodName19;
    private String[] _methodParameterTypes19;
    private String _methodName36;
    private String[] _methodParameterTypes36;
    private String _methodName37;
    private String[] _methodParameterTypes37;
    private String _methodName42;
    private String[] _methodParameterTypes42;
    private String _methodName43;
    private String[] _methodParameterTypes43;

    public BookLocalServiceClpInvoker() {
        _methodName0 = "addBook";

        _methodParameterTypes0 = new String[] { "com.zhaiyz.model.Book" };

        _methodName1 = "createBook";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteBook";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteBook";

        _methodParameterTypes3 = new String[] { "com.zhaiyz.model.Book" };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchBook";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "fetchBookByUuidAndCompanyId";

        _methodParameterTypes11 = new String[] { "java.lang.String", "long" };

        _methodName12 = "fetchBookByUuidAndGroupId";

        _methodParameterTypes12 = new String[] { "java.lang.String", "long" };

        _methodName13 = "getBook";

        _methodParameterTypes13 = new String[] { "long" };

        _methodName14 = "getPersistedModel";

        _methodParameterTypes14 = new String[] { "java.io.Serializable" };

        _methodName15 = "getBookByUuidAndCompanyId";

        _methodParameterTypes15 = new String[] { "java.lang.String", "long" };

        _methodName16 = "getBookByUuidAndGroupId";

        _methodParameterTypes16 = new String[] { "java.lang.String", "long" };

        _methodName17 = "getBooks";

        _methodParameterTypes17 = new String[] { "int", "int" };

        _methodName18 = "getBooksCount";

        _methodParameterTypes18 = new String[] {  };

        _methodName19 = "updateBook";

        _methodParameterTypes19 = new String[] { "com.zhaiyz.model.Book" };

        _methodName36 = "getBeanIdentifier";

        _methodParameterTypes36 = new String[] {  };

        _methodName37 = "setBeanIdentifier";

        _methodParameterTypes37 = new String[] { "java.lang.String" };

        _methodName42 = "addBook";

        _methodParameterTypes42 = new String[] {
                "long", "long", "long", "java.lang.String", "java.lang.String",
                "java.lang.String"
            };

        _methodName43 = "findByC_G";

        _methodParameterTypes43 = new String[] { "long", "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return BookLocalServiceUtil.addBook((com.zhaiyz.model.Book) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return BookLocalServiceUtil.createBook(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return BookLocalServiceUtil.deleteBook(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return BookLocalServiceUtil.deleteBook((com.zhaiyz.model.Book) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return BookLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return BookLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return BookLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return BookLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return BookLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return BookLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return BookLocalServiceUtil.fetchBook(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return BookLocalServiceUtil.fetchBookByUuidAndCompanyId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return BookLocalServiceUtil.fetchBookByUuidAndGroupId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return BookLocalServiceUtil.getBook(((Long) arguments[0]).longValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return BookLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return BookLocalServiceUtil.getBookByUuidAndCompanyId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName16.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
            return BookLocalServiceUtil.getBookByUuidAndGroupId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName17.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
            return BookLocalServiceUtil.getBooks(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName18.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
            return BookLocalServiceUtil.getBooksCount();
        }

        if (_methodName19.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
            return BookLocalServiceUtil.updateBook((com.zhaiyz.model.Book) arguments[0]);
        }

        if (_methodName36.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
            return BookLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName37.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes37, parameterTypes)) {
            BookLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName42.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
            return BookLocalServiceUtil.addBook(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                ((Long) arguments[2]).longValue(),
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4], (java.lang.String) arguments[5]);
        }

        if (_methodName43.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
            return BookLocalServiceUtil.findByC_G(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
