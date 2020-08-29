class Analista(
        nome: String,
        cpf: String,
        salario: Double


) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    fun autentica(senha: Int) {

    }

    override fun bonificacao(): Double {
        return super.bonificacao() + salario * 0.1
    }
}