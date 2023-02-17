fun main(){
    val text = "akirachix"
    println(text[0])
    println(text[2])
    println(text[3])


    println(noOfStrings())
    println(stmt())

    val name =  "Harvey"
    val statement = "That's me!"
    if(name ==(statement)){
        println("It's me")}else{
            println("I don't know who that is")
    }

}
fun noOfStrings():Int{
    val noString = "kotlin"
    val length = noString.length
    return length
}

fun stmt():String{
    val name = "Rachel"
    val age = "10"
    val stmt = "Hi, my name is $name and I am $age years old."
    return stmt
}