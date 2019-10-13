package com.chuan.commons;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

public class isEmpty {

    public static Boolean isObjectNotEmpty(Object obj) {
        String str = ObjectUtils.identityToString(obj);
        return StringUtils.isNotBlank(str);
    }

}
