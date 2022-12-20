package usingInterfaces

interface Parent {
    val name: String
    val age: Int

    fun callingTheChild(){
        println("Come here, $name! you're only $age, stay close to me")
    }
}