import com.typesafe.scalalogging.slf4j.LazyLogging

object Main extends App with LazyLogging {


  logger.debug("Meh: {}", Seq("meeeh") )
  logger.debug("Meh: {}", "meeeh")


}
