class Gerente(
        nome:String,
        cpf:String,
        salario:Double,
        val senha:Int

): Funcionario(nome = nome, cpf = cpf, salario = salario) {
    fun autentica(senha:Int){

    }

    override val bonificacao: Double
        get() {
            return salario
        }
}