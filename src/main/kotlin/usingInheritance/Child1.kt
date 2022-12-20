package usingInheritance

class Child1 (override val name:String,override val age: Int): Parent(name, age) {
    override fun callingTheChild() {
        super.callingTheChild()
        println("Ok i'm coming!")
    }
}