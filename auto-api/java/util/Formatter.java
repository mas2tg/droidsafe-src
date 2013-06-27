package java.util;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.nio.charset.Charset;
import libcore.icu.LocaleData;
import libcore.icu.NativeDecimalFormat;
import libcore.io.IoUtils;

public final class Formatter implements Closeable, Flushable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.432 -0400", hash_original_field = "C68271A63DDBC431C307BEB7D2918275", hash_generated_field = "3DC9338DC786F95D1A95A8961D85A2A6")

    private Appendable out;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.432 -0400", hash_original_field = "FB216D9E8791E63C8D12BDC420956839", hash_generated_field = "3C599F5969C756C105E47474D7BCB663")

    private Locale locale;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.432 -0400", hash_original_field = "61DD86C2DC75C3F569EC619BD283A33F", hash_generated_field = "613B0CE96D5332BFAF1329D4F111938C")

    private Object arg;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.432 -0400", hash_original_field = "1E79543A888DE7BB0ADBB289A8F4251D", hash_generated_field = "AA98B16E301073717D23E903C6D6286D")

    private boolean closed = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.432 -0400", hash_original_field = "B7B849C43DF0AE6D73905E0D7DFFBD21", hash_generated_field = "FB61E2282DE2F9A3C415CEE063007787")

    private FormatToken formatToken;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.432 -0400", hash_original_field = "460DFB1105EAD6E581494BC8EB7172AC", hash_generated_field = "94160D1F6EC5CF5867F2CCE7946E9FCB")

    private IOException lastIOException;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.432 -0400", hash_original_field = "E3E7EE28E6489646D907CCB03E05DAAD", hash_generated_field = "C9E2992A298A3ADEBF6945150F771649")

    private LocaleData localeData;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.433 -0400", hash_original_method = "776A8092D7EB6A8CE9FA3707C90FDC71", hash_generated_method = "84D520F5378D0961C20054F1B6C8CEC3")
    public  Formatter() {
        this(new StringBuilder(), Locale.getDefault());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.433 -0400", hash_original_method = "C10A7E7C6014F1D5457B2868B8DDD5FA", hash_generated_method = "31E6013FD29F4E00375F2E0819EFEC43")
    public  Formatter(Appendable a) {
        this(a, Locale.getDefault());
        addTaint(a.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.433 -0400", hash_original_method = "949ED46E62E9C1FD97345CAB1F572157", hash_generated_method = "1F77DEC42C276C4F532BB809AEBFC555")
    public  Formatter(Locale l) {
        this(new StringBuilder(), l);
        addTaint(l.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.434 -0400", hash_original_method = "731A0E308D6775F1250BD9086CA3748C", hash_generated_method = "76EB4A86010C765538F0CD5F267904FB")
    public  Formatter(Appendable a, Locale l) {
        {
            out = new StringBuilder();
        } //End block
        {
            out = a;
        } //End block
        locale = l;
        // ---------- Original Method ----------
        //if (a == null) {
            //out = new StringBuilder();
        //} else {
            //out = a;
        //}
        //locale = l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.434 -0400", hash_original_method = "55110CB3A063CDDA9DDF2A6FEEDBC4D6", hash_generated_method = "70BDD2B3DD755EDDD96C2C4A66B6ADFD")
    public  Formatter(String fileName) throws FileNotFoundException {
        this(new File(fileName));
        addTaint(fileName.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.434 -0400", hash_original_method = "D05AE6CA9B3694824C73C0B398D66198", hash_generated_method = "5E175B6E8111D40A645C215D023FFEEA")
    public  Formatter(String fileName, String csn) throws FileNotFoundException,
            UnsupportedEncodingException {
        this(new File(fileName), csn);
        addTaint(fileName.getTaint());
        addTaint(csn.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.434 -0400", hash_original_method = "106406A68116E4DC11358A25DB96C9D8", hash_generated_method = "5E89EAE84986EA97D043AD55A3E15F94")
    public  Formatter(String fileName, String csn, Locale l) throws FileNotFoundException, UnsupportedEncodingException {
        this(new File(fileName), csn, l);
        addTaint(fileName.getTaint());
        addTaint(csn.getTaint());
        addTaint(l.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.435 -0400", hash_original_method = "56C5088BBC7ACEBB0E3B42C5FC534A61", hash_generated_method = "589E7B2AC2ADE54B3D54DCD41B50441F")
    public  Formatter(File file) throws FileNotFoundException {
        this(new FileOutputStream(file));
        addTaint(file.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.435 -0400", hash_original_method = "15C3BB1BBEBB7DA2B256558B7A83F1D2", hash_generated_method = "F5E9451ABCBDE9893AA26A6A1D7AA59B")
    public  Formatter(File file, String csn) throws FileNotFoundException,
            UnsupportedEncodingException {
        this(file, csn, Locale.getDefault());
        addTaint(file.getTaint());
        addTaint(csn.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.436 -0400", hash_original_method = "11FC304A866A57AD6707E0AE5ACD74C6", hash_generated_method = "66CFD219CFA238E5D23F00C12D075619")
    public  Formatter(File file, String csn, Locale l) throws FileNotFoundException, UnsupportedEncodingException {
        FileOutputStream fout;
        fout = null;
        try 
        {
            fout = new FileOutputStream(file);
            out = new BufferedWriter(new OutputStreamWriter(fout, csn));
        } //End block
        catch (RuntimeException e)
        {
            IoUtils.closeQuietly(fout);
            if (DroidSafeAndroidRuntime.control) throw e;
        } //End block
        catch (UnsupportedEncodingException e)
        {
            IoUtils.closeQuietly(fout);
            if (DroidSafeAndroidRuntime.control) throw e;
        } //End block
        locale = l;
        addTaint(file.getTaint());
        // ---------- Original Method ----------
        //FileOutputStream fout = null;
        //try {
            //fout = new FileOutputStream(file);
            //out = new BufferedWriter(new OutputStreamWriter(fout, csn));
        //} catch (RuntimeException e) {
            //IoUtils.closeQuietly(fout);
            //throw e;
        //} catch (UnsupportedEncodingException e) {
            //IoUtils.closeQuietly(fout);
            //throw e;
        //}
        //locale = l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.447 -0400", hash_original_method = "18094D8509766CE6FC608D9540C5972B", hash_generated_method = "86DB88A0468A92B37477CC3A3583D801")
    public  Formatter(OutputStream os) {
        out = new BufferedWriter(new OutputStreamWriter(os, Charset.defaultCharset()));
        locale = Locale.getDefault();
        // ---------- Original Method ----------
        //out = new BufferedWriter(new OutputStreamWriter(os, Charset.defaultCharset()));
        //locale = Locale.getDefault();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.447 -0400", hash_original_method = "F6295FD9F7AB3AB7F721531D402E7F81", hash_generated_method = "84790D15860A1225F92619D8FE2D1847")
    public  Formatter(OutputStream os, String csn) throws UnsupportedEncodingException {
        this(os, csn, Locale.getDefault());
        addTaint(os.getTaint());
        addTaint(csn.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.448 -0400", hash_original_method = "339D31BAB557832A3B8A75EB377C0635", hash_generated_method = "8BEF5CEA51D6B567DEC1210198AC5CE9")
    public  Formatter(OutputStream os, String csn, Locale l) throws UnsupportedEncodingException {
        out = new BufferedWriter(new OutputStreamWriter(os, csn));
        locale = l;
        // ---------- Original Method ----------
        //out = new BufferedWriter(new OutputStreamWriter(os, csn));
        //locale = l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.452 -0400", hash_original_method = "6A92C9283CC7B01627E24F0E27824A3B", hash_generated_method = "EF9BC443EC2682F3121DB34BBAB1CB88")
    public  Formatter(PrintStream ps) {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
        } //End block
        out = ps;
        locale = Locale.getDefault();
        // ---------- Original Method ----------
        //if (ps == null) {
            //throw new NullPointerException();
        //}
        //out = ps;
        //locale = Locale.getDefault();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.453 -0400", hash_original_method = "9D62CCD9646FE324AC0FFA6EB7C17C6C", hash_generated_method = "290252297B85389E74E4DE45C54282A3")
    private NativeDecimalFormat getDecimalFormat(String pattern) {
        NativeDecimalFormat varB4EAC82CA7396A68D541C85D26508E83_772691634 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_772691634 = cachedDecimalFormat.get().update(localeData, pattern);
        addTaint(pattern.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_772691634.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_772691634;
        // ---------- Original Method ----------
        //return cachedDecimalFormat.get().update(localeData, pattern);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.454 -0400", hash_original_method = "E3DA6A4C963B6E9187963221C571CEC2", hash_generated_method = "CED13C9417F36F227519AB72CA97A589")
    private void checkNotClosed() {
        {
            if (DroidSafeAndroidRuntime.control) throw new FormatterClosedException();
        } //End block
        // ---------- Original Method ----------
        //if (closed) {
            //throw new FormatterClosedException();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.454 -0400", hash_original_method = "B5A8A4A4A455286143E3BD4E75C6F0FE", hash_generated_method = "E1E0716E72A4AD5B0EA90C282036CDA4")
    public Locale locale() {
        Locale varB4EAC82CA7396A68D541C85D26508E83_236772904 = null; //Variable for return #1
        checkNotClosed();
        varB4EAC82CA7396A68D541C85D26508E83_236772904 = locale;
        varB4EAC82CA7396A68D541C85D26508E83_236772904.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_236772904;
        // ---------- Original Method ----------
        //checkNotClosed();
        //return locale;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.455 -0400", hash_original_method = "D73A5BF8E95D39CBD6819B9B1AA13C8D", hash_generated_method = "E1F19BB639971AD7BFD971DBE22EA849")
    public Appendable out() {
        Appendable varB4EAC82CA7396A68D541C85D26508E83_1890335573 = null; //Variable for return #1
        checkNotClosed();
        varB4EAC82CA7396A68D541C85D26508E83_1890335573 = out;
        varB4EAC82CA7396A68D541C85D26508E83_1890335573.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1890335573;
        // ---------- Original Method ----------
        //checkNotClosed();
        //return out;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.455 -0400", hash_original_method = "39CF8FB3A631311648D12D228411CE26", hash_generated_method = "D629435BD798FAF900EA3CB5E37F257D")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_245328061 = null; //Variable for return #1
        checkNotClosed();
        varB4EAC82CA7396A68D541C85D26508E83_245328061 = out.toString();
        varB4EAC82CA7396A68D541C85D26508E83_245328061.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_245328061;
        // ---------- Original Method ----------
        //checkNotClosed();
        //return out.toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.456 -0400", hash_original_method = "E9CBCF5548B5D691C8801114F0C41C59", hash_generated_method = "013B35C8AAE53BF641F7E9D982E1D4C6")
    public void flush() {
        checkNotClosed();
        {
            try 
            {
                ((Flushable) out).flush();
            } //End block
            catch (IOException e)
            {
                lastIOException = e;
            } //End block
        } //End block
        // ---------- Original Method ----------
        //checkNotClosed();
        //if (out instanceof Flushable) {
            //try {
                //((Flushable) out).flush();
            //} catch (IOException e) {
                //lastIOException = e;
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.465 -0400", hash_original_method = "16C1939C51EF65BBD0A872F925CE78BF", hash_generated_method = "707CBA92274B8C8AF142983EEBDF49F5")
    public void close() {
        {
            closed = true;
            try 
            {
                {
                    ((Closeable) out).close();
                } //End block
            } //End block
            catch (IOException e)
            {
                lastIOException = e;
            } //End block
        } //End block
        // ---------- Original Method ----------
        //if (!closed) {
            //closed = true;
            //try {
                //if (out instanceof Closeable) {
                    //((Closeable) out).close();
                //}
            //} catch (IOException e) {
                //lastIOException = e;
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.466 -0400", hash_original_method = "AF5FE6AF92A07FF4E461FEC03ECD4D84", hash_generated_method = "EEA769EEB339DFFD9709BF5C5DC17E9E")
    public IOException ioException() {
        IOException varB4EAC82CA7396A68D541C85D26508E83_1575888903 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1575888903 = lastIOException;
        varB4EAC82CA7396A68D541C85D26508E83_1575888903.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1575888903;
        // ---------- Original Method ----------
        //return lastIOException;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.467 -0400", hash_original_method = "EE9FCF62B0D200225753D8BA586AA3F5", hash_generated_method = "788E87AEC2A7D52099961AA6D5537782")
    public Formatter format(String format, Object... args) {
        Formatter varB4EAC82CA7396A68D541C85D26508E83_1923392637 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1923392637 = format(this.locale, format, args);
        addTaint(format.getTaint());
        addTaint(args[0].getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1923392637.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1923392637;
        // ---------- Original Method ----------
        //return format(this.locale, format, args);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.468 -0400", hash_original_method = "F45273151F6DD69ACB6CCC03C59753A4", hash_generated_method = "3749D8A288767DD725E9552B6C2A68FE")
    public Formatter format(Locale l, String format, Object... args) {
        Formatter varB4EAC82CA7396A68D541C85D26508E83_112837971 = null; //Variable for return #1
        Locale originalLocale;
        originalLocale = locale;
        try 
        {
            this.locale = (l == null ? Locale.US : l);
            this.localeData = LocaleData.get(locale);
            doFormat(format, args);
        } //End block
        finally 
        {
            this.locale = originalLocale;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_112837971 = this;
        addTaint(format.getTaint());
        addTaint(args[0].getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_112837971.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_112837971;
        // ---------- Original Method ----------
        //Locale originalLocale = locale;
        //try {
            //this.locale = (l == null ? Locale.US : l);
            //this.localeData = LocaleData.get(locale);
            //doFormat(format, args);
        //} finally {
            //this.locale = originalLocale;
        //}
        //return this;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.474 -0400", hash_original_method = "960E24FB807777DEBBE8328729AF6A3F", hash_generated_method = "2D1E8936942173BF05B1349BD5740BD2")
    private void doFormat(String format, Object... args) {
        checkNotClosed();
        FormatSpecifierParser fsp;
        fsp = new FormatSpecifierParser(format);
        int currentObjectIndex;
        currentObjectIndex = 0;
        Object lastArgument;
        lastArgument = null;
        boolean hasLastArgumentSet;
        hasLastArgumentSet = false;
        int length;
        length = format.length();
        int i;
        i = 0;
        {
            int plainTextStart;
            plainTextStart = i;
            int nextPercent;
            nextPercent = format.indexOf('%', i);
            int plainTextEnd;
            plainTextEnd = length;
            plainTextEnd = nextPercent;
            {
                outputCharSequence(format, plainTextStart, plainTextEnd);
            } //End block
            i = plainTextEnd;
            {
                FormatToken token;
                token = fsp.parseFormatToken(i + 1);
                Object argument;
                argument = null;
                {
                    boolean var15437F24151F4B9BB4CF0F9304E51BA9_2147099231 = (token.requireArgument());
                    {
                        int index;
                        boolean varE3D8046091E4D6BBC992AF3D15742E1E_1288181829 = (token.getArgIndex() == FormatToken.UNSET);
                        index = currentObjectIndex++;
                        index = token.getArgIndex();
                        argument = getArgument(args, index, fsp, lastArgument, hasLastArgumentSet);
                        lastArgument = argument;
                        hasLastArgumentSet = true;
                    } //End block
                } //End collapsed parenthetic
                CharSequence substitution;
                substitution = transform(token, argument);
                {
                    outputCharSequence(substitution, 0, substitution.length());
                } //End block
                i = fsp.i;
            } //End block
        } //End block
        addTaint(format.getTaint());
        addTaint(args[0].getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.475 -0400", hash_original_method = "4A93F3F0DF6F4E45CC93AF5660722832", hash_generated_method = "7B8F10843DEF23B6000374A8576830D5")
    private void outputCharSequence(CharSequence cs, int start, int end) {
        try 
        {
            out.append(cs, start, end);
        } //End block
        catch (IOException e)
        {
            lastIOException = e;
        } //End block
        addTaint(cs.getTaint());
        addTaint(start);
        addTaint(end);
        // ---------- Original Method ----------
        //try {
            //out.append(cs, start, end);
        //} catch (IOException e) {
            //lastIOException = e;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.491 -0400", hash_original_method = "4EF20CF84298D39EE17983F53878C341", hash_generated_method = "356619E3E6B728AA5054105BE948DD56")
    private Object getArgument(Object[] args, int index, FormatSpecifierParser fsp,
            Object lastArgument, boolean hasLastArgumentSet) {
        Object varB4EAC82CA7396A68D541C85D26508E83_611906231 = null; //Variable for return #1
        Object varB4EAC82CA7396A68D541C85D26508E83_1460915803 = null; //Variable for return #2
        Object varB4EAC82CA7396A68D541C85D26508E83_135020389 = null; //Variable for return #3
        {
            if (DroidSafeAndroidRuntime.control) throw new MissingFormatArgumentException("<");
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_611906231 = null;
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new MissingFormatArgumentException(fsp.getFormatSpecifierText());
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_1460915803 = lastArgument;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_135020389 = args[index];
        addTaint(args[0].getTaint());
        addTaint(index);
        addTaint(fsp.getTaint());
        addTaint(lastArgument.getTaint());
        addTaint(hasLastArgumentSet);
        Object varA7E53CE21691AB073D9660D615818899_1117294415; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1117294415 = varB4EAC82CA7396A68D541C85D26508E83_611906231;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_1117294415 = varB4EAC82CA7396A68D541C85D26508E83_1460915803;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1117294415 = varB4EAC82CA7396A68D541C85D26508E83_135020389;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1117294415.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1117294415;
        // ---------- Original Method ----------
        //if (index == FormatToken.LAST_ARGUMENT_INDEX && !hasLastArgumentSet) {
            //throw new MissingFormatArgumentException("<");
        //}
        //if (args == null) {
            //return null;
        //}
        //if (index >= args.length) {
            //throw new MissingFormatArgumentException(fsp.getFormatSpecifierText());
        //}
        //if (index == FormatToken.LAST_ARGUMENT_INDEX) {
            //return lastArgument;
        //}
        //return args[index];
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.493 -0400", hash_original_method = "0237F1DF7BD7A386A4F4D1B44D43876F", hash_generated_method = "7E2E940AFF15D6B71F7A214E86C80A49")
    private CharSequence transform(FormatToken token, Object argument) {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_118599313 = null; //Variable for return #1
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1443812627 = null; //Variable for return #2
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_935847221 = null; //Variable for return #3
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_307183159 = null; //Variable for return #4
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_648032700 = null; //Variable for return #5
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_712266077 = null; //Variable for return #6
        this.formatToken = token;
        this.arg = argument;
        {
            boolean var774D16194421B6759CE7C28102870BC1_747891360 = (token.isDefault());
            {
                {
                    Object var3AF4190693AD8752FD689B6D6C2F4FD0_341996876 = (token.getConversionType());
                    //Begin case 's' 
                    {
                        varB4EAC82CA7396A68D541C85D26508E83_118599313 = "null";
                    } //End block
                    {
                        varB4EAC82CA7396A68D541C85D26508E83_1443812627 = arg.toString();
                    } //End block
                    //End case 's' 
                    //Begin case 'd' 
                    boolean needLocalizedDigits;
                    needLocalizedDigits = (localeData.zeroDigit != '0');
                    //End case 'd' 
                    //Begin case 'd' 
                    {
                        {
                            IntegralToString.appendInt((StringBuilder) out, ((Number) arg).intValue());
                            varB4EAC82CA7396A68D541C85D26508E83_935847221 = null;
                        } //End block
                        {
                            IntegralToString.appendLong((StringBuilder) out, ((Long) arg).longValue());
                            varB4EAC82CA7396A68D541C85D26508E83_307183159 = null;
                        } //End block
                    } //End block
                    //End case 'd' 
                    //Begin case 'd' 
                    {
                        String result;
                        result = arg.toString();
                        varB4EAC82CA7396A68D541C85D26508E83_648032700 = needLocalizedDigits ? localizeDigits(result) : result;
                    } //End block
                    //End case 'd' 
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        formatToken.checkFlags(arg);
        CharSequence result;
        {
            Object var1A1A65DF413B75C3108F1920C1E23A5B_2055166188 = (token.getConversionType());
            //Begin case 'B' 'b' 
            result = transformFromBoolean();
            //End case 'B' 'b' 
            //Begin case 'H' 'h' 
            result = transformFromHashCode();
            //End case 'H' 'h' 
            //Begin case 'S' 's' 
            result = transformFromString();
            //End case 'S' 's' 
            //Begin case 'C' 'c' 
            result = transformFromCharacter();
            //End case 'C' 'c' 
            //Begin case 'd' 'o' 'x' 'X' 
            {
                result = transformFromBigInteger();
            } //End block
            {
                result = transformFromInteger();
            } //End block
            //End case 'd' 'o' 'x' 'X' 
            //Begin case 'A' 'a' 'E' 'e' 'f' 'G' 'g' 
            result = transformFromFloat();
            //End case 'A' 'a' 'E' 'e' 'f' 'G' 'g' 
            //Begin case '%' 
            result = transformFromPercent();
            //End case '%' 
            //Begin case 'n' 
            result = System.lineSeparator();
            //End case 'n' 
            //Begin case 't' 'T' 
            result = transformFromDateTime();
            //End case 't' 'T' 
            //Begin case default 
            if (DroidSafeAndroidRuntime.control) throw token.unknownFormatConversionException();
            //End case default 
        } //End collapsed parenthetic
        {
            boolean var1DB4C6B053C2BBEFBDA3D42D86D066E6_1866146269 = (Character.isUpperCase(token.getConversionType()));
            {
                {
                    result = result.toString().toUpperCase(locale);
                } //End block
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_712266077 = result;
        CharSequence varA7E53CE21691AB073D9660D615818899_1638633687; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1638633687 = varB4EAC82CA7396A68D541C85D26508E83_118599313;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_1638633687 = varB4EAC82CA7396A68D541C85D26508E83_1443812627;
                break;
            case 3: //Assign result for return ordinal #3
                varA7E53CE21691AB073D9660D615818899_1638633687 = varB4EAC82CA7396A68D541C85D26508E83_935847221;
                break;
            case 4: //Assign result for return ordinal #4
                varA7E53CE21691AB073D9660D615818899_1638633687 = varB4EAC82CA7396A68D541C85D26508E83_307183159;
                break;
            case 5: //Assign result for return ordinal #5
                varA7E53CE21691AB073D9660D615818899_1638633687 = varB4EAC82CA7396A68D541C85D26508E83_648032700;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1638633687 = varB4EAC82CA7396A68D541C85D26508E83_712266077;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1638633687.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1638633687;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.499 -0400", hash_original_method = "D44F27ADB431306CEB9F9E1F25036901", hash_generated_method = "124E61E1871259646BE10006ACCFBD1F")
    private IllegalFormatConversionException badArgumentType() {
        if (DroidSafeAndroidRuntime.control) throw new IllegalFormatConversionException(formatToken.getConversionType(), arg.getClass());
        // ---------- Original Method ----------
        //throw new IllegalFormatConversionException(formatToken.getConversionType(), arg.getClass());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.502 -0400", hash_original_method = "8CD3AC57424B332A3611698407D98FD3", hash_generated_method = "B484557D5075E732FF51BDE3659BFCFF")
    private CharSequence localizeDigits(CharSequence s) {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_307239433 = null; //Variable for return #1
        int length;
        length = s.length();
        int offsetToLocalizedDigits;
        offsetToLocalizedDigits = localeData.zeroDigit - '0';
        StringBuilder result;
        result = new StringBuilder(length);
        {
            int i;
            i = 0;
            {
                char ch;
                ch = s.charAt(i);
                {
                    ch += offsetToLocalizedDigits;
                } //End block
                result.append(ch);
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_307239433 = result;
        addTaint(s.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_307239433.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_307239433;
        // ---------- Original Method ----------
        //int length = s.length();
        //int offsetToLocalizedDigits = localeData.zeroDigit - '0';
        //StringBuilder result = new StringBuilder(length);
        //for (int i = 0; i < length; ++i) {
            //char ch = s.charAt(i);
            //if (ch >= '0' && ch <= '9') {
                //ch += offsetToLocalizedDigits;
            //}
            //result.append(ch);
        //}
        //return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.503 -0400", hash_original_method = "CC3FF2DA7072A05A8664F97319F6C752", hash_generated_method = "5553DDF9BA830F10E3EC2C349BE8205E")
    private CharSequence insertGrouping(CharSequence s) {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1026255342 = null; //Variable for return #1
        StringBuilder result;
        result = new StringBuilder(s.length() + s.length()/3);
        int digitsLength;
        digitsLength = s.length();
        int i;
        i = 0;
        {
            boolean var9A0E6F317753A236C52C55D585498BB1_857377488 = (s.charAt(0) == '-');
            {
                result.append('-');
            } //End block
        } //End collapsed parenthetic
        int headLength;
        headLength = digitsLength % 3;
        {
            headLength = 3;
        } //End block
        result.append(s, i, i + headLength);
        i += headLength;
        {
            boolean var9E95E9D345FEFD15BDBA0B863D5CE5D9_2099937577 = (i < s.length());
            i += 3;
            {
                result.append(localeData.groupingSeparator);
                result.append(s, i, i + 3);
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1026255342 = result;
        addTaint(s.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1026255342.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1026255342;
        // ---------- Original Method ----------
        //StringBuilder result = new StringBuilder(s.length() + s.length()/3);
        //int digitsLength = s.length();
        //int i = 0;
        //if (s.charAt(0) == '-') {
            //--digitsLength;
            //++i;
            //result.append('-');
        //}
        //int headLength = digitsLength % 3;
        //if (headLength == 0) {
            //headLength = 3;
        //}
        //result.append(s, i, i + headLength);
        //i += headLength;
        //for (; i < s.length(); i += 3) {
            //result.append(localeData.groupingSeparator);
            //result.append(s, i, i + 3);
        //}
        //return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.504 -0400", hash_original_method = "54F34C95EDCEEE411BD250D07A12E500", hash_generated_method = "43C34DCABDE399566D9554B23FF0BD81")
    private CharSequence transformFromBoolean() {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_437168302 = null; //Variable for return #1
        CharSequence result;
        {
            result = arg.toString();
        } //End block
        {
            result = "false";
        } //End block
        {
            result = "true";
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_437168302 = padding(result, 0);
        varB4EAC82CA7396A68D541C85D26508E83_437168302.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_437168302;
        // ---------- Original Method ----------
        //CharSequence result;
        //if (arg instanceof Boolean) {
            //result = arg.toString();
        //} else if (arg == null) {
            //result = "false";
        //} else {
            //result = "true";
        //}
        //return padding(result, 0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.519 -0400", hash_original_method = "FEE63D21FF5AA7B8F21641D7D3CB6697", hash_generated_method = "01FA02EB5AC06CE38E6BE1762340914A")
    private CharSequence transformFromHashCode() {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_2055504460 = null; //Variable for return #1
        CharSequence result;
        {
            result = "null";
        } //End block
        {
            result = Integer.toHexString(arg.hashCode());
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_2055504460 = padding(result, 0);
        varB4EAC82CA7396A68D541C85D26508E83_2055504460.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2055504460;
        // ---------- Original Method ----------
        //CharSequence result;
        //if (arg == null) {
            //result = "null";
        //} else {
            //result = Integer.toHexString(arg.hashCode());
        //}
        //return padding(result, 0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.520 -0400", hash_original_method = "41FDF272148D1D909A3CC241D4F2B404", hash_generated_method = "DFF473BF0176150EFBD69C5A7753677E")
    private CharSequence transformFromString() {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1492759769 = null; //Variable for return #1
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1615320547 = null; //Variable for return #2
        {
            int flags;
            flags = 0;
            {
                flags |= FormattableFlags.LEFT_JUSTIFY;
            } //End block
            {
                flags |= FormattableFlags.ALTERNATE;
            } //End block
            {
                boolean varE5047B2B0C3ABA50902192D0CF9C9641_1260478306 = (Character.isUpperCase(formatToken.getConversionType()));
                {
                    flags |= FormattableFlags.UPPERCASE;
                } //End block
            } //End collapsed parenthetic
            ((Formattable) arg).formatTo(this, flags, formatToken.getWidth(),
                    formatToken.getPrecision());
            varB4EAC82CA7396A68D541C85D26508E83_1492759769 = null;
        } //End block
        CharSequence result;
        result = arg.toString();
        result = "null";
        varB4EAC82CA7396A68D541C85D26508E83_1615320547 = padding(result, 0);
        CharSequence varA7E53CE21691AB073D9660D615818899_68947223; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_68947223 = varB4EAC82CA7396A68D541C85D26508E83_1492759769;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_68947223 = varB4EAC82CA7396A68D541C85D26508E83_1615320547;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_68947223.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_68947223;
        // ---------- Original Method ----------
        //if (arg instanceof Formattable) {
            //int flags = 0;
            //if (formatToken.flagMinus) {
                //flags |= FormattableFlags.LEFT_JUSTIFY;
            //}
            //if (formatToken.flagSharp) {
                //flags |= FormattableFlags.ALTERNATE;
            //}
            //if (Character.isUpperCase(formatToken.getConversionType())) {
                //flags |= FormattableFlags.UPPERCASE;
            //}
            //((Formattable) arg).formatTo(this, flags, formatToken.getWidth(),
                    //formatToken.getPrecision());
            //return null;
        //}
        //CharSequence result = arg != null ? arg.toString() : "null";
        //return padding(result, 0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.521 -0400", hash_original_method = "78103310C8550D540C751775D2E73F1B", hash_generated_method = "077A0C6A1C50DC980E738D0C3BF099E7")
    private CharSequence transformFromCharacter() {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_609295162 = null; //Variable for return #1
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1785952514 = null; //Variable for return #2
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1256617553 = null; //Variable for return #3
        {
            varB4EAC82CA7396A68D541C85D26508E83_609295162 = padding("null", 0);
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_1785952514 = padding(String.valueOf(arg), 0);
        } //End block
        {
            int codePoint;
            codePoint = ((Number) arg).intValue();
            {
                boolean var6F543C204E9C4F46177946447429AAE1_673440753 = (!Character.isValidCodePoint(codePoint));
                {
                    if (DroidSafeAndroidRuntime.control) throw new IllegalFormatCodePointException(codePoint);
                } //End block
            } //End collapsed parenthetic
            CharSequence result;
            result = String.valueOf((char) codePoint);
            result = String.valueOf(Character.toChars(codePoint));
            varB4EAC82CA7396A68D541C85D26508E83_1256617553 = padding(result, 0);
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw badArgumentType();
        } //End block
        CharSequence varA7E53CE21691AB073D9660D615818899_31871654; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_31871654 = varB4EAC82CA7396A68D541C85D26508E83_609295162;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_31871654 = varB4EAC82CA7396A68D541C85D26508E83_1785952514;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_31871654 = varB4EAC82CA7396A68D541C85D26508E83_1256617553;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_31871654.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_31871654;
        // ---------- Original Method ----------
        //if (arg == null) {
            //return padding("null", 0);
        //}
        //if (arg instanceof Character) {
            //return padding(String.valueOf(arg), 0);
        //} else if (arg instanceof Byte || arg instanceof Short || arg instanceof Integer) {
            //int codePoint = ((Number) arg).intValue();
            //if (!Character.isValidCodePoint(codePoint)) {
                //throw new IllegalFormatCodePointException(codePoint);
            //}
            //CharSequence result = (codePoint < Character.MIN_SUPPLEMENTARY_CODE_POINT)
                    //? String.valueOf((char) codePoint)
                    //: String.valueOf(Character.toChars(codePoint));
            //return padding(result, 0);
        //} else {
            //throw badArgumentType();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.522 -0400", hash_original_method = "1802F533F155B8AA49557FA5A74B7DBE", hash_generated_method = "FC6DCF3086D4CC0C5C9E3B66D161F143")
    private CharSequence transformFromPercent() {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1985651281 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1985651281 = padding("%", 0);
        varB4EAC82CA7396A68D541C85D26508E83_1985651281.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1985651281;
        // ---------- Original Method ----------
        //return padding("%", 0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.528 -0400", hash_original_method = "EF7726D1BC858C4C5BDC40B9ACBD3ABF", hash_generated_method = "D4E4F4D2969BF321E73FAEBF510CEB18")
    private CharSequence padding(CharSequence source, int startIndex) {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_2086249176 = null; //Variable for return #1
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1865243302 = null; //Variable for return #2
        int start;
        start = startIndex;
        int width;
        width = formatToken.getWidth();
        int precision;
        precision = formatToken.getPrecision();
        int length;
        length = source.length();
        {
            length = Math.min(length, precision);
            {
                ((StringBuilder) source).setLength(length);
            } //End block
            {
                source = source.subSequence(0, length);
            } //End block
        } //End block
        {
            width = Math.max(source.length(), width);
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_2086249176 = source;
        } //End block
        char paddingChar;
        paddingChar = '\u0020';
        {
            {
                boolean var5580C15E55C4240F2395BB7B30D9E99A_340018210 = (formatToken.getConversionType() == 'd');
                {
                    paddingChar = localeData.zeroDigit;
                } //End block
                {
                    paddingChar = '0';
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            start = 0;
        } //End block
        char[] paddingChars;
        paddingChars = new char[width - length];
        Arrays.fill(paddingChars, paddingChar);
        boolean paddingRight;
        paddingRight = formatToken.flagMinus;
        StringBuilder result;
        result = toStringBuilder(source);
        {
            result.append(paddingChars);
        } //End block
        {
            result.insert(start, paddingChars);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1865243302 = result;
        addTaint(source.getTaint());
        addTaint(startIndex);
        CharSequence varA7E53CE21691AB073D9660D615818899_1828597205; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1828597205 = varB4EAC82CA7396A68D541C85D26508E83_2086249176;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1828597205 = varB4EAC82CA7396A68D541C85D26508E83_1865243302;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1828597205.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1828597205;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.533 -0400", hash_original_method = "AA67EEFB247ACC7BDA1BABCD03B30A80", hash_generated_method = "2E80FB0E4C124734BCE6D9AB3B58A990")
    private StringBuilder toStringBuilder(CharSequence cs) {
        StringBuilder varB4EAC82CA7396A68D541C85D26508E83_2057849958 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2057849958 = cs instanceof StringBuilder ? (StringBuilder) cs : new StringBuilder(cs);
        addTaint(cs.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_2057849958.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2057849958;
        // ---------- Original Method ----------
        //return cs instanceof StringBuilder ? (StringBuilder) cs : new StringBuilder(cs);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.534 -0400", hash_original_method = "CE1A2CC9741A13D14659E3953A660AC1", hash_generated_method = "4DC01CE13DF6448AE9B9CEDDE4C32CA8")
    private StringBuilder wrapParentheses(StringBuilder result) {
        StringBuilder varB4EAC82CA7396A68D541C85D26508E83_469149634 = null; //Variable for return #1
        result.setCharAt(0, '(');
        {
            formatToken.setWidth(formatToken.getWidth() - 1);
            result = (StringBuilder) padding(result, 1);
            result.append(')');
        } //End block
        {
            result.append(')');
            result = (StringBuilder) padding(result, 0);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_469149634 = result;
        addTaint(result.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_469149634.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_469149634;
        // ---------- Original Method ----------
        //result.setCharAt(0, '(');
        //if (formatToken.flagZero) {
            //formatToken.setWidth(formatToken.getWidth() - 1);
            //result = (StringBuilder) padding(result, 1);
            //result.append(')');
        //} else {
            //result.append(')');
            //result = (StringBuilder) padding(result, 0);
        //}
        //return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.553 -0400", hash_original_method = "FADDE3D8C4FA639F028B03B661D10023", hash_generated_method = "EAF45A9327650F22121C05851A6BD726")
    private CharSequence transformFromInteger() {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_159843200 = null; //Variable for return #1
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1125073100 = null; //Variable for return #2
        int startIndex;
        startIndex = 0;
        StringBuilder result;
        result = new StringBuilder();
        char currentConversionType;
        currentConversionType = formatToken.getConversionType();
        long value;
        {
            value = ((Long) arg).longValue();
        } //End block
        {
            value = ((Integer) arg).longValue();
        } //End block
        {
            value = ((Short) arg).longValue();
        } //End block
        {
            value = ((Byte) arg).longValue();
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw badArgumentType();
        } //End block
        {
            {
                result.append("0");
                startIndex += 1;
            } //End block
            {
                result.append("0x");
                startIndex += 2;
            } //End block
        } //End block
        {
            CharSequence digits;
            digits = Long.toString(value);
            {
                digits = insertGrouping(digits);
            } //End block
            {
                digits = localizeDigits(digits);
            } //End block
            result.append(digits);
            {
                {
                    varB4EAC82CA7396A68D541C85D26508E83_159843200 = wrapParentheses(result);
                } //End block
            } //End block
            {
                {
                    result.insert(0, '+');
                    startIndex += 1;
                } //End block
                {
                    result.insert(0, ' ');
                    startIndex += 1;
                } //End block
            } //End block
        } //End block
        {
            {
                value &= 0xffL;
            } //End block
            {
                value &= 0xffffL;
            } //End block
            {
                value &= 0xffffffffL;
            } //End block
            {
                result.append(Long.toOctalString(value));
            } //End block
            {
                result.append(Long.toHexString(value));
            } //End block
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1125073100 = padding(result, startIndex);
        CharSequence varA7E53CE21691AB073D9660D615818899_615895993; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_615895993 = varB4EAC82CA7396A68D541C85D26508E83_159843200;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_615895993 = varB4EAC82CA7396A68D541C85D26508E83_1125073100;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_615895993.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_615895993;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.554 -0400", hash_original_method = "15D0DEB8422EE33E04C98AFC872D1D51", hash_generated_method = "63B695F744D44205BBC2D363A81158E8")
    private CharSequence transformFromNull() {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1753141995 = null; //Variable for return #1
        formatToken.flagZero = false;
        varB4EAC82CA7396A68D541C85D26508E83_1753141995 = padding("null", 0);
        varB4EAC82CA7396A68D541C85D26508E83_1753141995.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1753141995;
        // ---------- Original Method ----------
        //formatToken.flagZero = false;
        //return padding("null", 0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.555 -0400", hash_original_method = "28740AE89E2FC451EFE3093F54121A6C", hash_generated_method = "A953A6B271CACF1AFD972134A096BCC7")
    private CharSequence transformFromBigInteger() {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1162214115 = null; //Variable for return #1
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1346777627 = null; //Variable for return #2
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1260783683 = null; //Variable for return #3
        int startIndex;
        startIndex = 0;
        StringBuilder result;
        result = new StringBuilder();
        BigInteger bigInt;
        bigInt = (BigInteger) arg;
        char currentConversionType;
        currentConversionType = formatToken.getConversionType();
        {
            varB4EAC82CA7396A68D541C85D26508E83_1162214115 = transformFromNull();
        } //End block
        boolean isNegative;
        isNegative = (bigInt.compareTo(BigInteger.ZERO) < 0);
        {
            CharSequence digits;
            digits = bigInt.toString(10);
            {
                digits = insertGrouping(digits);
            } //End block
            result.append(digits);
        } //End block
        {
            result.append(bigInt.toString(8));
        } //End block
        {
            result.append(bigInt.toString(16));
        } //End block
        {
            startIndex = isNegative ? 1 : 0;
            {
                result.insert(startIndex, "0");
                startIndex += 1;
            } //End block
            {
                result.insert(startIndex, "0x");
                startIndex += 2;
            } //End block
        } //End block
        {
            {
                result.insert(0, '+');
                startIndex += 1;
            } //End block
            {
                result.insert(0, ' ');
                startIndex += 1;
            } //End block
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_1346777627 = wrapParentheses(result);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1260783683 = padding(result, startIndex);
        CharSequence varA7E53CE21691AB073D9660D615818899_905946815; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_905946815 = varB4EAC82CA7396A68D541C85D26508E83_1162214115;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_905946815 = varB4EAC82CA7396A68D541C85D26508E83_1346777627;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_905946815 = varB4EAC82CA7396A68D541C85D26508E83_1260783683;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_905946815.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_905946815;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.562 -0400", hash_original_method = "3FA485DEFE055FA59E9A89B7029B3055", hash_generated_method = "D062503C2CE2E349AA988A0885BE3FDA")
    private CharSequence transformFromDateTime() {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_523525489 = null; //Variable for return #1
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1861635493 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_523525489 = transformFromNull();
        } //End block
        Calendar calendar;
        {
            calendar = (Calendar) arg;
        } //End block
        {
            Date date;
            date = null;
            {
                date = new Date(((Long) arg).longValue());
            } //End block
            {
                date = (Date) arg;
            } //End block
            {
                if (DroidSafeAndroidRuntime.control) throw badArgumentType();
            } //End block
            calendar = Calendar.getInstance(locale);
            calendar.setTime(date);
        } //End block
        StringBuilder result;
        result = new StringBuilder();
        {
            boolean varCAB943A58957944F491BEB3F9C12AAC8_601402216 = (!appendT(result, formatToken.getDateSuffix(), calendar));
            {
                if (DroidSafeAndroidRuntime.control) throw formatToken.unknownFormatConversionException();
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1861635493 = padding(result, 0);
        CharSequence varA7E53CE21691AB073D9660D615818899_1805846654; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1805846654 = varB4EAC82CA7396A68D541C85D26508E83_523525489;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1805846654 = varB4EAC82CA7396A68D541C85D26508E83_1861635493;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1805846654.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1805846654;
        // ---------- Original Method ----------
        //if (arg == null) {
            //return transformFromNull();
        //}
        //Calendar calendar;
        //if (arg instanceof Calendar) {
            //calendar = (Calendar) arg;
        //} else {
            //Date date = null;
            //if (arg instanceof Long) {
                //date = new Date(((Long) arg).longValue());
            //} else if (arg instanceof Date) {
                //date = (Date) arg;
            //} else {
                //throw badArgumentType();
            //}
            //calendar = Calendar.getInstance(locale);
            //calendar.setTime(date);
        //}
        //StringBuilder result = new StringBuilder();
        //if (!appendT(result, formatToken.getDateSuffix(), calendar)) {
            //throw formatToken.unknownFormatConversionException();
        //}
        //return padding(result, 0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.584 -0400", hash_original_method = "6A85D50A5F6F83B5DE3D767D1CCF3B76", hash_generated_method = "E523E589E4D51BC76BACB1D2143C4DFC")
    private boolean appendT(StringBuilder result, char conversion, Calendar calendar) {
        //Begin case 'A' 
        result.append(localeData.longWeekdayNames[calendar.get(Calendar.DAY_OF_WEEK)]);
        //End case 'A' 
        //Begin case 'a' 
        result.append(localeData.shortWeekdayNames[calendar.get(Calendar.DAY_OF_WEEK)]);
        //End case 'a' 
        //Begin case 'B' 
        result.append(localeData.longMonthNames[calendar.get(Calendar.MONTH)]);
        //End case 'B' 
        //Begin case 'b' 'h' 
        result.append(localeData.shortMonthNames[calendar.get(Calendar.MONTH)]);
        //End case 'b' 'h' 
        //Begin case 'C' 
        appendLocalized(result, calendar.get(Calendar.YEAR) / 100, 2);
        //End case 'C' 
        //Begin case 'D' 
        appendT(result, 'm', calendar);
        //End case 'D' 
        //Begin case 'D' 
        result.append('/');
        //End case 'D' 
        //Begin case 'D' 
        appendT(result, 'd', calendar);
        //End case 'D' 
        //Begin case 'D' 
        result.append('/');
        //End case 'D' 
        //Begin case 'D' 
        appendT(result, 'y', calendar);
        //End case 'D' 
        //Begin case 'F' 
        appendT(result, 'Y', calendar);
        //End case 'F' 
        //Begin case 'F' 
        result.append('-');
        //End case 'F' 
        //Begin case 'F' 
        appendT(result, 'm', calendar);
        //End case 'F' 
        //Begin case 'F' 
        result.append('-');
        //End case 'F' 
        //Begin case 'F' 
        appendT(result, 'd', calendar);
        //End case 'F' 
        //Begin case 'H' 
        appendLocalized(result, calendar.get(Calendar.HOUR_OF_DAY), 2);
        //End case 'H' 
        //Begin case 'I' 
        appendLocalized(result, to12Hour(calendar.get(Calendar.HOUR)), 2);
        //End case 'I' 
        //Begin case 'L' 
        appendLocalized(result, calendar.get(Calendar.MILLISECOND), 3);
        //End case 'L' 
        //Begin case 'M' 
        appendLocalized(result, calendar.get(Calendar.MINUTE), 2);
        //End case 'M' 
        //Begin case 'N' 
        appendLocalized(result, calendar.get(Calendar.MILLISECOND) * 1000000L, 9);
        //End case 'N' 
        //Begin case 'Q' 
        appendLocalized(result, calendar.getTimeInMillis(), 0);
        //End case 'Q' 
        //Begin case 'R' 
        appendT(result, 'H', calendar);
        //End case 'R' 
        //Begin case 'R' 
        result.append(':');
        //End case 'R' 
        //Begin case 'R' 
        appendT(result, 'M', calendar);
        //End case 'R' 
        //Begin case 'S' 
        appendLocalized(result, calendar.get(Calendar.SECOND), 2);
        //End case 'S' 
        //Begin case 'T' 
        appendT(result, 'H', calendar);
        //End case 'T' 
        //Begin case 'T' 
        result.append(':');
        //End case 'T' 
        //Begin case 'T' 
        appendT(result, 'M', calendar);
        //End case 'T' 
        //Begin case 'T' 
        result.append(':');
        //End case 'T' 
        //Begin case 'T' 
        appendT(result, 'S', calendar);
        //End case 'T' 
        //Begin case 'Y' 
        appendLocalized(result, calendar.get(Calendar.YEAR), 4);
        //End case 'Y' 
        //Begin case 'Z' 
        TimeZone timeZone;
        timeZone = calendar.getTimeZone();
        //End case 'Z' 
        //Begin case 'Z' 
        result.append(timeZone.getDisplayName(timeZone.inDaylightTime(calendar.getTime()),
                    TimeZone.SHORT, locale));
        //End case 'Z' 
        //Begin case 'c' 
        appendT(result, 'a', calendar);
        //End case 'c' 
        //Begin case 'c' 
        result.append(' ');
        //End case 'c' 
        //Begin case 'c' 
        appendT(result, 'b', calendar);
        //End case 'c' 
        //Begin case 'c' 
        result.append(' ');
        //End case 'c' 
        //Begin case 'c' 
        appendT(result, 'd', calendar);
        //End case 'c' 
        //Begin case 'c' 
        result.append(' ');
        //End case 'c' 
        //Begin case 'c' 
        appendT(result, 'T', calendar);
        //End case 'c' 
        //Begin case 'c' 
        result.append(' ');
        //End case 'c' 
        //Begin case 'c' 
        appendT(result, 'Z', calendar);
        //End case 'c' 
        //Begin case 'c' 
        result.append(' ');
        //End case 'c' 
        //Begin case 'c' 
        appendT(result, 'Y', calendar);
        //End case 'c' 
        //Begin case 'd' 
        appendLocalized(result, calendar.get(Calendar.DAY_OF_MONTH), 2);
        //End case 'd' 
        //Begin case 'e' 
        appendLocalized(result, calendar.get(Calendar.DAY_OF_MONTH), 0);
        //End case 'e' 
        //Begin case 'j' 
        appendLocalized(result, calendar.get(Calendar.DAY_OF_YEAR), 3);
        //End case 'j' 
        //Begin case 'k' 
        appendLocalized(result, calendar.get(Calendar.HOUR_OF_DAY), 0);
        //End case 'k' 
        //Begin case 'l' 
        appendLocalized(result, to12Hour(calendar.get(Calendar.HOUR)), 0);
        //End case 'l' 
        //Begin case 'm' 
        appendLocalized(result, calendar.get(Calendar.MONTH) + 1, 2);
        //End case 'm' 
        //Begin case 'p' 
        result.append(localeData.amPm[calendar.get(Calendar.AM_PM)].toLowerCase(locale));
        //End case 'p' 
        //Begin case 'r' 
        appendT(result, 'I', calendar);
        //End case 'r' 
        //Begin case 'r' 
        result.append(':');
        //End case 'r' 
        //Begin case 'r' 
        appendT(result, 'M', calendar);
        //End case 'r' 
        //Begin case 'r' 
        result.append(':');
        //End case 'r' 
        //Begin case 'r' 
        appendT(result, 'S', calendar);
        //End case 'r' 
        //Begin case 'r' 
        result.append(' ');
        //End case 'r' 
        //Begin case 'r' 
        result.append(localeData.amPm[calendar.get(Calendar.AM_PM)]);
        //End case 'r' 
        //Begin case 's' 
        appendLocalized(result, calendar.getTimeInMillis() / 1000, 0);
        //End case 's' 
        //Begin case 'y' 
        appendLocalized(result, calendar.get(Calendar.YEAR) % 100, 2);
        //End case 'y' 
        //Begin case 'z' 
        long offset;
        offset = calendar.get(Calendar.ZONE_OFFSET) + calendar.get(Calendar.DST_OFFSET);
        //End case 'z' 
        //Begin case 'z' 
        char sign;
        sign = '+';
        //End case 'z' 
        //Begin case 'z' 
        {
            sign = '-';
            offset = -offset;
        } //End block
        //End case 'z' 
        //Begin case 'z' 
        result.append(sign);
        //End case 'z' 
        //Begin case 'z' 
        appendLocalized(result, offset / 3600000, 2);
        //End case 'z' 
        //Begin case 'z' 
        appendLocalized(result, (offset % 3600000) / 60000, 2);
        //End case 'z' 
        addTaint(result.getTaint());
        addTaint(conversion);
        addTaint(calendar.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_890188354 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_890188354;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.585 -0400", hash_original_method = "07C369462F22245026E1280008B34AEC", hash_generated_method = "33340D1BBB8DA3FD36313FC90414624A")
    private int to12Hour(int hour) {
        addTaint(hour);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_549341545 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_549341545;
        // ---------- Original Method ----------
        //return hour == 0 ? 12 : hour;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.586 -0400", hash_original_method = "60B30B4DC0B127EF94D361BC9EB2AF90", hash_generated_method = "B21775F826EB3A831071CAF4CEC6C17C")
    private void appendLocalized(StringBuilder result, long value, int width) {
        int paddingIndex;
        paddingIndex = result.length();
        char zeroDigit;
        zeroDigit = localeData.zeroDigit;
        {
            result.append(value);
        } //End block
        {
            result.append(localizeDigits(Long.toString(value)));
        } //End block
        int zeroCount;
        zeroCount = width - (result.length() - paddingIndex);
        {
            result.insert(paddingIndex, ZEROS, 0, zeroCount);
        } //End block
        {
            {
                int i;
                i = 0;
                {
                    result.insert(paddingIndex, zeroDigit);
                } //End block
            } //End collapsed parenthetic
        } //End block
        addTaint(result.getTaint());
        addTaint(value);
        addTaint(width);
        // ---------- Original Method ----------
        //int paddingIndex = result.length();
        //char zeroDigit = localeData.zeroDigit;
        //if (zeroDigit == '0') {
            //result.append(value);
        //} else {
            //result.append(localizeDigits(Long.toString(value)));
        //}
        //int zeroCount = width - (result.length() - paddingIndex);
        //if (zeroCount <= 0) {
            //return;
        //}
        //if (zeroDigit == '0') {
            //result.insert(paddingIndex, ZEROS, 0, zeroCount);
        //} else {
            //for (int i = 0; i < zeroCount; ++i) {
                //result.insert(paddingIndex, zeroDigit);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.594 -0400", hash_original_method = "977B62B975352D4F075C1101DB18FB73", hash_generated_method = "8C118ED76978A89583FBDFE95D94D958")
    private CharSequence transformFromSpecialNumber(double d) {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_315150119 = null; //Variable for return #1
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_251405390 = null; //Variable for return #2
        String source;
        source = null;
        {
            boolean varF573A637641E1AB21D698815AEB110FB_1173359031 = (Double.isNaN(d));
            {
                source = "NaN";
            } //End block
            {
                {
                    source = "+Infinity";
                } //End block
                {
                    source = " Infinity";
                } //End block
                {
                    source = "Infinity";
                } //End block
            } //End block
            {
                {
                    source = "(Infinity)";
                } //End block
                {
                    source = "-Infinity";
                } //End block
            } //End block
            {
                varB4EAC82CA7396A68D541C85D26508E83_315150119 = null;
            } //End block
        } //End collapsed parenthetic
        formatToken.setPrecision(FormatToken.UNSET);
        formatToken.flagZero = false;
        varB4EAC82CA7396A68D541C85D26508E83_251405390 = padding(source, 0);
        addTaint(d);
        CharSequence varA7E53CE21691AB073D9660D615818899_859332753; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_859332753 = varB4EAC82CA7396A68D541C85D26508E83_315150119;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_859332753 = varB4EAC82CA7396A68D541C85D26508E83_251405390;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_859332753.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_859332753;
        // ---------- Original Method ----------
        //String source = null;
        //if (Double.isNaN(d)) {
            //source = "NaN";
        //} else if (d == Double.POSITIVE_INFINITY) {
            //if (formatToken.flagPlus) {
                //source = "+Infinity";
            //} else if (formatToken.flagSpace) {
                //source = " Infinity";
            //} else {
                //source = "Infinity";
            //}
        //} else if (d == Double.NEGATIVE_INFINITY) {
            //if (formatToken.flagParenthesis) {
                //source = "(Infinity)";
            //} else {
                //source = "-Infinity";
            //}
        //} else {
            //return null;
        //}
        //formatToken.setPrecision(FormatToken.UNSET);
        //formatToken.flagZero = false;
        //return padding(source, 0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.610 -0400", hash_original_method = "DECF7ECF8109F764E81E2CF8101BCB0C", hash_generated_method = "CEBE8335F11D3BDB7E6F82A263DB60CD")
    private CharSequence transformFromFloat() {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_653909125 = null; //Variable for return #1
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1543163775 = null; //Variable for return #2
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_468977092 = null; //Variable for return #3
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1135529643 = null; //Variable for return #4
        {
            varB4EAC82CA7396A68D541C85D26508E83_653909125 = transformFromNull();
        } //End block
        {
            Number number;
            number = (Number) arg;
            double d;
            d = number.doubleValue();
            {
                varB4EAC82CA7396A68D541C85D26508E83_1543163775 = transformFromSpecialNumber(d);
            } //End block
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw badArgumentType();
        } //End block
        char conversionType;
        conversionType = formatToken.getConversionType();
        {
            boolean var4D48FD270E3C43B43C7CAFA231E3C2A7_750863049 = (conversionType != 'a' && conversionType != 'A' && !formatToken.isPrecisionSet());
            {
                formatToken.setPrecision(FormatToken.DEFAULT_PRECISION);
            } //End block
        } //End collapsed parenthetic
        StringBuilder result;
        result = new StringBuilder();
        //Begin case 'a' 'A' 
        transformA(result);
        //End case 'a' 'A' 
        //Begin case 'e' 'E' 
        transformE(result);
        //End case 'e' 'E' 
        //Begin case 'f' 
        transformF(result);
        //End case 'f' 
        //Begin case 'g' 'G' 
        transformG(result);
        //End case 'g' 'G' 
        //Begin case default 
        if (DroidSafeAndroidRuntime.control) throw formatToken.unknownFormatConversionException();
        //End case default 
        formatToken.setPrecision(FormatToken.UNSET);
        int startIndex;
        startIndex = 0;
        {
            boolean varC4FD83BCDCE254D147FDF9D7B3AC13AA_214937160 = (result.charAt(0) == localeData.minusSign);
            {
                {
                    varB4EAC82CA7396A68D541C85D26508E83_468977092 = wrapParentheses(result);
                } //End block
            } //End block
            {
                {
                    result.insert(0, ' ');
                } //End block
                {
                    result.insert(0, '+');
                } //End block
            } //End block
        } //End collapsed parenthetic
        char firstChar;
        firstChar = result.charAt(0);
        {
            startIndex = 1;
        } //End block
        {
            startIndex += 2;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1135529643 = padding(result, startIndex);
        CharSequence varA7E53CE21691AB073D9660D615818899_473670705; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_473670705 = varB4EAC82CA7396A68D541C85D26508E83_653909125;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_473670705 = varB4EAC82CA7396A68D541C85D26508E83_1543163775;
                break;
            case 3: //Assign result for return ordinal #3
                varA7E53CE21691AB073D9660D615818899_473670705 = varB4EAC82CA7396A68D541C85D26508E83_468977092;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_473670705 = varB4EAC82CA7396A68D541C85D26508E83_1135529643;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_473670705.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_473670705;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.616 -0400", hash_original_method = "43DA2A76094CCA7D42287B4466035D61", hash_generated_method = "949F9C42786386F6F8D50D31E9DB8F14")
    private void transformE(StringBuilder result) {
        int precision;
        precision = formatToken.getPrecision();
        String pattern;
        pattern = "0E+00";
        {
            StringBuilder sb;
            sb = new StringBuilder("0.");
            char[] zeros;
            zeros = new char[precision];
            Arrays.fill(zeros, '0');
            sb.append(zeros);
            sb.append("E+00");
            pattern = sb.toString();
        } //End block
        NativeDecimalFormat nf;
        nf = getDecimalFormat(pattern);
        char[] chars;
        {
            chars = nf.formatBigDecimal((BigDecimal) arg, null);
        } //End block
        {
            chars = nf.formatDouble(((Number) arg).doubleValue(), null);
        } //End block
        {
            int i;
            i = 0;
            {
                {
                    chars[i] = 'e';
                } //End block
            } //End block
        } //End collapsed parenthetic
        result.append(chars);
        {
            int indexOfE;
            indexOfE = result.indexOf("e");
            result.insert(indexOfE, localeData.decimalSeparator);
        } //End block
        addTaint(result.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.625 -0400", hash_original_method = "1973123C0DFAE44325340FD650EA833E", hash_generated_method = "3841D631059D0EA3D295F6F17B737E5D")
    private void transformG(StringBuilder result) {
        int precision;
        precision = formatToken.getPrecision();
        {
            precision = 1;
        } //End block
        formatToken.setPrecision(precision);
        double d;
        d = ((Number) arg).doubleValue();
        {
            formatToken.setPrecision(precision);
            transformF(result);
        } //End block
        boolean requireScientificRepresentation;
        requireScientificRepresentation = true;
        d = Math.abs(d);
        {
            boolean var3ECD0EAFA593A6ADC1E4F46524942B82_71090655 = (Double.isInfinite(d));
            {
                precision = formatToken.getPrecision();
                formatToken.setPrecision(precision);
                transformE(result);
            } //End block
        } //End collapsed parenthetic
        BigDecimal b;
        b = new BigDecimal(d, new MathContext(precision));
        d = b.doubleValue();
        long l;
        l = b.longValue();
        {
            boolean var7952BAED570DF8211C40DB97D6C9494B_65884843 = (d >= 1 && d < Math.pow(10, precision));
            {
                {
                    boolean var6DA2CA6307083AFD29BF7C8CBC3D16A4_1534652117 = (l < Math.pow(10, precision));
                    {
                        requireScientificRepresentation = false;
                        precision -= String.valueOf(l).length();
                        precision = precision < 0 ? 0 : precision;
                        l = Math.round(d * Math.pow(10, precision + 1));
                        {
                            boolean varC0398DDD0FEAEEB1CB8B19A12469A8A5_167345971 = (String.valueOf(l).length() <= formatToken.getPrecision());
                        } //End collapsed parenthetic
                        formatToken.setPrecision(precision);
                    } //End block
                } //End collapsed parenthetic
            } //End block
            {
                l = b.movePointRight(4).longValue();
                {
                    boolean varFC5D9BA1CE39DA4CE1D6C7B756E730FB_631421101 = (d >= Math.pow(10, -4) && d < 1);
                    {
                        requireScientificRepresentation = false;
                        precision += 4 - String.valueOf(l).length();
                        l = b.movePointRight(precision + 1).longValue();
                        {
                            boolean varC0398DDD0FEAEEB1CB8B19A12469A8A5_1065682050 = (String.valueOf(l).length() <= formatToken.getPrecision());
                        } //End collapsed parenthetic
                        l = b.movePointRight(precision).longValue();
                        {
                            boolean var48F2D010DC481B7F6EDFA70502BAD5C5_1494106104 = (l >= Math.pow(10, precision - 4));
                            {
                                formatToken.setPrecision(precision);
                            } //End block
                        } //End collapsed parenthetic
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        {
            precision = formatToken.getPrecision();
            formatToken.setPrecision(precision);
            transformE(result);
        } //End block
        {
            transformF(result);
        } //End block
        addTaint(result.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.644 -0400", hash_original_method = "DF70A96812FA1EE536149F6B5D8F4C45", hash_generated_method = "78C4D6B4769C83AB925F5AAFCD169C70")
    private void transformF(StringBuilder result) {
        String pattern;
        pattern = "0.000000";
        int precision;
        precision = formatToken.getPrecision();
        {
            StringBuilder patternBuilder;
            patternBuilder = new StringBuilder();
            {
                patternBuilder.append(',');
                int groupingSize;
                groupingSize = 3;
                char[] sharps;
                sharps = new char[groupingSize - 1];
                Arrays.fill(sharps, '#');
                patternBuilder.append(sharps);
            } //End block
            patternBuilder.append('0');
            {
                patternBuilder.append('.');
                {
                    int i;
                    i = 0;
                    {
                        patternBuilder.append('0');
                    } //End block
                } //End collapsed parenthetic
            } //End block
            pattern = patternBuilder.toString();
        } //End block
        NativeDecimalFormat nf;
        nf = getDecimalFormat(pattern);
        {
            result.append(nf.formatBigDecimal((BigDecimal) arg, null));
        } //End block
        {
            result.append(nf.formatDouble(((Number) arg).doubleValue(), null));
        } //End block
        {
            result.append(localeData.decimalSeparator);
        } //End block
        addTaint(result.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.645 -0400", hash_original_method = "DCC3844221755C0C14FA659BF8647E6B", hash_generated_method = "3D3E891BFE3538851AABE98229235085")
    private void transformA(StringBuilder result) {
        {
            result.append(Float.toHexString(((Float) arg).floatValue()));
        } //End block
        {
            result.append(Double.toHexString(((Double) arg).doubleValue()));
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw badArgumentType();
        } //End block
        {
            boolean var0BA49339344F3E46004E2C66FA171DC0_322200379 = (!formatToken.isPrecisionSet());
        } //End collapsed parenthetic
        int precision;
        precision = formatToken.getPrecision();
        {
            precision = 1;
        } //End block
        int indexOfFirstFractionalDigit;
        indexOfFirstFractionalDigit = result.indexOf(".") + 1;
        int indexOfP;
        indexOfP = result.indexOf("p");
        int fractionalLength;
        fractionalLength = indexOfP - indexOfFirstFractionalDigit;
        {
            char[] zeros;
            zeros = new char[precision - fractionalLength];
            Arrays.fill(zeros, '0');
            result.insert(indexOfP, zeros);
        } //End block
        result.delete(indexOfFirstFractionalDigit + precision, indexOfP);
        addTaint(result.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    public enum BigDecimalLayoutForm {
        SCIENTIFIC,
        DECIMAL_FLOAT
    }

    
    private static class CachedDecimalFormat {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.645 -0400", hash_original_field = "DBECB303151001B254CD458C962BFA06", hash_generated_field = "57B03D121D93C35DC4CD446F8684FFFD")

        public NativeDecimalFormat decimalFormat;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.645 -0400", hash_original_field = "0DC9450ED9A8CE4C2B3A1D132A9E7261", hash_generated_field = "F1A921FEF7693E6D4DF1F57B4D8F992B")

        public LocaleData currentLocaleData;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.645 -0400", hash_original_field = "0B0F76B47F491349A26FCE54BEF066C1", hash_generated_field = "79B878750A67D50688DF69A25D47682C")

        public String currentPattern;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.646 -0400", hash_original_method = "3AB4302EBBD3C6ECF16B79A91E887CC6", hash_generated_method = "C4149067CD2AF28823E946F111841C62")
        public  CachedDecimalFormat() {
            // ---------- Original Method ----------
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.647 -0400", hash_original_method = "784B3214258603820EA00D340F6FA563", hash_generated_method = "7E05D120438E0B138394E37023F6BC4E")
        public NativeDecimalFormat update(LocaleData localeData, String pattern) {
            NativeDecimalFormat varB4EAC82CA7396A68D541C85D26508E83_521980571 = null; //Variable for return #1
            {
                currentPattern = pattern;
                currentLocaleData = localeData;
                decimalFormat = new NativeDecimalFormat(currentPattern, currentLocaleData);
            } //End block
            {
                boolean varC04205845392AD76FE20C5C34EA780FF_958488861 = (!pattern.equals(currentPattern));
                {
                    decimalFormat.applyPattern(pattern);
                    currentPattern = pattern;
                } //End block
            } //End collapsed parenthetic
            {
                decimalFormat.setDecimalFormatSymbols(localeData);
                currentLocaleData = localeData;
            } //End block
            varB4EAC82CA7396A68D541C85D26508E83_521980571 = decimalFormat;
            varB4EAC82CA7396A68D541C85D26508E83_521980571.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_521980571;
            // ---------- Original Method ----------
            //if (decimalFormat == null) {
                //currentPattern = pattern;
                //currentLocaleData = localeData;
                //decimalFormat = new NativeDecimalFormat(currentPattern, currentLocaleData);
            //}
            //if (!pattern.equals(currentPattern)) {
                //decimalFormat.applyPattern(pattern);
                //currentPattern = pattern;
            //}
            //if (localeData != currentLocaleData) {
                //decimalFormat.setDecimalFormatSymbols(localeData);
                //currentLocaleData = localeData;
            //}
            //return decimalFormat;
        }

        
    }


    
    private static class FormatToken {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.648 -0400", hash_original_field = "CABEE536F594A7425CADCE9FE8AB1016", hash_generated_field = "772417271F7F0BDFEA0E64414172A084")

        private int argIndex = UNSET;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.662 -0400", hash_original_field = "AF7A833327A8AE088613AF6547808B22", hash_generated_field = "98479ABC53D035AE015748B6501BED19")

        boolean flagComma;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.662 -0400", hash_original_field = "77D00CCF13983863513393B04DE90A5E", hash_generated_field = "84E0FE8767B1823F9BD483DE94C8D5B6")

        boolean flagMinus;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.662 -0400", hash_original_field = "58EB12214972261349BEFF4AFEEBADE7", hash_generated_field = "6268F94D7EC6432771FAC9A81C06B277")

        boolean flagParenthesis;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.662 -0400", hash_original_field = "2FC88FB85E37FA3049E7C4FB6131D130", hash_generated_field = "B18F735AA5B0F0DABBD7E427068CC4C3")

        boolean flagPlus;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.662 -0400", hash_original_field = "CA9A273EC976964302B347E1A888F814", hash_generated_field = "C720CA7CDB619DB58116FBA407D9470B")

        boolean flagSharp;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.662 -0400", hash_original_field = "0A9A68E8CA9C930B3BD25AC0267A50F6", hash_generated_field = "A2EE573CAED7292D13BAD741251059A4")

        boolean flagSpace;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.662 -0400", hash_original_field = "23AC23B8E4A938ABDC183973ABADFBB2", hash_generated_field = "79C0F430E2F3E53D9DF49552E4733685")

        boolean flagZero;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.662 -0400", hash_original_field = "06BB72258511A33C8D897372F71D9BEB", hash_generated_field = "E9F667FE63992DF0A85E5D7A0685E01F")

        private char conversionType = (char) UNSET;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.662 -0400", hash_original_field = "CBA7C70F75D3196A71CEB9803FA45256", hash_generated_field = "6AC9B9E35F29643906A8717247B50CCB")

        private char dateSuffix;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.662 -0400", hash_original_field = "448C0902A81C3D78DB12BA0C73991461", hash_generated_field = "1A5EEC185E39D6E54480D34E352CE283")

        private int precision = UNSET;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.662 -0400", hash_original_field = "E3737662F9BF753CD6F77C63AE3B771F", hash_generated_field = "7F084C83D0F1982A47DE9354FC0CF9F1")

        private int width = UNSET;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.662 -0400", hash_original_field = "8A84BD7A36073EE32C37C1B79462B501", hash_generated_field = "0527ECB4D15D76D63A180FF8CBB184B2")

        private StringBuilder strFlags;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.662 -0400", hash_original_method = "98998A93ECCA1CEE378BE6F5FF82B45F", hash_generated_method = "98998A93ECCA1CEE378BE6F5FF82B45F")
        public FormatToken ()
        {
            //Synthesized constructor
        }


        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.663 -0400", hash_original_method = "A7B957B3122A1E0264F586D374F2E6B7", hash_generated_method = "5B89D1EF5586778339FBD96961E136DF")
         boolean isDefault() {
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1825704736 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1825704736;
            // ---------- Original Method ----------
            //return !flagComma && !flagMinus && !flagParenthesis && !flagPlus && !flagSharp &&
                    //!flagSpace && !flagZero && width == UNSET && precision == UNSET;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.664 -0400", hash_original_method = "A13969ECEC9F8D1C94EA6A52CDFB6E17", hash_generated_method = "6A9E8CA004067386CFFA6E4AF03F78FE")
         boolean isPrecisionSet() {
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_425824505 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_425824505;
            // ---------- Original Method ----------
            //return precision != UNSET;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.664 -0400", hash_original_method = "3A74106121887CCA509F985D60DB5637", hash_generated_method = "56EBB59BCA1BE47A16177CA30724B432")
         int getArgIndex() {
            int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1583711293 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1583711293;
            // ---------- Original Method ----------
            //return argIndex;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.664 -0400", hash_original_method = "27CE41687BF54420F4C00D2CFB6A73FA", hash_generated_method = "F3E94D0F268DD41F463EE67139BE9385")
         void setArgIndex(int index) {
            argIndex = index;
            // ---------- Original Method ----------
            //argIndex = index;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.673 -0400", hash_original_method = "40140C97EC91863535630C305615FEC1", hash_generated_method = "A210DE95F0563FBB4398DDF3C96392B4")
         int getWidth() {
            int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1762264939 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1762264939;
            // ---------- Original Method ----------
            //return width;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.674 -0400", hash_original_method = "5C954D9C93DF99E2E990960A3CC1749D", hash_generated_method = "D40BD430ACB0EA3E0D63770A2976B08D")
         void setWidth(int width) {
            this.width = width;
            // ---------- Original Method ----------
            //this.width = width;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.674 -0400", hash_original_method = "71BCDCF9E73C85D95AB18BEF6635FA18", hash_generated_method = "1CCE98064CAEE6C2DE7A06065F138706")
         int getPrecision() {
            int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1430109599 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1430109599;
            // ---------- Original Method ----------
            //return precision;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.675 -0400", hash_original_method = "7515FB19ACE3C47DEBBD3E8357F6915C", hash_generated_method = "5866B10F1157266750859E3B0502D979")
         void setPrecision(int precise) {
            this.precision = precise;
            // ---------- Original Method ----------
            //this.precision = precise;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.675 -0400", hash_original_method = "837A02C50E03265F058B23775F6F6197", hash_generated_method = "966BDE1A490DEBE1E26D9B9A5FA9712C")
         String getStrFlags() {
            String varB4EAC82CA7396A68D541C85D26508E83_1724872643 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_1724872643 = (strFlags != null) ? strFlags.toString() : "";
            varB4EAC82CA7396A68D541C85D26508E83_1724872643.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_1724872643;
            // ---------- Original Method ----------
            //return (strFlags != null) ? strFlags.toString() : "";
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.692 -0400", hash_original_method = "E6ACD7E32E6ABC5AE16C357DB8116DB3", hash_generated_method = "C09D9C2144F75F82E9D4BDF9555FEA69")
         boolean setFlag(int ch) {
            boolean dupe;
            dupe = false;
            //Begin case ',' 
            dupe = flagComma;
            //End case ',' 
            //Begin case ',' 
            flagComma = true;
            //End case ',' 
            //Begin case '-' 
            dupe = flagMinus;
            //End case '-' 
            //Begin case '-' 
            flagMinus = true;
            //End case '-' 
            //Begin case '(' 
            dupe = flagParenthesis;
            //End case '(' 
            //Begin case '(' 
            flagParenthesis = true;
            //End case '(' 
            //Begin case '+' 
            dupe = flagPlus;
            //End case '+' 
            //Begin case '+' 
            flagPlus = true;
            //End case '+' 
            //Begin case '#' 
            dupe = flagSharp;
            //End case '#' 
            //Begin case '#' 
            flagSharp = true;
            //End case '#' 
            //Begin case ' ' 
            dupe = flagSpace;
            //End case ' ' 
            //Begin case ' ' 
            flagSpace = true;
            //End case ' ' 
            //Begin case '0' 
            dupe = flagZero;
            //End case '0' 
            //Begin case '0' 
            flagZero = true;
            //End case '0' 
            {
                if (DroidSafeAndroidRuntime.control) throw new DuplicateFormatFlagsException(String.valueOf(ch));
            } //End block
            {
                strFlags = new StringBuilder(7);
            } //End block
            strFlags.append((char) ch);
            addTaint(ch);
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_187394206 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_187394206;
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.693 -0400", hash_original_method = "563B5213711441DEFA9BB3355CD61032", hash_generated_method = "76ECB65A432F4219CD841DDA5346B978")
         char getConversionType() {
            char varA87DEB01C5F539E6BDA34829C8EF2368_1352863284 = getTaintChar();
            return varA87DEB01C5F539E6BDA34829C8EF2368_1352863284;
            // ---------- Original Method ----------
            //return conversionType;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.693 -0400", hash_original_method = "6C3279116A999B7A879305F448E4C7E6", hash_generated_method = "37AF4C580148FD1E99691D99021A9434")
         void setConversionType(char c) {
            conversionType = c;
            // ---------- Original Method ----------
            //conversionType = c;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.693 -0400", hash_original_method = "EE45DA1AFAF958B13872135C146745E9", hash_generated_method = "768A132D9D1687F923E7A99692606D0D")
         char getDateSuffix() {
            char varA87DEB01C5F539E6BDA34829C8EF2368_145853294 = getTaintChar();
            return varA87DEB01C5F539E6BDA34829C8EF2368_145853294;
            // ---------- Original Method ----------
            //return dateSuffix;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.693 -0400", hash_original_method = "6F4F20E9A23952874C5B1A6A80E321B4", hash_generated_method = "B3184FE9D51C912BE0F6FB157BD6AF85")
         void setDateSuffix(char c) {
            dateSuffix = c;
            // ---------- Original Method ----------
            //dateSuffix = c;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.694 -0400", hash_original_method = "67F4DE623207C5AE23B919ACAD45AA0B", hash_generated_method = "F73B182D3C55A6E8F60C425FCD54460F")
         boolean requireArgument() {
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_571586980 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_571586980;
            // ---------- Original Method ----------
            //return conversionType != '%' && conversionType != 'n';
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.706 -0400", hash_original_method = "34D9D8688BA6BF211700F1E1A866C731", hash_generated_method = "56FE71540218C91494B42CA3F736F857")
         void checkFlags(Object arg) {
            boolean allowComma;
            allowComma = false;
            boolean allowMinus;
            allowMinus = true;
            boolean allowParenthesis;
            allowParenthesis = false;
            boolean allowPlus;
            allowPlus = false;
            boolean allowSharp;
            allowSharp = false;
            boolean allowSpace;
            allowSpace = false;
            boolean allowZero;
            allowZero = false;
            boolean allowPrecision;
            allowPrecision = true;
            boolean allowWidth;
            allowWidth = true;
            boolean allowArgument;
            allowArgument = true;
            //Begin case 'c' 'C' 't' 'T' 
            allowPrecision = false;
            //End case 'c' 'C' 't' 'T' 
            //Begin case 's' 'S' 
            {
                allowSharp = true;
            } //End block
            //End case 's' 'S' 
            //Begin case 'g' 'G' 
            allowComma = allowParenthesis = allowPlus = allowSpace = allowZero = true;
            //End case 'g' 'G' 
            //Begin case 'f' 
            allowComma = allowParenthesis = allowPlus = allowSharp = allowSpace = allowZero = true;
            //End case 'f' 
            //Begin case 'e' 'E' 
            allowParenthesis = allowPlus = allowSharp = allowSpace = allowZero = true;
            //End case 'e' 'E' 
            //Begin case 'a' 'A' 
            allowPlus = allowSharp = allowSpace = allowZero = true;
            //End case 'a' 'A' 
            //Begin case 'd' 
            allowComma = allowParenthesis = allowPlus = allowSpace = allowZero = true;
            //End case 'd' 
            //Begin case 'd' 
            allowPrecision = false;
            //End case 'd' 
            //Begin case 'o' 'x' 'X' 
            allowSharp = allowZero = true;
            //End case 'o' 'x' 'X' 
            //Begin case 'o' 'x' 'X' 
            {
                allowParenthesis = allowPlus = allowSpace = true;
            } //End block
            //End case 'o' 'x' 'X' 
            //Begin case 'o' 'x' 'X' 
            allowPrecision = false;
            //End case 'o' 'x' 'X' 
            //Begin case 'n' 
            allowMinus = false;
            //End case 'n' 
            //Begin case 'n' 
            allowArgument = allowPrecision = allowWidth = false;
            //End case 'n' 
            //Begin case '%' 
            allowArgument = false;
            //End case '%' 
            //Begin case '%' 
            allowPrecision = false;
            //End case '%' 
            //Begin case default 
            if (DroidSafeAndroidRuntime.control) throw unknownFormatConversionException();
            //End case default 
            String mismatch;
            mismatch = null;
            {
                mismatch = ",";
            } //End block
            {
                mismatch = "-";
            } //End block
            {
                mismatch = "(";
            } //End block
            {
                mismatch = "+";
            } //End block
            {
                mismatch = "#";
            } //End block
            {
                mismatch = " ";
            } //End block
            {
                mismatch = "0";
            } //End block
            {
                {
                    if (DroidSafeAndroidRuntime.control) throw new IllegalFormatFlagsException(mismatch);
                } //End block
                {
                    if (DroidSafeAndroidRuntime.control) throw new FormatFlagsConversionMismatchException(mismatch, conversionType);
                } //End block
            } //End block
            {
                if (DroidSafeAndroidRuntime.control) throw new MissingFormatWidthException("-" + conversionType);
            } //End block
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalFormatFlagsException("%" + conversionType +
                        " doesn't take an argument");
            } //End block
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalFormatPrecisionException(precision);
            } //End block
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalFormatWidthException(width);
            } //End block
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalFormatFlagsException("the '+' and ' ' flags are incompatible");
            } //End block
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalFormatFlagsException("the '-' and '0' flags are incompatible");
            } //End block
            addTaint(arg.getTaint());
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.718 -0400", hash_original_method = "ECFEC3AA46FEEC6BDD34290E5303C5C1", hash_generated_method = "1F40DF5C85005D492273A294DD80B82F")
        public UnknownFormatConversionException unknownFormatConversionException() {
            {
                if (DroidSafeAndroidRuntime.control) throw new UnknownFormatConversionException(String.format("%c%c",
                        conversionType, dateSuffix));
            } //End block
            if (DroidSafeAndroidRuntime.control) throw new UnknownFormatConversionException(String.valueOf(conversionType));
            // ---------- Original Method ----------
            //if (conversionType == 't' || conversionType == 'T') {
                //throw new UnknownFormatConversionException(String.format("%c%c",
                        //conversionType, dateSuffix));
            //}
            //throw new UnknownFormatConversionException(String.valueOf(conversionType));
        }

        
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.718 -0400", hash_original_field = "0D32D75D80197F9844932D7929DB5015", hash_generated_field = "4838A237F0CA625FBEF0C47D75A467F3")

        static int LAST_ARGUMENT_INDEX = -2;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.718 -0400", hash_original_field = "682DBD04772A37CB99D92EB22481F8C6", hash_generated_field = "CF0957A0598B24AFC845C2D7EA89AC9D")

        static int UNSET = -1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.718 -0400", hash_original_field = "8FE6A229232BC2E57ECCA9364408A298", hash_generated_field = "822D4D5D37D288CD3F0EE0538BD215B6")

        static int FLAGS_UNSET = 0;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.718 -0400", hash_original_field = "AEFDD97FD64534132DA681FF73D9FC6D", hash_generated_field = "8568B544001A5D706A13E03FC312BB1B")

        static int DEFAULT_PRECISION = 6;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.718 -0400", hash_original_field = "60A2F91F5F69F60923439B86F77F3E9E", hash_generated_field = "B609C087757A73DA0A261F76F6BF2C2A")

        static int FLAG_ZERO = 1 << 4;
    }


    
    private static class FormatSpecifierParser {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.719 -0400", hash_original_field = "1DDCB92ADE31C8FBD370001F9B29A7D9", hash_generated_field = "3AFBEC2146BDEA5BFCBD2772D27C43DD")

        private String format;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.719 -0400", hash_original_field = "2FA47F7C65FEC19CC163B195725E3844", hash_generated_field = "C7D2E1B1F4403418CA216FC250689056")

        private int length;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.719 -0400", hash_original_field = "04D77DDD9C9389CC56939726D3DA8089", hash_generated_field = "4DF8ED554EC7B2C7483518163DCC894C")

        private int startIndex;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.719 -0400", hash_original_field = "865C0C0B4AB0E063E5CAA3387C1A8741", hash_generated_field = "DDFC4038967415E2F22993ABFD9A3B3F")

        private int i;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.725 -0400", hash_original_method = "2EAAE714EE0AE41BF39DBCA3F91B9104", hash_generated_method = "99616AB8C1E30FEFAAC91AD743EEE46F")
          FormatSpecifierParser(String format) {
            this.format = format;
            this.length = format.length();
            // ---------- Original Method ----------
            //this.format = format;
            //this.length = format.length();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.726 -0400", hash_original_method = "F77740880648C3886F14C74FD023BD3A", hash_generated_method = "6D3E81A08C44A4B5FF11A30507E13AAA")
         FormatToken parseFormatToken(int offset) {
            FormatToken varB4EAC82CA7396A68D541C85D26508E83_44432879 = null; //Variable for return #1
            this.startIndex = offset;
            this.i = offset;
            varB4EAC82CA7396A68D541C85D26508E83_44432879 = parseArgumentIndexAndFlags(new FormatToken());
            varB4EAC82CA7396A68D541C85D26508E83_44432879.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_44432879;
            // ---------- Original Method ----------
            //this.startIndex = offset;
            //this.i = offset;
            //return parseArgumentIndexAndFlags(new FormatToken());
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.727 -0400", hash_original_method = "7C388C74117CDF3E7844B526DC734D8C", hash_generated_method = "CC67D8E0BCACE329DA7CB7CF07DB09F7")
         String getFormatSpecifierText() {
            String varB4EAC82CA7396A68D541C85D26508E83_1234455448 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_1234455448 = format.substring(startIndex, i);
            varB4EAC82CA7396A68D541C85D26508E83_1234455448.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_1234455448;
            // ---------- Original Method ----------
            //return format.substring(startIndex, i);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.737 -0400", hash_original_method = "6521B9C02DA744FF180556D39A74ED44", hash_generated_method = "B8A75DD226047F76E160439741E6DAAF")
        private int peek() {
            {
                Object var765273F0E3B5EB95414F86EBEA317E40_1827731872 = (format.charAt(i));
            } //End flattened ternary
            int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_314028408 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_314028408;
            // ---------- Original Method ----------
            //return (i < length) ? format.charAt(i) : -1;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.737 -0400", hash_original_method = "F520742ED92EBACDB47FBF0D0B1F08F4", hash_generated_method = "7D3CB7E8EC37ED03D898EF71ED85D7EC")
        private char advance() {
            {
                if (DroidSafeAndroidRuntime.control) throw unknownFormatConversionException();
            } //End block
            char var7701A7CCE85ED6AA9880F4BA6BB09ECE_656572231 = (format.charAt(i++));
            char varA87DEB01C5F539E6BDA34829C8EF2368_951383074 = getTaintChar();
            return varA87DEB01C5F539E6BDA34829C8EF2368_951383074;
            // ---------- Original Method ----------
            //if (i >= length) {
                //throw unknownFormatConversionException();
            //}
            //return format.charAt(i++);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.739 -0400", hash_original_method = "DFAEBB829CC6A7AFE465DA1B9A0C1D5A", hash_generated_method = "30FA7929508460104EF53B75E4099319")
        private UnknownFormatConversionException unknownFormatConversionException() {
            if (DroidSafeAndroidRuntime.control) throw new UnknownFormatConversionException(getFormatSpecifierText());
            // ---------- Original Method ----------
            //throw new UnknownFormatConversionException(getFormatSpecifierText());
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.744 -0400", hash_original_method = "AD27190704DEC79DF3778A7C88589CDF", hash_generated_method = "F0B45CB8CFBD97FB53EDC7ACCEB7CC41")
        private FormatToken parseArgumentIndexAndFlags(FormatToken token) {
            FormatToken varB4EAC82CA7396A68D541C85D26508E83_1145529519 = null; //Variable for return #1
            FormatToken varB4EAC82CA7396A68D541C85D26508E83_1406333728 = null; //Variable for return #2
            FormatToken varB4EAC82CA7396A68D541C85D26508E83_1059631450 = null; //Variable for return #3
            FormatToken varB4EAC82CA7396A68D541C85D26508E83_1581222865 = null; //Variable for return #4
            int position;
            position = i;
            int ch;
            ch = peek();
            {
                boolean varDFC3E7B8AB55A9B54C0F9DEC46B1A118_726141392 = (Character.isDigit(ch));
                {
                    int number;
                    number = nextInt();
                    {
                        boolean varAF443300A994E05CBD4A93B1F0A6046B_1031519391 = (peek() == '$');
                        {
                            advance();
                            {
                                if (DroidSafeAndroidRuntime.control) throw new MissingFormatArgumentException(getFormatSpecifierText());
                            } //End block
                            token.setArgIndex(Math.max(0, number - 1));
                        } //End block
                        {
                            {
                                i = position;
                            } //End block
                            {
                                varB4EAC82CA7396A68D541C85D26508E83_1145529519 = parseWidth(token, number);
                            } //End block
                        } //End block
                    } //End collapsed parenthetic
                } //End block
                {
                    token.setArgIndex(FormatToken.LAST_ARGUMENT_INDEX);
                    advance();
                } //End block
            } //End collapsed parenthetic
            {
                boolean varD959591D21FA1B51681982FB61D589FE_553471985 = (token.setFlag(peek()));
                {
                    advance();
                } //End block
            } //End collapsed parenthetic
            ch = peek();
            {
                boolean varDFC3E7B8AB55A9B54C0F9DEC46B1A118_1788361085 = (Character.isDigit(ch));
                {
                    varB4EAC82CA7396A68D541C85D26508E83_1406333728 = parseWidth(token, nextInt());
                } //End block
                {
                    varB4EAC82CA7396A68D541C85D26508E83_1059631450 = parsePrecision(token);
                } //End block
                {
                    varB4EAC82CA7396A68D541C85D26508E83_1581222865 = parseConversionType(token);
                } //End block
            } //End collapsed parenthetic
            addTaint(token.getTaint());
            FormatToken varA7E53CE21691AB073D9660D615818899_1098922172; //Final return value
            switch (DroidSafeAndroidRuntime.switchControl) {
                case 1: //Assign result for return ordinal #1
                    varA7E53CE21691AB073D9660D615818899_1098922172 = varB4EAC82CA7396A68D541C85D26508E83_1145529519;
                    break;
                case 2: //Assign result for return ordinal #2
                    varA7E53CE21691AB073D9660D615818899_1098922172 = varB4EAC82CA7396A68D541C85D26508E83_1406333728;
                    break;
                case 3: //Assign result for return ordinal #3
                    varA7E53CE21691AB073D9660D615818899_1098922172 = varB4EAC82CA7396A68D541C85D26508E83_1059631450;
                    break;
                default:
                    varA7E53CE21691AB073D9660D615818899_1098922172 = varB4EAC82CA7396A68D541C85D26508E83_1581222865;
                    break;
            }
            varA7E53CE21691AB073D9660D615818899_1098922172.addTaint(getTaint()); //Add taint from parent
            return varA7E53CE21691AB073D9660D615818899_1098922172;
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.772 -0400", hash_original_method = "F4C6E47C7F58A93445972E2EDFDFCD5C", hash_generated_method = "22E45259420097EE481FC14E649D0245")
        private FormatToken parseWidth(FormatToken token, int width) {
            FormatToken varB4EAC82CA7396A68D541C85D26508E83_1036506516 = null; //Variable for return #1
            FormatToken varB4EAC82CA7396A68D541C85D26508E83_79604110 = null; //Variable for return #2
            token.setWidth(width);
            int ch;
            ch = peek();
            {
                varB4EAC82CA7396A68D541C85D26508E83_1036506516 = parsePrecision(token);
            } //End block
            {
                varB4EAC82CA7396A68D541C85D26508E83_79604110 = parseConversionType(token);
            } //End block
            addTaint(token.getTaint());
            addTaint(width);
            FormatToken varA7E53CE21691AB073D9660D615818899_1056712300; //Final return value
            switch (DroidSafeAndroidRuntime.switchControl) {
                case 1: //Assign result for return ordinal #1
                    varA7E53CE21691AB073D9660D615818899_1056712300 = varB4EAC82CA7396A68D541C85D26508E83_1036506516;
                    break;
                default:
                    varA7E53CE21691AB073D9660D615818899_1056712300 = varB4EAC82CA7396A68D541C85D26508E83_79604110;
                    break;
            }
            varA7E53CE21691AB073D9660D615818899_1056712300.addTaint(getTaint()); //Add taint from parent
            return varA7E53CE21691AB073D9660D615818899_1056712300;
            // ---------- Original Method ----------
            //token.setWidth(width);
            //int ch = peek();
            //if (ch == '.') {
                //return parsePrecision(token);
            //} else {
                //return parseConversionType(token);
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.772 -0400", hash_original_method = "06DE93E908B11B43F41251F270A468F2", hash_generated_method = "BDB9F05BB60DE72C168B0BCC9891284D")
        private FormatToken parsePrecision(FormatToken token) {
            FormatToken varB4EAC82CA7396A68D541C85D26508E83_152507430 = null; //Variable for return #1
            advance();
            int ch;
            ch = peek();
            {
                boolean varDFC3E7B8AB55A9B54C0F9DEC46B1A118_2038522493 = (Character.isDigit(ch));
                {
                    token.setPrecision(nextInt());
                    varB4EAC82CA7396A68D541C85D26508E83_152507430 = parseConversionType(token);
                } //End block
                {
                    if (DroidSafeAndroidRuntime.control) throw unknownFormatConversionException();
                } //End block
            } //End collapsed parenthetic
            addTaint(token.getTaint());
            varB4EAC82CA7396A68D541C85D26508E83_152507430.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_152507430;
            // ---------- Original Method ----------
            //advance();
            //int ch = peek();
            //if (Character.isDigit(ch)) {
                //token.setPrecision(nextInt());
                //return parseConversionType(token);
            //} else {
                //throw unknownFormatConversionException();
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.773 -0400", hash_original_method = "779E7C7A9E24C2B8C7A984530163E241", hash_generated_method = "D7F897238EB1BA92D210DBFA239FC373")
        private FormatToken parseConversionType(FormatToken token) {
            FormatToken varB4EAC82CA7396A68D541C85D26508E83_652326873 = null; //Variable for return #1
            char conversionType;
            conversionType = advance();
            token.setConversionType(conversionType);
            {
                char dateSuffix;
                dateSuffix = advance();
                token.setDateSuffix(dateSuffix);
            } //End block
            varB4EAC82CA7396A68D541C85D26508E83_652326873 = token;
            addTaint(token.getTaint());
            varB4EAC82CA7396A68D541C85D26508E83_652326873.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_652326873;
            // ---------- Original Method ----------
            //char conversionType = advance();
            //token.setConversionType(conversionType);
            //if (conversionType == 't' || conversionType == 'T') {
                //char dateSuffix = advance(); 
                //token.setDateSuffix(dateSuffix);
            //}
            //return token;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.773 -0400", hash_original_method = "ADF8322FF676CF5038257F50E4E4E6DC", hash_generated_method = "D82CB0CDDCC7FF3388F056EFBC17B8E1")
        private int nextInt() {
            long value;
            value = 0;
            {
                boolean var89C0C9F591E86A0985096DE42B7326D1_751185597 = (i < length && Character.isDigit(format.charAt(i)));
                {
                    value = 10 * value + (format.charAt(i++) - '0');
                    {
                        int varBF2312BB009815DC54B749D4D210B6C9_1646489689 = (failNextInt());
                    } //End block
                } //End block
            } //End collapsed parenthetic
            int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_132485061 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_132485061;
            // ---------- Original Method ----------
            //long value = 0;
            //while (i < length && Character.isDigit(format.charAt(i))) {
                //value = 10 * value + (format.charAt(i++) - '0');
                //if (value > Integer.MAX_VALUE) {
                    //return failNextInt();
                //}
            //}
            //return (int) value;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.774 -0400", hash_original_method = "F2814F47D4EB7F1D4CA24D9FE1C3918D", hash_generated_method = "02BF43D814267D4CA027FCD47720DC8B")
        private int failNextInt() {
            {
                boolean varDB282127B78D2B872AE9DB5E44D7F6B7_975776809 = (Character.isDigit(peek()));
                {
                    advance();
                } //End block
            } //End collapsed parenthetic
            int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2027219939 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2027219939;
            // ---------- Original Method ----------
            //while (Character.isDigit(peek())) {
                //advance();
            //}
            //return FormatToken.UNSET;
        }

        
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.774 -0400", hash_original_field = "A2B3A99FDB3C7974C9307D50BA09396A", hash_generated_field = "83C24A683F165D37EA212CE26252E31E")

    private static char[] ZEROS = new char[] { '0', '0', '0', '0', '0', '0', '0', '0', '0' };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.774 -0400", hash_original_field = "2E22D2BB824CAE76137397D7BB1A476C", hash_generated_field = "91CAAB2155118F946DF70B4E57A5439D")

    private static ThreadLocal<CachedDecimalFormat> cachedDecimalFormat = new ThreadLocal<CachedDecimalFormat>() {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:51.774 -0400", hash_original_method = "3BF85501572F336E7CB9026A6524A649", hash_generated_method = "B2205A88F8B94479AC480920CAE36D03")
        @Override
        protected CachedDecimalFormat initialValue() {
            CachedDecimalFormat varB4EAC82CA7396A68D541C85D26508E83_1636441013 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_1636441013 = new CachedDecimalFormat();
            varB4EAC82CA7396A68D541C85D26508E83_1636441013.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_1636441013;
            // ---------- Original Method ----------
            //return new CachedDecimalFormat();
        }

        
};
}

