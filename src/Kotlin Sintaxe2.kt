fun main(){
var n1:Int=8
var n2:Int=0
val mil=1000

    println("Digite dois Numeros")
    //n1 = readLine()!!.toInt()
    //n2 = readLine()!!.toInt()

    if (n1>n2){
        println("$n1 é > que $n2")
    }
    else if(n2>n1){
        println("$n2 é > que $n1")
    }
    else if(n2==n1){
        println("$n2 é = a $n1")
    }

    val a:Int?=null // declarando variavel a como inteiro nulo
    var number = a ?:1 // verifica se a é nulo, se não for ele atribui o valor de a, se for nulo ele atribui 1
    println(number)

    val maxValue = if(n1 > n2) n1 else if (n1<n2) n2 else n1 //atribuir valor diretão com if pro maxvalue

    val minValue = if(n1>n2){ //mesma coisa mais usando chaves
        println("$n2 é o menor valor")
        n2
    }
    else if(n1<n2){
        println("$n1 é o menor valor")
        n1
    }else{
        println("os valores são = $n1")
        n2
    }
    when{
        n1>n2 -> {"n1 é maior que n2"}
        n1 != n2 && n1 > mil -> {"n1 é diferente de n2 E n1 é maior que 1000"}
        n2 == 0 -> {"n2 é igual a 0"}
        else ->{"sei la"}
    }
    //val grade = (0..10).random()
    //println(grade.getStudentStatus())
    var t:Int
    var x:Int? = null
    var w:Int? = 10
    t = x?: w?: -1 // o ? serve para saber se é nulo ? esta sempre relacionado a nulo
                   // se x não for null t = x se for null passa, se w não for null então t = w, se for null passa
                   // então t = -1, entretanto w = 10 então t=10
    println(t)
    //var nota:Int? = readLine()!!.toInt()
    var nota:Int? = 8
    var pegaNota:String?
    pegaNota = nota?.getStudentStatus() // pegaNota recebe os status da nota da função(reprovado,bom...)
    println(pegaNota)                   // a função tem println da nota somente.

    //While do While são iguais então não vou fazer exemplos

    //downTo()
    //until()
    //step(2)
    letters()

}
    fun Int.getStudentStatus():String{ //função recebe valor inteiro e retorna String
        println("nota $this")
        return when (this){ //retorna aqui
            in 0..4 -> "Reprovado"
            in 5..7 -> "mediano"
            in 8..9 -> "Bom"
            10 -> "Excelente"
            else -> "Indefinido"
        }
    }

    fun downTo(){
        for(i in 20 downTo 0) {
            println("$i ")
        }
    }
    fun until(){
        for(i in 0  until 20){
            println("$i ")
        }
    }
    fun step(num:Int){
        for(i in 0..20 step num){
            println("$i ")
        }
    }

    fun letters(){
        val sArray = "Olha essa String!"
        sArray.forEach { l -> print(l + " ") } // estou atribuindo cada letra em L
    }