interface MechanicalTransport {
    var number: String
    var mileage: Int
    var category: String

    fun drive(km: Int)

    fun setInfo(mileage: Int, number: String) {
        this.mileage = mileage
        this.number = number
    }
}
