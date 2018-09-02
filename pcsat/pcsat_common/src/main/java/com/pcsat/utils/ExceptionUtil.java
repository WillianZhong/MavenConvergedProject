package com.pcsat.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @description: 服务异常处理工具类
 * @author: WillianZhong
 * @date: 2018-09-02
 */
public class ExceptionUtil {

	/**
	 * 获取异常的堆栈信息
	 * 
	 * @param t
	 * @return
	 */
	public static String getStackTrace(Throwable t) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);

		try {
			t.printStackTrace(pw);
			return sw.toString();
		} finally {
			pw.close();
		}
	}
}
