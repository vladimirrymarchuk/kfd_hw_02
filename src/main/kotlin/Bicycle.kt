class Bicycle(
    model: String
) : Transport(model) {
    override fun getInfo(): String = "bicycle: $model"
}
