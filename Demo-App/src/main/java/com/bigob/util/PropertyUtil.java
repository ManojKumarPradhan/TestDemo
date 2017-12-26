package com.bigob.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertyUtil {

	@Autowired
	private Environment envo;
	
	public String getValueFromKey(String key) {
		System.out.println(key);
		return envo.getProperty(key);
	}
}
