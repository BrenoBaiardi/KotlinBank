class ContaPoupanca(
        titular: String,
        numero: Int
) : Conta(
        titular = titular,
        numero = numero
),Transferivel {
    override fun saca(valor: Double) {
        if (this.saldo>=valor){
            this.saldo-=valor
        }
    }

    override fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}