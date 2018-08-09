package com.github.notjamesm;

import org.apache.log4j.Logger;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.String.format;

public class TodoHandler extends AbstractHandler {

    private final Logger LOGGER = Logger.getLogger(TodoServer.class);

    @Override
    public void handle(String target,
                       Request baseRequest,
                       HttpServletRequest request,
                       HttpServletResponse response) throws IOException {

        String logMessage = format("Target:\n%s\nbaseRequest:\n%s\nrequest:\n%s\nresponse:\n%s\n",
                target, baseRequest, request,response);

        LOGGER.info(logMessage);

        response.setContentType("text/html; charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("<h1>Hello There</h1>");
        baseRequest.setHandled(true);
    }
}
