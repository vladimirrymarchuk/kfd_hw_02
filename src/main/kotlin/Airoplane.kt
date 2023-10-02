class Airplane(
    model: String,
    val maxPassengers: Int
) : Transport(model){
    override fun getInfo(): String = "model: $model, maxPassengers: $maxPassengers"
}

