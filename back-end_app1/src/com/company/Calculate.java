package com.company;

public class Calculate {
    public static void main(String[] args) {

        int[] myArray = new int[256];
        final var CRC_TABLE =  myArray;

        for (int i = 0; i < 256; ++i)
        {
            int code = i;
            for (int j = 0; j < 8; ++j)
            {
                //code = (code & 0x01 ? 0xEDB88320 ^ (code >>> 1) : (code >>> 1) );
            }
            CRC_TABLE[i] = code;
        }

        //int crc32 =
    }



        //
}
