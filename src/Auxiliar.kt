class Auxiliar(
        nome: String,
        cpf: String,
        salario: Double


) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    fun autentica(senha: Int) {

    }

    override val bonificacao: Double
        get() = salario * 0.05

}