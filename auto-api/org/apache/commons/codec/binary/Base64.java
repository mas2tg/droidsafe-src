package org.apache.commons.codec.binary;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

public class Base64 implements BinaryEncoder, BinaryDecoder {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:05.573 -0400", hash_original_method = "2DB9D16143059D09A54A3BB31C55E28D", hash_generated_method = "2DB9D16143059D09A54A3BB31C55E28D")
    public Base64 ()
    {
        //Synthesized constructor
    }


        private static boolean isBase64(byte octect) {
        if (octect == PAD) {
            return true;
        } else if (base64Alphabet[octect] == -1) {
            return false;
        } else {
            return true;
        }
    }

    
        public static boolean isArrayByteBase64(byte[] arrayOctect) {
        arrayOctect = discardWhitespace(arrayOctect);
        int length = arrayOctect.length;
        if (length == 0) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (!isBase64(arrayOctect[i])) {
                return false;
            }
        }
        return true;
    }

    
        public static byte[] encodeBase64(byte[] binaryData) {
        return encodeBase64(binaryData, false);
    }

    
        public static byte[] encodeBase64Chunked(byte[] binaryData) {
        return encodeBase64(binaryData, true);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:05.574 -0400", hash_original_method = "27928DA5608E3EA81ACF98D07D1CDAA8", hash_generated_method = "9833BE6BD1A3FE7F10B32B5280764527")
    public Object decode(Object pObject) throws DecoderException {
        Object varB4EAC82CA7396A68D541C85D26508E83_110385768 = null; //Variable for return #1
        {
            if (DroidSafeAndroidRuntime.control) throw new DecoderException("Parameter supplied to Base64 decode is not a byte[]");
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_110385768 = decode((byte[]) pObject);
        addTaint(pObject.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_110385768.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_110385768;
        // ---------- Original Method ----------
        //if (!(pObject instanceof byte[])) {
            //throw new DecoderException("Parameter supplied to Base64 decode is not a byte[]");
        //}
        //return decode((byte[]) pObject);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:05.574 -0400", hash_original_method = "E9A5741B84FE67E582817B8B79597420", hash_generated_method = "8151796E03024FD151FC3F5FBAAE926C")
    public byte[] decode(byte[] pArray) {
        byte[] var1D913E090727938764A38251CCC47DBA_719965073 = (decodeBase64(pArray));
        addTaint(pArray[0]);
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_1064797842 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_1064797842;
        // ---------- Original Method ----------
        //return decodeBase64(pArray);
    }

    
        public static byte[] encodeBase64(byte[] binaryData, boolean isChunked) {
        int lengthDataBits = binaryData.length * EIGHTBIT;
        int fewerThan24bits = lengthDataBits % TWENTYFOURBITGROUP;
        int numberTriplets = lengthDataBits / TWENTYFOURBITGROUP;
        byte encodedData[] = null;
        int encodedDataLength = 0;
        int nbrChunks = 0;
        if (fewerThan24bits != 0) {
            encodedDataLength = (numberTriplets + 1) * 4;
        } else {
            encodedDataLength = numberTriplets * 4;
        }
        if (isChunked) {
            nbrChunks =
                (CHUNK_SEPARATOR.length == 0 ? 0 : (int) Math.ceil((float) encodedDataLength / CHUNK_SIZE));
            encodedDataLength += nbrChunks * CHUNK_SEPARATOR.length;
        }
        encodedData = new byte[encodedDataLength];
        byte k = 0, l = 0, b1 = 0, b2 = 0, b3 = 0;
        int encodedIndex = 0;
        int dataIndex = 0;
        int i = 0;
        int nextSeparatorIndex = CHUNK_SIZE;
        int chunksSoFar = 0;
        for (i = 0; i < numberTriplets; i++) {
            dataIndex = i * 3;
            b1 = binaryData[dataIndex];
            b2 = binaryData[dataIndex + 1];
            b3 = binaryData[dataIndex + 2];
            l = (byte) (b2 & 0x0f);
            k = (byte) (b1 & 0x03);
            byte val1 =
                ((b1 & SIGN) == 0) ? (byte) (b1 >> 2) : (byte) ((b1) >> 2 ^ 0xc0);
            byte val2 =
                ((b2 & SIGN) == 0) ? (byte) (b2 >> 4) : (byte) ((b2) >> 4 ^ 0xf0);
            byte val3 =
                ((b3 & SIGN) == 0) ? (byte) (b3 >> 6) : (byte) ((b3) >> 6 ^ 0xfc);
            encodedData[encodedIndex] = lookUpBase64Alphabet[val1];
            encodedData[encodedIndex + 1] =
                lookUpBase64Alphabet[val2 | (k << 4)];
            encodedData[encodedIndex + 2] =
                lookUpBase64Alphabet[(l << 2) | val3];
            encodedData[encodedIndex + 3] = lookUpBase64Alphabet[b3 & 0x3f];
            encodedIndex += 4;
            if (isChunked) {
                if (encodedIndex == nextSeparatorIndex) {
                    System.arraycopy(
                        CHUNK_SEPARATOR,
                        0,
                        encodedData,
                        encodedIndex,
                        CHUNK_SEPARATOR.length);
                    chunksSoFar++;
                    nextSeparatorIndex =
                        (CHUNK_SIZE * (chunksSoFar + 1)) + 
                        (chunksSoFar * CHUNK_SEPARATOR.length);
                    encodedIndex += CHUNK_SEPARATOR.length;
                }
            }
        }
        dataIndex = i * 3;
        if (fewerThan24bits == EIGHTBIT) {
            b1 = binaryData[dataIndex];
            k = (byte) (b1 & 0x03);
            byte val1 =
                ((b1 & SIGN) == 0) ? (byte) (b1 >> 2) : (byte) ((b1) >> 2 ^ 0xc0);
            encodedData[encodedIndex] = lookUpBase64Alphabet[val1];
            encodedData[encodedIndex + 1] = lookUpBase64Alphabet[k << 4];
            encodedData[encodedIndex + 2] = PAD;
            encodedData[encodedIndex + 3] = PAD;
        } else if (fewerThan24bits == SIXTEENBIT) {
            b1 = binaryData[dataIndex];
            b2 = binaryData[dataIndex + 1];
            l = (byte) (b2 & 0x0f);
            k = (byte) (b1 & 0x03);
            byte val1 =
                ((b1 & SIGN) == 0) ? (byte) (b1 >> 2) : (byte) ((b1) >> 2 ^ 0xc0);
            byte val2 =
                ((b2 & SIGN) == 0) ? (byte) (b2 >> 4) : (byte) ((b2) >> 4 ^ 0xf0);
            encodedData[encodedIndex] = lookUpBase64Alphabet[val1];
            encodedData[encodedIndex + 1] =
                lookUpBase64Alphabet[val2 | (k << 4)];
            encodedData[encodedIndex + 2] = lookUpBase64Alphabet[l << 2];
            encodedData[encodedIndex + 3] = PAD;
        }
        if (isChunked) {
            if (chunksSoFar < nbrChunks) {
                System.arraycopy(
                    CHUNK_SEPARATOR,
                    0,
                    encodedData,
                    encodedDataLength - CHUNK_SEPARATOR.length,
                    CHUNK_SEPARATOR.length);
            }
        }
        return encodedData;
    }

    
        public static byte[] decodeBase64(byte[] base64Data) {
        base64Data = discardNonBase64(base64Data);
        if (base64Data.length == 0) {
            return new byte[0];
        }
        int numberQuadruple = base64Data.length / FOURBYTE;
        byte decodedData[] = null;
        byte b1 = 0, b2 = 0, b3 = 0, b4 = 0, marker0 = 0, marker1 = 0;
        int encodedIndex = 0;
        int dataIndex = 0;
        {
            int lastData = base64Data.length;
            while (base64Data[lastData - 1] == PAD) {
                if (--lastData == 0) {
                    return new byte[0];
                }
            }
            decodedData = new byte[lastData - numberQuadruple];
        }
        for (int i = 0; i < numberQuadruple; i++) {
            dataIndex = i * 4;
            marker0 = base64Data[dataIndex + 2];
            marker1 = base64Data[dataIndex + 3];
            b1 = base64Alphabet[base64Data[dataIndex]];
            b2 = base64Alphabet[base64Data[dataIndex + 1]];
            if (marker0 != PAD && marker1 != PAD) {
                b3 = base64Alphabet[marker0];
                b4 = base64Alphabet[marker1];
                decodedData[encodedIndex] = (byte) (b1 << 2 | b2 >> 4);
                decodedData[encodedIndex + 1] =
                    (byte) (((b2 & 0xf) << 4) | ((b3 >> 2) & 0xf));
                decodedData[encodedIndex + 2] = (byte) (b3 << 6 | b4);
            } else if (marker0 == PAD) {
                decodedData[encodedIndex] = (byte) (b1 << 2 | b2 >> 4);
            } else if (marker1 == PAD) {
                b3 = base64Alphabet[marker0];
                decodedData[encodedIndex] = (byte) (b1 << 2 | b2 >> 4);
                decodedData[encodedIndex + 1] =
                    (byte) (((b2 & 0xf) << 4) | ((b3 >> 2) & 0xf));
            }
            encodedIndex += 3;
        }
        return decodedData;
    }

    
        static byte[] discardWhitespace(byte[] data) {
        byte groomedData[] = new byte[data.length];
        int bytesCopied = 0;
        for (int i = 0; i < data.length; i++) {
            switch (data[i]) {
            case (byte) ' ' :
            case (byte) '\n' :
            case (byte) '\r' :
            case (byte) '\t' :
                    break;
            default:
                    groomedData[bytesCopied++] = data[i];
            }
        }
        byte packedData[] = new byte[bytesCopied];
        System.arraycopy(groomedData, 0, packedData, 0, bytesCopied);
        return packedData;
    }

    
        static byte[] discardNonBase64(byte[] data) {
        byte groomedData[] = new byte[data.length];
        int bytesCopied = 0;
        for (int i = 0; i < data.length; i++) {
            if (isBase64(data[i])) {
                groomedData[bytesCopied++] = data[i];
            }
        }
        byte packedData[] = new byte[bytesCopied];
        System.arraycopy(groomedData, 0, packedData, 0, bytesCopied);
        return packedData;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:05.580 -0400", hash_original_method = "D5F82E7B8136CE61250AF5358F628FEE", hash_generated_method = "78B159AB391047B125200071250370DC")
    public Object encode(Object pObject) throws EncoderException {
        Object varB4EAC82CA7396A68D541C85D26508E83_1349572005 = null; //Variable for return #1
        {
            if (DroidSafeAndroidRuntime.control) throw new EncoderException(
                "Parameter supplied to Base64 encode is not a byte[]");
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1349572005 = encode((byte[]) pObject);
        addTaint(pObject.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1349572005.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1349572005;
        // ---------- Original Method ----------
        //if (!(pObject instanceof byte[])) {
            //throw new EncoderException(
                //"Parameter supplied to Base64 encode is not a byte[]");
        //}
        //return encode((byte[]) pObject);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:05.592 -0400", hash_original_method = "D3EC39ECED0CD0D362D80F2CDBB3BB21", hash_generated_method = "4E9A209B47015E88BECAC5EA041D44AD")
    public byte[] encode(byte[] pArray) {
        byte[] varA92A7E559FFCE381A6CE5DEBD2A9417B_1603167460 = (encodeBase64(pArray, false));
        addTaint(pArray[0]);
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_219937658 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_219937658;
        // ---------- Original Method ----------
        //return encodeBase64(pArray, false);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:05.592 -0400", hash_original_field = "C900088CF47F42E1FDEDD732093A05C6", hash_generated_field = "85C6B49191FC20C4F27FA3AEB522150B")

    static int CHUNK_SIZE = 76;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:05.592 -0400", hash_original_field = "B7A4D877F3BF42159AEE0021E6617F7C", hash_generated_field = "8CC0692E7DF1A1E86EA7F6D4EB01016D")

    static byte[] CHUNK_SEPARATOR = "\r\n".getBytes();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:05.593 -0400", hash_original_field = "5E96E21471F1976C1C78B3F41EB003B0", hash_generated_field = "A93B2154FEA6A8D65C6FDB2A8EB57D51")

    static int BASELENGTH = 255;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:05.593 -0400", hash_original_field = "6EEAD15E586E708406939B927FEBCE47", hash_generated_field = "DE8BF3EFEA4BD875938BAE191E0D80FE")

    static int LOOKUPLENGTH = 64;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:05.593 -0400", hash_original_field = "5FB1B32D3E558CF51736E68C69144AD1", hash_generated_field = "8F9AADB15AC7000EC3163A0AE4279592")

    static int EIGHTBIT = 8;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:05.593 -0400", hash_original_field = "595C4E55E554F88DDD51B78B71420F02", hash_generated_field = "F0221AD14D8AAA3EFF8B32A4C2E69F91")

    static int SIXTEENBIT = 16;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:05.593 -0400", hash_original_field = "D59141B5DBE1F4ED7207DB28018CE9C9", hash_generated_field = "99C6EA074D5D3683B8807E36E0F00DAC")

    static int TWENTYFOURBITGROUP = 24;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:05.593 -0400", hash_original_field = "D30F819F31CC54693730510117B4ABEA", hash_generated_field = "FC722E0636678D6F8FCAAED61CAB469F")

    static int FOURBYTE = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:05.593 -0400", hash_original_field = "B9AA2C8A95DA7A348B6D193C71C0B1DF", hash_generated_field = "D172B8AFE1061ADFF04C92720430372F")

    static int SIGN = -128;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:05.593 -0400", hash_original_field = "4C83C243BBFD8CB560E0AD46C22F53BF", hash_generated_field = "562BC1C9DF44ABC649C8D868148CEB68")

    static byte PAD = (byte) '=';
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:05.593 -0400", hash_original_field = "E1A2ACC54BD0A692D22B9AD890A99BAA", hash_generated_field = "E339A84FE51839DD01CB76A90F256930")

    private static byte[] base64Alphabet = new byte[BASELENGTH];
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:05.593 -0400", hash_original_field = "DB995B43D72DC5ACFB2DDFB6DA167785", hash_generated_field = "5F6F4EBEDC3FFA3D977AF8A987ABD629")

    private static byte[] lookUpBase64Alphabet = new byte[LOOKUPLENGTH];
    static {
        for (int i = 0; i < BASELENGTH; i++) {
            base64Alphabet[i] = (byte) -1;
        }
        for (int i = 'Z'; i >= 'A'; i--) {
            base64Alphabet[i] = (byte) (i - 'A');
        }
        for (int i = 'z'; i >= 'a'; i--) {
            base64Alphabet[i] = (byte) (i - 'a' + 26);
        }
        for (int i = '9'; i >= '0'; i--) {
            base64Alphabet[i] = (byte) (i - '0' + 52);
        }
        base64Alphabet['+'] = 62;
        base64Alphabet['/'] = 63;
        for (int i = 0; i <= 25; i++) {
            lookUpBase64Alphabet[i] = (byte) ('A' + i);
        }
        for (int i = 26, j = 0; i <= 51; i++, j++) {
            lookUpBase64Alphabet[i] = (byte) ('a' + j);
        }
        for (int i = 52, j = 0; i <= 61; i++, j++) {
            lookUpBase64Alphabet[i] = (byte) ('0' + j);
        }
        lookUpBase64Alphabet[62] = (byte) '+';
        lookUpBase64Alphabet[63] = (byte) '/';
    }
    
}

