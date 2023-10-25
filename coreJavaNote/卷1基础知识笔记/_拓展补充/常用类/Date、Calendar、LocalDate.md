# Date

第一代日期类

new Date（），无参数构造器，默认的输出格式是国外的方式，要进行转化

可以用SimpleDateFormat sdf=new SimpleDateFormat（“yyyy年mm月dd日	hh：mm：ss	E”）

创建一个上述对象，可以指定相应的格式sdf.format(date1)

可以把一个格式化的字符串对应的转成一个Date

sdf.parse(s),s的格式要正确，不然抛出异常	

# Calendar

Calendar类是一个抽象类，为日历字段的转换提供了一些方法

Calendar类不能new出来，要用getInstance方法

有很多get方法，要注意Calendar返回月的时候是从0开始编号的，所以要手动+1

Calendar没有提供对应的格式化，需要程序员自己组合输出

- 默认的输出格式12小时制的，如果需要按照24小时制获取小时，把HOUR改成HOUR_OF_DAY

# 以上两者的不足

不足：

1. Calendar类是可变的，但是日期和时间的类应该是不可变的

2. 偏移性问题：Date的年份是从1900年开始的，而月份是从0开始的

3. 格式化只对Date有用而对Calendar没有用

4. 他们不是线程安全的；

5. 不能处理闰秒

   

# LocalDate、LocalTime、LocalDateTime

LocalDate只包含日期，既年月日

LocalTime只包含时间，既时分秒

LocalDateTime包含时间加日期既年月日时分秒



LocalDateTime构造器：提供两个参数，一个是LocalDate，一个是LocalTime

## DateTimeFormatter

DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒")

String s=dtf.format(localDateTime)

## Instant(时间戳)

类似于Date

提供了一系列与Date相互转化的方式

Date date=Date.from(instant)

Instant instant=date.toInstant()

​	
