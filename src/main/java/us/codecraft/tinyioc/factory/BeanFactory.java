package us.codecraft.tinyioc.factory;

import us.codecraft.tinyioc.BeanDefinition;

/**
 * IoC最基本的角色有两个：容器(BeanFactory)和 Bean 本身。这里使用B eanDefinition 来封装了 bean 对象，这样可以保存一些额外的元信息。
 * 将 bean 的初始化放入 BeanFactory 中
 *
 * @author Sky
 * @Date 2021-03-23 16:53.
 */
public interface BeanFactory {

    Object getBean(String beanName);

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
