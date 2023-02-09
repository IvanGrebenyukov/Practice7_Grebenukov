fun main()
{
    Zadanie24()
}
fun Zadanie24()
{
    while (true)
    {
        try
        {
            print("Введите x: ")
            var x: Double = readLine()!!.toDouble()
            print("Введите y: ")
            var y: Double = readLine()!!.toDouble()
            when
            {
                (x > 0) && (y > 0) -> println("Точка с координатами $x и $y находится в 1  координатной четверти")
                (x > 0) && (y < 0) -> println("Точка с координатами $x и $y находится в 4  координатной четверти")
                (x < 0) && (y > 0) -> println("Точка с координатами $x и $y находится в 2  координатной четверти")
                (x < 0) && (y < 0) -> println("Точка с координатами $x и $y находится в 3  координатной четверти")
                else -> println("Точка с координатами $x и $y находится в нулевой точке")

            }
            break
        }
        catch (e: Exception)
        {
            println("Вы ввели не число")
        }
    }
}