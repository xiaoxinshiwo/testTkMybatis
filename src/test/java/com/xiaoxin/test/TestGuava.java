package com.xiaoxin.test;

import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.xiaoxin.domain.UserT;
import org.junit.Test;
import org.springframework.util.StringUtils;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author zhangyongxin
 * @date 2017/11/15 下午4:12
 */
public class TestGuava {

    @Test
    public void testOptional(){
        Optional<Integer> optionVal = Optional.of(5);
        if(optionVal.isPresent()){
            System.out.print(optionVal.get());
        }
    }

    @Test
    public void testPreConditions(){
        String param ="";
        int a = 0;
        try{
            Preconditions.checkArgument(param==null || param.length()==0,"param %s is Empty");
            Preconditions.checkArgument(a==0,"param %s can not be Zero");

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testJoiner(){
        String[] str = {"a","b","c"};
        Joiner joiner = Joiner.on("@");
        String result = joiner.join(Arrays.asList(str));
        System.out.println(result);
    }

    @Test
    public void testSplitter(){
        Iterable<String> result = Splitter.on(',')
                .trimResults()
                .omitEmptyStrings()
                .split("foo,bar,,   qux,");

    }

    @Test
    public void testCollection(){
        Map<String,Map<String,UserT>> map = Maps.newHashMap();
        ImmutableMap<String,Integer> immutableMap = ImmutableMap.of("a",1,"2",2);

    }

    @Test
    public void testRedis(){
        // 连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        jedis.set("test-1","22222");
        System.out.println("连接成功");
        // 查看服务是否运行
        System.out.println("服务正在运行: " + jedis.ping());
    }
}
