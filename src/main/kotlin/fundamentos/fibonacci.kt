package fundamentos

 fun fibonacci (termo: Int = 0){
     var termo1 = 0
     var termo2 = 1
     var fib = 0
     var index = 0

     while (index < termo ){
         fib = termo1 + termo2
         println(fib)
         termo1 = termo2
         termo2 = fib
         index++
     }
 }
