package org.apache.http;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public interface HttpEntityEnclosingRequest extends HttpRequest {

    
    boolean expectContinue();
    
    
    void setEntity(HttpEntity entity);
    
    HttpEntity getEntity();
    
}
