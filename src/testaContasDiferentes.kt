fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
            titular = "Alex",
            numero = 1001
    )

    val contaPoupanca = ContaPoupanca(
            titular = "Fran",
            numero = 1002
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupanca: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupanca: ${contaPoupanca.saldo}")
}




