/*
 * Copyright (C) 2015,  Massachusetts Institute of Technology
 * 
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation; either version 2 of the License, or (at your
 * option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 * 
 * Please email droidsafe@lists.csail.mit.edu if you need additional
 * information or have any questions.
 * 
 * 
 * This file incorporates work covered by the following copyright and
 * permission notice:
 *
* Conditions Of Use
*
* This software was developed by employees of the National Institute of
* Standards and Technology (NIST), an agency of the Federal Government.
* Pursuant to title 15 Untied States Code Section 105, works of NIST
* employees are not subject to copyright protection in the United States
* and are considered to be in the public domain.  As a result, a formal
* license is not needed to use the software.
*
* This software is provided by NIST as a service and is expressly
* provided "AS IS."  NIST MAKES NO WARRANTY OF ANY KIND, EXPRESS, IMPLIED
* OR STATUTORY, INCLUDING, WITHOUT LIMITATION, THE IMPLIED WARRANTY OF
* MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, NON-INFRINGEMENT
* AND DATA ACCURACY.  NIST does not warrant or make any representations
* regarding the use of the software or the results thereof, including but
* not limited to the correctness, accuracy, reliability or usefulness of
* the software.
*
* Permission to use this software is contingent upon your acceptance
* of the terms of this agreement
*
* .
*
*/

/***** THIS FILE HAS BEEN MODIFIED FROM THE ORIGINAL BY THE DROIDSAFE PROJECT. *****/


package gov.nist.core.net;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

public interface NetworkLayer {
    
    @DSComment("Abstract Method")
    @DSSpec(DSCat.ABSTRACT_METHOD)
    public ServerSocket createServerSocket(int port, int backlog,
            InetAddress bindAddress) throws IOException;
    
    @DSComment("Abstract Method")
    @DSSpec(DSCat.ABSTRACT_METHOD)
    public SSLServerSocket createSSLServerSocket(int port, int backlog,
            InetAddress bindAddress) throws IOException;
    
    @DSComment("Abstract Method")
    @DSSpec(DSCat.ABSTRACT_METHOD)
    public Socket createSocket(InetAddress address, int port) throws IOException;
    
    @DSComment("Abstract Method")
    @DSSpec(DSCat.ABSTRACT_METHOD)
    public Socket createSocket(InetAddress address, int port, InetAddress localAddress) throws IOException;
    
    @DSComment("Abstract Method")
    @DSSpec(DSCat.ABSTRACT_METHOD)
    public Socket createSocket(InetAddress address, int port,
                    InetAddress myAddress, int myPort)
        throws IOException;
    
    @DSComment("Abstract Method")
    @DSSpec(DSCat.ABSTRACT_METHOD)
    public SSLSocket createSSLSocket(InetAddress address, int port) throws IOException;
    
    @DSComment("Abstract Method")
    @DSSpec(DSCat.ABSTRACT_METHOD)
    public SSLSocket createSSLSocket(InetAddress address, int port, InetAddress localAddress) throws IOException;
    
    @DSComment("Abstract Method")
    @DSSpec(DSCat.ABSTRACT_METHOD)
    public DatagramSocket createDatagramSocket() throws SocketException;
    
    @DSComment("Abstract Method")
    @DSSpec(DSCat.ABSTRACT_METHOD)
    public DatagramSocket createDatagramSocket(int port, InetAddress laddr)
            throws SocketException;

}
