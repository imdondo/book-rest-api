package com.doncorp.bookrestapi.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class ActuatorFilter implements Filter {

    private static Logger log = LoggerFactory.getLogger(ActuatorFilter.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        log.info("ActuatorFilter - doFilter");
        chain.doFilter(request, response);
    }
}
