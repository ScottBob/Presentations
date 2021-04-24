package example1

import org.slf4j.LoggerFactory

class LanguageFundamentals {
  private lazy val log = LoggerFactory.getLogger(getClass)

  def addNumbers(x: Int, y: Int): Int = {
    val result = x + y
    result // keyword return is not needed as semicolon at the end of the lines
  }

  def executeOperation(x: Int, y: Int, operation: (Int, Int) => String): String = {
    operation(x, y) // short version of operation.apply(x, y)
  }

  def runExecuteOperation(): Unit = {
    log.info(executeOperation(2, 3, (x, y) => (x * y).toString))
  }
}
