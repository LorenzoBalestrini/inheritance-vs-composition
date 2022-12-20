package usingInterfaces

class Child1(override val name: String, override val age: Int):Parent  {

    override fun callingTheChild() {
        super.callingTheChild()
        println("Ok i'm coming!")
    }
}