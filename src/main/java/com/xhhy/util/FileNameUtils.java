package com.xhhy.util;

import java.util.UUID;

public class FileNameUtils {
	public static String randomFileName(String extension){
		UUID uuid = UUID.randomUUID();
		String uuidStr = uuid.toString().replace("-", "");
		String fileName = uuidStr + "." + extension;
		return fileName;
	}

}
