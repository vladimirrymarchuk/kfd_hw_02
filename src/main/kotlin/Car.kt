class Car(
    model: String,
    override var number: String,
    override var mileage: Int = 0,
    val maxWeight: Double
) : MechanicalTransport, Transport(model) {
    override var category: String = "B"

    init {
        if (maxWeight > 3.5) {
            category = "C"
        }
    }

    override fun getInfo(): String = "model: $model, number: $number, mileage: $mileage, category: $category, maxWaight: $maxWeight"


    override fun drive(km: Int) {
        println("Car drive!")
        mileage += km
    }
}
