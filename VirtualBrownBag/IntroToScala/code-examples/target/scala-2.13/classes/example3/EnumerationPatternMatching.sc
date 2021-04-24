trait ValidationResult
case object Valid extends ValidationResult
case object Invalid extends ValidationResult

def validate(arg: Double): ValidationResult = {
  if (arg == 0.0) Invalid
  else Valid
}

def div(x: Double, y: Double): Double = {
  validate(y) match {
    case Invalid => Double.NaN
    case Valid => x / y
  }
}

div(1.0, 2.0)

div(1.0, 0.0)
