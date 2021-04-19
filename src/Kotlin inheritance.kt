fun main(){
var benki=Banker("Jer",25)
    benki.eat()
    println(benki.countMoney(listOf(100,500,1000)))

}
open class Person(name:String,age:Int){
    fun talk (){
        println("I am a person")
    }
    fun eat(){
        println("yummz")
    }

}
class Banker(name: String, age: Int): Person(name, age){
    fun countMoney(notes: List<Int>): Int{
        var sum = 0
        notes.forEach{note-> sum+=note}
        return sum
    }

}
class Farmer(name: String,age: Int): Person(name, age){
    fun harvest(){
        println("I harvest maize twice a year.")
    }

}
class Doctor(name: String,age: Int): Person(name, age){
fun patientCount(num:Int){
    
}

}