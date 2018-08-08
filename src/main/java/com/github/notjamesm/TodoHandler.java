package com.github.notjamesm;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TodoHandler extends AbstractHandler {

    @Override
    public void handle(String target,
                       Request baseRequest,
                       HttpServletRequest request,
                       HttpServletResponse response) throws IOException, ServletException {

        //todo read https://stackoverflow.com/questions/17886865/post-request-becomes-get
//        System.out.printf("Target:\n%s\nbaseRequest:\n%s\nrequest:\n%s\nresponse:\n%s\n", target, baseRequest,request,response);
        System.out.println(request.getMethod());

        response.setContentType("text/html; charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("<h1>Hello There</h1>");
        baseRequest.setHandled(true);
    }
}
