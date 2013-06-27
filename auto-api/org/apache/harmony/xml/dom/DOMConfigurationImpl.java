package org.apache.harmony.xml.dom;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMError;
import org.w3c.dom.DOMErrorHandler;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMStringList;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public final class DOMConfigurationImpl implements DOMConfiguration {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.815 -0400", hash_original_field = "88667684FBB30FAC95A75D39520ACEEF", hash_generated_field = "5ED7B0BC2D04FF583BB30F785E29E32B")

    private boolean cdataSections = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.828 -0400", hash_original_field = "AC6CB9F900E4AC822CC7D7503C4FB949", hash_generated_field = "CDB6C8A59587D4B38723E8D62E318D78")

    private boolean comments = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.828 -0400", hash_original_field = "DEFBCF7EA9D0ED7B3379095476F4AB13", hash_generated_field = "B4FFAE981AB95B3BAB64727BA2BE14B8")

    private boolean datatypeNormalization = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.828 -0400", hash_original_field = "DB0E754A3DBCB0D9242079E6551B6F07", hash_generated_field = "0899F7E4099371810DFD0ED4613D56AF")

    private boolean entities = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.828 -0400", hash_original_field = "F56352FA359A5F4533A25E5F29D527F4", hash_generated_field = "C593DE14B1A4C8EDDB3A2D02ECCEAC59")

    private DOMErrorHandler errorHandler;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.828 -0400", hash_original_field = "312A8D34A10A42AF3135F707FD689CB4", hash_generated_field = "F2647CFF1692834895465A43B4FBE112")

    private boolean namespaces = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.828 -0400", hash_original_field = "5B05AC4441A4449CBA0DFDBA2688DC56", hash_generated_field = "4E5247B7654703F0DC11D1A6647320E7")

    private String schemaLocation;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.828 -0400", hash_original_field = "95683761337FDA3D94293B79FEDD4046", hash_generated_field = "8BB5B57F71ABC60D10B8C43C61B09782")

    private String schemaType;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.828 -0400", hash_original_field = "63E63286318457EDDE538415EB66AE23", hash_generated_field = "252D4DD458506543FA976A984A9E322B")

    private boolean splitCdataSections = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.828 -0400", hash_original_field = "6AB193C06927C8434BA70FB40E80FC09", hash_generated_field = "BB829D4F8EE6AEB873AE518F7EBB8303")

    private boolean validate = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.828 -0400", hash_original_field = "5C017D12AF213FE0B9E33CC2EFDD8EA5", hash_generated_field = "5203D1AF6935072C8F57FB747FAEF7C6")

    private boolean wellFormed = true;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.828 -0400", hash_original_method = "4D153F5051BE9FB53ACB86332ED9FE59", hash_generated_method = "4D153F5051BE9FB53ACB86332ED9FE59")
    public DOMConfigurationImpl ()
    {
        //Synthesized constructor
    }


    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.828 -0400", hash_original_method = "5F5EB2ABC8B048DBE9223C434320CDED", hash_generated_method = "32FAC8671844F5100ED4364F93DB33A9")
    public boolean canSetParameter(String name, Object value) {
        Parameter parameter;
        parameter = PARAMETERS.get(name);
        boolean var59F2D60379DF79AEFF6AEA7982825E2A_840097084 = (parameter != null && parameter.canSet(this, value));
        addTaint(name.getTaint());
        addTaint(value.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1205546628 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1205546628;
        // ---------- Original Method ----------
        //Parameter parameter = PARAMETERS.get(name);
        //return parameter != null && parameter.canSet(this, value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.829 -0400", hash_original_method = "F200B80DD8F3D3ABFAA5C6CAA3AC3079", hash_generated_method = "301CE288C7731B150BEDF83A85DB654A")
    public void setParameter(String name, Object value) throws DOMException {
        Parameter parameter;
        parameter = PARAMETERS.get(name);
        {
            if (DroidSafeAndroidRuntime.control) throw new DOMException(DOMException.NOT_FOUND_ERR, "No such parameter: " + name);
        } //End block
        try 
        {
            parameter.set(this, value);
        } //End block
        catch (NullPointerException e)
        {
            if (DroidSafeAndroidRuntime.control) throw new DOMException(DOMException.TYPE_MISMATCH_ERR,
                    "Null not allowed for " + name);
        } //End block
        catch (ClassCastException e)
        {
            if (DroidSafeAndroidRuntime.control) throw new DOMException(DOMException.TYPE_MISMATCH_ERR,
                    "Invalid type for " + name + ": " + value.getClass());
        } //End block
        addTaint(name.getTaint());
        addTaint(value.getTaint());
        // ---------- Original Method ----------
        //Parameter parameter = PARAMETERS.get(name);
        //if (parameter == null) {
            //throw new DOMException(DOMException.NOT_FOUND_ERR, "No such parameter: " + name);
        //}
        //try {
            //parameter.set(this, value);
        //} catch (NullPointerException e) {
            //throw new DOMException(DOMException.TYPE_MISMATCH_ERR,
                    //"Null not allowed for " + name);
        //} catch (ClassCastException e) {
            //throw new DOMException(DOMException.TYPE_MISMATCH_ERR,
                    //"Invalid type for " + name + ": " + value.getClass());
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.829 -0400", hash_original_method = "4C81A8ACD622F0BCFE1551B59FC6CCCF", hash_generated_method = "970F8C25352B08B08D5E15A3793B9B18")
    public Object getParameter(String name) throws DOMException {
        Object varB4EAC82CA7396A68D541C85D26508E83_585299308 = null; //Variable for return #1
        Parameter parameter;
        parameter = PARAMETERS.get(name);
        {
            if (DroidSafeAndroidRuntime.control) throw new DOMException(DOMException.NOT_FOUND_ERR, "No such parameter: " + name);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_585299308 = parameter.get(this);
        addTaint(name.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_585299308.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_585299308;
        // ---------- Original Method ----------
        //Parameter parameter = PARAMETERS.get(name);
        //if (parameter == null) {
            //throw new DOMException(DOMException.NOT_FOUND_ERR, "No such parameter: " + name);
        //}
        //return parameter.get(this);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.830 -0400", hash_original_method = "95541708528899B2117FFEEED54CDAAC", hash_generated_method = "BFAEFABDAE1EDD1651FABB51B99ACA24")
    public DOMStringList getParameterNames() {
        DOMStringList varB4EAC82CA7396A68D541C85D26508E83_666633462 = null; //Variable for return #1
        String[] result;
        result = PARAMETERS.keySet().toArray(new String[PARAMETERS.size()]);
        varB4EAC82CA7396A68D541C85D26508E83_666633462 = new DOMStringList() {
            public String item(int index) {
                return index < result.length ? result[index] : null;
            }
            public int getLength() {
                return result.length;
            }
            public boolean contains(String str) {
                return PARAMETERS.containsKey(str); 
            }
        };
        varB4EAC82CA7396A68D541C85D26508E83_666633462.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_666633462;
        // ---------- Original Method ----------
        //final String[] result = PARAMETERS.keySet().toArray(new String[PARAMETERS.size()]);
        //return new DOMStringList() {
            //public String item(int index) {
                //return index < result.length ? result[index] : null;
            //}
            //public int getLength() {
                //return result.length;
            //}
            //public boolean contains(String str) {
                //return PARAMETERS.containsKey(str); 
            //}
        //};
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.838 -0400", hash_original_method = "89B49C7AFC8106B5DCE888AAFD47AF2F", hash_generated_method = "56DD1F08B05A10A09F6D8A27C52E2EDA")
    public void normalize(Node node) {
        {
            Object var09E3B15CD8604B5CA0883ABFA37862BC_1673159918 = (node.getNodeType());
            //Begin case Node.CDATA_SECTION_NODE 
            CDATASectionImpl cdata;
            cdata = (CDATASectionImpl) node;
            //End case Node.CDATA_SECTION_NODE 
            //Begin case Node.CDATA_SECTION_NODE 
            {
                {
                    boolean varF53537D16E4DE2BC176C0CE1403CCB89_230107947 = (cdata.needsSplitting());
                    {
                        {
                            cdata.split();
                            report(DOMError.SEVERITY_WARNING, "cdata-sections-splitted");
                        } //End block
                        {
                            report(DOMError.SEVERITY_ERROR, "wf-invalid-character");
                        } //End block
                    } //End block
                } //End collapsed parenthetic
                checkTextValidity(cdata.buffer);
            } //End block
            //End case Node.CDATA_SECTION_NODE 
            //Begin case Node.CDATA_SECTION_NODE 
            node = cdata.replaceWithText();
            //End case Node.CDATA_SECTION_NODE 
            //Begin case Node.TEXT_NODE 
            TextImpl text;
            text = (TextImpl) node;
            //End case Node.TEXT_NODE 
            //Begin case Node.TEXT_NODE 
            text = text.minimize();
            //End case Node.TEXT_NODE 
            //Begin case Node.TEXT_NODE 
            {
                checkTextValidity(text.buffer);
            } //End block
            //End case Node.TEXT_NODE 
            //Begin case Node.COMMENT_NODE 
            CommentImpl comment;
            comment = (CommentImpl) node;
            //End case Node.COMMENT_NODE 
            //Begin case Node.COMMENT_NODE 
            {
                comment.getParentNode().removeChild(comment);
            } //End block
            //End case Node.COMMENT_NODE 
            //Begin case Node.COMMENT_NODE 
            {
                boolean varBA396D41C31642F943B18CB50D39518A_288284323 = (comment.containsDashDash());
                {
                    report(DOMError.SEVERITY_ERROR, "wf-invalid-character");
                } //End block
            } //End collapsed parenthetic
            //End case Node.COMMENT_NODE 
            //Begin case Node.COMMENT_NODE 
            checkTextValidity(comment.buffer);
            //End case Node.COMMENT_NODE 
            //Begin case Node.PROCESSING_INSTRUCTION_NODE 
            checkTextValidity(((ProcessingInstructionImpl) node).getData());
            //End case Node.PROCESSING_INSTRUCTION_NODE 
            //Begin case Node.ATTRIBUTE_NODE 
            checkTextValidity(((AttrImpl) node).getValue());
            //End case Node.ATTRIBUTE_NODE 
            //Begin case Node.ELEMENT_NODE 
            ElementImpl element;
            element = (ElementImpl) node;
            //End case Node.ELEMENT_NODE 
            //Begin case Node.ELEMENT_NODE 
            NamedNodeMap attributes;
            attributes = element.getAttributes();
            //End case Node.ELEMENT_NODE 
            //Begin case Node.ELEMENT_NODE 
            {
                int i;
                i = 0;
                boolean varB52A5F5C76706054FE03857094E040A4_689100295 = (i < attributes.getLength());
                {
                    normalize(attributes.item(i));
                } //End block
            } //End collapsed parenthetic
            //End case Node.ELEMENT_NODE 
            //Begin case Node.DOCUMENT_NODE Node.DOCUMENT_FRAGMENT_NODE 
            Node next;
            //End case Node.DOCUMENT_NODE Node.DOCUMENT_FRAGMENT_NODE 
            //Begin case Node.DOCUMENT_NODE Node.DOCUMENT_FRAGMENT_NODE 
            {
                Node child;
                child = node.getFirstChild();
                child = next;
                {
                    next = child.getNextSibling();
                    normalize(child);
                } //End block
            } //End collapsed parenthetic
            //End case Node.DOCUMENT_NODE Node.DOCUMENT_FRAGMENT_NODE 
            //Begin case default 
            if (DroidSafeAndroidRuntime.control) throw new DOMException(DOMException.NOT_SUPPORTED_ERR,
                        "Unsupported node type " + node.getNodeType());
            //End case default 
        } //End collapsed parenthetic
        addTaint(node.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.848 -0400", hash_original_method = "1D4ECB40573303902DF99E5874724C46", hash_generated_method = "ED7195C4746B6F999C0146F703CA559C")
    private void checkTextValidity(CharSequence s) {
        {
            boolean varDE0C170823F5DE2F72932472C20834E2_54551223 = (wellFormed && !isValid(s));
            {
                report(DOMError.SEVERITY_ERROR, "wf-invalid-character");
            } //End block
        } //End collapsed parenthetic
        addTaint(s.getTaint());
        // ---------- Original Method ----------
        //if (wellFormed && !isValid(s)) {
            //report(DOMError.SEVERITY_ERROR, "wf-invalid-character");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.849 -0400", hash_original_method = "E3663B8D897962AAB4126247F22D681E", hash_generated_method = "03EC23486EBF630B021E466695A9DC61")
    private boolean isValid(CharSequence text) {
        {
            int i;
            i = 0;
            boolean var09A513B6E63B388E1018609860421E92_237258424 = (i < text.length());
            {
                char c;
                c = text.charAt(i);
                boolean valid;
                valid = c == 0x9 || c == 0xA || c == 0xD
                    || (c >= 0x20 && c <= 0xd7ff)
                    || (c >= 0xe000 && c <= 0xfffd);
            } //End block
        } //End collapsed parenthetic
        addTaint(text.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_876982326 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_876982326;
        // ---------- Original Method ----------
        //for (int i = 0; i < text.length(); i++) {
            //char c = text.charAt(i);
            //boolean valid = c == 0x9 || c == 0xA || c == 0xD
                    //|| (c >= 0x20 && c <= 0xd7ff)
                    //|| (c >= 0xe000 && c <= 0xfffd);
            //if (!valid) {
                //return false;
            //}
        //}
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.849 -0400", hash_original_method = "9DB2BD31AEB3F11512B5C9ACC16D052B", hash_generated_method = "6D59703D0F4ED5EEF88B0248AD35A30B")
    private void report(short severity, String type) {
        {
            errorHandler.handleError(new DOMErrorImpl(severity, type));
        } //End block
        addTaint(severity);
        addTaint(type.getTaint());
        // ---------- Original Method ----------
        //if (errorHandler != null) {
            //errorHandler.handleError(new DOMErrorImpl(severity, type));
        //}
    }

    
    static class FixedParameter implements Parameter {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.850 -0400", hash_original_field = "D5CCF1C24409E8FF388AC557FA1C3923", hash_generated_field = "95587A84CAA85CC05C4823B1B5D207DB")

        Object onlyValue;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.850 -0400", hash_original_method = "4AEE734B1EFD8A5D4A3557C383752F00", hash_generated_method = "A506FC59BBF6CC43F79B603F40D6503D")
          FixedParameter(Object onlyValue) {
            this.onlyValue = onlyValue;
            // ---------- Original Method ----------
            //this.onlyValue = onlyValue;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.850 -0400", hash_original_method = "580583282F0D57EA1D5F8BCC7DFB7226", hash_generated_method = "FE6EA7125EDA5D7B0A076C207A803867")
        public Object get(DOMConfigurationImpl config) {
            Object varB4EAC82CA7396A68D541C85D26508E83_1976995584 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_1976995584 = onlyValue;
            addTaint(config.getTaint());
            varB4EAC82CA7396A68D541C85D26508E83_1976995584.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_1976995584;
            // ---------- Original Method ----------
            //return onlyValue;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.866 -0400", hash_original_method = "403AFB4EBDC51E40E976B1F523409C3A", hash_generated_method = "C7AA081FDDA9519F02A7001A34BA0ECD")
        public void set(DOMConfigurationImpl config, Object value) {
            {
                boolean var84D9E80B9B225BB6F3DE78B8079DA4A9_1734880617 = (!onlyValue.equals(value));
                {
                    if (DroidSafeAndroidRuntime.control) throw new DOMException(DOMException.NOT_SUPPORTED_ERR,
                        "Unsupported value: " + value);
                } //End block
            } //End collapsed parenthetic
            addTaint(config.getTaint());
            addTaint(value.getTaint());
            // ---------- Original Method ----------
            //if (!onlyValue.equals(value)) {
                //throw new DOMException(DOMException.NOT_SUPPORTED_ERR,
                        //"Unsupported value: " + value);
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.867 -0400", hash_original_method = "94364F826E7659C79EA0A17708890F8B", hash_generated_method = "AE9A2F3FD8B9E1FB4938F4D7C59F021C")
        public boolean canSet(DOMConfigurationImpl config, Object value) {
            boolean var433AF86F19244B8241FCFE7BDE982C20_1926023124 = (onlyValue.equals(value));
            addTaint(config.getTaint());
            addTaint(value.getTaint());
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_838811957 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_838811957;
            // ---------- Original Method ----------
            //return onlyValue.equals(value);
        }

        
    }


    
    static abstract class BooleanParameter implements Parameter {
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.867 -0400", hash_original_method = "51C6AD17F5451D33F04DE00B4C815245", hash_generated_method = "51C6AD17F5451D33F04DE00B4C815245")
        public BooleanParameter ()
        {
            //Synthesized constructor
        }


        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.867 -0400", hash_original_method = "BF6F151915BB667F3BD2F9A011756FE4", hash_generated_method = "EAE32E0AD0CB0E9563C9D2B610C45414")
        public boolean canSet(DOMConfigurationImpl config, Object value) {
            addTaint(config.getTaint());
            addTaint(value.getTaint());
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1037717630 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1037717630;
            // ---------- Original Method ----------
            //return value instanceof Boolean;
        }

        
    }


    
    interface Parameter {
        Object get(DOMConfigurationImpl config);
        void set(DOMConfigurationImpl config, Object value);
        boolean canSet(DOMConfigurationImpl config, Object value);
    }
    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.868 -0400", hash_original_field = "FE2A13E70A5AD5AD7A8D43D91F2FE2FF", hash_generated_field = "B6B42EE3C6A0FF6B694CD6EFFB8F2C37")

    private static Map<String, Parameter> PARAMETERS = new TreeMap<String, Parameter>(String.CASE_INSENSITIVE_ORDER);
    static {
        PARAMETERS.put("canonical-form", new FixedParameter(false));
        PARAMETERS.put("cdata-sections", new BooleanParameter() {
            public Object get(DOMConfigurationImpl config) {
                return config.cdataSections;
            }
            public void set(DOMConfigurationImpl config, Object value) {
                config.cdataSections = (Boolean) value;
            }
        });
        PARAMETERS.put("check-character-normalization", new FixedParameter(false));
        PARAMETERS.put("comments", new BooleanParameter() {
            public Object get(DOMConfigurationImpl config) {
                return config.comments;
            }
            public void set(DOMConfigurationImpl config, Object value) {
                config.comments = (Boolean) value;
            }
        });
        PARAMETERS.put("datatype-normalization", new BooleanParameter() {
            public Object get(DOMConfigurationImpl config) {
                return config.datatypeNormalization;
            }
            public void set(DOMConfigurationImpl config, Object value) {
                if ((Boolean) value) {
                    config.datatypeNormalization = true;
                    config.validate = true;
                } else {
                    config.datatypeNormalization = false;
                }
            }
        });
        PARAMETERS.put("element-content-whitespace", new FixedParameter(true));
        PARAMETERS.put("entities", new BooleanParameter() {
            public Object get(DOMConfigurationImpl config) {
                return config.entities;
            }
            public void set(DOMConfigurationImpl config, Object value) {
                config.entities = (Boolean) value;
            }
        });
        PARAMETERS.put("error-handler", new Parameter() {
            public Object get(DOMConfigurationImpl config) {
                return config.errorHandler;
            }
            public void set(DOMConfigurationImpl config, Object value) {
                config.errorHandler = (DOMErrorHandler) value;
            }
            public boolean canSet(DOMConfigurationImpl config, Object value) {
                return value == null || value instanceof DOMErrorHandler;
            }
        });
        PARAMETERS.put("infoset", new BooleanParameter() {
            public Object get(DOMConfigurationImpl config) {
                return !config.entities
                        && !config.datatypeNormalization
                        && !config.cdataSections
                        && config.wellFormed
                        && config.comments
                        && config.namespaces;
            }
            public void set(DOMConfigurationImpl config, Object value) {
                if ((Boolean) value) {
                    config.entities = false;
                    config.datatypeNormalization = false;
                    config.cdataSections = false;
                    config.wellFormed = true;
                    config.comments = true;
                    config.namespaces = true;
                }
            }
        });
        PARAMETERS.put("namespaces", new BooleanParameter() {
            public Object get(DOMConfigurationImpl config) {
                return config.namespaces;
            }
            public void set(DOMConfigurationImpl config, Object value) {
                config.namespaces = (Boolean) value;
            }
        });
        PARAMETERS.put("namespace-declarations", new FixedParameter(true));
        PARAMETERS.put("normalize-characters", new FixedParameter(false));
        PARAMETERS.put("schema-location", new Parameter() {
            public Object get(DOMConfigurationImpl config) {
                return config.schemaLocation;
            }
            public void set(DOMConfigurationImpl config, Object value) {
                config.schemaLocation = (String) value;
            }
            public boolean canSet(DOMConfigurationImpl config, Object value) {
                return value == null || value instanceof String;
            }
        });
        PARAMETERS.put("schema-type", new Parameter() {
            public Object get(DOMConfigurationImpl config) {
                return config.schemaType;
            }
            public void set(DOMConfigurationImpl config, Object value) {
                config.schemaType = (String) value;
            }
            public boolean canSet(DOMConfigurationImpl config, Object value) {
                return value == null || value instanceof String;
            }
        });
        PARAMETERS.put("split-cdata-sections", new BooleanParameter() {
            public Object get(DOMConfigurationImpl config) {
                return config.splitCdataSections;
            }
            public void set(DOMConfigurationImpl config, Object value) {
                config.splitCdataSections = (Boolean) value;
            }
        });
        PARAMETERS.put("validate", new BooleanParameter() {
            public Object get(DOMConfigurationImpl config) {
                return config.validate;
            }
            public void set(DOMConfigurationImpl config, Object value) {
                config.validate = (Boolean) value;
            }
        });
        PARAMETERS.put("validate-if-schema", new FixedParameter(false));
        PARAMETERS.put("well-formed", new BooleanParameter() {
            public Object get(DOMConfigurationImpl config) {
                return config.wellFormed;
            }
            public void set(DOMConfigurationImpl config, Object value) {
                config.wellFormed = (Boolean) value;
            }
        });
    }
    
}

