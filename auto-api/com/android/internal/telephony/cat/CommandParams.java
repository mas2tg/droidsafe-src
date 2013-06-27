package com.android.internal.telephony.cat;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.graphics.Bitmap;

class CommandParams {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.105 -0400", hash_original_field = "455D72CEA61E597AF64B6D9F179A4D87", hash_generated_field = "ADD54520BA0629F0A763D04B0B24DD10")

    CommandDetails cmdDet;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.106 -0400", hash_original_method = "2B3FA66352959F95E07A360EAE45E831", hash_generated_method = "677B05FD0D442BB524C5F5A6AA3633B9")
      CommandParams(CommandDetails cmdDet) {
        this.cmdDet = cmdDet;
        // ---------- Original Method ----------
        //this.cmdDet = cmdDet;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.107 -0400", hash_original_method = "BBFB9BBC2EA7C24F6D809DAEED5D51EA", hash_generated_method = "2746B4B1176C27D9B0FBEA69DE38D91B")
     AppInterface.CommandType getCommandType() {
        AppInterface.CommandType varB4EAC82CA7396A68D541C85D26508E83_512813549 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_512813549 = AppInterface.CommandType.fromInt(cmdDet.typeOfCommand);
        varB4EAC82CA7396A68D541C85D26508E83_512813549.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_512813549;
        // ---------- Original Method ----------
        //return AppInterface.CommandType.fromInt(cmdDet.typeOfCommand);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.107 -0400", hash_original_method = "A8568713BEFC46F9EECE865CBC0E3B85", hash_generated_method = "27E688947D74CA233D5C97AB6EE3B7E7")
     boolean setIcon(Bitmap icon) {
        addTaint(icon.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_492966497 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_492966497;
        // ---------- Original Method ----------
        //return true;
    }

    
}

class DisplayTextParams extends CommandParams {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.107 -0400", hash_original_field = "D82152991B616F53E9EF719C0FDFF95B", hash_generated_field = "BB47A92F903E4E2AEB0FA2E7CC37DE84")

    TextMessage textMsg;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.108 -0400", hash_original_method = "700E001E6C7C4BB86F65A405A500553F", hash_generated_method = "BD558B34FCA90AD7DD0D7D5104167384")
      DisplayTextParams(CommandDetails cmdDet, TextMessage textMsg) {
        super(cmdDet);
        this.textMsg = textMsg;
        addTaint(cmdDet.getTaint());
        // ---------- Original Method ----------
        //this.textMsg = textMsg;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.108 -0400", hash_original_method = "21525D99FCC45F45CD5434385C40E277", hash_generated_method = "365A63F7A6FF03536006B593B4298E4E")
     boolean setIcon(Bitmap icon) {
        {
            textMsg.icon = icon;
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_583496026 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_583496026;
        // ---------- Original Method ----------
        //if (icon != null && textMsg != null) {
            //textMsg.icon = icon;
            //return true;
        //}
        //return false;
    }

    
}

class LaunchBrowserParams extends CommandParams {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.108 -0400", hash_original_field = "06B4D899C3434F9B6E6ACC3F56239187", hash_generated_field = "B2111E59C12A8525442758C5427A208C")

    TextMessage confirmMsg;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.108 -0400", hash_original_field = "15D61712450A686A7F365ADF4FEF581F", hash_generated_field = "A5764D2D4FA704D86881B5DFDB508312")

    LaunchBrowserMode mode;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.108 -0400", hash_original_field = "572D4E421E5E6B9BC11D815E8A027112", hash_generated_field = "1B433832A8D8C8722BF3FE2FD98C7841")

    String url;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.109 -0400", hash_original_method = "333668ED0BA1936719D55AC9BD5C191E", hash_generated_method = "CC22F545F096CE673E741DC4473AB3ED")
      LaunchBrowserParams(CommandDetails cmdDet, TextMessage confirmMsg,
            String url, LaunchBrowserMode mode) {
        super(cmdDet);
        this.confirmMsg = confirmMsg;
        this.mode = mode;
        this.url = url;
        addTaint(cmdDet.getTaint());
        // ---------- Original Method ----------
        //this.confirmMsg = confirmMsg;
        //this.mode = mode;
        //this.url = url;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.109 -0400", hash_original_method = "14C8B1CAE4AF3E3922E99E945859BFE8", hash_generated_method = "8730FD66F12A6257AA41C57ED283DAEC")
     boolean setIcon(Bitmap icon) {
        {
            confirmMsg.icon = icon;
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1936936226 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1936936226;
        // ---------- Original Method ----------
        //if (icon != null && confirmMsg != null) {
            //confirmMsg.icon = icon;
            //return true;
        //}
        //return false;
    }

    
}

class PlayToneParams extends CommandParams {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.109 -0400", hash_original_field = "D82152991B616F53E9EF719C0FDFF95B", hash_generated_field = "BB47A92F903E4E2AEB0FA2E7CC37DE84")

    TextMessage textMsg;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.109 -0400", hash_original_field = "2E5D8AA3DFA8EF34CA5131D20F9DAD51", hash_generated_field = "8D4AD8F7EAF433DA2E5A401C5C613EFE")

    ToneSettings settings;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.120 -0400", hash_original_method = "0EF5086DB6919FD4BD0CA8FFEAE75A4D", hash_generated_method = "1CCD5FF7A6E10B3B67EECB23401B048D")
      PlayToneParams(CommandDetails cmdDet, TextMessage textMsg,
            Tone tone, Duration duration, boolean vibrate) {
        super(cmdDet);
        this.textMsg = textMsg;
        this.settings = new ToneSettings(duration, tone, vibrate);
        addTaint(cmdDet.getTaint());
        // ---------- Original Method ----------
        //this.textMsg = textMsg;
        //this.settings = new ToneSettings(duration, tone, vibrate);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.120 -0400", hash_original_method = "21525D99FCC45F45CD5434385C40E277", hash_generated_method = "9373F06313F8DA0F4B139B3A9B729733")
     boolean setIcon(Bitmap icon) {
        {
            textMsg.icon = icon;
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_102253478 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_102253478;
        // ---------- Original Method ----------
        //if (icon != null && textMsg != null) {
            //textMsg.icon = icon;
            //return true;
        //}
        //return false;
    }

    
}

class CallSetupParams extends CommandParams {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.120 -0400", hash_original_field = "06B4D899C3434F9B6E6ACC3F56239187", hash_generated_field = "B2111E59C12A8525442758C5427A208C")

    TextMessage confirmMsg;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.120 -0400", hash_original_field = "C92AF136DB908B735C01311448F4DE71", hash_generated_field = "965D344D08F644937D8D78D46A2A1817")

    TextMessage callMsg;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.121 -0400", hash_original_method = "E3AB8AF63DAE9B970C2C85BEC45D1384", hash_generated_method = "52C73CCFCD580AFBFB46BC3DA7CA71B7")
      CallSetupParams(CommandDetails cmdDet, TextMessage confirmMsg,
            TextMessage callMsg) {
        super(cmdDet);
        this.confirmMsg = confirmMsg;
        this.callMsg = callMsg;
        addTaint(cmdDet.getTaint());
        // ---------- Original Method ----------
        //this.confirmMsg = confirmMsg;
        //this.callMsg = callMsg;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.122 -0400", hash_original_method = "7CBBFD719CD54FED6A95014430B0D13E", hash_generated_method = "AA327F0A33DF666B0E1A3F94433D056F")
     boolean setIcon(Bitmap icon) {
        {
            confirmMsg.icon = icon;
        } //End block
        {
            callMsg.icon = icon;
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1382844103 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1382844103;
        // ---------- Original Method ----------
        //if (icon == null) {
            //return false;
        //}
        //if (confirmMsg != null && confirmMsg.icon == null) {
            //confirmMsg.icon = icon;
            //return true;
        //} else if (callMsg != null && callMsg.icon == null) {
            //callMsg.icon = icon;
            //return true;
        //}
        //return false;
    }

    
}

class SelectItemParams extends CommandParams {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.122 -0400", hash_original_field = "06127BF5F44271A1FC348E33777BAE7E", hash_generated_field = "1ECB1009BB02DA4D1823D6D12E970C7B")

    Menu menu = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.122 -0400", hash_original_field = "D39C2A8FFC14B00416DE6BA09EB55732", hash_generated_field = "87D0E6332583567BDE938D421B6FE2B8")

    boolean loadTitleIcon = false;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.122 -0400", hash_original_method = "E55DB81905BD2AA861EB811BEF064274", hash_generated_method = "B06BB4F629C0AEBD0BAA25FC718DF795")
      SelectItemParams(CommandDetails cmdDet, Menu menu, boolean loadTitleIcon) {
        super(cmdDet);
        this.menu = menu;
        this.loadTitleIcon = loadTitleIcon;
        addTaint(cmdDet.getTaint());
        // ---------- Original Method ----------
        //this.menu = menu;
        //this.loadTitleIcon = loadTitleIcon;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.158 -0400", hash_original_method = "18017A51DEA7E263420DEFD24143331D", hash_generated_method = "834BAD3EF779405CE4A851278702F8E0")
     boolean setIcon(Bitmap icon) {
        {
            {
                menu.titleIcon = icon;
            } //End block
            {
                {
                    Iterator<Item> varEC31BF7F1D0D208DA2BB8B90D8CDB8D2_1206941583 = (menu.items).iterator();
                    varEC31BF7F1D0D208DA2BB8B90D8CDB8D2_1206941583.hasNext();
                    Item item = varEC31BF7F1D0D208DA2BB8B90D8CDB8D2_1206941583.next();
                    {
                        item.icon = icon;
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1284836852 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1284836852;
        // ---------- Original Method ----------
        //if (icon != null && menu != null) {
            //if (loadTitleIcon && menu.titleIcon == null) {
                //menu.titleIcon = icon;
            //} else {
                //for (Item item : menu.items) {
                    //if (item.icon != null) {
                        //continue;
                    //}
                    //item.icon = icon;
                    //break;
                //}
            //}
            //return true;
        //}
        //return false;
    }

    
}

class GetInputParams extends CommandParams {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.158 -0400", hash_original_field = "1CFC72C8A5D816EEF0317D3D02105AD5", hash_generated_field = "FCC05DAC3210D446A9ECD36D82FBAA06")

    Input input = null;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.158 -0400", hash_original_method = "4B81DD05ADA485DA1C52833ACC153D55", hash_generated_method = "B322023BE653A24EEBDECDFB28157E0E")
      GetInputParams(CommandDetails cmdDet, Input input) {
        super(cmdDet);
        this.input = input;
        addTaint(cmdDet.getTaint());
        // ---------- Original Method ----------
        //this.input = input;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:17.159 -0400", hash_original_method = "0D1B780F5B7D1ED973494BE2C3910B90", hash_generated_method = "B175982CE85A110F87A92FF3C7D86A56")
     boolean setIcon(Bitmap icon) {
        {
            input.icon = icon;
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_877476273 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_877476273;
        // ---------- Original Method ----------
        //if (icon != null && input != null) {
            //input.icon = icon;
        //}
        //return true;
    }

    
}

