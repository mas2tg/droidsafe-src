package org.apache.http.impl.conn.tsccm;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import dalvik.system.SocketTagger;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.params.HttpParams;
import org.apache.http.impl.conn.DefaultClientConnectionOperator;

public class ThreadSafeClientConnManager implements ClientConnectionManager {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:15.986 -0400", hash_original_field = "0B7469F2850D918A96D1C36E99B23F5C", hash_generated_field = "4E4E630304492253CB8147CAE1C7D2A5")

    private Log log = LogFactory.getLog(getClass());
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:15.986 -0400", hash_original_field = "1D823F19EC944D016B48B105C3632412", hash_generated_field = "262A27B6B6B1CBF25439CFECC3909997")

    protected SchemeRegistry schemeRegistry;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:15.986 -0400", hash_original_field = "99874BDECC32FFAA06AFF68D9A8B62AF", hash_generated_field = "A126A5C00AC17033F6B94E836FE92D15")

    protected AbstractConnPool connectionPool;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:15.986 -0400", hash_original_field = "30434E45229CAA1EA40A11E0FD7C2DB8", hash_generated_field = "6D2607DA479BDA11A25B13C47E7F0C5C")

    protected ClientConnectionOperator connOperator;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:15.993 -0400", hash_original_method = "CE8305B2F50479AC170D47319F9570C8", hash_generated_method = "47E8D39DEDAEBCF841B552E3AC018102")
    public  ThreadSafeClientConnManager(HttpParams params,
                                       SchemeRegistry schreg) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("HTTP parameters may not be null");
        } //End block
        this.schemeRegistry = schreg;
        this.connOperator   = createConnectionOperator(schreg);
        this.connectionPool = createConnectionPool(params);
        // ---------- Original Method ----------
        //if (params == null) {
            //throw new IllegalArgumentException("HTTP parameters may not be null");
        //}
        //this.schemeRegistry = schreg;
        //this.connOperator   = createConnectionOperator(schreg);
        //this.connectionPool = createConnectionPool(params);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:15.995 -0400", hash_original_method = "0E19810A97EBEE58216EC05F0D60A026", hash_generated_method = "374DE57AB0E3DB06FD60574FD3247A4E")
    @Override
    protected void finalize() throws Throwable {
        shutdown();
        super.finalize();
        // ---------- Original Method ----------
        //shutdown();
        //super.finalize();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.038 -0400", hash_original_method = "E5BC66DBF19261346819AE7E60C7F467", hash_generated_method = "8940F1A3148818D0DA715B20E7B254A4")
    protected AbstractConnPool createConnectionPool(final HttpParams params) {
        AbstractConnPool varB4EAC82CA7396A68D541C85D26508E83_307277895 = null; //Variable for return #1
        AbstractConnPool acp;
        acp = new ConnPoolByRoute(connOperator, params);
        boolean conngc;
        conngc = true;
        {
            acp.enableConnectionGC();
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_307277895 = acp;
        addTaint(params.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_307277895.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_307277895;
        // ---------- Original Method ----------
        //AbstractConnPool acp = new ConnPoolByRoute(connOperator, params);
        //boolean conngc = true;
        //if (conngc) {
            //acp.enableConnectionGC();
        //}
        //return acp;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.038 -0400", hash_original_method = "25E4E60569E24699D7326BD2975E9BC2", hash_generated_method = "26046A840096E58C5DAC3FF333581C53")
    protected ClientConnectionOperator createConnectionOperator(SchemeRegistry schreg) {
        ClientConnectionOperator varB4EAC82CA7396A68D541C85D26508E83_1124271703 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1124271703 = new DefaultClientConnectionOperator(schreg);
        addTaint(schreg.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1124271703.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1124271703;
        // ---------- Original Method ----------
        //return new DefaultClientConnectionOperator(schreg);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.039 -0400", hash_original_method = "98F37EDA7C4377EF27FBBC8455A5DCE4", hash_generated_method = "BCA440F77B7F1EECA6F12BD4673F7454")
    public SchemeRegistry getSchemeRegistry() {
        SchemeRegistry varB4EAC82CA7396A68D541C85D26508E83_1218318860 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1218318860 = this.schemeRegistry;
        varB4EAC82CA7396A68D541C85D26508E83_1218318860.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1218318860;
        // ---------- Original Method ----------
        //return this.schemeRegistry;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.039 -0400", hash_original_method = "3E5898B68534E316FCFFCF41E86D81D5", hash_generated_method = "60C0B6EE0028220A1D31FDAC07F2DFAB")
    public ClientConnectionRequest requestConnection(
            final HttpRoute route, 
            final Object state) {
        ClientConnectionRequest varB4EAC82CA7396A68D541C85D26508E83_1218305734 = null; //Variable for return #1
        PoolEntryRequest poolRequest;
        poolRequest = connectionPool.requestPoolEntry(
                route, state);
        varB4EAC82CA7396A68D541C85D26508E83_1218305734 = new ClientConnectionRequest() {
            public void abortRequest() {
                poolRequest.abortRequest();
            }
            public ManagedClientConnection getConnection(
                    long timeout, TimeUnit tunit) throws InterruptedException,
                    ConnectionPoolTimeoutException {
                if (route == null) {
                    throw new IllegalArgumentException("Route may not be null.");
                }
                if (log.isDebugEnabled()) {
                    log.debug("ThreadSafeClientConnManager.getConnection: "
                        + route + ", timeout = " + timeout);
                }
                BasicPoolEntry entry = poolRequest.getPoolEntry(timeout, tunit);
                try {
                    final Socket socket = entry.getConnection().getSocket();
                    if (socket != null) {
                        SocketTagger.get().tag(socket);
                    }
                } catch (IOException iox) {
                    log.debug("Problem tagging socket.", iox);
                }
                return new BasicPooledConnAdapter(ThreadSafeClientConnManager.this, entry);
            }
        };
        addTaint(route.getTaint());
        addTaint(state.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1218305734.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1218305734;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.048 -0400", hash_original_method = "3CF782E9F00803924FA9A14119B3585D", hash_generated_method = "7B11FA0E583D2F5C5DE159736B776580")
    public void releaseConnection(ManagedClientConnection conn, long validDuration, TimeUnit timeUnit) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException
                ("Connection class mismatch, " +
                 "connection not obtained from this manager.");
        } //End block
        BasicPooledConnAdapter hca;
        hca = (BasicPooledConnAdapter) conn;
        {
            boolean var6192AB5B64B46E2400472BDF20A88225_113882296 = ((hca.getPoolEntry() != null) && (hca.getManager() != this));
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException
                ("Connection not obtained from this manager.");
            } //End block
        } //End collapsed parenthetic
        try 
        {
            BasicPoolEntry entry;
            entry = (BasicPoolEntry) hca.getPoolEntry();
            Socket socket;
            socket = entry.getConnection().getSocket();
            {
                SocketTagger.get().untag(socket);
            } //End block
            {
                boolean var3E60D1B6142E7057429C96B0BFD0893C_743344060 = (hca.isOpen() && !hca.isMarkedReusable());
                {
                    {
                        boolean varB5EA13E236059479AA556C9226E19405_621818824 = (log.isDebugEnabled());
                        {
                            log.debug
                        ("Released connection open but not marked reusable.");
                        } //End block
                    } //End collapsed parenthetic
                    hca.shutdown();
                } //End block
            } //End collapsed parenthetic
        } //End block
        catch (IOException iox)
        {
            {
                boolean varCF6EB300C7D56FAF33A2C36006D8EF42_1074821348 = (log.isDebugEnabled());
                log.debug("Exception shutting down released connection.",
                          iox);
            } //End collapsed parenthetic
        } //End block
        finally 
        {
            BasicPoolEntry entry;
            entry = (BasicPoolEntry) hca.getPoolEntry();
            boolean reusable;
            reusable = hca.isMarkedReusable();
            hca.detach();
            {
                connectionPool.freeEntry(entry, reusable, validDuration, timeUnit);
            } //End block
        } //End block
        addTaint(conn.getTaint());
        addTaint(validDuration);
        addTaint(timeUnit.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.048 -0400", hash_original_method = "5B798EEC995C1D56865AC1580F955080", hash_generated_method = "42E2BBAB2AF21073775665B77EF166D8")
    public void shutdown() {
        connectionPool.shutdown();
        // ---------- Original Method ----------
        //connectionPool.shutdown();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.049 -0400", hash_original_method = "52C9DA1F5E2D598BCB82BD013D1068AD", hash_generated_method = "086162645F67FE95B5D58641873AEDCC")
    public int getConnectionsInPool(HttpRoute route) {
        int varC462CC0BD6AD8361B0292006FD2C7F79_672689887 = (((ConnPoolByRoute)connectionPool).getConnectionsInPool(
                route));
        addTaint(route.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_576268881 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_576268881;
        // ---------- Original Method ----------
        //return ((ConnPoolByRoute)connectionPool).getConnectionsInPool(
                //route);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.049 -0400", hash_original_method = "A7E68EC885457C399BA150A4DD387F90", hash_generated_method = "D080EFF80B29F58127C5058AC2C31A95")
    public int getConnectionsInPool() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_285453508 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_285453508;
        // ---------- Original Method ----------
        //synchronized (connectionPool) {
            //return connectionPool.numConnections; 
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.049 -0400", hash_original_method = "614803CEB018564B6D4B8085A3E1BC4F", hash_generated_method = "E2FAE87BE7F4B8196EB48159FCB6D7F9")
    public void closeIdleConnections(long idleTimeout, TimeUnit tunit) {
        connectionPool.closeIdleConnections(idleTimeout, tunit);
        connectionPool.deleteClosedConnections();
        addTaint(idleTimeout);
        addTaint(tunit.getTaint());
        // ---------- Original Method ----------
        //connectionPool.closeIdleConnections(idleTimeout, tunit);
        //connectionPool.deleteClosedConnections();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.060 -0400", hash_original_method = "3CBEAD5C5E5FD142C35EE66C6F0AAE4C", hash_generated_method = "536375C07B2EFC293E2096521891082E")
    public void closeExpiredConnections() {
        connectionPool.closeExpiredConnections();
        connectionPool.deleteClosedConnections();
        // ---------- Original Method ----------
        //connectionPool.closeExpiredConnections();
        //connectionPool.deleteClosedConnections();
    }

    
}

