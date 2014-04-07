package com.zhaiyz.portlet.book;

import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;

import org.apache.struts2.dispatcher.DefaultActionSupport;
import org.apache.struts2.portlet.context.PortletActionContext;

public class LiferayActionSupport extends DefaultActionSupport {

    private static final long serialVersionUID = 7397642416652881116L;

    public ThemeDisplay getThemeDisplay() {
		return (ThemeDisplay) PortletActionContext.getRequest().getAttribute(WebKeys.THEME_DISPLAY);
	}

	public User getUser() {
		return getThemeDisplay().getUser();
	}

	public long getCompanyId() {
		return getThemeDisplay().getCompanyId();
	}

	public long getScopeGroupId() {
		return getThemeDisplay().getScopeGroupId();
	}

	public long getUserId() {
		return getThemeDisplay().getUserId();
	}

	public String getUserName() {
		return getUser().getFullName();
	}
}