const val op:Int = 5
 fun main(){

     var n1:Double? = 2.0
     var n2:Double? = 10.0

     print("O resultado da operação é: "+calculadora(n1,n2,op))
 }

 private fun calculadora (n1:Double?, n2:Double?, operacao:Int):String{
    if((n1==null) || (n2==null)){
     return "nulo! "
    }
    else{
        return when (operacao){
            1 -> "${n1+n2}"
            2 -> "${n1-n2}"
            3 -> "${n1/n2}"
            4 -> "${n1*n2}"
            5 -> "${n1*(n2/100)}"
            else -> "Operação Invalida!"
        }
    }
 }