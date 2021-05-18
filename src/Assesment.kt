fun main() {

   sortedBooks(listOf(
       Book("the greatest outdoors","john doe",500),
       Book("Born a crime","Trevor Noah",208),
       Book("A man in a river","James",50)
   ))
    square()
    var toyota=Truck("KDS200",200,500)
    toyota.load(50)
    toyota.unload(30)
    toyota.weightCheck()

    var BMW= Trailer("RAB107F",100,200,60)
    BMW.load(30)
    BMW.unload(60)
    BMW.weightCheck()
}


data class Book(var title:String, var author:String, var pages: Int)
fun sortedBooks(books:List<Book>){
    var sorting= books.sortedBy { books ->books.title  }
    println(sorting)
}

fun square(){
    var i=-1
    do{
        for (i in 1..3000)

            if (i<3000){
                break
            }
            println(i*i)
        i--
    }
        while (i*i<3000)
}
open class Cars(var registration: String,var totalWeight: Int,var capacity: Int){
    fun load(weight: Int){
        println(totalWeight+weight)
    }
    fun unload(weight: Int){
        println(totalWeight-weight)
    }
    open fun weightCheck(){
        if (totalWeight>capacity){
            println("Truck is overloaded ${totalWeight-capacity} kgs")
        }
        else if (totalWeight<capacity){
            println("truck is underloaded ${capacity-totalWeight} kgs")
        }
    }
}
class Truck(registration:String, totalWeight:Int, capacity:Int):Cars(registration,totalWeight,capacity){

}

class Trailer(registration:String, totalWeight:Int, capacity:Int, var wheels:Int):Cars(registration,totalWeight,capacity){
    override fun weightCheck() {
        println((totalWeight/wheels)+capacity)
    }
}