package usingInheritance

class Child2 (override val name:String,override val age: Int): Parent(name, age) {
    override fun callingTheChild() {
        super.callingTheChild()
        println("no, I don't want to!")
    }
}