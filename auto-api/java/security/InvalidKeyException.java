package java.security;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class InvalidKeyException extends KeyException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:46.960 -0400", hash_original_method = "BC12CDCCA39AEA87BF36441977671D95", hash_generated_method = "19AF4627832A22455F8CDE4EC0A5F487")
    public  InvalidKeyException(String msg) {
        super(msg);
        addTaint(msg.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:46.961 -0400", hash_original_method = "4C9DBAC0C74B6F235E7CED5E494EF3EA", hash_generated_method = "92C65BC824CFB76E11B7AB2CF746507A")
    public  InvalidKeyException() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:46.961 -0400", hash_original_method = "F48B209D0258F085C8D5998E4F2F8DB1", hash_generated_method = "3D66F03B60DE5627646EE84233E6A841")
    public  InvalidKeyException(String message, Throwable cause) {
        super(message, cause);
        addTaint(message.getTaint());
        addTaint(cause.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:46.961 -0400", hash_original_method = "F8B65E52926150DDFBD4B64691704A27", hash_generated_method = "86A90968DBBF5A24975C4DF9C1F74931")
    public  InvalidKeyException(Throwable cause) {
        super(cause);
        addTaint(cause.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:46.962 -0400", hash_original_field = "11F5C7EB8196B9D76D79C7D0467CBCA6", hash_generated_field = "00C1FFA27406DF65131A6300FE404CAE")

    private static long serialVersionUID = 5698479920593359816L;
}

