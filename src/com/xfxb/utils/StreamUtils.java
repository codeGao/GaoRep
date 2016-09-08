package com.xfxb.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtils {

	public static String streamToString(InputStream in) {
		String result = "";
		try {
			// 创建一个字节数组写入流
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int length = 0;
			while ((length = in.read(buffer)) != -1) {
				out.write(buffer, 0, length);
				out.flush();
			}
			result = new String(out.toByteArray(), "gbk");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
