package us.codecraft.tinyioc;

/**
 * IoC最基本的角色有两个：容器(BeanFactory)和 Bean 本身。这里使用B eanDefinition 来封装了 bean 对象，这样可以保存一些额外的元信息。
 *
 * @author Sky
 * @Date 2021-03-23 16:54.
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
