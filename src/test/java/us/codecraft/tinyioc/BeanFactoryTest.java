package us.codecraft.tinyioc;

import org.junit.Test;
import us.codecraft.tinyioc.factory.AutowireCapableBeanFactory;
import us.codecraft.tinyioc.factory.BeanFactory;

/**
 * BeanFactory 测试类
 *
 * @author Sky
 * @Date 2021-03-23 17:09.
 */
public class BeanFactoryTest {

    @Test
    public void test() throws Exception {
        // 1，初始化 BeanFactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();
        // 2，bean 定义
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("us.codecraft.tinyioc.HelloWorldService");
        // 3，设置属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("text", "Hello World!"));
        beanDefinition.setPropertyValues(propertyValues);
        // 4，生成 bean
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);
        // 5，获取 bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}
