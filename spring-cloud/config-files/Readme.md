# Spring Cloud Config 配置文件说明

```
/{application}/{profile}[/{label}]

/{application}-{profile}.yml

/{label}/{application}-{profile}.yml

/{application}-{profile}.properties

/{label}/{application}-{profile}.properties
```

上面的url会映射{application}-{profile}.properties对应的配置文件，
其中{label}对应Git上不同的分支，默认为master。