fun main() {
    val msg = mensagem("Lucca")
    println(msg)

    println(mensagem("João"))

    if(parOuImpar(7)) {
        println("7 é par")
    } else {
        println("7 é ímpar")
    }

    val teste = verificarParOuImpar(6)
    println(teste)

    criarPote()
    criarPote(quant = 12)
    criarPote(tipo = "Morango")
    criarPote(
        tipo = "Uva",
        quant = 15
    )

    exemploListaImutavel()

    exemploListaMutavel()

    exemploMapaImutavel()

    exemploMapaMutavel()

    exemploLambda1()

    exemploLambda2()

    desafio()
}

fun mensagem(nome : String) : String {
    return "Olá, $nome"
}

fun parOuImpar(valor : Int) : Boolean {
    return valor % 2 == 0
}

fun verificarParOuImpar(valor : Int) : String {

    return if(valor % 2 == 0) "$valor é par!" else "$valor é ímpar!"
}

fun criarPote(tipo : String = "Chocolate", quant : Int = 10) {
    println("Pote de $tipo com $quant unidades")
}

fun exemploListaImutavel() {
    val nomes : List<String> = listOf("Lucca", "João", "Matheus")

    println("\nMostrando nomes da lista")

    for(nome in nomes) {
        println(mensagem(nome))
    }
}

fun exemploListaMutavel() {
    val frutas = mutableListOf<String>("Uva", "Morango", "Laranja")

    frutas.add("Banana") // Uva | Morango | Laranja | Banana
    frutas.removeAt(0) // Morango | Laranja | Banana
    frutas.add("Tangerina") // Morango | Laranja | Banana | Tangerina
    frutas.remove("Morango") // Laranja | Banana | Tangerina

    println("\nMostrando Frutas:")
    frutas.forEach{println(it)}

}

fun exemploMapaImutavel() {
    val capitais = mapOf(
        "BR" to "Brasília",
        "PT" to "Lisboa"
    )

    println("\nCapital do Brasil: ")
    println(capitais["BR"])
    println("\nCapital dos EUA: ")
    println(capitais.getOrDefault("EUA", "Capital não cadastrada!"))
    println("\nCapital de Portugal: ")
    println(capitais.getOrDefault("PT", "Capital não cadastrada!"))

}

fun exemploMapaMutavel() {
    val telefones = mutableMapOf(
        "Ana" to "99999-9999",
        "Zé" to "3569-9874"
    )

    telefones["Bob"] = "98745-6123"
    println("\nTelefones: ")
    println(telefones.getOrDefault("Ana", "Telefone não encontrado!"))
    println(telefones.getOrDefault("Eva", "Telefone não encontrado!"))
    println(telefones.get("Duda"))
    println(telefones["Bob"])

}

fun exemploLambda1() {
    val dobro : (Int) -> Int = {x -> x * 2}

    println("\nO dobro de 5 é ${dobro(5)}")

    val quadrado : (Int) -> Int = {it * it}
    // Quando é um único argumento que a função recebe, podemos usar "it"
    println("O quadrado de 8 é ${quadrado(8)}")
}

fun exemploLambda2() {
    print("\nInforme um valor float: ")
    val n1 = readln().toFloat()

    print("Informe outro valor float: ")
    val n2 = readln().toFloat()

    val media = (n1 + n2) / 2

    val mediaFormatada : (Float) -> String = {String.format("%.2f", it)}
    println("Média dos valores informados: ${mediaFormatada(media)}")
}

fun desafio() {
    print("\nInforme um valor float: ")
    val n1 = readln().toFloat()

    print("Informe outro valor float: ")
    val n2 = readln().toFloat()

    val produto : (Float, Float) -> Float = {a, b -> a * b}

    println("O produto de $n1 e $n2 é ${produto(n1, n2)}")

    print("\nDigite seu nome: ")
    val nome = readln().toString()

    val cumprimenta : (String) -> String = {"Oi, $it"}

    println(cumprimenta(nome))
}