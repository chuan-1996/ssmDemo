package com.chuan.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author qq491
 */

public class InitAfterStartListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("hello! I'm listener");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}

