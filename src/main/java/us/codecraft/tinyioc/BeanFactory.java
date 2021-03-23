package us.codecraft.tinyioc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * IoC最基本的角色有两个：容器(BeanFactory)和 Bean 本身。这里使用B eanDefinition 来封装了 bean 对象，这样可以保存一些额外的元信息。
 *
 * @author Sky
 * @Date 2021-03-23 16:53.
 */
public class BeanFactory {

    // ConcurrentHashMap 是线程安全的和在并发环境下不需要加额外的同步
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>(16);

    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    public Object getBean(String beanName) {
        return beanDefinitionMap.get(beanName).getBean();
    }

}
