package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_reponsibilities._03_java;

import javax.servlet.*;
import java.io.IOException;

public class CoRInJava {

    public static void main(String[] args) {
        Filter filter = new Filter() {
            @Override
            public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
                // TODO 전처리
                filterChain.doFilter(servletRequest, servletResponse);
                // TODO 후처리
            }
        };
    }
}
