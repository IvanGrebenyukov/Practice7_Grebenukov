import kotlin.math.*
fun main()
{
    Zadanie7_2()
}
fun Zadanie7_2()
{
    while(true)
    {
        try
        {
            print("Введите x: ")
            val x: Double = readLine()!!.toDouble()
            print("Введите y: ")
            val y: Double = readLine()!!.toDouble()
            print("Введите z: ")
            val z: Double = readLine()!!.toDouble()
            var a: Double = (3 + Math.pow(Math.E, y - 1)) / (1 + Math.pow(x, 2.0) * abs(y - Math.tan(z)))
            println("Ответ = " + String.format("%.4f", a))
            var b: Double = (1 + abs(y - x)) + ((Math.pow(y - x, 2.0) / 2)) + (Math.pow(abs(y - x), 3.0) / 3)
            println("Ответ = " + String.format("%.4f", b))
            break
        }
        catch (e: Exception)
        {
            println("Вы ввели не число")
        }
    }
}