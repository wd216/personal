create databases personal;

use personal;orderitem
-- 管理员表
create table adm(
	id int primary key auto_increment,
	aname varchar(20) not null,	-- 管理员名字
	apwd varchar(30) not null	-- 管理员密码			
	aphone varchar(20) -- 管理员电话
); 
select * from adm;

-- 用户表
create table customer(
  id int primary key auto_increment,
  name varchar(20), -- 用户名bookbooktypeorderitemorderitemorderitem
  psword varchar(20), -- 用户密码
  email varchar(30), -- 用户邮箱
  leave int default 0-- 用户身份识别
);

insert into user(name,psword,email) value('张三','123456','1313@qq.com');
insert into user(name,psword,email) value('李四','123456','2558@qq.com');

create table booktype(
  id int primary key auto_increment,
  type varchar(20),  -- 图书类型
  detail varchar(50) -- 图书类型描述
);
insert into booktype(type,detail) 
values('艺术','艺术类'),
('小说','小说类'),('文学','文学类'),
('传记','传记类'),('科幻','科幻类');
create table book( 
  id int primary key auto_increment,
  bid int not null, -- 图书类型
  bname varchar(30), -- 图书名字
  author varchar(30), -- 图书作者
  image varchar(100), -- 图书封面
  price float, -- 图书价格
  press varchar(100), -- 图书出版社
  presstime date, -- 图书出版时间
  page int, -- 图书有多少页
  word int, -- 图书有多少字
  printingtime date -- 图书的印刷时间
);

insert into book(bid,bname,author,image,price,press,presstime,page,word,printingtime)
values
(1,'使女的故事','玛格丽特·阿特伍德著','图书图片',23.32f,'上海译文出版社','2001-09-08',564,1013000,'2001-09-08'),
(3,'局外人','加缪','图书图片',29.6f,'江苏凤凰文艺出版社','2013-07-06',704,769000,'2013-07-06'),
(5,'三体','刘慈欣','图书图片',93.32f,'重庆出版集团','2008-06-12',104,1405000,'2008-06-12'),
(2,'忏悔录','卢梭','图书图片',16.8f,'北京燕山出版社','2009-05-22',498,530000,'2000-05-22'),
(1,'本源','丹·布朗','图书图片',55.0f,'人民文学出版社','2018-05-01',476,520000,'2018-05-01'),
(4,'如父如子','[日]是枝裕和[日]佐野晶','图书图片',49.8f,'湖南文艺出版社','2011-07-08',64,138000,'2011-07-08'),
(3,'活着','余秋雨','图书图片',58.8f,'作家出版社','2012-07-18',191,136000,'2017-08-08'),
(3,'天长地久','龙应台','图书图片',43.8f,'湖南文艺出版社','2018-07-20',138,129000,'2018-07-20'),
(4,'云便有个小卖部','张嘉佳',42.8f,'湖南文艺出版社','2018-07-28',34,18000,'2018-07-28');
-- 购物车
create table orderItem(
  id int primary key auto_increment
  , bid int,-- 图书封面
  -- 图书名称
  -- 图书单价
   -- 支付状态
  count int, -- 图书数量
  price double,-- 小计
  uid int -- 用户id 用来判断是谁的购物车
);
-- 订单表
create table order
(
  id varchar(50), -- 订单编号能够随机生成一个字符串数字且不重复
  -- 购物车的id
  -- 图书封面
  -- 图书价格
  ordertime date, -- 下单时间
  aid int -- 地址id 引用过来
);

create table address
(
	id int primary key auto_increment,
	uid int not null,
	-- 收货地址
	name varchar(20), -- 收货人名字
	phone varchar(20),	-- 收货人的联系电话
	-- 收货时间
)
