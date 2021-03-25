step1 中的 bean 是初始化好之后再 set 进去的，实际使用中，我们希望容器来管理 bean 的创建。
于是我们将 bean 的初始化放入 BeanFactory 中。为了保证扩展性，我们使用 Extract Interface 的方法，
将 BeanFactory 替换成接口，而使用 AbstractBeanFactory 和 AutowireCapableBeanFactory 作为其实现。
"AutowireCapable" 的意思是“可自动装配的”，为我们后面注入属性做准备。

```
// 1.初始化beanfactory
BeanFactory beanFactory = new AutowireCapableBeanFactory();

// 2.注入bean
BeanDefinition beanDefinition = new BeanDefinition();
beanDefinition.setBeanClassName("us.codecraft.tinyioc.HelloWorldService");
beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

// 3.获取bean
HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
helloWorldService.helloWorld();
```