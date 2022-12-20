package usingInheritance

import usingInterfaces.Child1

fun main(){

    val luca = Child1("Luca", 10)
    val mario = Child2("Mario",8)

    luca.callingTheChild()
    println("-----------------------")
    mario.callingTheChild()
}