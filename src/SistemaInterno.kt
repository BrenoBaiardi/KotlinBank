class SistemaInterno {
    //should not have to implement auth for each type of Funcionario
    fun entra(admin: Autenticavel,senha:Int){
        if (admin.autentica(senha)) {
            println("sucesso")
        }else println("falha")
    }
}