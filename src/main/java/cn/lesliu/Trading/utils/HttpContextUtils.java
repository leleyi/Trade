package cn.lesliu.Trading.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HttpContextUtils {

    /**
     * 获取 request 对象
     *
     * @return
     */
    public static HttpServletRequest getHttpServletRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

    /**
     * 获取 Response 对象
     *
     * @return
     */
    public static HttpServletResponse getHttpServletResponse() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
    }

    /**
     * 获取 session
     *
     * @return
     */
    public static HttpSession getSession() {
        return getHttpServletRequest().getSession();
    }

    /**
     * 添加session 值
     *
     * @param sessionName session的key
     * @param object      session的value
     */
    public static void setSession(String sessionName, Object object) {
        HttpSession session = (HttpSession) getHttpServletRequest().getSession();
        if (null != object) {
            session.setAttribute(sessionName, object);
        }
    }

    /**
     * 获取session
     *
     * @param sessionName session的key
     * @return session的value
     */
    public static Object getSession(String sessionName) {
        HttpSession session = getHttpServletRequest().getSession();
        Object object = session.getAttribute(sessionName);
        return object;
    }
}
