fun main()
{
    try
    {
        var a: OpenClass = OpenClass()
        a.input()
        a.info()
        var b: MainClass = MainClass()
        b.input()
        b.info()
    }
    catch(e:Exception)
    {
        println("Некорректно введены данные")
    }
}