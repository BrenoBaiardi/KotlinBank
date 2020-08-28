fun main() {
    println("Bem vindo ao Bytebank")
    val contaAlex = Conta("Alex",1001)
    val contaFran = Conta("Fran",1002)


    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("transferinfo 100 de Alex pra Fran")
    if (contaAlex.transfere(100.0,contaFran)) {
        println("Sucesso")
    }    else {
        println("Falha")
    }

}

class Conta {
    private var titular = ""
    private var numero = 0
    //will be coded as a property
    var saldo = 0.0
        private set // the RIGHT way to use setters

    constructor(titular: String, numero: Int) {
        this.titular = titular
        this.numero = numero
    }


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


//códigos de teste e exploração de sintaxe
fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
}

fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0
        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }
    for (i in 5 downTo 1) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0
        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }
}
