package test;

import com.lsz.spring.setinjection.User;
import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/12/12.
 */
public class TestUser extends TestCase {
    public void testUser_Success() throws Exception{
        //准备数据
        User action = new User();
        action.setUsername("admin");

        //调用被测试方法
        String result = action.login();

        //判断测试是否通过
        assertEquals("success",result);
    }
}
