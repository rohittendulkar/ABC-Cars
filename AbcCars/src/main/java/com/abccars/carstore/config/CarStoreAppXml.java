package com.abccars.carstore.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CarStoreAppXml extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{JPAConfig.class,SecurityConfig.class};
    }


    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{CarStoreMvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}