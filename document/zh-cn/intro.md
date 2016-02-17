# 简介 #
## 概述 ##
Rexdb是一款使用Java语言编写的、开放源代码的持久层框架。具有使用简便、性能良好、支持复杂SQL的特性。

## 功能 ##

1. 数据库查询、更新、批量处理、函数和存储过程调用、事物和JTA事物等；
2. ORM映射，支持常见数组、Map、List、实体类与JDBC对象之间的映射；
3. 数据源管理，拥有一个内置的连接池，支持第三方数据源和JNDI；
4. 数据库方言，支持Oracle、DB2、Mysql等数据库，以及金仓、达梦等国产数据库。
5. SQL执行和事物的监控；
6. 统一的异常管理，和错误信息的国际化支持；
7. SQL校验、事物超时设置等常用功能。


## 优势 ##

1. 编码量少，通常只需要一行代码即可完成数据库操作，不需要额外的映射配置；
1. 使用简单，开发人员不需要学习繁杂调用方法和使用规范。请参见[Rexdb快速上手指南](http://#)；
4. 性能良好，具体的性能测试结果请查看[Rexdb性能测试报告](http://#)；
5. 兼容性好，没有必须依赖的第三方包，并且会根据运行环境自动调节某些功能，通常不会因框架的混合使用而出现问题。但可为Rexdb选配一些第三方包，以实现更多功能，请参见[Rexdb可选的第三方包](http://#)。

## 网站 ##

Rexdb的网站地址是：[http://db.rex-soft.org](http://db.rex-soft.org)。

## 帮助和支持 ##

Rexdb是免费的开源软件，除源代码、文档、示例外，不提供技术支持。但开发团队致力于积极改进框架的使用体验，欢迎使用者[提出需求和BUG反馈](http://#)。

## 协议 ##

Rexdb基于Apache 2.0协议，可以免费用于个人或商业用途。

协议详情请见：[Apache Lisence, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)