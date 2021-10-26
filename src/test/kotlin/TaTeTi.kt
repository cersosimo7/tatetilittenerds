import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class `Ta Te Ti` {
    @Test
    fun `Se puede iniciar el juego con dos jugadores`() {
        val jugador1 = "jugador-1-test"
        val jugador2 = "jugador-2-test"
        val juego = Juego(jugador1, jugador2)

        juego.empezar()

        assertTrue(juego.estaEmpezado())
    }
}