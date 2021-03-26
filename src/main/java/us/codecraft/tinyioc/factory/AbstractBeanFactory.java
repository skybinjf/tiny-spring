package us.codecraft.tinyioc.factory;

import us.codecraft.tinyioc.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * step1中的bean是初始化好之后再set进去的，实际使用中，我们希望容器来管理bean的创建。于是我们将bean的初始化放入BeanFactory中。
 * 为了保证扩展性，我们使用Extract Interface的方法，将BeanFactory替换成接口，而使用AbstractBeanFactory和AutowireCapableBeanFactory作为其实现。
 * "AutowireCapable"的意思是“可自动装配的”，为我们后面注入属性做准备。
 *
 * @author Sky
 * @Date 2021-03-25 13:58.
 */
public abstract class AbstractBeanFactory implements BeanFactory {
    // ConcurrentHashMap 是线程安全的和在并发环境下不需要加额外的同步
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>(16);

    public Object getBean(String beanName) {
        return beanDefinitionMap.get(beanName).getBean();
    }

    /**
     * 通过全类名注册 bean
     * @param beanName
     * @param beanDefinition
     */
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws Exception {
        Object bean = doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    /**
     * 初始化 bean
     * @param beanDefinition
     * @return
     */
    protected abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;
}
