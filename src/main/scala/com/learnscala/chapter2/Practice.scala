package com.learnscala.chapter2

class Practice {
  
	//2.1一个数字如果为正数，则它的signum为1;
	//如果是负数,则signum为-1;如果为0,则signum为0.编写一个函数来计算这个值
	def signum(num:Int) {
		if (num > 0) print(1) else
			if (num < 0) print(-1) else print(0)
	}
		
	//2.4 针对下列Java循环编写一个Scala版本:for(int i=10;i>=0;i–)System.out.println(i);
	//使用reverse倒序
	for (i <- 0 to 10 reverse) print(i)
	
	//2.5 编写一个过程countdown(n:Int)，打印从n到0的数字
	def countdown(n:Int){
		 for (i <- 0 to n reverse) print(i)
	}
	
	//2.6 编写一个for循环,计算字符串中所有字母的Unicode代码的乘积。
	//举例来说，"Hello"中所有字符串的乘积为9415087488L
	def wordUnicode(word: String) : Long = {
		var t:Long = 1
		for (i <- word){
			t = t * i.toLong
		}
		t
	}
	
	//2.7 同样是解决前一个练习的问题，但这次不使用循环。（提示：在Scaladoc中查看StringOps）
	def wordUnicode2(word: String) : Long = {
		var t:Long = 1
		word.foreach(t *= _.toLong)
		t
	}
	//2.8 编写一个函数product(s:String)，计算前面练习中提到的乘积
	//同2.6
	
	//2.9 把前一个练习中的函数改成递归函数
	def product(s: String): Long = {
		if (s.length() == 1) return s.charAt(0).toLong
		else s.take(1).charAt(0).toLong * product(s.drop(1))
	}
	
/*	//2.10 编写函数计算x的n次方,其中n是整数，使用如下的递归定义:
	xn=y2,如果n是正偶数的话，这里的y=x(n/2)
	xn = x*x(n-1),如果n是正奇数的话
	x0 = 1
	xn = 1/x(-n),如果n是负数的话
	不得使用return语句*/
	def mi(x: Double, n: Int): Double = {
		if (n == 0) 1
		else if (n > 0 && n%2 == 0) mi(x,n/2) * mi(x,n/2)
		else if (n > 0 && n%2 == 1) x * mi(x,n-1)
		else 1/mi(x,-n)
	}
	
}
