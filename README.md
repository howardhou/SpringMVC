

# SpringMVC

- hello项目 spring mvc + maven
    - 是通过 Maven 下面的 maven-archetype-webapp 原型创建的
    - 主要功能是：通过 ajax 异步调用后端接口

- SpringHello 项目
    - 是通过 Spring 下面的 Spring MVC 模板创建的， 没有用到 maven

- [使用intellij idea搭建MAVEN+SSM(Spring+SpringMVC+MyBatis)框架](https://www.cnblogs.com/jingpeipei/p/6291071.html)
	- 需要注意选择的 archetype（原型） 为： maven-archetype-webapp, 别选错了
	- 自动创建完 Spring MVC 项目后， 配置一下 Tomcat 9， 然后直接运行，就可以看到Hello World界面了
	- 查询 jar 包的 Maven 依赖： http://mvnrepository.com/

- 准备阶段
    - Copy SpringHello 项目 中的 web.xml, dispatcher-servlet.xml 文件到本项目中
    - 在 pom.xml 文件中添加依赖
        - org.springframework:spring-web
        - org.springframework:spring-webmvc
        - javax.servlet-api-4.0.1
        - com.fasterxml.jackson.core:jackson-databind
    - 在 main 目录下新增 java 和 resources 目录，在webapp目录下新增 statics和views目录
    - 打开 Idea 的 Project Structure， 选择 Modules菜单，标记 java目录为 Sources, 标记 resources目录为 Resources
    
- 按照书上例子，编写代码

- 前端 引用的 js 库
    - jQuery 
		- 使用： http://www.w3school.com.cn/jquery/ajax_ajax.asp
		- 例子： https://www.xiariboke.com/design/2663.html

	- [json2](https://github.com/douglascrockford/JSON-js/blob/master/json2.js) 
		- [json1 和 json2 有什么区别](https://stackoverflow.com/questions/552135/difference-between-json-js-and-json2-js)

- ISSUE：总是出现：415 Unsupported Media 错误，网上搜了很久，就是解决不了，后来用 Maven 创建了 hello 项目, 安照书上就解决了， 怀疑是 jackson 的包没有引用正确
    - [Type POST JSON fails with 415 Unsupported media type, Spring 3 mvc](https://stackoverflow.com/questions/11492325/post-json-fails-with-415-unsupported-media-type-spring-3-mvc)
    - [HTTP 415 错误 – 不支持的媒体类型(Unsupported media type)](https://blog.csdn.net/kingtracy8/article/details/78076024/)
    - [<mvc:annotation-driven />深度解析](https://www.tuicool.com/articles/UZrUfyf)
    
