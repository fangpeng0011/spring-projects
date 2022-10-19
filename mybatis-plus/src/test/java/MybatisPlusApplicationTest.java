import com.ffp.mybatisplus.mapper.User;
import com.ffp.mybatisplus.mapper.UserMapper;
import com.ffp.mybatisplus.stater.SpringMybatisPlusApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;
import java.util.List;

/**
 * Description:
 *
 * @author ffp
 * @date 2022/10/18 9:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringMybatisPlusApplication.class)
public class MybatisPlusApplicationTest {


    @Autowired(required = false)
    private UserMapper userMapper;

    @Test
    public void testSelectList() {
        System.out.println(("----- selectAll method test ------"));
        //UserMapper 中的 selectList() 方法的参数为 MP 内置的条件封装器 Wrapper
        //所以不填写就是无任何条件
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void testInsertUser(){
        User user = new User();
        user.setAge(25);
        user.setName("ZhangSan");
        user.setEmail("zhangSan@163.com");
        int insert = userMapper.insert(user);
        System.out.println(insert);
        System.out.println(user);

    }

}
