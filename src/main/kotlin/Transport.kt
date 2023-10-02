abstract class Transport(
    open val model: String
) {
    open fun getInfo() : String = "model: $model"
}