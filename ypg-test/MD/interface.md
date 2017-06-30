####BeanFactory 以DefaultListableBeanFactory为例
实现的主要接口:
* BeanFactory 工厂接口
* BeanDefinitionRegistry,父接口AliasRegistry。表示一个注册bean信息、别名的容器

主要的方法:

* getBean(...)  各种获取bean,  接口BeanFactory定义
* registerAlias(...) 注册别名
* registerScope(String scopeName, Scope scope) 添加scope，可自定义,比如spring-web扩展的SessionScope
* addBeanPostProcessor(BeanPostProcessor beanPostProcessor) ，注册实例创建前后的processor
       BeanPostProcessor BeanFactory创建实例前后的处理
       子接口InstantiationAwareBeanPostProcessor 
             postProcessBeforeInstantiation() ,如果返回非空，则使用返回值做bean实例
       子接口MergedBeanDefinitionPostProcessor 
       
       http://uule.iteye.com/blog/2094549





