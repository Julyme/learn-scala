package com.learnscala.chapter3

import scala.util.Random
import scala.collection.mutable.ArrayBuffer
import java.util.TimeZone
import scala.util.Sorting

class Practice {
  
	//3.1编写一段代码，将a设置为一个n个随机整数的数组，要求随机数介于0和n之间。
	def makeArr(n: Int): Array[Int] = {
		val a =  Array[Int](n)
		val rand = Random
		for (i <- a) yield rand.nextInt(n)
	}
	
	//3.2编写一个循环，将整数数组中相邻的元素置换。
	def revert(arr: Array[Int]): Array[Int] = {
		for (i <- 0 until (arr.length -1, 2)){
			val t = arr(i)
			arr(i) = arr(i + 1)
			arr(i + 1 ) = t
		}
		arr
	}
	
	//3.3重复前一个练习，不过这次生成一个新的值交换过的数组。用for/yield。
	def revertyield(arr: Array[Int]) = {
		for (i <- 0 until arr.length) yield {
			if (i < (arr.length - 1) && i% 2 == 0){
				val t= arr(i)
				arr(i) = arr(i+1)
				arr(i+1) = t
			}
			arr(i)
		}
	}
	
	//3.4给定一个整数数组，产出一个新的数组，包含元数组中的所有正值，以原有顺序排列，之后的元素是所有零或负值，以原有顺序排列。
	def sigNumArr(arr: Array[Int]): Array[Int] = {
		val buf = ArrayBuffer[Int]()
		buf ++= (for (i <- arr if i>0) yield i)
		buf ++= (for (i <- arr if i==0) yield i)
		buf ++= (for (i <- arr if i<0) yield i)
		buf.toArray
	}
	
	//3.5如何计算Array[Double]的平均值？
	def avgArr(arr: Array[Double]): Double = {
		arr.sum / arr.length
	}
	
	//3.6如何重新组织Array[Int]的元素将它们反序排列？对于ArrayBuffer[Int]你又会怎么做呢？
	
	//3.7编写一段代码，产出数组中的所有值，去掉重复项。
	def arrDistinct(arr: Array[Int]): Array[Int] = {
		arr.distinct
	}
	
	//3.8
	
	//3.9创建一个由java.util.TimeZone.getAvailableIDs返回的时区集合，判断条件是它们在美洲，去掉”America/“前缀并排序。
	def timeZoneName() = {
		val arr = TimeZone.getAvailableIDs()
		val tmp = (for (i <- arr if i.startsWith("America")) yield {
			i.drop("America/".length())
		})
		Sorting.quickSort(tmp)
		tmp
	}
	
	
	
	
}