
fun testaComportamentoConta() {
    val contaAlex = ContaCorrente("Alex", 1001)
    val contaFran = ContaPoupanca("Fran", 1002)


    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("transferinfo 100 de Alex pra Fran")
    if (contaAlex.transfere(100.0, contaFran)) {
        println("Sucesso")
    } else {
        println("Falha")
    }
}
