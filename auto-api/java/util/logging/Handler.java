package java.util.logging;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public abstract class Handler {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.077 -0400", hash_original_field = "64F93D01E165083D0DC505B68AA2262A", hash_generated_field = "DEE7EAAE0C2AC4A8B1FAFE0F9E9DFB7A")

    private ErrorManager errorMan;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.077 -0400", hash_original_field = "84BEA1F0FD2CE16F7E562A9F06EF03D3", hash_generated_field = "AA03A19AA54A465901EEA798BB232EAE")

    private String encoding;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.077 -0400", hash_original_field = "C9E9A848920877E76685B2E4E76DE38D", hash_generated_field = "D176117E1979538AD7BA6376A3FC48D1")

    private Level level;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.077 -0400", hash_original_field = "F2FFC59487832CBAD265A8FEF2133592", hash_generated_field = "83002D5DCA7A99652BD6403E70FD4EB0")

    private Formatter formatter;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.078 -0400", hash_original_field = "B2C97AE425DD751B0E48A3ACAE79CF4A", hash_generated_field = "74C4F31F2046DF3317E23CAC988BE234")

    private Filter filter;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.078 -0400", hash_original_field = "851F5AC9941D720844D143ED9CFCF60A", hash_generated_field = "F717D382565968ED95842821FAEC62F9")

    private String prefix;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.092 -0400", hash_original_method = "E5C195C4F6A42ED3922A908BC2F6920A", hash_generated_method = "4AD38258785274DDA54C2318D34742C6")
    protected  Handler() {
        this.errorMan = new ErrorManager();
        this.level = DEFAULT_LEVEL;
        this.encoding = null;
        this.filter = null;
        this.formatter = null;
        this.prefix = this.getClass().getName();
        // ---------- Original Method ----------
        //this.errorMan = new ErrorManager();
        //this.level = DEFAULT_LEVEL;
        //this.encoding = null;
        //this.filter = null;
        //this.formatter = null;
        //this.prefix = this.getClass().getName();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.093 -0400", hash_original_method = "505322F9A2F9CDB1C20F31F6B7CB4718", hash_generated_method = "0D61DF187637395B28C7B64AAC049367")
    private Object getDefaultInstance(String className) {
        Object varB4EAC82CA7396A68D541C85D26508E83_1245710361 = null; //Variable for return #1
        Object varB4EAC82CA7396A68D541C85D26508E83_1242528851 = null; //Variable for return #2
        Object result;
        result = null;
        {
            varB4EAC82CA7396A68D541C85D26508E83_1245710361 = result;
        } //End block
        try 
        {
            result = Class.forName(className).newInstance();
        } //End block
        catch (Exception e)
        { }
        varB4EAC82CA7396A68D541C85D26508E83_1242528851 = result;
        addTaint(className.getTaint());
        Object varA7E53CE21691AB073D9660D615818899_1858375514; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1858375514 = varB4EAC82CA7396A68D541C85D26508E83_1245710361;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1858375514 = varB4EAC82CA7396A68D541C85D26508E83_1242528851;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1858375514.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1858375514;
        // ---------- Original Method ----------
        //Object result = null;
        //if (className == null) {
            //return result;
        //}
        //try {
            //result = Class.forName(className).newInstance();
        //} catch (Exception e) {
        //}
        //return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.203 -0400", hash_original_method = "B808F11DA6FC61C942B2D7F2A86E3C09", hash_generated_method = "1E2200E308D5DE291795A50BDF3AB52E")
    private Object getCustomizeInstance(final String className) throws Exception {
        Object varB4EAC82CA7396A68D541C85D26508E83_1105105927 = null; //Variable for return #1
        ClassLoader loader;
        loader = Thread.currentThread().getContextClassLoader();
        {
            loader = ClassLoader.getSystemClassLoader();
        } //End block
        Class<?> c;
        c = loader.loadClass(className);
        varB4EAC82CA7396A68D541C85D26508E83_1105105927 = c.newInstance();
        addTaint(className.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1105105927.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1105105927;
        // ---------- Original Method ----------
        //ClassLoader loader = Thread.currentThread().getContextClassLoader();
        //if (loader == null) {
            //loader = ClassLoader.getSystemClassLoader();
        //}
        //Class<?> c = loader.loadClass(className);
        //return c.newInstance();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.204 -0400", hash_original_method = "B5D56DC5C4B8FE4C311A48E44264ABBB", hash_generated_method = "8ECCEE92D6B0702A8069FDB20075B657")
     void printInvalidPropMessage(String key, String value, Exception e) {
        String msg;
        msg = "Invalid property value for " + prefix + ":" + key + "/" + value;
        errorMan.error(msg, e, ErrorManager.GENERIC_FAILURE);
        addTaint(key.getTaint());
        addTaint(value.getTaint());
        addTaint(e.getTaint());
        // ---------- Original Method ----------
        //String msg = "Invalid property value for " + prefix + ":" + key + "/" + value;
        //errorMan.error(msg, e, ErrorManager.GENERIC_FAILURE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.226 -0400", hash_original_method = "329775ED115F17D9C0AB62A79233F4A6", hash_generated_method = "76139230BFC2733E8D4E3A9C191E5499")
     void initProperties(String defaultLevel, String defaultFilter,
            String defaultFormatter, String defaultEncoding) {
        LogManager manager;
        manager = LogManager.getLogManager();
        String filterName;
        filterName = manager.getProperty(prefix + ".filter");
        {
            try 
            {
                filter = (Filter) getCustomizeInstance(filterName);
            } //End block
            catch (Exception e1)
            {
                printInvalidPropMessage("filter", filterName, e1);
                filter = (Filter) getDefaultInstance(defaultFilter);
            } //End block
        } //End block
        {
            filter = (Filter) getDefaultInstance(defaultFilter);
        } //End block
        String levelName;
        levelName = manager.getProperty(prefix + ".level");
        {
            try 
            {
                level = Level.parse(levelName);
            } //End block
            catch (Exception e)
            {
                printInvalidPropMessage("level", levelName, e);
                level = Level.parse(defaultLevel);
            } //End block
        } //End block
        {
            level = Level.parse(defaultLevel);
        } //End block
        String formatterName;
        formatterName = manager.getProperty(prefix + ".formatter");
        {
            try 
            {
                formatter = (Formatter) getCustomizeInstance(formatterName);
            } //End block
            catch (Exception e)
            {
                printInvalidPropMessage("formatter", formatterName, e);
                formatter = (Formatter) getDefaultInstance(defaultFormatter);
            } //End block
        } //End block
        {
            formatter = (Formatter) getDefaultInstance(defaultFormatter);
        } //End block
        String encodingName;
        encodingName = manager.getProperty(prefix + ".encoding");
        try 
        {
            internalSetEncoding(encodingName);
        } //End block
        catch (UnsupportedEncodingException e)
        {
            printInvalidPropMessage("encoding", encodingName, e);
        } //End block
        addTaint(defaultEncoding.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    public abstract void close();

    
    public abstract void flush();

    
    public abstract void publish(LogRecord record);

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.228 -0400", hash_original_method = "B6DA448E779CA9929D0D7B4D988D1AFB", hash_generated_method = "E4B18603C343DD9CEE1EE5D445DDDC86")
    public String getEncoding() {
        String varB4EAC82CA7396A68D541C85D26508E83_1008421306 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1008421306 = this.encoding;
        varB4EAC82CA7396A68D541C85D26508E83_1008421306.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1008421306;
        // ---------- Original Method ----------
        //return this.encoding;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.253 -0400", hash_original_method = "E0C8CBFEDB627F2BA4CE76D0A71E633A", hash_generated_method = "FCE88152A5A526BCF97D1969FBEA681D")
    public ErrorManager getErrorManager() {
        ErrorManager varB4EAC82CA7396A68D541C85D26508E83_40507311 = null; //Variable for return #1
        LogManager.getLogManager().checkAccess();
        varB4EAC82CA7396A68D541C85D26508E83_40507311 = this.errorMan;
        varB4EAC82CA7396A68D541C85D26508E83_40507311.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_40507311;
        // ---------- Original Method ----------
        //LogManager.getLogManager().checkAccess();
        //return this.errorMan;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.254 -0400", hash_original_method = "D58C134707557B2D24085330800528E0", hash_generated_method = "9A3B8655BC3B8BD9CB26A7E2197FB67B")
    public Filter getFilter() {
        Filter varB4EAC82CA7396A68D541C85D26508E83_1693851624 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1693851624 = this.filter;
        varB4EAC82CA7396A68D541C85D26508E83_1693851624.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1693851624;
        // ---------- Original Method ----------
        //return this.filter;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.254 -0400", hash_original_method = "A74BB1584114C9889E52E1E2254AF36C", hash_generated_method = "1B5E0A506124174C016A86FA8E9F0029")
    public Formatter getFormatter() {
        Formatter varB4EAC82CA7396A68D541C85D26508E83_315616829 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_315616829 = this.formatter;
        varB4EAC82CA7396A68D541C85D26508E83_315616829.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_315616829;
        // ---------- Original Method ----------
        //return this.formatter;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.255 -0400", hash_original_method = "56C01E3C36F1CAAB6EC71D0FEE2F8D34", hash_generated_method = "9539CD6BB45CFF7D35E4DAC3234682C6")
    public Level getLevel() {
        Level varB4EAC82CA7396A68D541C85D26508E83_1437605002 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1437605002 = this.level;
        varB4EAC82CA7396A68D541C85D26508E83_1437605002.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1437605002;
        // ---------- Original Method ----------
        //return this.level;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.261 -0400", hash_original_method = "CE8301478397D9840767CF11CB8E453A", hash_generated_method = "EED565CD62E034EEA922883227C4C847")
    public boolean isLoggable(LogRecord record) {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
        } //End block
        {
            boolean varC6DC5D3408E80ECFA7CEDDE0672ABB7E_161735135 = (this.level.intValue() == Level.OFF.intValue());
            {
                boolean var1D4F55F3574EBE2A94BF6ED5EDA0E7EA_285333861 = (record.getLevel().intValue() >= this.level.intValue());
                {
                    boolean varFF0BDF006199A98020A7674169EB5A36_74093377 = (this.filter == null || this.filter.isLoggable(record));
                } //End block
            } //End collapsed parenthetic
        } //End collapsed parenthetic
        addTaint(record.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1873022476 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1873022476;
        // ---------- Original Method ----------
        //if (record == null) {
            //throw new NullPointerException();
        //}
        //if (this.level.intValue() == Level.OFF.intValue()) {
            //return false;
        //} else if (record.getLevel().intValue() >= this.level.intValue()) {
            //return this.filter == null || this.filter.isLoggable(record);
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.262 -0400", hash_original_method = "F62113B5966ABE7DC6200BD5FC9C8FC5", hash_generated_method = "0CC409114E4194617957DA8F5E99F18C")
    protected void reportError(String msg, Exception ex, int code) {
        this.errorMan.error(msg, ex, code);
        addTaint(msg.getTaint());
        addTaint(ex.getTaint());
        addTaint(code);
        // ---------- Original Method ----------
        //this.errorMan.error(msg, ex, code);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.287 -0400", hash_original_method = "DC978F88261D557C3638CA74D49294AA", hash_generated_method = "F11F5204EE2EC32196A376CF2913C698")
     void internalSetEncoding(String newEncoding) throws UnsupportedEncodingException {
        {
            this.encoding = null;
        } //End block
        {
            {
                boolean var11B098441035F08402D4AF053DB3FE19_1189159178 = (Charset.isSupported(newEncoding));
                {
                    this.encoding = newEncoding;
                } //End block
                {
                    if (DroidSafeAndroidRuntime.control) throw new UnsupportedEncodingException(newEncoding);
                } //End block
            } //End collapsed parenthetic
        } //End block
        // ---------- Original Method ----------
        //if (newEncoding == null) {
            //this.encoding = null;
        //} else {
            //if (Charset.isSupported(newEncoding)) {
                //this.encoding = newEncoding;
            //} else {
                //throw new UnsupportedEncodingException(newEncoding);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.288 -0400", hash_original_method = "E46261745C62E25D2001A68F77BA37B9", hash_generated_method = "5335FEA30ADD49670765F935CE552975")
    public void setEncoding(String encoding) throws UnsupportedEncodingException {
        LogManager.getLogManager().checkAccess();
        internalSetEncoding(encoding);
        addTaint(encoding.getTaint());
        // ---------- Original Method ----------
        //LogManager.getLogManager().checkAccess();
        //internalSetEncoding(encoding);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.289 -0400", hash_original_method = "041C6EB6ECB5770848F1CB62B0AB93B7", hash_generated_method = "EC2127C7CB48AD3BB9F5E432C54B7F80")
    public void setErrorManager(ErrorManager em) {
        LogManager.getLogManager().checkAccess();
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
        } //End block
        this.errorMan = em;
        // ---------- Original Method ----------
        //LogManager.getLogManager().checkAccess();
        //if (em == null) {
            //throw new NullPointerException();
        //}
        //this.errorMan = em;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.293 -0400", hash_original_method = "18CF3005E196F8EBECF3068D37979086", hash_generated_method = "D619F8118A4E49CDEA2B68F72F4125AC")
    public void setFilter(Filter newFilter) {
        LogManager.getLogManager().checkAccess();
        this.filter = newFilter;
        // ---------- Original Method ----------
        //LogManager.getLogManager().checkAccess();
        //this.filter = newFilter;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.317 -0400", hash_original_method = "DEDBD4D0DEEB998F333BEBDE35469176", hash_generated_method = "907885E8382BD589AB4167E0CA5C56E1")
     void internalSetFormatter(Formatter newFormatter) {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
        } //End block
        this.formatter = newFormatter;
        // ---------- Original Method ----------
        //if (newFormatter == null) {
            //throw new NullPointerException();
        //}
        //this.formatter = newFormatter;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.317 -0400", hash_original_method = "C9CA011EA2B703B6BFC998B221D30A9E", hash_generated_method = "C0C64348FB7ED6D228D512F36F513360")
    public void setFormatter(Formatter newFormatter) {
        LogManager.getLogManager().checkAccess();
        internalSetFormatter(newFormatter);
        addTaint(newFormatter.getTaint());
        // ---------- Original Method ----------
        //LogManager.getLogManager().checkAccess();
        //internalSetFormatter(newFormatter);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.325 -0400", hash_original_method = "AEDF55860BF7C8EC74AABF9FCD3CABC4", hash_generated_method = "5196F74A613B6D919A6565569D709A9E")
    public void setLevel(Level newLevel) {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
        } //End block
        LogManager.getLogManager().checkAccess();
        this.level = newLevel;
        // ---------- Original Method ----------
        //if (newLevel == null) {
            //throw new NullPointerException();
        //}
        //LogManager.getLogManager().checkAccess();
        //this.level = newLevel;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:59.325 -0400", hash_original_field = "4CA0C5D4254FCFAD767C165981DA6256", hash_generated_field = "F47D4AEFA620E4F3F02B561507D95F17")

    private static Level DEFAULT_LEVEL = Level.ALL;
}

