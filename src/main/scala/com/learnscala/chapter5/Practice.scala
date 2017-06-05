package com.learnscala.chapter5

import scala.beans.BeanProperty

class Practice {
  
	//5.1改进5.1节的Counter类,让它不要在Int.MaxValue时变成负数 
	class Count{
		private var value = Int.MaxValue
		def increment(){
			if (value < Int.MaxValue) value + 1 else value
		}
		def current = value
	}
	
	//5.2编写一个BankAccount类，加入deposit和withdraw方法，和一个只读的balance属性 
	class BankAccount(val balance: Int = 0){
		def deposit(){}
		def withdraw(){}
	}
	
	//5.3编写一个Time类，加入只读属性hours和minutes，和一个检查某一时刻是否早于另一时刻的方法before(other:Time):Boolean。
	//Time对象应该以new Time(hrs,min)方式构建。其中hrs以军用时间格式呈现(介于0和23之间) 
	class Time(val hours: Int, val minutes: Int){
		def before(other: Time): Boolean = {
			hours < other.hours || (hours == other.hours && minutes < other.minutes)
		}
		override def toString(): String = {
			hours + ":" + minutes;
		}
	}
	
	//5.4 重新实现前一个类中的Time类，将内部呈现改成午夜起的分钟数(介于0到24*60-1之间)。
	//不要改变公有接口。也就是说，客户端代码不应因你的修改而受影响 

	//5.5创建一个Student类，加入可读写的JavaBeans属性name(类型为String)和id(类型为Long)。有哪些方法被生产？(用javap查看。)
	//你可以在Scala中调用JavaBeans的getter和setter方法吗？应该这样做吗？ 
	//生成了name(),name_=(),id(),id_=(),setName(),getName(),setId(),getId()
	class Student{
		@BeanProperty var name: String = _
		@BeanProperty var id: Long = _
	}
	
	
}