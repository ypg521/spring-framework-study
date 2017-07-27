### beans，DefaultListableBeanFactory
* 实现BeanFactory ，实现各种getBean(...)和判断bean类型的各种方法
* 实现BeanDefinitionRegistry（父接口AliasRegistry）表示一个可以注册bean信息、别名的容器
* Scope 实现此接口可以自定义bean的范围，通过DefaultListableBeanFactory.registerScope(String scopeName,Scope scope)注册，使用:@Scope(scopeName)
* BeanDefinition 解析xml保存bean信息的接口

####主要方法

* registerScope() 添加自定义的bean作用域,默认只有singleton和prototype。
* addBeanPostProcessor(BeanPostProcessor b) ， 添加bean创建、初始化时的加工器。可以控制bean实例化、set属性等操作
以下按照处理顺序排序: AbstractAutowireCapableBeanFactory。doCreateBean
        子接口InstantiationAwareBeanPostProcessor 实现此接口，可在实例化bean前后做一些自定义的处理，伪代码
               ```
               for(){
                   result= doBefore()
                   if(result!=null) return result;
               }
               return null;
               ```
               ```
               if(doForBefore()!=null)
                    for(){
                        result= doAfter()
                        if(result==null) return null;
                    }
                    return result;
                ```
        if for{doBefore()} return null; 则不会执行 for{doAfter()}。最终返回非空就停止beanFactory的执行,以下子接口也就没有执行的机会了。

        子接口MergedBeanDefinitionPostProcessor ，初始化以后，填充之前修改mbd的设置
         如果支持earlyBean 则缓存ObjecFactory （实际实现是操作   孙子SmartInstantiationAwareBeanPostProcessor getEarlyBeanReference解决循环依赖）
        子接口DestructionAwareBeanPostProcessor, 销毁时触发

BeanDefinitionRegistryPostProcessor  (super BeanFactoryPostProcessor)


AnnotationAwareOrderComparator @Order的比较器

### context，ClassPathXmlApplicationContext

annotation-config、component-scan都会addBeanDefine:

* ConfigurationClassPostProcessor
* AutowiredAnnotationBeanPostProcessor
* RequiredAnnotationBeanPostProcessor
* CommonAnnotationBeanPostProcessor
* PersistenceAnnotationBeanPostProcessor
* EventListenerMethodProcessor
* DefaultEventListenerFactory

而且component-scan会扫面Component、Service等注解，而annotation-config就可以不要了。

refresh()时讲以上类加入processor组

* Aware ,资源超级接口，spring帮助设置响应的资源，比如实现了子接口BeanFactoryAware的bean会设置好BeanFactory。ApplicationContextAware类似
* ApplicationEvent (定义) ， ApplicationEventPublisherAware(发布) ，ApplicationListener (监听)
* ApplicationListener&ApplicationEvent
实现BeanDefinitionRegistryPostProcessor的bean，在容器初始化时调用相应方法注册bean

### aop
使用配置 <aop:aspectj-autoproxy expose-proxy="true" proxy-target-class="true"></aop:aspectj-autoproxy>
			
加入加工器  AnnotationAwareAspectJAutoProxyCreator，根据 xml配置设置响应的属性，扫描切面接口和注解
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

start use  ReflectiveMethodInvocation
pointCut的顺序是
   AspectJAfterAdvice
   AspectJAroundAdvice
   AspectJMethodBeforeAdvice
   

### spring-tx

TxNamespaceHandler
AnnotationDrivenBeanDefinitionParser

添加InfrastructureAdvisorAutoProxyCreator 与aop的ProxyCreator作用类似，并且可能用替换它。但是他只扫描切面接口

advisor  PointcutAdvisor  BeanFactoryTransactionAttributeSourceAdvisor
advice TransactionInterceptor  

@Autowired Aware 通过processor实现

主要的方法:

* getBean(...)  各种获取bean,  接口BeanFactory定义
* registerAlias(...) 注册别名
* registerScope(String scopeName, Scope scope) 添加scope，可自定义,比如spring-web扩展的SessionScope
* addBeanPostProcessor(BeanPostProcessor beanPostProcessor) ，注册实例创建前后的processor  http://jinnianshilongnian.iteye.com/blog/1492424

## 备忘
* Advisor接口的用法
*  循环依赖实现  org/springframework/beans/factory/support/AbstractAutowireCapableBeanFactory.java:570  BeanDefinitionValueResolver.resolveReference 设置reference类型的值
* MergedBeanDefinitionPostProcessor 接口的处理逻辑
FactoryBean接口
 
      





