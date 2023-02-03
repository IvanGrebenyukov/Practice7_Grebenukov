fun main()
{
    Zadanie14()
}
fun Zadanie14()
{   while(true)
    {
        try
        {
            print("Введите x: ")
            var x: Double = readLine()!!.toDouble()
            print("Введите y: ")
            var y: Double = readLine()!!.toDouble()
            print("Введите m: ")
            var m: Double = readLine()!!.toDouble()
            print("Введите n: ")
            var n: Double = readLine()!!.toDouble()
            var result1: Double = x - y
            var result2: Double = m % n
            when
            {
                (result1 < result2) ->
                {
                    x++
                    println("x - y < m % n -> x = $x")
                }
                else -> println("x - y > m % n -> x = $x")
            }

            break

        }
        catch (e: Exception)
        {
            println("Вы ввели не число")
        }
    }
}