fun main(){
    val text = "akirachix"
    println(text[0])
    println(text[2])
    println(text[3])

    val name = "Rachel"
    val age = "10"
    val sentense = "Hi, my name is $name and I am $age years old."
    println(sentense)

    println(noOfStrings())

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
