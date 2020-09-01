class Analista(
        nome: String,
        cpf: String,
        salario: Double


) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    fun autentica(senha: Int) {

    }

    override val bonificacao: Double
        get() {
            return salario * 0.1
        }
}