package org.apache.http;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.util.Locale;

public interface ReasonPhraseCatalog {

    
    public String getReason(int status, Locale loc)
        ;

}
