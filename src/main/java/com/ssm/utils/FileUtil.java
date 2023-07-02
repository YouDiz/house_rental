package com.ssm.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileUtil {
	/**
	 * 将文件转换为字节数组
	 *
	 * @param file 文件对象
	 * @return 字节数组
	 * @throws IOException 如果文件不存在或读取文件时发生错误
	 */
	public static byte[] fileToByte(File file) throws IOException {
		if (!file.exists()) {
			throw new IOException("File does not exist: " + file.getAbsolutePath());
		}

		try (FileInputStream fis = new FileInputStream(file);
			 ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
			byte[] buffer = new byte[1024];
			int bytesRead;
			while ((bytesRead = fis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesRead);
			}
			return bos.toByteArray();
		}
	}
}
