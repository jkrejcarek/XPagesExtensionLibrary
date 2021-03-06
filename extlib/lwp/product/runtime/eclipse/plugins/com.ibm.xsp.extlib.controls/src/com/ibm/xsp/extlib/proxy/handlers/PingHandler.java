/*
 * � Copyright IBM Corp. 2010, 2014
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */
package com.ibm.xsp.extlib.proxy.handlers;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Ping Proxy Handler.
 * @author priand
 */
public class PingHandler extends AbstractProxyHandler {

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setStatus(HttpServletResponse.SC_OK);
        response.setContentType( "text/html" ); //$NON-NLS-1$
        response.setCharacterEncoding("UTF-8"); //$NON-NLS-1$
        PrintWriter w = new PrintWriter(new OutputStreamWriter(response.getOutputStream(),"utf-8")); //$NON-NLS-1$
        try {
            w.println("<html>"); //$NON-NLS-1$
            w.println("<body>"); //$NON-NLS-1$
            w.println("Hello, this is the proxy server"); // $NLX-PingHandler.Hellothisistheproxyserver-1$
            w.println("</body>"); //$NON-NLS-1$
            w.println("</html>"); //$NON-NLS-1$
        } finally {
            w.flush();
        }
    }
}