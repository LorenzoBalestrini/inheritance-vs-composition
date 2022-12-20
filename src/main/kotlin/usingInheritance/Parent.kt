package usingInheritance

open class Parent (open val name: String, open val age: Int) {
    open fun callingTheChild(){
        println("Come here, $name! you're only $age, stay close to me")
    }
}