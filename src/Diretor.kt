class Diretor(
        nome: String,
        cpf: String,
        salario: Double,
        val senha: Int,
        val plr: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    fun autentica(senha: Int) {

    }

    override fun bonificacao(): Double {
        return super.bonificacao() + salario + plr
    }

}