package xyz.kidjaya.utils;

import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AssertResult {
    /**
     * @param result 结果集
     * @param assertMap 期望结果集
     * @throws Exception 返回异常
     */
    public static void match(ResultActions result, HashMap<String,Object> assertMap) throws Exception {
        result.andExpect(MockMvcResultMatchers.status().isOk());
        Set<Map.Entry<String, Object>> entries = assertMap.entrySet();
        for (Map.Entry<String, Object> entry : entries){
            result.andExpect(MockMvcResultMatchers.jsonPath(entry.getKey()).value(entry.getValue()));
        }
        result.andDo(MockMvcResultHandlers.print());
    }
}
