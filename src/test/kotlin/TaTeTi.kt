import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class `Ta Te Ti` {
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
}