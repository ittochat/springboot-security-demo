## 1 在Pom配置中引入配置
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
```

## 2 自定义用户认证逻辑
- 处理用户信息获取逻辑
> UserDetailsService
- 处理用户校验逻辑
> UserDetails
- 处理密码加密解密
> PasswordEncode

## 3 个性化用户认证流程
- 自定义登陆页面
- 自定义登陆成功处理
- 自定义登陆失败处理

## 4 生成图形验证码
- 根据随机数生成图片
- 将随机数存到Session中
- 在将生成的图片写到接口的响应中