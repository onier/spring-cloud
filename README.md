**说明**
     

 1. Eureka-Server 为spring eureka服务端。

     @EnableEurekaServer
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
} 

 2.  Eureka-Service修改服务端口运行多个服务
 3. Eureka-Client 在客户端执行负载均衡。
