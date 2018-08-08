package com.ssm.util;

import java.util.List;

public class Test {
	 public static void main(String[] args) {
			List<String> open_urls = ResourcesUtil.getKeyList("commonURL");
			for (String open_url : open_urls) {
				 System.out.println(open_url);
			}
	}
}
