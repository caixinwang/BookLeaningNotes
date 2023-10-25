# Arrays

## 遍历数组

Arrays.toString方法，可以显示数组信息

## sort排序

arrays提供了高效的sort方法

可以利用接口定制方法

## 二分查找

binarySearch方法，要求必须数组有序

如果找不到，会返回-（low+1）,low为它如果存在应该在的位置

## 数组复制

copyOf（arr，num）方法

从arr拷贝num个到newarr中

如果拷贝的长度大于arr，会在后面添加null

如果拷贝长度小于0，就抛出异常

## 数组填充

fill（arr，num）方法	

用num把arr中的所有元素替换

## 比较数组是否一致

equals（arr1，arr2）

必须一模一样，包括顺序和元素

## 转成list

asList（arr）

会将arr中的数据转成一个list集合

