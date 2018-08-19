# 食用手册
1. 运行eureka-server模块的EurekaServerApplication
2. 运行java-api模块的JavaApiApplication
3. 命令行进入php-api目录，执行`php artisan serve`运行php
4. 运行sidecar模块的SidecarApplication
5. 访问http://localhost:8080/php/api/test，成功通过feign访问php接口

# 简单介绍下调用流程
> 请求java-api的/php/api/test接口