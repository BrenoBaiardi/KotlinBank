class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        println("bonificação do usuário ${funcionario.nome} registrada")
        this.total += funcionario.bonificacao()
    }

//    The following steps are not required since
//    all of the classes below ARE Funcionarios
//    fun registra(gerente: Gerente) {
//        this.total += gerente.bonificacao()
//    }
//    fun registra(diretor: Diretor) {
//        this.total += diretor.bonificacao()
//    }

}