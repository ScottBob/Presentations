object ValidationResult extends Enumeration {
  type ValidationResult = Value
  val Valid, Invalid = Value
}

import ValidationResult._

def validate(arg: Double): ValidationResult = {
  if (arg == 0) ValidationResult.Invalid
  else ValidationResult.Valid
}

def div(x: Double, y: Double): Double = {
  validate(y) match {
    case Invalid => Double.NaN
    case Valid => x / y
  }
}

div(1.0, 2.0)

div(1.0, 0.0)
