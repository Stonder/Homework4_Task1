import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionCalculationMastercard() {
        val card = "Mastercard"
        val previousAmount = 25000_00
        val moneyTransfer = 4000_00

        val result = commissionCalculation(
            card = card,
            previousAmount = previousAmount,
            moneyTransfer = moneyTransfer
        )

        assertEquals(0, result)
    }

    @Test
    fun commissionCalculationMaestro() {
        val card = "Maestro"
        val previousAmount = 76000_00
        val moneyTransfer = 4000_00

        val result = commissionCalculation(
            card = card,
            previousAmount = previousAmount,
            moneyTransfer = moneyTransfer
        )

        assertEquals(44_00, result)
    }

    @Test
    fun commissionCalculationVisa() {
        val card = "Visa"
        val previousAmount = 1000000_00
        val moneyTransfer = 30_00

        val result = commissionCalculation(
            card = card,
            previousAmount = previousAmount,
            moneyTransfer = moneyTransfer
        )

        assertEquals(35_00, result)
    }

    @Test
    fun commissionCalculationMir() {
        val card = "Мир"
        val previousAmount = 0
        val moneyTransfer = 10000_00

        val result = commissionCalculation(
            card = card,
            previousAmount = previousAmount,
            moneyTransfer = moneyTransfer
        )

        assertEquals(75_00, result)
    }

}