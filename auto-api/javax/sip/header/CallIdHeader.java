package javax.sip.header;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;

// import Iterator to deal with enhanced for loop translation
import java.util.Iterator;

import java.text.ParseException;

public interface CallIdHeader extends Header {
    String NAME = "Call-ID";

    String getCallId();
    void setCallId(String callId) throws ParseException;
}

