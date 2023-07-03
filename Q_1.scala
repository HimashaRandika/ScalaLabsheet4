object ActualAmount {

    def main(args: Array[String]): Unit = {
      print("Enter deposit amount : ")
      val depositAmount = scala.io.StdIn.readDouble()

      print(f"Actual Amount of interest - ${calculateActualAmount(depositAmount)}%.2f")
    }

    def calculateActualAmount(depositAmount: Double): Double = {
      depositAmount match {
        case amount if amount <= 20000 => amount * 0.02
        case amount if amount <= 200000 => amount * 0.04
        case amount if amount <= 2000000 => amount * 0.035
        case amount => amount * 0.065

      }
      }
}

