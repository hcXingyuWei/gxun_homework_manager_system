package org.gxun.homework.manager.core.api.utils;

import org.gxun.homework.manager.core.utils.file.MD5Util;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

@Log4j2
public class SignUtils {

    private static final Map<String, String> SECRETS = new HashMap<String, String>() {{
        //通用接口签名
        put("fomille-1000", "o0tUGNebDK1ApPFn9Hn75TRGCy1yugRH");
    }};


    public static boolean checkSign(String app, String version, String sign, String timestamp) {

        //获得秘钥
        String secret = SECRETS.get(app + "-" + version);
        //没有秘钥、非法访问
        if (StringUtils.isBlank(secret)) {
            return false;
        }

        StringBuffer sb = new StringBuffer(app)
                .append("&").append(version)
                .append("&").append(secret)
                .append("&").append(timestamp);

        log.info("++++++++++sign str is:"+sb.toString());
        String mySign = MD5Util.MD5(sb.toString());
        log.info("++++++++++true sign is:"+mySign);
        return mySign.equals(sign);
    }

}
