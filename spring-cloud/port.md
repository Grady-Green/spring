# spring-cloud 端口


## 配置端口
|名称|功能|port|
|:---:|:---:|:---:|
|eureka | 注册中心 | 8101 |
|config|配置中心:config-server|8102|
|config-client|配置中心:config-client|8103|


## 服务端口
|名称|功能|port|
|:---:|:---:|:---:|
| eureka-client | eureka服务提供者 | 8201 |


## 消费者端口
|名称|功能|port|
|:---:|:---:|:---:|
| eureka-consummer | eureka服务消费者 | 8301 |
| ribbon | ribbon服务消费者 | 8302 |
| feign|feign服务消费者|8303|


## 监控端口
|名称|功能|port|
|:---:|:---:|:---:|
|hystrix-dashboard|流量监控|8401|

## 网关端口
|名称|功能|port|
|:---:|:---:|:---:|
|zuul|网关|8501|