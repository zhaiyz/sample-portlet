<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<portlet:defineObjects />

<s:actionerror />

<h2>Edit books</h2>

<s:form action="editSave" method="post">
	<input type="hidden" name="bookId" value="<s:property value='%{bookId}' />" />
	<s:textfield name="author" label="Author" value="%{book.author}" />
	<s:textfield name="title" label="Title" value="%{book.title}" />
	<s:submit value="Edit" />
</s:form>