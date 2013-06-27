package android.widget;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.util.ArrayList;

class ExpandableListPosition {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.373 -0400", hash_original_field = "EE07D40A93E39122F7007E1922755F80", hash_generated_field = "2301C40FE9B33471D945A5226ECAAB38")

    public int groupPos;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.374 -0400", hash_original_field = "DEB93B3708C76AD8AAD280EF94D7E2FE", hash_generated_field = "60A49C0AC4F2F0436AB7AB0C7B3140B6")

    public int childPos;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.374 -0400", hash_original_field = "1CED080A89697925D9EEB8ECFC3C5C9C", hash_generated_field = "ABD45EB65AB80D8EB9E3EA196D9D59D5")

    int flatListPos;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.374 -0400", hash_original_field = "599DCCE2998A6B40B1E38E8C6006CB0A", hash_generated_field = "6AC5CE4BE311ED1283E9BD812937901E")

    public int type;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.374 -0400", hash_original_method = "AC719FEF152399BDA1BD5A5CA7FBB765", hash_generated_method = "CA9DC1117656D5954D084C62466145DC")
    private  ExpandableListPosition() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.384 -0400", hash_original_method = "6E7C899DC67219985BD699CC84AD95E6", hash_generated_method = "D1043CAEEE96B318519BE4957822CE46")
    private void resetState() {
        groupPos = 0;
        childPos = 0;
        flatListPos = 0;
        type = 0;
        // ---------- Original Method ----------
        //groupPos = 0;
        //childPos = 0;
        //flatListPos = 0;
        //type = 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.385 -0400", hash_original_method = "C8676DC8E5CB906E204449634591A777", hash_generated_method = "BA0355D2EAA69D67C69DE24B1EDD6B57")
     long getPackedPosition() {
        long varF1CDC56F9484B79C6147A2A49F08CA17_1853611644 = (ExpandableListView.getPackedPositionForChild(groupPos, childPos));
        long varC88519A853E40A47ED20C816E0704D5D_758748740 = (ExpandableListView.getPackedPositionForGroup(groupPos));
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1610925771 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1610925771;
        // ---------- Original Method ----------
        //if (type == CHILD) return ExpandableListView.getPackedPositionForChild(groupPos, childPos);
        //else return ExpandableListView.getPackedPositionForGroup(groupPos);
    }

    
        static ExpandableListPosition obtainGroupPosition(int groupPosition) {
        return obtain(GROUP, groupPosition, 0, 0);
    }

    
        static ExpandableListPosition obtainChildPosition(int groupPosition, int childPosition) {
        return obtain(CHILD, groupPosition, childPosition, 0);
    }

    
        static ExpandableListPosition obtainPosition(long packedPosition) {
        if (packedPosition == ExpandableListView.PACKED_POSITION_VALUE_NULL) {
            return null;
        }
        ExpandableListPosition elp = getRecycledOrCreate();
        elp.groupPos = ExpandableListView.getPackedPositionGroup(packedPosition);
        if (ExpandableListView.getPackedPositionType(packedPosition) ==
                ExpandableListView.PACKED_POSITION_TYPE_CHILD) {
            elp.type = CHILD;
            elp.childPos = ExpandableListView.getPackedPositionChild(packedPosition);
        } else {
            elp.type = GROUP;
        }
        return elp;
    }

    
        static ExpandableListPosition obtain(int type, int groupPos, int childPos, int flatListPos) {
        ExpandableListPosition elp = getRecycledOrCreate();
        elp.type = type;
        elp.groupPos = groupPos;
        elp.childPos = childPos;
        elp.flatListPos = flatListPos;
        return elp;
    }

    
        private static ExpandableListPosition getRecycledOrCreate() {
        ExpandableListPosition elp;
        synchronized (sPool) {
            if (sPool.size() > 0) {
                elp = sPool.remove(0);
            } else {
                return new ExpandableListPosition();
            }
        }
        elp.resetState();
        return elp;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.386 -0400", hash_original_method = "8A154BA1D9B394A3D67E04E6A86589B2", hash_generated_method = "18D097C65E3EA7CC9E4F164E744B399D")
    public void recycle() {
        {
            {
                boolean varFD1AE4DE39490BAA16F88E57693E4F3C_1526567875 = (sPool.size() < MAX_POOL_SIZE);
                {
                    sPool.add(this);
                } //End block
            } //End collapsed parenthetic
        } //End block
        // ---------- Original Method ----------
        //synchronized (sPool) {
            //if (sPool.size() < MAX_POOL_SIZE) {
                //sPool.add(this);
            //}
        //}
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.386 -0400", hash_original_field = "889E6ADBE471574497DA5C9E79EF7FCA", hash_generated_field = "F95AA3BBD7F2EE021B9A9B5059C2D36B")

    private static int MAX_POOL_SIZE = 5;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.386 -0400", hash_original_field = "5A94D2210A3BD35C5C514A0AAE6A7DBD", hash_generated_field = "13B9F617BBB013357274E6300FD7AEA8")

    private static ArrayList<ExpandableListPosition> sPool = new ArrayList<ExpandableListPosition>(MAX_POOL_SIZE);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.386 -0400", hash_original_field = "0FE51404ACE91FDA107540AE9D2D4278", hash_generated_field = "F0F5C77DA98AF028C1257C33F37951DA")

    public final static int CHILD = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.386 -0400", hash_original_field = "8B6AA562AB8083D61143786D8730F6DA", hash_generated_field = "4F320263FDA19E11C7632EEC3F961D53")

    public final static int GROUP = 2;
}

