package com.pluribus.rocketflow.rest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class NvosRestUtil {
	public static <T> String getRestFilterString(T filter) {
		try {
		    Field[] allFields = filter.getClass().getDeclaredFields();
		    @SuppressWarnings("unchecked")
			Constructor<T> defaultConstructor = (Constructor<T>) filter.getClass().getConstructor();
		    T reference = defaultConstructor.newInstance();

		    StringBuilder sb = new StringBuilder();
		    for (Field field : allFields) {
		    	field.setAccessible(true);
		    	Object o1 = field.get(filter);
		    	Object o2 = field.get(reference);
		    	if (o1 != null && !o1.equals(o2)) {
		    		sb.append("&" + convertToHyphen(field.getName()) + "=" + o1);
		    	}
		    }

		    return sb.toString();
		} catch (ReflectiveOperationException roex) {
			return "";
		}
	}

	public static String convertToHyphen(String camelCase) {
		String regex = "([a-z])([A-Z])";
        String replacement = "$1-$2";
        return camelCase.replaceAll(regex, replacement).toLowerCase();
	}
}
