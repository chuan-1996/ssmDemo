package com.chuan.controller;

import com.chuan.service.vo.UserVO;
import javax.servlet.http.HttpServletRequest;

public class BaseController {

    public void setSessionUser(String sessionType, HttpServletRequest request, UserVO user) {
        request.getSession().setAttribute(sessionType, user);
    }

    public void removeSessionUser(String sessionType, HttpServletRequest request) {
        request.getSession().removeAttribute(sessionType);
    }

    public UserVO getSessionUser(String sessionType, HttpServletRequest request) {
        return (UserVO) request.getSession().getAttribute(sessionType);
    }

}