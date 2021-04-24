case class Processor() {
  def process(x: Int): Int = x * x
}

def operation(x: Int)(implicit processor: Processor): Int = processor.process(x)

implicit val p: Processor = Processor()

operation(5)

operation(5)
operation(5)
operation(5)
operation(5)
operation(5)
