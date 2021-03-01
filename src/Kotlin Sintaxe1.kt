const val maximo=68 // só permite fora da função, e só é aplicada durante a compilação
const val MORE = 1
fun main() {
    //val e var é aplicados durante a execução

    val maximoVal=68//tipo imutavel
    var tDouble:Double = 22.3 //tipo mutavel double

    var tInt:Int? = 9
    var tString = "aoba"
    tDouble=22.89

    var a:Double=5.1
    var b:Double=5.0
    var soma:Double=0.0

    var var_ola = "Ola"
    var var_mundo = "mundo"
    soma = a+b //ou soma = a.plus(b)
    //a.times(b) da pra escrever funcão msm pra somar, dividir etc


    println(soma)
    println(tString )
    println(tDouble)
    println(tInt)
    println(maximo)
    println(maximoVal)
    println(a>b) //= pode ser equal

    println(a.compareTo(b))
    println(a.compareTo(b)==MORE)


    val bingo = listOf(8,4,6,32,12)
    var nSorteado = 4

    println(nSorteado in bingo) // operador in
    val MIN_AGE = 16
    val MAX_AGE = 68
    var age = (10..100).random() //.. é range, ele te tudo que tem no ENTRE(faixa de valores)
    println(age)
    if(age in MIN_AGE..MAX_AGE){ // (age>=MIN_AGE && age <=MAX_AGE)
        println("permitido")
    }
    println("${var_ola}, ${var_mundo.capitalize()}!") // capitalize deixa a primeira letra maiuscula
    println(var_ola.plus(var_mundo)) //var_ola+var_mundo
    println("Ola, $var_mundo!")
    var formatacao ="teste aa"

    println(formatacao.capitalize())
    println(formatacao.toUpperCase())
    formatacao = formatacao.toUpperCase()
    println(formatacao.toLowerCase())
    formatacao = formatacao.toLowerCase()
    formatacao = formatacao.capitalize()
    println(formatacao.decapitalize())
    println(formatacao.trimEnd())
    val blank = "  "
    val empty = ""
    println(blank.isBlank())
    println(empty.isEmpty())
    
}