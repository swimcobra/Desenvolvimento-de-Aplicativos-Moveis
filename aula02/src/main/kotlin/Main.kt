fun main() {
    // mensagem(); // Ponto e vírgula não é necessário
    ex20()
}

fun mensagem() {
    println("Hello World!")
}

fun ex01() {

    // Média das notas

    print("Informe a primeira nota: ")
    val n1 = readln().toFloat()

    print("Informe a primeira nota: ")
    val n2 = readln().toFloat()

    print("Informe a primeira nota: ")
    val n3 = readln().toFloat()

    val media = (n1 + n2 + n3) / 3

    println("Média: %.2f".format(media))

    if(media >= 7) {
        println("Aprovado!")
        return
    }

    println("Reprovado!")
}

fun ex03() {

    // Contagem regressiva

    var cont = 10

    // Abordagem com o While tradicional
    println("Abordagem com o While")
    while(cont > 0) {
        println(cont)
        cont--
    }

    // Abordagem com o For do kotlin
    println("\nAbordagem com o For do Kotlin")
    for (i in 10 downTo 1) {
        println(i)
    }
}

fun ex04() {

    // Soma dos valores entre 1 e 100

    var soma = 0;
    for(cont in 1..100) {
        soma += cont
    }

    println("Soma dos valores entre 1 e 100: $soma")
}

fun ex05() {

    // Tabuada

    print("Informe o número que deseja obter a tabuada: ")
    val numero = readln().toInt()
    for(i in 1..10) {
        println("$numero X $i \t= ${i * numero}")
    }

}

fun ex06() {

    // Fatorial

    print("Informe o valor que deseja calcular o fatorial: ")
    val valor = readln().toInt()
    var fatorial = 1L // long int
    for (cont in 1..valor) {
        fatorial *= cont
    }

    println("Fatorial de $valor = $fatorial")
}

fun ex07() {

    // Contagem de vogais

    print("Digite uma palavra: ")
    val texto = readln().lowercase() // Transformar texto digitado em minusculo
    val vogais = "aeiou"
    var cont = 0 // Inicialmente não temos nenhuma vogal identificada

    for(letra in texto) {
        // Verificar se a letra atual da string "texto" está contida dentro das vogais
        if(letra in vogais) {
            cont++
        }
    }

    println("Quantidade de vogais: $cont")

}

fun ex12() {

    // Conversor de Notas

    print("Informe a nota do aluno: ")
    val nota = readln().toFloat()
    val conceito = when {

        nota >= 9 -> "A"
        nota >= 8 -> "B"
        nota >= 7 -> "C"
        nota >= 6 -> "D"
        nota >= 5 -> "E"
        else -> "F"
    }

    println("Conceito do aluno: $conceito")

}

fun ex14() {

    // Pedra Papel Tesoura

    print("Player 1: digite 'pedra', 'papel' ou 'tesoura': ")
    val p1 = readln().lowercase()
    print("Player 2: digite 'pedra', 'papel' ou 'tesoura': ")
    val p2 = readln().lowercase()

    val resultado = when {
        p1 == p2 -> "Empate!"
        (p1 == "pedra" && p2 == "tesoura") ||
        (p1 == "tesoura" && p2 == "papel") ||
        (p1 == "papel" && p2 == "pedra") -> "Player 1 venceu!"
        else -> "Player 2 venceu!"
    }

    println("Resultado: $resultado")
}

fun ex20() {

    // Soma dos quadrados

    print("Informe um valor inteiro maior que 1: ")
    var valor = readln().toInt()

    while (valor <= 1) {
        println("Erro: Valor precisa ser maior que 1")
        print("Informe novamente o valor: ")
        valor = readln().toInt()
    }

    var somaQuadrados = 0

    for(i in 1..valor) {
        somaQuadrados += i * i
    }

    println("A soma dos quadrados de 1 até $valor é $somaQuadrados")
}