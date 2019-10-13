package com.chuan.commons;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * @author qq491
 */
public class PasswordUtil {
    private static RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
    private static String algorithmName = "md5";
    private static int hashIterations = 3;

    public static String encryptPassword(String password, String salt) {
        return new SimpleHash(algorithmName, password, ByteSource.Util.bytes(salt), hashIterations).toHex();
    }

    public static String generateSalt() {
        return randomNumberGenerator.nextBytes().toHex();
    }

}
