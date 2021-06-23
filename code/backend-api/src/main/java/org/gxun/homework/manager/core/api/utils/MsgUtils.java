package org.gxun.homework.manager.core.api.utils;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class MsgUtils {

    public static void writeMessage(ServletResponse response, int code, String msg){
        Map<String,Object> map = new HashMap<>(16);
        map.put("msg", msg);
        map.put("code", code);

        String res = JSON.toJSONString(map);
        PrintWriter writer;

        try {
            writer = response.getWriter();
            writer.write(res);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
