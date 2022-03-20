package com.company;


public class Main {

    final static int[] CRC_TABLE = new int[256];

    public static void main(String[] args) {
        for (int i = 0; i < 256; ++i) {
            int code = i;
            for (int j = 0; j < 8; ++j) {
                code = (code & 0x01 ? 0xEDB88320 ^ (code >>> 1) : (code >>> 1));
            }
            CRC_TABLE[i] = code;
        }
        System.out.println(crc32("Example text"));
    }

    public static int crc32(char[] text)
    {
        int crc = -1;
        for (int i = 0; i < text.length; ++i ) {
            final int code = Character.codePointAt(text, i);
            crc = CRC_TABLE[(code ^ crc) & 0xFF] ^ (crc >>> 8);
        }
        return (-1 ^ crc) >>> 0;
    }
}
