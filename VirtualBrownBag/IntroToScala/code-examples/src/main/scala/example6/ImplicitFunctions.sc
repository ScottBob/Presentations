type SqrProcessor = Int => Int

def operation(x: Int)(implicit processor: SqrProcessor): Int = processor(x)

implicit val p: SqrProcessor = x => x * x

operation(5)
