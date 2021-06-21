### Tiny car parking system API's realization

---

## 概述

> Use Framework
- SpringBoot 
- Mybatis_plus  
- Junit

> Develop Environment
 - JDK : 1.8.0_40
 - MySQL : 5.7

> Design Description

停车场管理系统主要包括几个实体对象：

- 车辆 、用户 、岗亭 、管理员 、停车位 、订单

- 主要通过画出主要的[E-R图](https://www.processon.com/view/link/60b84f095653bb4826dacf33
  )，构建实体属性
  
##  功能需求

### 用户模块

- 查询用户
- 新增用户
- 删除用户
- 修改用户  
- 绑定公众号
- 绑定车辆

### 管理员模块

- 管理员信息
- 查询管理员
- 新增管理员
- 删除管理员

### 订单模块

- 新增订单
- 查询订单
- 修改订单
- 打印订单  
- 用户支付订单

### 停车位模块

- 查询停车位信息
- 修改停车位信息
- 增加停车位
- 删除停车位  

### 车辆模块

- 添加车信息
- 修改车信息
- 删除车信息

### 岗亭模块

- 查询岗亭列表
- 修改岗亭信息
- 新增岗亭
- 删除岗亭

### 功能说明
- 停⻋场有多个楼层，顾客可以在此停放汽⻋。
- 停⻋场具有多个⼊⼝和出⼝。
- 顾客从⼊⼝取票。
- 顾客可以在出⼝岗亭通过现⾦⽅式缴费给管理员，缴费后管理员打印停⻋⼩票给顾客并放⾏。
- 客户也可以在商场公众号上进⾏在线⽀付停⻋费，如果客户已在商场公众号⽀付了停⻋费， 15分钟内离
  场则不必在出⼝岗亭再次⽀付，可以直接放⾏离场。超出15分钟未离场则重新计费。
- 该系统所允许停放的⻋辆数不得超过停⻋场的最⼤容量。
- 停⻋场有⼀些指定⽤于电动汽⻋的停⻋位,电动停⻋位燃油⻋不允许停。
- 该系统按⼩时收费， 24⼩时内10元封顶，超出24⼩时重新计费。 计费规则为第⼀个⼩时内⽀付5元，第
  ⼆个⼩时和第三个⼩时⽀付3元，其余所有时间⽀付2元


## 开发设计

### 技术与规范

- Restful规范
- MVC架构：Controller、Service、Dao
- 持久化框架：Mybatis Plus
- 数据库：MySQL

### 数据库设计
车位表、客户表、车辆表、管理员表、岗亭表、订单表、中间表

### 模块与类定义
| 模块       | 表现层             | 逻辑层          | 持久层      |
| ---------- | ------------------ | --------------- | ----------- |
| 用户模块   | UserController     | UserService     | UserDao     |
| 订单模块   | OrderController    | OrderService    | OrderDao    |
| 停车位模块 | ParkingController  | ParkingService  | ParkingDao  |
| 车辆模块   | VehicleController  | VehicleService  | VehicleDao  |
| 岗亭模块   | WatchBoxController | WatchBoxService | WatchBoxDao |

### 实体类定义

车位：Parking

| 字段名 | 类型    | 注释                              |
| ------ | ------- | --------------------------------- |
| id     | char    | 车位ID                            |
| type   | tinyint | 车类型  0：普通车位   1：充电车位 |
| status | tinyint | 占位情况 0：空   1：已有车        |
| floor  | tinyint | 车位所在楼层                      |
| area   | tinyint | 车位所在楼层方位                  |

客户表：User

| 字段名   | 类型    | 注释               |
| -------- | ------- | ------------------ |
| id       | char    | 客户ID             |
| openId   | char    | 微信公众平台开放ID |
| nickname | varchar | 用户昵称           |
| cover    | varchar | 用户头像           |

客户车辆绑定表（公众号）：BindInfo

| 字段名 | 类型 | 注释   |
| ------ | ---- | ------ |
| user_id | char | 用户ID |
| car_id  | char | 车辆ID |

车辆表：Vehicle

| 字段名 | 类型    | 注释                  |
| ------ | ------- | --------------------- |
| id     | char    | 车ID                  |
| number | char    |                       |
| type   | tinyint | 0：燃油车 1：新能源车 |

管理员表：Admin

| 字段名 | 类型    | 注释     |
| ------ | ------- | -------- |
| id     | char    | 管理员ID |
| name   | varchar | 姓名     |
| major  | varchar | 职位     |

值班记录：Duty

| 字段名       | 类型     | 注释     |
| ------------ | -------- | -------- |
| ID           | char     | 值班ID   |
| start_time   | datetime | 开始时间 |
| end_time     | datetime | 结束时间 |
| admin_id     | char     |          |
| watch_box_id | char     |          |

岗亭信息：WatchBox

| 字段名      | 类型    | 注释              |
| ----------- | ------- | ----------------- |
| id          | char    | 岗亭ID            |
| type        | tinyint | 0：入口   1：出口 |
| description | varchar | 岗亭信息描述      |

订单信息：Order

| 字段名     | 类型     | 注释                                  |
| ---------- | -------- | ------------------------------------- |
| id         | char     | 流水号                                |
| status     | tinyint  | 0：未支付    1：支付中    2：支付完成 |
| start_time | datetime | 开始计费时间                          |
| car_id     | char     |                                       |
| user_id    | char     |                                       |
| entry_id   | char     |                                       |
| exit_id    | char     |                                       |
| admin_id   | char     |                                       |
| pay_type   | tinyint  | 0：现场付费   1：公众号付费           |
| left       | tinyint  | 0：未离开     1：已离开               |
| tip        |          |                                       |
| is_deleted | tinyint  | 0：否    1：是                        |

## 接口方法定义
新增用户

| RESFul资源 | /user                                                 |
| ---------- | ----------------------------------------------------- |
| http方法   | POST                                                  |
| 类名       | UserController                                        |
| 方法名     | addUser                                               |
| 输入       | User：用户对象                                        |
| 输出       | {<br />sucess: 是否成功<br />message：操作信息<br />} |
| 功能描述   | 新增一个用户                                          |

新增用户

| RESFul资源 | /user                                                 |
| ---------- | ----------------------------------------------------- |
| http方法   | POST                                                  |
| 类名       | UserController                                        |
| 方法名     | addUser                                               |
| 输入       | User：用户对象                                        |
| 输出       | {<br />sucess: 是否成功<br />message：操作信息<br />} |
| 功能描述   | 新增一个用户                                          |






