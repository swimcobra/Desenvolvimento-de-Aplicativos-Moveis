fun main() {

    var p1 = Pessoa("Lucca", 20)
    println("Pessoa p1 - Nome: ${p1.nome}; Idade: ${p1.idade}")
    p1.falar("Bom dia! Aula 04 de Kotlin!")

    var c1 = Carro()
    println("Dados do carro 1: ${c1.modelo} - ${c1.placa}")

    var c2 = Carro("Celta", "ABC-2115")
    println("Dados do carro 1: ${c2.modelo} - ${c2.placa}")

    var pr2 = Produto("Salgadinho Fandangos Queijo", 7.89f)
    var pr1 = Produto("Bolacha Trakinas Morango", -10f)

    var f1 = Filme("Matrix", 1999, "Ficção Ciêntifica")
    var f2 = Filme("Bastardos Inglórios")

    println("\nFilmes cadastrados: ")
    f1.mostrarDadosFilme()
    f2.mostrarDadosFilme()

    var cachorro1 = Cachorro("Rex", "Pastor Alemão")
    var gato1 = Gato("Bolinho", "Amarelo")

    println("\nComportamento dos animais: ")
    cachorro1.falar()
    gato1.falar()

    val user1 = Usuario(1, "maria_maria", "lalala1234")
    val user2 = Usuario(2, "jao-jao", "jao123")
    val user3 = user2.copy() // Cria novo objeto copiando dados de outro

    println("\nUsuários Cadastrados:")
    println(user1) // Invocando implicitamente o toString
    println(user2)
    println(user3)

    // Leitura de dados
    print("\nInforme seu nome para finalizarmos esta atividade: ")
    var nome: String? = readln() // ? indica que o valor pode ser nulo

    nome = nome?.uppercase() // ?. indica que a ação de uppercase só será executada se o valor não for nulo

    println("\nObrigado $nome por sua participação na aula de hoje!")

    println("\nAula finalizada!")
}