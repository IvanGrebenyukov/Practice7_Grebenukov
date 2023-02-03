import kotlin.math.*
fun main()
{
    Zadanie4()
}
fun Zadanie4()
{
    while(true)
    {
        try
        {
            print("Введите a: ")
            val a: Double = readLine()!!.toDouble()
            print("Введите b: ")
            val b: Double = readLine()!!.toDouble()
            print("Введите c: ")
            val c: Double = readLine()!!.toDouble()
            var max: Double = Double.MIN_VALUE;
            when
            {
                (a >= b && a >= c) ->  max = a
                (b >= a && b >= c) -> max = b
                else -> max = c
            }
            var min: Double = Double.MAX_VALUE;
            when
            {
                (a <= b && a <= c) -> min = a
                (b <= a && b <= c) -> min = b
                else -> min = c
            }
            var p: Double = (max + min) / 2
            println("Ответ = $p")
            break
        }
        catch(e: Exception)
        {
            println("Вы ввели не число")
        }
    }
}