
import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.*
fun main()
{
    Zadanie34()
}
fun Zadanie34()
{
    while(true)
    {
        try
        {
            print("Введите k: ")
            var k: Double = readLine()!!.toDouble()
            print("Введите b: ")
            var b: Double = readLine()!!.toDouble()
            print("Введите a: ")
            var a: Double = readLine()!!.toDouble()
            var discriminant: Double = (Math.pow(b, 2.0)) - (4 * k * (-a))
            var x1: Double = ((-b) + Math.sqrt(discriminant)) / (2*k)
            var x2: Double = ((-b) - Math.sqrt(discriminant)) / (2*k)
            var y1: Double = k * x1 + b
            var y2: Double = k * x2 + b
            var df = DecimalFormat("#.#####")
            df.roundingMode = RoundingMode.DOWN
            println("Координаты точек пересечения прямой и параболы = (${(df.format(x2))} ; ${(df.format(y2))}) и (${(df.format(x1))} ; ${(df.format(y1))})")
            break
        }
        catch (e: Exception)
        {
            println("Вы ввели не число")
        }
    }
}