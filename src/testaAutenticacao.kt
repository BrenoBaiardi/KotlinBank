
fun testaAutenticacao() {
    val gerente = Gerente("zé", "123123123", 1000.0, 1234)
    val cliente = Cliente("zé-Cliente", "123123123", 1234)
    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234)
    sistema.entra(cliente,1234)
}
