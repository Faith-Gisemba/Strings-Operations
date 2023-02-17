fun main(){
    val text = "akirachix"
    println(text[0])
    println(text[2])
    println(text[3])


    println(noOfStrings())
    println(stmt())

    val name1 =  "Harvey"
    val name2 = "Angel"
    if(name1 ==(name2)){
        println("I know you")}else{
            println("I don't know who that is")
    }

}
fun noOfStrings():Int{
    val noString = "kotlin"
    val len = noString.length
    return len
}

fun stmt():String{
    val name = "Rachel"
    val age = "10"
    val stmt = "Hi, my name is $name and I am $age years old."
    return stmt
}