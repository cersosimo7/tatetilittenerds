import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.RuntimeException
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class `Ta Te Ti` {
  @Test
  fun `Al iniciar el juego el tablero esta vacio`() {
    val tablero = Tablero()

    assertTrue(tablero.estaVacio())
  }

  @Test
  fun `Se puede iniciar el juego con dos jugadores`(){
    val jugador1 = "jugador-1-test"
    val jugador2 = "jugador-2-test"
    val juego = Juego(jugador1, jugador2)

    juego.empezar()

    assertTrue(juego.estaEmpezado())
  }

  @Test
  fun `No se puede iniciar el juego con un jugador`(){
    val jugador1 = "jugador-1-test"

    val exception= assertThrows<RuntimeException> {
      Juego(jugador1)
    }

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