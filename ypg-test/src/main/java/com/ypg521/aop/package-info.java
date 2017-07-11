/**
 * Created by Administrator on 2017/6/26
 * <p>
 * D:\java8_64\bin\java -agentlib:jdwp=transport=dt_socket,address=127.0.0.1:63443,suspend=y,server=n -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:C:\Users\Administrator\.IntelliJIdea2017.1\system\groovyHotSwap\gragent.jar -Dfile.encoding=UTF-8 -classpath "D:\JetBrains\IntelliJ IDEA 2017.1.1\lib\idea_rt.jar;D:\JetBrains\IntelliJ IDEA 2017.1.1\plugins\junit\lib\junit-rt.jar;D:\java8_64\jre\lib\charsets.jar;D:\java8_64\jre\lib\deploy.jar;D:\java8_64\jre\lib\ext\access-bridge-64.jar;D:\java8_64\jre\lib\ext\cldrdata.jar;D:\java8_64\jre\lib\ext\dnsns.jar;D:\java8_64\jre\lib\ext\jaccess.jar;D:\java8_64\jre\lib\ext\jfxrt.jar;D:\java8_64\jre\lib\ext\localedata.jar;D:\java8_64\jre\lib\ext\nashorn.jar;D:\java8_64\jre\lib\ext\sunec.jar;D:\java8_64\jre\lib\ext\sunjce_provider.jar;D:\java8_64\jre\lib\ext\sunmscapi.jar;D:\java8_64\jre\lib\ext\sunpkcs11.jar;D:\java8_64\jre\lib\ext\zipfs.jar;D:\java8_64\jre\lib\javaws.jar;D:\java8_64\jre\lib\jce.jar;D:\java8_64\jre\lib\jfr.jar;D:\java8_64\jre\lib\jfxswt.jar;D:\java8_64\jre\lib\jsse.jar;D:\java8_64\jre\lib\management-agent.jar;D:\java8_64\jre\lib\plugin.jar;D:\java8_64\jre\lib\resources.jar;D:\java8_64\jre\lib\rt.jar;D:\ideaProjects\spring-framework\ypg-test\build\classes\main;D:\ideaProjects\spring-framework\ypg-test\build\resources\main;D:\ideaProjects\spring-framework\spring-core\build\libs\spring-objenesis-repack-2.5.1.jar;D:\ideaProjects\spring-framework\spring-core\build\libs\spring-cglib-repack-3.2.5.jar;D:\ideaProjects\spring-framework\spring-beans-groovy\build\classes\main;D:\ideaProjects\spring-framework\spring-core\build\classes\main;D:\ideaProjects\spring-framework\spring-beans\build\classes\main;D:\ideaProjects\spring-framework\spring-beans\build\resources\main;D:\ideaProjects\spring-framework\spring-context\build\classes\main;D:\ideaProjects\spring-framework\spring-context\build\resources\main;D:\ideaProjects\spring-framework\spring-aop\build\classes\main;D:\ideaProjects\spring-framework\spring-aop\build\resources\main;D:\ideaProjects\spring-framework\spring-tx\build\classes\main;D:\ideaProjects\spring-framework\spring-tx\build\resources\main;D:\ideaProjects\spring-framework\spring-jdbc\build\classes\main;D:\ideaProjects\spring-framework\spring-jdbc\build\resources\main;D:\ideaProjects\spring-framework\spring-expression\build\classes\main;D:\ideaProjects\spring-framework\spring-expression\build\resources\main;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\junit\junit\4.12\2973d150c0dc1fefe998f834810d68f278ea58ec\junit-4.12.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.aspectj\aspectjrt\1.9.0.BETA-5\c156e3f0b2bac06a61c67e625ae09629698513dc\aspectjrt-1.9.0.BETA-5.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.aspectj\aspectjweaver\1.9.0.BETA-5\21243ba57c3f8e585e618767dca1aa6958eb7f6d\aspectjweaver-1.9.0.BETA-5.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\log4j\log4j\1.2.17\5af35056b4d257e4b64b9e8069c0746e8b08629f\log4j-1.2.17.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\com.alibaba\druid\1.1.0\673abfd98753db1179a2d02650f24ff94c426ef2\druid-1.1.0.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.mybatis\mybatis\3.4.4\31f6ee836efc0a69e07d44f71deb0b0b4fd0f0c4\mybatis-3.4.4.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.mybatis\mybatis-spring\1.3.1\5197169e15a43066f177a1cd12a098e1283fdc76\mybatis-spring-1.3.1.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.apache.commons\commons-lang3\3.6\9d28a6b23650e8a7e9063c04588ace6cf7012c17\commons-lang3-3.6.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\mysql\mysql-connector-java\6.0.6\1d19b184dbc596008cc71c83596f051c3ec4097f\mysql-connector-java-6.0.6.jar;D:\ideaProjects\spring-framework\spring-jcl\build\classes\main;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.hamcrest\hamcrest-core\1.3\42a25dc3219429f0e5d060061f71acb49bf010a0\hamcrest-core-1.3.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\com.google.code.findbugs\jsr305\3.0.2\25ea2e8b0c338a877313bd4672d3fe056ea78f0d\jsr305-3.0.2.jar" com.intellij.rt.execution.junit.JUnitStarter -ideVersion5 com.ypg521.aop.TestAop,testSay
 * Connected to the target VM, address: '127.0.0.1:63443', transport: 'socket'
 * 七月 11, 2017 2:07:55 下午 org.springframework.context.support.AbstractApplicationContext prepareRefresh
 * 信息: Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@5bcea91b: startup date [Tue Jul 11 14:07:55 CST 2017]; root of context hierarchy
 * 七月 11, 2017 2:07:56 下午 org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
 * 信息: Loading XML bean definitions from class path resource [aop.xml]
 * say---0
 * sayWithInner---0
 * innerSay---0
 * equals---5
 * toString---0
 * hashCode---6
 * clone---0
 * indexOf---4
 * indexOf---4
 * isFrozen---4
 * toProxyConfigString---4
 * getProxiedInterfaces---4
 * isInterfaceProxied---4
 * removeAdvisor---4
 * removeAdvisor---4
 * replaceAdvisor---4
 * removeAdvice---4
 * isPreFiltered---4
 * addAdvice---4
 * addAdvice---4
 * setPreFiltered---4
 * addAdvisor---4
 * addAdvisor---4
 * getTargetSource---4
 * setExposeProxy---4
 * isExposeProxy---4
 * isProxyTargetClass---4
 * setTargetSource---4
 * getAdvisors---4
 * getTargetClass---4
 * [org.springframework.aop.interceptor.ExposeInvocationInterceptor@2d6c53fc, org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor@25f4878b]
 * doBefore
 * doSay
 * Disconnected from the target VM, address: '127.0.0.1:63443', transport: 'socket'
 * <p>
 * Process finished with exit code 0
 */
package com.ypg521.aop;