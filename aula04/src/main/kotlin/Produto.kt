class Produto(
    var nome: String,
    var preco: Float
) {
    // Bloco Init: Executado sempre que o construtor primario for chamado

    init {
       // require(preco >= 0f) { "Preço deve ser maior que zero!" }
        if(preco <=0) preco = 0.01f
        println("Produto Cadastrado: $nome por R$$preco")
    }
}