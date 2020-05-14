import com.sun.pojo.Books;
import com.sun.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Mytest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookServiceImpl = context.getBean("BookServiceImpl", BookServiceImpl.class);
        for (Books books : bookServiceImpl.queryAllBook()) {
            System.out.println(books);
        }
    }
}
