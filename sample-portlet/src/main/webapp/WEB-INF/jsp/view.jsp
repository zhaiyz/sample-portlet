<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<portlet:defineObjects />

<s:actionmessage />
<s:actionerror />

<h2>List books</h2>
<table border="1">
	<tr>
		<th>BookId</th>
		<th>Author</th>
		<th>Title</th>
		<th>Action</th>
	</tr>
	<s:iterator value="%{books}" var="book">
	<tr>
		<s:url action="delete" portletUrlType="action" id="deleteUrl">
			<s:param name="bookId" value="%{bookId}"/>
		</s:url>
		<s:url action="edit" portletUrlType="action" id="editUrl">
			<s:param name="bookId" value="%{bookId}"/>
		</s:url>
		<td><s:property value="%{bookId}" /></td>
		<td><s:property value="%{author}" /></td>
		<td><s:property value="%{title}" /></td>
		<td>
			<a href="<s:property value='%{deleteUrl}' />">Delete</a>
			|
			<a href="<s:property value='%{editUrl}' />">Edit</a>
		</td>
	</tr>
	</s:iterator>
</table>
<hr />
<h2>Add books</h2>
<s:form action="add" method="get">
	<s:textfield name="author" label="Author" />
	<s:textfield name="title" label="Title" />
	<s:submit value="Add" />
</s:form>