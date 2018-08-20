# 食用手册
1. 运行eureka-server模块的EurekaServerApplication
2. 运行java-api模块的JavaApiApplication
3. 命令行进入php-api目录，执行`composer install`安装依赖，后执行`php artisan serve --host 0.0.0.0`运行服务
4. 运行sidecar模块的SidecarApplication
5. 访问[http://127.0.0.1:8080/api/call_php](http://127.0.0.1:8080/api/call_php)，JAVA服务成功通过feign访问php接口
6. 访问[http://127.0.0.1:8000/api/call_java](http://127.0.0.1:8000/api/call_java)，PHP服务成功通过sidecar访问java的接口
7. 运行zuul-gateway模块的ZuulGatewayApplication，直接访问网关默认策略http://127.0.0.1:8888/{应用名}/{接口地址}，请求到到任一应用接口。例如[http://127.0.0.1:8000/php-api/api/test](http://127.0.0.1:8000/php-api/api/test)

# 服务清单

| 应用名称 | 端口 | 语言 |
|----| ---- | ---- |
| eureka | 8761 | java |
| java-api | 8080 | java |
| php-api | 8000 | php |
| sidecar | 7999 | java |
| zuul-gateway | 8888 | java |

# 简单介绍下调用流程
> TODO