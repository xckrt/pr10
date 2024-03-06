abstract class Cabel1():Cabel {
    abstract var type:String
    abstract var jil:Double
    abstract var D:Double
    abstract var Qp:Double
    abstract var P:Boolean
    abstract var Q:Double
    abstract var width:Int

    override fun info()
    {
    println("Тип $type.\nКол-во жил $jil.\nДиаметр $D. \nКол-во жил $jil. \nДиаметр сечения $D.\nЗначение Q $ ")
    }
    override fun input()
    {
        println("Введите кол-во жил")
        jil = readLine()!!.toDouble()
        println("Введите диаметр")
        D = readLine()!!.toDouble()
        println("Введите длину")
        width = readLine()!!.toInt()

        Q = D/jil
        P = false
        Qp = 0.0
    }





}