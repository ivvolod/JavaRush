package com.javarush.task.task32.task3211;

import javax.xml.bind.DatatypeConverter;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.util.Arrays;

/* 
Целостность информации
*/

public class Solution {


    public static final String ALGO = "MD5";
    private static MessageDigest messageDigest;
    private static byte[] mD5ParserStringToByte;
    private static byte[] messageDigestResult;



    public static void main(String... args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(new String("test string"));
        oos.flush();
        System.out.println(compareMD5(bos, "5a47d12a2e3f9fecf2d9ba1fd98152eb")); //true

    }

    public static boolean compareMD5(ByteArrayOutputStream byteArrayOutputStream, String md5) throws Exception {
       messageDigest = MessageDigest.getInstance(ALGO);
        messageDigestResult = messageDigest.digest(byteArrayOutputStream.toByteArray());
        mD5ParserStringToByte = DatatypeConverter.parseHexBinary(md5);

        return Arrays.equals(mD5ParserStringToByte, messageDigestResult);
    }
}
