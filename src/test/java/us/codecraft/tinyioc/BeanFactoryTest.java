package us.codecraft.tinyioc;

import org.junit.Test;

/**
 * BeanFactory 测试类
 *
 * @author Sky
 * @Date 2021-03-23 17:09.
 */
public class BeanFactoryTest {

    @Test
    public void test() {
        // 1，初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();
        // 2，注入 bean
        BeanDefinition beanDefinition = new BeanDefinition(new HelloWorldService());
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);
        // 3，获取 bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.hello();
    }
}
