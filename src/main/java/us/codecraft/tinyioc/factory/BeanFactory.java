package us.codecraft.tinyioc.factory;

import us.codecraft.tinyioc.BeanDefinition;

/**
 * bean 的容器
 *
 * @author Sky
 * @Date 2021-03-23 16:53.
 */
public interface BeanFactory {

    Object getBean(String beanName);

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws Exception;
}
