package javax.xml.parsers;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.validation.Schema;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public abstract class DocumentBuilder {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:01.870 -0400", hash_original_method = "A55CBA234E1648A7F9C09E5B63DC560C", hash_generated_method = "BA105E34266083D2C63C902BC6535525")
    protected  DocumentBuilder() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:01.883 -0400", hash_original_method = "B05B5D751774CA5E926948E22CD07EE8", hash_generated_method = "2559B266869D76599D38F19052EA5B6F")
    public void reset() {
        if (DroidSafeAndroidRuntime.control) throw new UnsupportedOperationException(
            "This DocumentBuilder, \"" + this.getClass().getName() + "\", does not support the reset functionality."
            + "  Specification \"" + this.getClass().getPackage().getSpecificationTitle() + "\""
            + " version \"" + this.getClass().getPackage().getSpecificationVersion() + "\""
            );
        // ---------- Original Method ----------
        //throw new UnsupportedOperationException(
            //"This DocumentBuilder, \"" + this.getClass().getName() + "\", does not support the reset functionality."
            //+ "  Specification \"" + this.getClass().getPackage().getSpecificationTitle() + "\""
            //+ " version \"" + this.getClass().getPackage().getSpecificationVersion() + "\""
            //);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:01.884 -0400", hash_original_method = "95E59CF6F0A1DFE242840282B735E195", hash_generated_method = "440498E613D03A0AC88B7881AD84B017")
    public Document parse(InputStream is) throws SAXException, IOException {
        Document varB4EAC82CA7396A68D541C85D26508E83_1632376548 = null; //Variable for return #1
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("InputStream cannot be null");
        } //End block
        InputSource in;
        in = new InputSource(is);
        varB4EAC82CA7396A68D541C85D26508E83_1632376548 = parse(in);
        addTaint(is.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1632376548.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1632376548;
        // ---------- Original Method ----------
        //if (is == null) {
            //throw new IllegalArgumentException("InputStream cannot be null");
        //}
        //InputSource in = new InputSource(is);
        //return parse(in);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:01.884 -0400", hash_original_method = "EA811CE95A08B04D15381504F667910C", hash_generated_method = "946E6F6FCC990E0039CC802A58C14F28")
    public Document parse(InputStream is, String systemId) throws SAXException, IOException {
        Document varB4EAC82CA7396A68D541C85D26508E83_813709120 = null; //Variable for return #1
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("InputStream cannot be null");
        } //End block
        InputSource in;
        in = new InputSource(is);
        in.setSystemId(systemId);
        varB4EAC82CA7396A68D541C85D26508E83_813709120 = parse(in);
        addTaint(is.getTaint());
        addTaint(systemId.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_813709120.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_813709120;
        // ---------- Original Method ----------
        //if (is == null) {
            //throw new IllegalArgumentException("InputStream cannot be null");
        //}
        //InputSource in = new InputSource(is);
        //in.setSystemId(systemId);
        //return parse(in);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:01.885 -0400", hash_original_method = "595BF8AC63AB584AD723E5F0FBAE035E", hash_generated_method = "8BBD35D400254FCD42C701599B6FF493")
    public Document parse(String uri) throws SAXException, IOException {
        Document varB4EAC82CA7396A68D541C85D26508E83_751789178 = null; //Variable for return #1
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("URI cannot be null");
        } //End block
        InputSource in;
        in = new InputSource(uri);
        varB4EAC82CA7396A68D541C85D26508E83_751789178 = parse(in);
        addTaint(uri.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_751789178.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_751789178;
        // ---------- Original Method ----------
        //if (uri == null) {
            //throw new IllegalArgumentException("URI cannot be null");
        //}
        //InputSource in = new InputSource(uri);
        //return parse(in);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:01.893 -0400", hash_original_method = "F95298F4448DE156B1C85F49780E514D", hash_generated_method = "AA5CE150EDE077358FF61CD31505045E")
    public Document parse(File f) throws SAXException, IOException {
        Document varB4EAC82CA7396A68D541C85D26508E83_570866954 = null; //Variable for return #1
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("File cannot be null");
        } //End block
        String escapedURI;
        escapedURI = FilePathToURI.filepath2URI(f.getAbsolutePath());
        {
            System.out.println("Escaped URI = " + escapedURI);
        } //End block
        InputSource in;
        in = new InputSource(escapedURI);
        varB4EAC82CA7396A68D541C85D26508E83_570866954 = parse(in);
        addTaint(f.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_570866954.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_570866954;
        // ---------- Original Method ----------
        //if (f == null) {
            //throw new IllegalArgumentException("File cannot be null");
        //}
        //String escapedURI = FilePathToURI.filepath2URI(f.getAbsolutePath());
        //if (DEBUG) {
            //System.out.println("Escaped URI = " + escapedURI);
        //}
        //InputSource in = new InputSource(escapedURI);
        //return parse(in);
    }

    
    public abstract Document parse(InputSource is)
        throws  SAXException, IOException;

    
    public abstract boolean isNamespaceAware();

    
    public abstract boolean isValidating();

    
    public abstract void setEntityResolver(EntityResolver er);

    
    public abstract void setErrorHandler(ErrorHandler eh);

    
    public abstract Document newDocument();

    
    public abstract DOMImplementation getDOMImplementation();

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:01.897 -0400", hash_original_method = "0EC7A1CF3FE0EA75043A7D33C5A41123", hash_generated_method = "2E2EBD7A2D5464481CAA84ECE27CE0D0")
    public Schema getSchema() {
        if (DroidSafeAndroidRuntime.control) throw new UnsupportedOperationException(
            "This parser does not support specification \""
            + this.getClass().getPackage().getSpecificationTitle()
            + "\" version \""
            + this.getClass().getPackage().getSpecificationVersion()
            + "\""
            );
        // ---------- Original Method ----------
        //throw new UnsupportedOperationException(
            //"This parser does not support specification \""
            //+ this.getClass().getPackage().getSpecificationTitle()
            //+ "\" version \""
            //+ this.getClass().getPackage().getSpecificationVersion()
            //+ "\""
            //);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:01.897 -0400", hash_original_method = "2D701854F0A16C5A4E7C38BB02DF4544", hash_generated_method = "913952F190C808759BAC4BAE41E090E0")
    public boolean isXIncludeAware() {
        if (DroidSafeAndroidRuntime.control) throw new UnsupportedOperationException(
            "This parser does not support specification \""
            + this.getClass().getPackage().getSpecificationTitle()
            + "\" version \""
            + this.getClass().getPackage().getSpecificationVersion()
            + "\""
            );
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1481610767 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1481610767;
        // ---------- Original Method ----------
        //throw new UnsupportedOperationException(
            //"This parser does not support specification \""
            //+ this.getClass().getPackage().getSpecificationTitle()
            //+ "\" version \""
            //+ this.getClass().getPackage().getSpecificationVersion()
            //+ "\""
            //);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:01.897 -0400", hash_original_field = "021906CCEC815FC820B74F760E7368C7", hash_generated_field = "E83DF1E2E661A92B1AFDA8C473D190B2")

    private static boolean DEBUG = false;
}

