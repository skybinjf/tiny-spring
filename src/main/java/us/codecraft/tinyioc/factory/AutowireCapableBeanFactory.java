package us.codecraft.tinyioc.factory;

import us.codecraft.tinyioc.BeanDefinition;

/**
 * step1中的bean是初始化好之后再set进去的，实际使用中，我们希望容器来管理bean的创建。于是我们将bean的初始化放入BeanFactory中。
 * 为了保证扩展性，我们使用Extract Interface的方法，将BeanFactory替换成接口，而使用AbstractBeanFactory和AutowireCapableBeanFactory作为其实现。
 * "AutowireCapable"的意思是“可自动装配的”，为我们后面注入属性做准备。
 *
 * @author Sky
 * @Date 2021-03-25 14:05.
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {
        try {
            Object bean = beanDefinition.getBeanClass().newInstance();
            return bean;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
