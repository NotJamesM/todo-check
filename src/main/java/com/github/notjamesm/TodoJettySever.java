package com.github.notjamesm;

import org.apache.log4j.Logger;
import org.eclipse.jetty.server.NCSARequestLog;
import org.eclipse.jetty.server.Server;

public class TodoJettySever {

    private final Server server;

    public TodoJettySever(int portNumber) {
            this.server = new Server(portNumber);
    }

    public void start() {
        try {
            setUpServerContexts();
            server.start();
        } catch (Exception e) {
            throw new RuntimeException("Failed to start", e);
        }
    }

    public void stop(){
        try {
            server.stop();
        } catch (Exception e) {
            throw new RuntimeException("Failed to stop", e);
        }
    }

    private void setUpServerContexts() {
        //todo set up the endpoints
        NCSARequestLog requestLog = generateRequestLog();

        server.setRequestLog(requestLog);
    }

    private NCSARequestLog generateRequestLog() {
        NCSARequestLog requestLog = new NCSARequestLog("logs/jetty/yyyy-mm-dd.request.log");
        requestLog.setAppend(true);
        requestLog.setExtended(false);
        requestLog.setLogTimeZone("GMT");
        requestLog.setLogLatency(true);
        requestLog.setRetainDays(90);
        return requestLog;
    }
}
