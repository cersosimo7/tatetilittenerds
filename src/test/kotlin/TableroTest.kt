import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TableroTest {
    @Test
    fun `Al iniciar el juego el tablero esta vacio`() {
        val tablero = Tablero()

        assertTrue(tablero.estaVacio())
    }

    @Test
    internal fun `Inicialmente una casilla esta vacia`() {
        val tablero = Tablero()

        assertTrue(tablero.laCasillaEstaVacia(1, 1))
    }

    @Test
    internal fun `Se puede agregar una ficha a una casilla`() {
        val tablero = Tablero()
        val ficha = "cruz"
        val fila = 1
        val columna = 1

        tablero.ponerUnaFichaEn(ficha, fila, columna)

        assertFalse(tablero.laCasillaEstaVacia(fila, columna))
    }

    @Test
    internal fun `No se puede agregar una ficha en una casilla ocupada`() {
        val tablero = Tablero()
        val ficha = "cruz"
        val fila = 2
        val columna = 2

        tablero.ponerUnaFichaEn(ficha, fila, columna)

        val exception = assertThrows<RuntimeException> {
            val otraFicha = "circulo"
            tablero.ponerUnaFichaEn(otraFicha, fila, columna)
        }

        assertEquals(Tablero.CASILLA_OCUPADA, exception.message)
    }
}