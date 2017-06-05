package com.learnscala.chapter9

import scala.io.Source
import java.io.PrintWriter

class Practice {
  
	//9.1编写一小段Scala代码，将某个文件中的行倒转顺序(将最后一行作为第一行,依此类推)
	def fileReverse(path: String){
		val reader = Source.fromFile(path).getLines()
		val result = reader.toArray.reverse
		val out = new PrintWriter(path)
		result.foreach(line => out.write(line + "\n"))
		out.close()
	}
	
	//9.2编写Scala程序,从一个带有制表符的文件读取内容,将每个制表符替换成一组空格,
	//使得制表符隔开的n列仍然保持纵向对齐,并将结果写入同一个文件
	def filePractice2(path: String){
		val reader = Source.fromFile(path).getLines()
		val result = for (t <- reader) yield t.replaceAll("\\t", " ")
		val out = new PrintWriter(path)
		result.foreach(line => out.write(line + "\n"))
		out.close()
	}
	
	//9.3编写一小段Scala代码,从一个文件读取内容并把所有字符数大于12的单词打印到控制台。如果你能用单行代码完成会有额外奖励
	def filePractice3(path: String){
		Source.fromFile(path).mkString.split("\\s+").foreach(word => if (word.length() > 5) print(word))
	}
	
	//9.4编写Scala程序，从包含浮点数的文本文件读取内容，打印出文件中所有浮点数之和，平均值，最大值和最小值
	def filePractice4(path: String){
		val nums = Source.fromFile(path).mkString.split("\\s+")
		var total = 0d
		nums.foreach(total += _.toDouble)
	}
	
	//9.7编写Scala程序，从文本文件读取内容，并打印出所有的非浮点数的词法单位。要求使用正则表达式 
	def filePractice7(path: String){
		val source = Source.fromFile(path).mkString
		val pattern = """[^((\d+\.){0,1}\d+)^\s+]+""".r
		pattern.findAllIn(source).foreach(println(_))
	}
	
	//9.8编写Scala程序打印出某个网页中所有img标签的src属性。使用正则表达式和分组
	def filePractice8(path: String){
		val source = Source.fromFile(path).mkString
		val pattern = """<img[^>]+(src\s*=\s*"[^>^"]+")[^>]*>""".r
		for (pattern(str) <- pattern.findAllIn(source)) println(str)
	}
	
	
	
	
}