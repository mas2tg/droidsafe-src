package java.security;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Date;
import java.util.Enumeration;
import javax.crypto.SecretKey;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.PasswordCallback;

public abstract class KeyStoreSpi {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:47.079 -0400", hash_original_method = "0F44DABB4B3060793D573A941E7E27B4", hash_generated_method = "0F44DABB4B3060793D573A941E7E27B4")
    public KeyStoreSpi ()
    {
        //Synthesized constructor
    }


    public abstract Key engineGetKey(String alias, char[] password)
            throws NoSuchAlgorithmException, UnrecoverableKeyException;

    
    public abstract Certificate[] engineGetCertificateChain(String alias);

    
    public abstract Certificate engineGetCertificate(String alias);

    
    public abstract Date engineGetCreationDate(String alias);

    
    public abstract void engineSetKeyEntry(String alias, Key key,
            char[] password, Certificate[] chain) throws KeyStoreException;

    
    public abstract void engineSetKeyEntry(String alias, byte[] key,
            Certificate[] chain) throws KeyStoreException;

    
    public abstract void engineSetCertificateEntry(String alias,
            Certificate cert) throws KeyStoreException;

    
    public abstract void engineDeleteEntry(String alias)
            throws KeyStoreException;

    
    public abstract Enumeration<String> engineAliases();

    
    public abstract boolean engineContainsAlias(String alias);

    
    public abstract int engineSize();

    
    public abstract boolean engineIsKeyEntry(String alias);

    
    public abstract boolean engineIsCertificateEntry(String alias);

    
    public abstract String engineGetCertificateAlias(Certificate cert);

    
    public abstract void engineStore(OutputStream stream, char[] password)
            throws IOException, NoSuchAlgorithmException, CertificateException;

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:47.095 -0400", hash_original_method = "2DD87D7240BCBB9F96BACA77A06CD528", hash_generated_method = "39FF2BFC10C6E11D55D19E6B4006D8BB")
    public void engineStore(KeyStore.LoadStoreParameter param) throws IOException, NoSuchAlgorithmException, CertificateException {
        if (DroidSafeAndroidRuntime.control) throw new UnsupportedOperationException();
        addTaint(param.getTaint());
        // ---------- Original Method ----------
        //throw new UnsupportedOperationException();
    }

    
    public abstract void engineLoad(InputStream stream, char[] password)
            throws IOException, NoSuchAlgorithmException, CertificateException;

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:47.103 -0400", hash_original_method = "C2F8D415FB9276C7A503B37F207C6477", hash_generated_method = "9737B10C3E173C27681A459498F9F884")
    public void engineLoad(KeyStore.LoadStoreParameter param) throws IOException, NoSuchAlgorithmException, CertificateException {
        {
            engineLoad(null, null);
        } //End block
        char[] pwd;
        KeyStore.ProtectionParameter pp;
        pp = param.getProtectionParameter();
        {
            try 
            {
                pwd = ((KeyStore.PasswordProtection) pp).getPassword();
                engineLoad(null, pwd);
            } //End block
            catch (IllegalStateException e)
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException(e);
            } //End block
        } //End block
        {
            try 
            {
                pwd = getPasswordFromCallBack(pp);
                engineLoad(null, pwd);
            } //End block
            catch (UnrecoverableEntryException e)
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException(e);
            } //End block
        } //End block
        if (DroidSafeAndroidRuntime.control) throw new UnsupportedOperationException("protectionParameter is neither PasswordProtection "
                                                + "nor CallbackHandlerProtection instance");
        addTaint(param.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:47.110 -0400", hash_original_method = "B68FB53D4042F1FDA8275FB481793ECB", hash_generated_method = "A937DF4E0DB56849D3BF2E3170745CAD")
    public KeyStore.Entry engineGetEntry(String alias,
            KeyStore.ProtectionParameter protParam) throws KeyStoreException,
            NoSuchAlgorithmException, UnrecoverableEntryException {
        KeyStore.Entry varB4EAC82CA7396A68D541C85D26508E83_465852876 = null; //Variable for return #1
        KeyStore.Entry varB4EAC82CA7396A68D541C85D26508E83_111935292 = null; //Variable for return #2
        KeyStore.Entry varB4EAC82CA7396A68D541C85D26508E83_1896166756 = null; //Variable for return #3
        KeyStore.Entry varB4EAC82CA7396A68D541C85D26508E83_740801823 = null; //Variable for return #4
        {
            boolean var5CDA5E3738B95D49C978F3282219AB9E_1619531381 = (!engineContainsAlias(alias));
            {
                varB4EAC82CA7396A68D541C85D26508E83_465852876 = null;
            } //End block
        } //End collapsed parenthetic
        {
            boolean var3331921A37AE2FFC3485EFBB76E44677_746250519 = (engineIsCertificateEntry(alias));
            {
                varB4EAC82CA7396A68D541C85D26508E83_111935292 = new KeyStore.TrustedCertificateEntry(
                    engineGetCertificate(alias));
            } //End block
        } //End collapsed parenthetic
        char[] passW;
        passW = null;
        {
            {
                try 
                {
                    passW = ((KeyStore.PasswordProtection) protParam)
                            .getPassword();
                } //End block
                catch (IllegalStateException ee)
                {
                    if (DroidSafeAndroidRuntime.control) throw new KeyStoreException("Password was destroyed", ee);
                } //End block
            } //End block
            {
                passW = getPasswordFromCallBack(protParam);
            } //End block
            {
                if (DroidSafeAndroidRuntime.control) throw new UnrecoverableEntryException("ProtectionParameter object is not "
                                                      + "PasswordProtection: " + protParam);
            } //End block
        } //End block
        {
            boolean varC8D635291ED23140AD71444B2F09E907_51309799 = (engineIsKeyEntry(alias));
            {
                Key key;
                key = engineGetKey(alias, passW);
                {
                    varB4EAC82CA7396A68D541C85D26508E83_1896166756 = new KeyStore.PrivateKeyEntry((PrivateKey) key,
                                                    engineGetCertificateChain(alias));
                } //End block
                {
                    varB4EAC82CA7396A68D541C85D26508E83_740801823 = new KeyStore.SecretKeyEntry((SecretKey) key);
                } //End block
            } //End block
        } //End collapsed parenthetic
        if (DroidSafeAndroidRuntime.control) throw new NoSuchAlgorithmException("Unknown KeyStore.Entry object");
        addTaint(alias.getTaint());
        addTaint(protParam.getTaint());
        KeyStore.Entry varA7E53CE21691AB073D9660D615818899_881734639; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_881734639 = varB4EAC82CA7396A68D541C85D26508E83_465852876;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_881734639 = varB4EAC82CA7396A68D541C85D26508E83_111935292;
                break;
            case 3: //Assign result for return ordinal #3
                varA7E53CE21691AB073D9660D615818899_881734639 = varB4EAC82CA7396A68D541C85D26508E83_1896166756;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_881734639 = varB4EAC82CA7396A68D541C85D26508E83_740801823;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_881734639.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_881734639;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:47.120 -0400", hash_original_method = "3D4613712C6A1FF15305C05DDF5D1E0F", hash_generated_method = "1D6823B89CFE58CDCDEC3D71C79EAD3B")
    public void engineSetEntry(String alias, KeyStore.Entry entry,
            KeyStore.ProtectionParameter protParam) throws KeyStoreException {
        {
            if (DroidSafeAndroidRuntime.control) throw new KeyStoreException("entry == null");
        } //End block
        {
            boolean var356966AF57386F220AA335774EF1D5B5_451981547 = (engineContainsAlias(alias));
            {
                engineDeleteEntry(alias);
            } //End block
        } //End collapsed parenthetic
        {
            KeyStore.TrustedCertificateEntry trE;
            trE = (KeyStore.TrustedCertificateEntry) entry;
            engineSetCertificateEntry(alias, trE.getTrustedCertificate());
        } //End block
        char[] passW;
        passW = null;
        {
            try 
            {
                passW = ((KeyStore.PasswordProtection) protParam).getPassword();
            } //End block
            catch (IllegalStateException ee)
            {
                if (DroidSafeAndroidRuntime.control) throw new KeyStoreException("Password was destroyed", ee);
            } //End block
        } //End block
        {
            {
                try 
                {
                    passW = getPasswordFromCallBack(protParam);
                } //End block
                catch (Exception e)
                {
                    if (DroidSafeAndroidRuntime.control) throw new KeyStoreException(e);
                } //End block
            } //End block
            {
                if (DroidSafeAndroidRuntime.control) throw new KeyStoreException("protParam should be PasswordProtection or "
                                            + "CallbackHandlerProtection");
            } //End block
        } //End block
        {
            KeyStore.PrivateKeyEntry prE;
            prE = (KeyStore.PrivateKeyEntry) entry;
            engineSetKeyEntry(alias, prE.getPrivateKey(), passW, prE
                    .getCertificateChain());
        } //End block
        {
            KeyStore.SecretKeyEntry skE;
            skE = (KeyStore.SecretKeyEntry) entry;
            engineSetKeyEntry(alias, skE.getSecretKey(), passW, null);
        } //End block
        if (DroidSafeAndroidRuntime.control) throw new KeyStoreException("Entry object is neither PrivateKeyObject nor SecretKeyEntry "
                                    + "nor TrustedCertificateEntry: " + entry);
        addTaint(alias.getTaint());
        addTaint(entry.getTaint());
        addTaint(protParam.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:47.126 -0400", hash_original_method = "E646126BAF6D7B233BE960C73341BBD0", hash_generated_method = "A817FEC8AAAA0D979E2D115DFE738695")
    public boolean engineEntryInstanceOf(String alias,
            Class<? extends KeyStore.Entry> entryClass) {
        {
            boolean var5CDA5E3738B95D49C978F3282219AB9E_937190090 = (!engineContainsAlias(alias));
        } //End collapsed parenthetic
        try 
        {
            {
                boolean var8FF0158E2A843FED52256D95A84AA871_1054030279 = (engineIsCertificateEntry(alias));
                {
                    boolean varD6CC2852CBA1BA58ED0B285BA4B13848_1726815940 = (entryClass
                        .isAssignableFrom(Class
                                .forName("java.security.KeyStore$TrustedCertificateEntry")));
                } //End block
            } //End collapsed parenthetic
            {
                boolean var04F400450A38CB8A9AC0285F529D0D71_1777321664 = (engineIsKeyEntry(alias));
                {
                    {
                        boolean var40AFCBC15E92F845EB44D55A7221C1FD_269156055 = (entryClass.isAssignableFrom(Class
                        .forName("java.security.KeyStore$PrivateKeyEntry")));
                        {
                            boolean var1D4CC438EDDF037AEC1A448A0CB5A59D_1194501246 = (engineGetCertificate(alias) != null);
                        } //End block
                    } //End collapsed parenthetic
                    {
                        boolean var4F6DF7ECC1F528257CAF7647CB20F355_868242909 = (entryClass.isAssignableFrom(Class
                        .forName("java.security.KeyStore$SecretKeyEntry")));
                        {
                            boolean varBBE742A5E059735C0A2505C4791C7481_349947849 = (engineGetCertificate(alias) == null);
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
        } //End block
        catch (ClassNotFoundException ignore)
        { }
        addTaint(alias.getTaint());
        addTaint(entryClass.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_569326968 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_569326968;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        static char[] getPasswordFromCallBack(KeyStore.ProtectionParameter protParam) throws UnrecoverableEntryException {
        if (protParam == null) {
            return null;
        }
        if (!(protParam instanceof KeyStore.CallbackHandlerProtection)) {
            throw new UnrecoverableEntryException("Incorrect ProtectionParameter");
        }
        String clName = Security.getProperty("auth.login.defaultCallbackHandler");
        if (clName == null) {
            throw new UnrecoverableEntryException("Default CallbackHandler was not defined");
        }
        try {
            Class<?> cl = Class.forName(clName);
            CallbackHandler cbHand = (CallbackHandler) cl.newInstance();
            PasswordCallback[] pwCb = { new PasswordCallback("password: ", true) };
            cbHand.handle(pwCb);
            return pwCb[0].getPassword();
        } catch (Exception e) {
            throw new UnrecoverableEntryException(e.toString());
        }
    }

    
}

