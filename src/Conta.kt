//this constructor will already require and initialize the variables
abstract class Conta(
        val titular: String,
        val numero: Int
) {
    //will be coded as a property
    var saldo: Double = 0.0
        protected set // protected in order to subclasses to have acess

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    //should be open or else it cannot be overwritten
    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

}