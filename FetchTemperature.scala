import concurrent.ExecutionContext.Implicits.global
import concurrent.Future

def cityTemp(name: String): Double = {
  val url = "http://api.openweathermap.org/data/2.5/weather"
  val cityUrl = s"$url?q=$name"
  val json = io.Source.fromURL(cityUrl).mkString.trim
  val pattern = """.*"temp":([\d.]+).*""".r
  val pattern(temp) = json
  temp.toDouble
}
