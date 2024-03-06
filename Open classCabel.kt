open class OpenClass():Cabel1()
{
    override var type:String = gettype()
    override var jil:Double = 0.0
    override var D: Double = 0.0
    override var P: Boolean = false
    override var Qp:Double = 0.0
    override var width:Int = 0
    override var Q: Double = 0.0



    fun gettype():String
    {
        println("Выберите один из типов кабеля")
        println("1 - ВВГ, 2 - NYM, 3 - ВББШв, 4 - ШВВП, 5 - ПВС")
        var ans = readLine()!!.toInt()
        when(ans)
        {
            1 -> return "ВВГ"
            2 -> return "NYM"
            3 -> return "ВББШв"
            4 -> return "ШВВП"
            5 -> return "ПВС"
            else -> return ""
        }

    }





}