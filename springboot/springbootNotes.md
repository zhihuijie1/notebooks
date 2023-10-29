# springboot项目的快速搭建



> 1：创建一个maven项目
>
> 2：在pom文件中引入依赖，（1：springboot的父依赖 2：web开发依赖）
>
> ```xml
>  	<!--引入springboot继承的父-->
>     <parent>
>         <groupId>org.springframework.boot</groupId>
>         <artifactId>spring-boot-starter-parent</artifactId>
>         <version>2.7.2</version>
>     </parent>
> 
>     <dependencies>
>         <!--引入web开发换环境-->
>         <dependency>
>             <groupId>org.springframework.boot</groupId>
>             <artifactId>spring-boot-starter-web</artifactId>
>         </dependency>
>     </dependencies>
> ```
>
> 3：创建controller层，然后编写请求
>
> 4：创建springboot的引导入口
>
> ```java
> @SpringBootApplication
> public class helloApplication {
>     public static void main(String[] args){
>         SpringApplication.run(helloApplication.class);
>     }
> }
> ```









