open class Customer(val name: String = "Customer",
                val shopName: String){

    fun pay(priceOfBread: Double = 50.0, numberOfBread: Int){
        println("$name paid ${priceOfBread * numberOfBread} for the price of $priceOfBread" +
                " per bread and bought $numberOfBread bread(s)")
    }

    open fun greet(): String = "Hello Sam"

}

class MonthlyCustomer(name: String, shopName: String): Customer(name, shopName){

    override fun greet(): String = super.greet() + " from $name, the owner of $shopName"

    fun pay(pricePerMonth: Double = 4_000.0, numberOfMonth: Int, numberOfBread: Int = 40){
        println("$name paid ${pricePerMonth * numberOfMonth} for $numberOfBread bread(s) to be delivered" +
                " per month for $numberOfMonth month(s)")
    }
}

fun main(args: Array<String>){
    val belema = Customer(shopName = "Mini mart")
    val austin = Customer("Austin", "Mini mart")
    println(belema.greet())
    belema.pay(numberOfBread = 5)
    austin.pay(40.0, 100)

    val tolu = MonthlyCustomer("Tolu","Tolu's shop")
    println(tolu.greet())
    //tolu wants to buy for her house
    tolu.pay(numberOfBread = 6)
    //tolu buying as a monthly customer
    tolu.pay(numberOfMonth = 5)
}