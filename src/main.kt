fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario("Alex",cpf = "111.111.111-11",salario = 1000.0)

    println("Salário ${alex.salario}")
    println("cpf ${alex.cpf}")
    println("nome ${alex.nome}")
    println("Bonificação ${alex.bonificacao()}")
    
}



