package com.doncorp.bookrestapi.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
@Order(1)
public class BookFilterTwo implements Filter {

    private static Logger log = LoggerFactory.getLogger(BookFilterTwo.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        log.info("BookFilterTwo - doFilter");
        chain.doFilter(request, response);
    }

}
