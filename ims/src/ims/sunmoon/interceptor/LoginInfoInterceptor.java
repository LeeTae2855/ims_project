package ims.sunmoon.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInfoInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession(true);

		Boolean isLogin = session.getAttribute("isLogin") != null ? (Boolean) session.getAttribute("isLogin") : false;

		if (!isLogin) {
			response.sendRedirect(request.getContextPath() + "/login");
			return false;
		} else {
			String url = request.getRequestURL().toString();
			String path = url.substring(url.lastIndexOf("/"), url.length());

			if ("".equals(path) || path == null || "/".equals(path)) {
				session.invalidate();
				response.sendRedirect(request.getContextPath() + "/login");
				return false;
			}
		}

		return super.preHandle(request, response, handler);
	}
}
