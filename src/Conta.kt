//this constructor will already require and initialize the variables
class Conta(
        val titular: String,
        val numero: Int
) {
    //will be coded as a property
    var saldo: Double = 0.0
        private set // the RIGHT way to use setters

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            return true
        }
        return false
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saca(valor)) {
            destino.saca(valor)
            return true
        }
        return false
    }

}