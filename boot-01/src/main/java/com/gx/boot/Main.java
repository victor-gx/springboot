package com.gx.boot;


import ch.qos.logback.core.db.DBHelper;
import com.gx.boot.bean.Pet;
import com.gx.boot.bean.User;
import com.gx.boot.config.MyConfig;
import com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主程序
 * @SpringBootApplication：这是一个springboot应用
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        // 1.返回我们的IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(Main.class,args);

        //2. 查看容器里面的组件
//        String[] names = run.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }

        // 3. 从容器中获取组件
//        Pet tom01 = run.getBean("tom", Pet.class);
//        Pet tom02 = run.getBean("tom", Pet.class);
//        System.out.println("租件：" + (tom01 == tom02));
//
//        //4. com.gx.boot.config.MyConfig$$EnhancerBySpringCGLIB$$56fb4a47@3dcd0346
//        MyConfig bean = run.getBean(MyConfig.class);
//        System.out.println(bean);
//
//        User user = bean.user01();
//        User user1 = bean.user01();
//        System.out.println(user == user1);
//
//        User user01 = run.getBean("user01", User.class);
//        Pet tom = run.getBean("tom", Pet.class);
//
//        System.out.println("用户的宠物：" + (user01.getPet() == tom));
//
//        // 5. 获取组件
//        String[] beanNamesForType = run.getBeanNamesForType(User.class);
//        System.out.println("====================");
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }
//
//        DBHelper bean1 = run.getBean(DBHelper.class);
//        System.out.println(bean1);

        boolean tom = run.containsBean("tom");
        System.out.println("容器中tom组件：" + tom);

        boolean user01 = run.containsBean("user01");
        System.out.println("容器中user01组件：" + user01);

        boolean haha = run.containsBean("haha");
        boolean hehe = run.containsBean("hehe");
        System.out.println("haha:" + haha);
        System.out.println("hehe:" + hehe);
    }
}
