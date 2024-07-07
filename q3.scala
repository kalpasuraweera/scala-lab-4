@main def main():Unit = 
    println(formatNames("Benny", toUpper))
    println(formatNames("N",toUpper)+formatNames("iroshan", toLower))
    println(formatNames("Saman", toLower))
    println(formatNames("Kumar", toLower) + formatNames("a", toUpper))
    

def toUpper(text:String):String = text.toUpperCase()
def toLower(text:String):String = text.toLowerCase()

def formatNames(name:String, convert:String=>String):String = convert(name)