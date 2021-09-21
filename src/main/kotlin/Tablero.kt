class Tablero {
  private val casillas = arrayOf(
    arrayOf("nada", "nada", "nada"),
    arrayOf("nada", "nada", "nada"),
    arrayOf("nada", "nada", "nada")
  )

  fun estaVacio(): Boolean {
    return true
  }

  fun laCasillaEstaVacia(fila: Int, columna: Int): Boolean {
    return casillas[fila][columna] === "nada"
  }

  fun ponerUnaFichaEn(ficha: String, fila: Int, columna: Int) {
    casillas[fila][columna] = ficha
  }
}
