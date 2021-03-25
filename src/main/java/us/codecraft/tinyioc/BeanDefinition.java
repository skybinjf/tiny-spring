package us.codecraft.tinyioc;

/**
 * IoC 最基本的角色有两个：容器(BeanFactory)和 Bean 本身。这里使用B eanDefinition 来封装了 bean 对象，这样可以保存一些额外的元信息。
 * step1 中的 bean 是初始化好之后再 set 进去的，实际使用中，我们希望容器来管理 bean 的创建。于是我们将 bean 的初始化放入 BeanFactory 中。
 * @author Sky
 * @Date 2021-03-23 16:54.
 */
public class BeanDefinition {
    private Object bean;
    private Class beanClass;
    private String beanClassName;

    public BeanDefinition() { }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public String getBeanClassName() {
        return beanClassName;
    }

    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
        try {
            this.beanClass = Class.forName(beanClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
