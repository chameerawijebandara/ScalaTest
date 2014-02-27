package test1

import scala.reflect.io.File
object hello {
	def main(args: Array[String]) {
		
		val source = scala.io.Source.fromFile("C:\\Users\\Chameera\\Desktop\\new.txt")
		val lines = source.getLines();
		source.close()
		
		println(lines)
	}
}