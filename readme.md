# MyBlob博客系统开发

## 技术栈

- SpringBoot
- MyBatis
- Thymleaf

## 前期准备工作

1. 数据库搭建

2. Entity实体类搭建
3. dao和Mapper的搭建
4. service的搭建
5. controller层搭建
   1. 更换login主题，搭建一个好看的登陆界面







## 问题

数据库的配置文件写在哪了？？ 是不是在spring中的配置文件中写了，就不需要写了那么mapper怎么找

3. Mapper.xml中的sql写法可以再次封装，将一些公共部分抽取出来
4. MyBatis中的动态传参数的两种方式 #{}和${}的区别
5. MyBatis开启驼峰命名格式
6. mybatis的SQL语句映射文件中的数据库属性与实体类属性命名必须是驼峰式或一致
7. 一个dao操作一个数据表，一个service可以操作多个dao
8. mybatis有两种开发方式，一种是dao开发，一种是mapper开发方式，后者用得较多
9. dao层找不到，需要在springboot启动类中添加@MapperScan()
10. SpringBoot的启动流程
11. dao层需不需要加@Mapper和@Repository
12. @Autowired和@Resource的区别
13. springboot修改部分内容，不需要重新启动怎么设置
14. 访问一个网页过程中发生了什么
15. 登陆的背后原理：常见的登陆方式（Cookie+Session；Token登陆；SSO单点登陆；OAuth第三方登陆）
16. thymeleaf+vue+bootstrap之间的关系
17. getMapping和postMapping的区别（get和post的区别）
18. session存储数据
19. redirect重定向
20. 图片验证码

## 项目难点

1. MD5算法的实现

2. 版本不兼容问题

## 后期升级

- 前端采用Vue，前后端分离