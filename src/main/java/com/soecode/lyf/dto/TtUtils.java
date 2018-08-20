package com.soecode.lyf.dto;

import java.util.List;
import java.util.Random;

public class TtUtils {
	
	/**
	 * 随机6位数
	 * @return
	 */
	public static String RandomNum(){
		 Random random = new Random();
		    String result="";
		    for (int i=0;i<6;i++)
		    {
		    	result+=random.nextInt(10);
		    }
			return result;
	}
	/**
	 * 循环比较数据库的随机id
	 * @param randString
	 * @param allRandUserId
	 * @return
	 */
	public static String getRandUserId(String randString,List<String> allRandUserId){
		for(int i = 0;i<allRandUserId.size();i++){
			if(randString.equals(allRandUserId.get(i))){
				randString = RandomNum();
				randString = getRandUserId(randString, allRandUserId);
			}
		}
		return randString;
	}


}
