class MainClass():OpenClass()
{
    override var type:String = ""
    override var jil: Double = 0.0
    override var D:Double = 0.0
    override var P:Boolean = nalicieopletki()
    override var Qp = SearchQp()
    override var width = 0
    override var Q = D/jil
     fun nalicieopletki(): Boolean
    {
        println("Есть ли у кабеля оплетка")
        var ans = readLine()!!.toInt()
        return if (ans == 1)
        {
            true
        }
        else
        {
            false
        }
    }
    fun SearchQp(): Double
    {
        if(P)
        {
            return 2*Q
        }
        else
            return 0.7*Q
    }
}