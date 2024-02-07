package test.kotlin

import main.kotlin.Habitacion
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class HabitacionTest {

    @Test
    fun moverDerecha() {
    }

    @Test
    fun existePuertaDerecha() {
        val habitacion = Habitacion(10,10)
        habitacion.moverDerecha()
        habitacion.moverDerecha()
        habitacion.moverDerecha()
        habitacion.moverDerecha()
        habitacion.moverDerecha()
        habitacion.moverDerecha()
        habitacion.moverDerecha()
        habitacion.moverDerecha()
        assertEquals("P",habitacion.miraDerecha())
    }

    @Test
    fun puertaEncntrada() {
        val habitacion = Habitacion(10,10)
        assert(habitacion.encontrarCaminoHastaPuerta())
    }
}