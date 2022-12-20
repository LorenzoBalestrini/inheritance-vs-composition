package usingInterfaces

class Child2(override val name: String, override val age: Int):Parent  {

    override fun callingTheChild() {
        super.callingTheChild()
        println("no, I don't want to!")
    }
}