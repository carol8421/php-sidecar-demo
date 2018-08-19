# 食用手册
1. 运行eureka-server模块的EurekaServerApplication
2. 运行java-api模块的JavaApiApplication
3. 命令行进入php-api目录，执行`composer install`安装依赖，后执行`php artisan serve --host 0.0.0.0`运行服务
4. 运行sidecar模块的SidecarApplication
5. 访问[http://localhost:8080/api/call_php](http://localhost:8080/api/call_php)，JAVA服务成功通过feign访问php接口
6. 访问[http://127.0.0.1:8000/api/call_java](http://127.0.0.1:8000/api/call_java)，PHP服务成功通过sidecar访问java的接口

# 服务清单

| 应用名称 | 端口 |
|----| ---- |
| eureka | 8761 |
| java-api | 8080 |
| php-api | 8000 |
| sidecar | 7999 |

# 简单介绍下调用流程
> TODO