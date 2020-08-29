fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario("Alex",cpf = "111.111.111-11",salario = 1000.0)
    val fran = Gerente("Fran",cpf = "111.111.111-11",salario = 2000.0,senha = 123)
    val gui = Diretor("Gui",cpf = "111.111.111-11",salario = 3000.0,senha = 123,plr = 10.0)
    val maria = Analista("maria",cpf = "111.111.111-11",salario = 3000.0)

//    println("nome ${alex.nome}")
//    println("cpf ${alex.cpf}")
//    println("Salário ${alex.salario}")
//    println("Bonificação ${alex.bonificacao()}")


    var calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println(calculadora.total)
}



