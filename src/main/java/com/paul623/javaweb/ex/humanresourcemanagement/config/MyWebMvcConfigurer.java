package com.paul623.javaweb.ex.humanresourcemanagement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        AuthorizedInterceptor authorizedInterceptor=new AuthorizedInterceptor();
        registry.addInterceptor(authorizedInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/loginForm", "/login","/404.html","/css/**","/fonts/**","images/**","js/**","lib/**","logo.ico","error/**");
    }
}
