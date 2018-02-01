package com.renault.faq.util;

import java.security.MessageDigest;

public  class PwdUtil {
	
	//定义一个加密字符串
	private static final String ENCODE = "ccidit";
	
	/**
	 * 加密密码
	 * @param pswd
	 * @return
	 */
	public static String md5Pswd(String pswd){
		pswd = String.format("%s#%s", ENCODE,pswd);
		pswd = getMD5(pswd);
		return pswd;
	}
	
	/**
	 * MD5 加密
	 * @param str
	 * @return
	 * @throws Exception
	 */
	 public static String  getMD5(String str) {  
	        MessageDigest messageDigest = null;  
	            try {
					messageDigest = MessageDigest.getInstance("MD5");
					messageDigest.reset();
					messageDigest.update(str.getBytes("UTF-8"));
				} catch (Exception e) {
					System.out.println("MD5转换异常！message");
				}  
				
	        byte[] byteArray = messageDigest.digest();  
	        StringBuffer md5StrBuff = new StringBuffer();  
	        for (int i = 0; i < byteArray.length; i++) {              
	            if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)  
	                md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));  
	            else  
	                md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));  
	        }  
	        return md5StrBuff.toString();  
	    }
	 public static void main(String[] args) {
		System.out.println(md5Pswd("123456"));
	}
}
