class Motobike(
    model: String,
    override var number: String,
    override var mileage: Int = 0,
) : MechanicalTransport, Transport(model){
    override var category: String = "A"

    override fun drive(km: Int) {
        println("Motobike drive")
        mileage += km
    }

    override fun getInfo(): String = "model: $model, number: $number, mileage: $mileage, category: $category"


}