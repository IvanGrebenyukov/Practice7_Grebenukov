import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.*
fun main()
{
    Zadanie40()
}
fun Zadanie40()
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
            print("Введите l: ")
            var l: Double = readLine()!!.toDouble()
            var discriminant: Double = (Math.pow(k, 2.0)) - (4 * b * (-a))
            var x1: Double = ((-k) + Math.sqrt(discriminant)) / (2*a)
            var x2: Double = ((-k) - Math.sqrt(discriminant)) / (2*a)
            var y1: Double = k * x1 + b
            var y2: Double = k * x2 + b
            var df = DecimalFormat("#.#####")
            df.roundingMode = RoundingMode.DOWN
            when
            {
                (x2 < l && y2 < l) && (x1 < l && y1 < l) -> println("Координаты точек пересечения прямой и параболы (${(df.format(x2))} ;" +
                        " ${(df.format(y2))}) и (${(df.format(x1))} ; ${(df.format(y1))}) \n" +
                        "ПОПАДАЮТ В КВАДРАТ СО СТОРОНОЙ $l")
                else ->  println("Координаты точек пересечения прямой и параболы (${(df.format(x2))} ; " +
                        "${(df.format(y2))}) и (${(df.format(x1))} ; ${(df.format(y1))}) " +
                        "\nНЕ ПОПАДАЮТ В КВАДРАТ СО СТОРОНОЙ $l")
            }
            break
        }
        catch (e: Exception)
        {
            println("Вы ввели не число")
        }
    }
}