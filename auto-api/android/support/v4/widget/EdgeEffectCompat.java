package android.support.v4.widget;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;

public class EdgeEffectCompat {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.228 -0400", hash_original_field = "57A7CF27A845892EEEA09B7BE13F185E", hash_generated_field = "8B86712DCA30565AC003C93F8A9D023C")

    private Object mEdgeEffect;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.229 -0400", hash_original_method = "D753748532B85BCF2954D7C221C91401", hash_generated_method = "A1ADE811356594F2DB256EED3B0F5EB3")
    public  EdgeEffectCompat(Context context) {
        mEdgeEffect = IMPL.newEdgeEffect(context);
        // ---------- Original Method ----------
        //mEdgeEffect = IMPL.newEdgeEffect(context);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.229 -0400", hash_original_method = "D4DAEE1A405642168AB096E0B8E2EAD2", hash_generated_method = "10759A7DC67983439FBE95C72E5D0608")
    public void setSize(int width, int height) {
        IMPL.setSize(mEdgeEffect, width, height);
        addTaint(width);
        addTaint(height);
        // ---------- Original Method ----------
        //IMPL.setSize(mEdgeEffect, width, height);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.230 -0400", hash_original_method = "EFAA81473E99AA681742723D4D62AB38", hash_generated_method = "6FDBAD2ACD54CDAFC892BCA85E8E439E")
    public boolean isFinished() {
        boolean var3EA09ADF94E351308B7D2F9F554CE5C6_258558843 = (IMPL.isFinished(mEdgeEffect));
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_440154811 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_440154811;
        // ---------- Original Method ----------
        //return IMPL.isFinished(mEdgeEffect);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.231 -0400", hash_original_method = "9C12A7C81A14CC06F079C8FA3122B4B4", hash_generated_method = "4D27A3E0F74451F4D051768EA9080087")
    public void finish() {
        IMPL.finish(mEdgeEffect);
        // ---------- Original Method ----------
        //IMPL.finish(mEdgeEffect);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.231 -0400", hash_original_method = "1908B5EE653AB1B5A5CE65E81F6BDB7A", hash_generated_method = "C51703336AFCBE578CB4FE01685E5567")
    public boolean onPull(float deltaDistance) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        boolean var49F6B611416CEB99433E1723B9963436_321236069 = (IMPL.onPull(mEdgeEffect, deltaDistance));
        addTaint(deltaDistance);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_166960348 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_166960348;
        // ---------- Original Method ----------
        //return IMPL.onPull(mEdgeEffect, deltaDistance);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.231 -0400", hash_original_method = "45F767B8769552AFBFA0E978EE8933FD", hash_generated_method = "E2F4A2C6FBF4CDB47C9A4C68D764BFC9")
    public boolean onRelease() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        boolean var845123BA855AFA627A6BFC6DB66C1464_755113682 = (IMPL.onRelease(mEdgeEffect));
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2128665153 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2128665153;
        // ---------- Original Method ----------
        //return IMPL.onRelease(mEdgeEffect);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.244 -0400", hash_original_method = "F0B0848CCB34A5B04946FEDCFE4DC62C", hash_generated_method = "B679501A29244CF9DBC1AAB50CB63F45")
    public boolean onAbsorb(int velocity) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        boolean var7983AD964AD2959367886FA4B6FF2BC1_1441502863 = (IMPL.onAbsorb(mEdgeEffect, velocity));
        addTaint(velocity);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_191170639 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_191170639;
        // ---------- Original Method ----------
        //return IMPL.onAbsorb(mEdgeEffect, velocity);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.245 -0400", hash_original_method = "F27D97BEDCE0E3BB57468FC6E19E8F78", hash_generated_method = "6119C3579887E1063D359DDC663FE0F5")
    public boolean draw(Canvas canvas) {
        boolean var0887A156A0CBF102BD39403A4700F946_350044729 = (IMPL.draw(mEdgeEffect, canvas));
        addTaint(canvas.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1947208223 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1947208223;
        // ---------- Original Method ----------
        //return IMPL.draw(mEdgeEffect, canvas);
    }

    
    static class BaseEdgeEffectImpl implements EdgeEffectImpl {
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.245 -0400", hash_original_method = "E93AF950D68741CBF25DC67984C27D7B", hash_generated_method = "E93AF950D68741CBF25DC67984C27D7B")
        public BaseEdgeEffectImpl ()
        {
            //Synthesized constructor
        }


        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.246 -0400", hash_original_method = "598F7EE7163BC02F940E7AE457E81E71", hash_generated_method = "7B87DE1035C42512F4831089E11F9789")
        public Object newEdgeEffect(Context context) {
            Object varB4EAC82CA7396A68D541C85D26508E83_1231922296 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_1231922296 = null;
            addTaint(context.getTaint());
            varB4EAC82CA7396A68D541C85D26508E83_1231922296.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_1231922296;
            // ---------- Original Method ----------
            //return null;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.246 -0400", hash_original_method = "7AB0823D4C5E0A56EB104E764A6EE643", hash_generated_method = "49B2AA1843748C607BB1606128254A22")
        public void setSize(Object edgeEffect, int width, int height) {
            addTaint(edgeEffect.getTaint());
            addTaint(width);
            addTaint(height);
            // ---------- Original Method ----------
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.264 -0400", hash_original_method = "18A3B4E50EAF82FBFB3F783FB1724270", hash_generated_method = "A8A71447DBE542912BEC8D6CEB526193")
        public boolean isFinished(Object edgeEffect) {
            addTaint(edgeEffect.getTaint());
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1740300273 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1740300273;
            // ---------- Original Method ----------
            //return true;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.264 -0400", hash_original_method = "4537DDA1058A07DD12C2683C46DAE0A0", hash_generated_method = "214222B178933FED02E3E3C1CFC2ED00")
        public void finish(Object edgeEffect) {
            addTaint(edgeEffect.getTaint());
            // ---------- Original Method ----------
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.264 -0400", hash_original_method = "6D6767FA0A7FD096DC5FAE330C25B4EB", hash_generated_method = "3003349F319A287EFC21D6947969CBF8")
        public boolean onPull(Object edgeEffect, float deltaDistance) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            addTaint(edgeEffect.getTaint());
            addTaint(deltaDistance);
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_170100373 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_170100373;
            // ---------- Original Method ----------
            //return false;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.265 -0400", hash_original_method = "4CCDA82CBCC611597E463B09D91011D3", hash_generated_method = "05EA4CF3AA66EC1E6F3CE355828F1B0D")
        public boolean onRelease(Object edgeEffect) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            addTaint(edgeEffect.getTaint());
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1123659483 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1123659483;
            // ---------- Original Method ----------
            //return false;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.266 -0400", hash_original_method = "E4A19D3F19F8749DFC3F77D5467C90AC", hash_generated_method = "0E07D7CCFDCA40A59457F941DE8AD52E")
        public boolean onAbsorb(Object edgeEffect, int velocity) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            addTaint(edgeEffect.getTaint());
            addTaint(velocity);
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1085372124 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1085372124;
            // ---------- Original Method ----------
            //return false;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.266 -0400", hash_original_method = "014795F812E9F03FFB958DEDF8F6EEBD", hash_generated_method = "EFAF2C2504A2E2A685582E47DBEA4A65")
        public boolean draw(Object edgeEffect, Canvas canvas) {
            addTaint(edgeEffect.getTaint());
            addTaint(canvas.getTaint());
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_756277211 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_756277211;
            // ---------- Original Method ----------
            //return false;
        }

        
    }


    
    static class EdgeEffectIcsImpl implements EdgeEffectImpl {
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.267 -0400", hash_original_method = "722DC077141274393C35BB912CA199C0", hash_generated_method = "722DC077141274393C35BB912CA199C0")
        public EdgeEffectIcsImpl ()
        {
            //Synthesized constructor
        }


        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.267 -0400", hash_original_method = "4DBA645CACC3049A11EF7913FF866293", hash_generated_method = "7A2AEE0880AD79564A03E164AFE3FCA4")
        public Object newEdgeEffect(Context context) {
            Object varB4EAC82CA7396A68D541C85D26508E83_51073077 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_51073077 = EdgeEffectCompatIcs.newEdgeEffect(context);
            addTaint(context.getTaint());
            varB4EAC82CA7396A68D541C85D26508E83_51073077.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_51073077;
            // ---------- Original Method ----------
            //return EdgeEffectCompatIcs.newEdgeEffect(context);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.283 -0400", hash_original_method = "7828FC66149E7A8F26ACE38B475CC37B", hash_generated_method = "340CA08827D52565611E8128FDC6E8D6")
        public void setSize(Object edgeEffect, int width, int height) {
            EdgeEffectCompatIcs.setSize(edgeEffect, width, height);
            addTaint(edgeEffect.getTaint());
            addTaint(width);
            addTaint(height);
            // ---------- Original Method ----------
            //EdgeEffectCompatIcs.setSize(edgeEffect, width, height);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.284 -0400", hash_original_method = "C615DC1E8C401B6C07B9EA0C459CE8A5", hash_generated_method = "CF143C5BC814A4BCB0BFB12FC8A3B6A5")
        public boolean isFinished(Object edgeEffect) {
            boolean var92021B66B6C455FA9C98D7EC13E0FB75_1789048119 = (EdgeEffectCompatIcs.isFinished(edgeEffect));
            addTaint(edgeEffect.getTaint());
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_884410114 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_884410114;
            // ---------- Original Method ----------
            //return EdgeEffectCompatIcs.isFinished(edgeEffect);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.284 -0400", hash_original_method = "AD76F4504BEBAE253EF4AD4435BC2FB9", hash_generated_method = "A0452D7327A084395392B10AF3A17D31")
        public void finish(Object edgeEffect) {
            EdgeEffectCompatIcs.finish(edgeEffect);
            addTaint(edgeEffect.getTaint());
            // ---------- Original Method ----------
            //EdgeEffectCompatIcs.finish(edgeEffect);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.285 -0400", hash_original_method = "A82E9A0A10EC720EFD1907409B81ECC2", hash_generated_method = "E47E8A51564BE9B36FB672BA4DF87FAD")
        public boolean onPull(Object edgeEffect, float deltaDistance) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            boolean var433561664B1B1C44BB28414376EF2187_366596071 = (EdgeEffectCompatIcs.onPull(edgeEffect, deltaDistance));
            addTaint(edgeEffect.getTaint());
            addTaint(deltaDistance);
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_852096524 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_852096524;
            // ---------- Original Method ----------
            //return EdgeEffectCompatIcs.onPull(edgeEffect, deltaDistance);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.292 -0400", hash_original_method = "D85EB1006C2B11862110869EE99A2168", hash_generated_method = "3A99CEAC1BF7D8B7E290F99CA05E92AC")
        public boolean onRelease(Object edgeEffect) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            boolean var96599794B2E390224525D270AB981239_61598997 = (EdgeEffectCompatIcs.onRelease(edgeEffect));
            addTaint(edgeEffect.getTaint());
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_580252985 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_580252985;
            // ---------- Original Method ----------
            //return EdgeEffectCompatIcs.onRelease(edgeEffect);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.292 -0400", hash_original_method = "DA1A282FCCAC2CD96B6A4C969DDDC50D", hash_generated_method = "E150305944A6D5BE64AA7AC52EE84193")
        public boolean onAbsorb(Object edgeEffect, int velocity) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            boolean var16606BECCBEA8DCDC86980EE1AE84F47_1942755607 = (EdgeEffectCompatIcs.onAbsorb(edgeEffect, velocity));
            addTaint(edgeEffect.getTaint());
            addTaint(velocity);
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1925330303 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1925330303;
            // ---------- Original Method ----------
            //return EdgeEffectCompatIcs.onAbsorb(edgeEffect, velocity);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.303 -0400", hash_original_method = "C724F7B236835D74B44177C7968204E4", hash_generated_method = "4FE16AAD4A1ABC5514D96A64390C8627")
        public boolean draw(Object edgeEffect, Canvas canvas) {
            boolean varBE7C46C8462B47BE2D7A6E5E2437CD79_888063012 = (EdgeEffectCompatIcs.draw(edgeEffect, canvas));
            addTaint(edgeEffect.getTaint());
            addTaint(canvas.getTaint());
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_169647775 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_169647775;
            // ---------- Original Method ----------
            //return EdgeEffectCompatIcs.draw(edgeEffect, canvas);
        }

        
    }


    
    interface EdgeEffectImpl {
        public Object newEdgeEffect(Context context);
        public void setSize(Object edgeEffect, int width, int height);
        public boolean isFinished(Object edgeEffect);
        public void finish(Object edgeEffect);
        public boolean onPull(Object edgeEffect, float deltaDistance);
        public boolean onRelease(Object edgeEffect);
        public boolean onAbsorb(Object edgeEffect, int velocity);
        public boolean draw(Object edgeEffect, Canvas canvas);
    }
    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:34.303 -0400", hash_original_field = "27A9F92549363F04EF46148FE9E87EEE", hash_generated_field = "C39368587D934C727CBBE97C813A7339")

    private static EdgeEffectImpl IMPL;
    static {
        if (Build.VERSION.SDK_INT >= 14) { 
            IMPL = new EdgeEffectIcsImpl();
        } else {
            IMPL = new BaseEdgeEffectImpl();
        }
    }
    
}

