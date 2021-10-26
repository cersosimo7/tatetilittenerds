import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class `Ta Te Ti` {
    @Test
    fun `Se puede iniciar el juego con dos jugadores`() {
        val jugador1 = Jugador(tipoDeFicha = "cruz")
        val jugador2 = Jugador(tipoDeFicha = "circulo")
        val juego = Juego(jugador1, jugador2)

        juego.empezar()

        assertTrue(juego.estaEmpezado())
    }

    @Test
    internal fun `Se asigna una tipo de ficha a cada jugador`() {
        val jugador1 = Jugador(tipoDeFicha = "cruz")
        val jugador2 = Jugador(tipoDeFicha = "circulo")

        // TODO: estamos testeando estado tras construir, tiene sentido?
        assertEquals("cruz", jugador1.tipoDeFicha)
        assertEquals("circulo", jugador2.tipoDeFicha)
    }

    @Test
    internal fun `Un jugador puede jugar en su turno`() {
        val jugador1 = Jugador(tipoDeFicha = "cruz")
        val jugador2 = Jugador(tipoDeFicha = "circulo")
        val juego = Juego(jugador1, jugador2)
        juego.empezar()

        assertTrue(juego.esTurnoDe(jugador1))

        // TODO: cual seria el assert?
        juego.ponerFicha(jugador1.tipoDeFicha)
    }
}