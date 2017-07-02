### beans，DefaultListableBeanFactory
* 实现BeanFactory ，实现各种getBean(...)和判断bean类型的各种方法
* 实现BeanDefinitionRegistry（父接口AliasRegistry）表示一个可以注册bean信息、别名的容器
* Scope 实现此接口可以自定义bean的范围，通过DefaultListableBeanFactory.registerScope(String scopeName,Scope scope)注册，使用:@Scope(scopeName)
* BeanDefinition 解析xml保存bean信息的接口

####主要方法

* registerScope() 添加自定义的bean作用域,默认只有singleton和prototype。
* addBeanPostProcessor(BeanPostProcessor b) ， 添加bean创建、初始化时的加工器。可以控制bean实例化、set属性等操作
        子接口InstantiationAwareBeanPostProcessor 实现此接口，可在实例化bean前后做一些自定义的处理，也可以自定义获取属性值
                SmartInstantiationAwareBeanPostProcessor getEarlyBeanReference解决循环依赖
        子接口MergedBeanDefinitionPostProcessor 
        子接口DestructionAwareBeanPostProcessor



AnnotationAwareOrderComparator @Order的比较器

### context，ClassPathXmlApplicationContext
* Aware ,资源超级接口，spring帮助设置响应的资源，比如实现了子接口BeanFactoryAware的bean会设置好BeanFactory。ApplicationContextAware类似
* EventListener
* ApplicationListener&ApplicationEvent


### aop
使用配置 <aop:aspectj-autoproxy expose-proxy="true" proxy-target-class="true"></aop:aspectj-autoproxy>

加入加工器  AnnotationAwareAspectJAutoProxyCreator，根据 xml配置设置响应的属性
* postProcessBeforeInstantiation 如果CustomTargetSource！=null 则创建proxy      ？？？？

* postProcessAfterInitialization 如果已经生成proxy，则返回bean，否则生成返回的proxy ？？？？

* 构造Advisor:查找实现Advisor接口或者有@Aspect注解 的bean
* 通过new ProxyFactory().getProxy（）创建proxy，ObjenesisCglibAopProxy

#### CglibAopProxy.getProxy()
如果expose-proxy="true"，则会使用特殊的CallBack实例，该实例会把当前的代理对象放入到AopContext里面(ThreadLocal绑定),以支持内部方法调用

```
        public class DemoService {
        
        	public void say() {
        		System.out.println("doSay");
        	}
        
        	public void sayWithInner() {
        		System.out.println("sayWithInner");
        		((DemoService) AopContext.currentProxy()).innerSay();
        //		innerSay();
        	}
        
        
        	public void innerSay() {
        		System.out.println("innerSay");
        	}
        }
```
#### CglibAopProxy$ProxyCallbackFilter    
    使用这个Filter ，返回index，来实现调用哪一个callBack。注释如下： Implementation of CallbackFilter.accept() to return the index of the callback we need.






* Advisor
* AspectJAdvisorFactory
* aop  AnnotationAwareAspectJAutoProxyCreator processor
* ObjenesisCglibAopProxy
* JdkDynamicAopProxy
* CglibAopProxy


### spring-tx

TxNamespaceHandler



@Autowired Aware 通过processor实现

主要的方法:

* getBean(...)  各种获取bean,  接口BeanFactory定义
* registerAlias(...) 注册别名
* registerScope(String scopeName, Scope scope) 添加scope，可自定义,比如spring-web扩展的SessionScope
* addBeanPostProcessor(BeanPostProcessor beanPostProcessor) ，注册实例创建前后的processor  http://jinnianshilongnian.iteye.com/blog/1492424

## 备忘
* Advisor接口的用法
       
      





