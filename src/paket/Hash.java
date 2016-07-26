package paket;

import java.security.*;
import java.math.*;

public class Hash
{
    public String md5(String s) throws Exception
    {
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(s.getBytes(), 0, s.length());

        return new BigInteger(1,m.digest()).toString(16);
    }

    public String sha1(String s) throws Exception
    {
        MessageDigest m = MessageDigest.getInstance("SHA1");
        m.update(s.getBytes(), 0, s.length());

        return new BigInteger(1,m.digest()).toString(16);
    }
}