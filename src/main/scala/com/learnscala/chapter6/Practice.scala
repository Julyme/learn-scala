package com.learnscala.chapter6

class Practice {
  
	//6.1编写一个Conversions对象，加入inchesToCentimeters,gallonsToLiters和milesToKilometers方法 
	object Conversions{
		def inchesToCentimeters(){}
		def gallonsToLiters(){}
		def milesToKilometers(){}
	}
	
	//6.2前一个练习不是很面向对象。提供一个通用的超类UnitConversion并定义扩展该超类的InchesToCentimeters,GallonsToLiters和MilesToKilometers对象
	abstract class UnitConversion{
		def inchesToCentimeters(){}
		def gallonsToLiters(){}
		def milesToKilometers(){}
	}
	object InchesToCentimeters extends UnitConversion{
		override def inchesToCentimeters(){}
	}
	object GallonsToLiters extends UnitConversion{
		override def gallonsToLiters(){}
	}
	object MilesToKilometers extends UnitConversion{
		override def milesToKilometers(){}
	}
	
	//6.3 定义一个扩展自java.awt.Point的Origin对象。为什么说这实际上不是个好主意？(仔细看Point类的方法) 
	//Point中的getLocation方法返回的是Point对象，如果想返回Origin对象，需要Origin类才行 
	
	//6.4定义一个Point类和一个伴生对象,使得我们可以不用new而直接用Point(3,4)来构造Point实例 
	class Point(x: Int, y:Int){
		override def toString: String = "x=" + x + " y= " + y
	}
	object Point extends App{
		def apply(x: Int, y: Int) = {
			new Point(x,y)
		}
	}
	val p = Point(1,2)
	
	//6.5编写一个Scala应用程序,使用App特质,以反序打印命令行参数,用空格隔开。举例来说,scala Reverse Hello World应该打印World Hello
	object Reverse extends App{
		args.reverse.foreach(arg => print(arg + " "))
	}
	
	//6.6编写一个扑克牌4种花色的枚举,让其toString方法分别返回♣,♦,♥,♠ 
	//6.7实现一个函数,检查某张牌的花色是否为红色 
	object Card extends Enumeration with App{
		val M = Value("♣")
		val T = Value("♦")
		val H = Value("♥")
		val F = Value("♠")
		def color(c: Card.Value){
			if (c == Card.M || c == Card.T) print("Black")
			else print("Red")
		}
	}
	
	//6.8编写一个枚举,描述RGB立方体的8个角。ID使用颜色值(例如:红色是0xff0000) 
	object RGB extends Enumeration with App{
		val RED = Value(0xff0000, "Red")
		val BLACK = Value(0x000000, "Black")
		val GREEN = Value(0x00ff00, "Green")
		val CYAN = Value(0x00ffff, "Cyan")
		val YELLOW = Value(0xffff00, "Yellow")
		val WHITE = Value(0xffffff, "White")
		val BLUE = Value(0x0000ff, "Blue")
		val MAGENTA = Value(0xff00ff, "Magenta")
	}
	
	
	
}