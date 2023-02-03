import kotlin.math.*
fun main()
{
    Zadanie3()
}
fun Zadanie3()
{
    while (true)
    {
        try
        {
            println("Введите число")
            var number: Double = readLine()!!.toDouble()
            println("Введите знаменатель")
            var multiply: Double = readLine()!!.toDouble()
            println("Введите номер от которого начинается прогрессия")
            var k: Double = readLine()!!.toDouble()
            while(true)
            {
                if(k > 0)
                    break
                else{
                    println("Введите число больше 0")
                    k = readLine()!!.toDouble()
                }
            }
            println("Введите номер на котором заканчивается прогрессия")
            var p: Double = readLine()!!.toDouble()
            while(true)
            {
                if(p > k)
                    break
                else
                {
                    println("Введите число больше k")
                    p = readLine()!!.toDouble()
                }
            }
            var n = p - k + 1
            var sum: Double = number * (Math.pow(multiply, n) - 1) / (multiply - 1)
            println("Сумма членов = $sum")
            break
        }
        catch (e: Exception)
        {
            println("Вы ввели не число")
        }
    }
}