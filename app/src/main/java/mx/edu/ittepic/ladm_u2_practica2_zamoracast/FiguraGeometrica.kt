package mx.edu.ittepic.ladm_u2_practica2_zamoracast

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.view.MotionEvent

class FiguraGeometrica() {
    var x = 0f
    var y = 0f
    var tipo = 1
    var radio = 0f
    var ancho = 0f
    var alto = 0f

    var incXC = -20
    var incYC = 20

    var incXM = 10
    var incYM = -10

    var incXG = -5
    var incYG = 5

    var incXMG = 2
    var incYMG = -2


    constructor(x: Int, y: Int, radio: Int) : this() {
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
        ancho = this.radio * 2
        alto = ancho
    }


    fun pintar(c: Canvas, p: Paint) {
        when (tipo) {
            1 -> {
                c.drawCircle(x + radio, y + radio, radio, p)
            }

        }
    }


    fun reboteC(ancho: Int, alto: Int) {

        x += incXC
        if (x <= -100 || x >= ancho) {
            incXC *= -1
        }
        y += incYC
        if (y <= -100 || y >= alto) {
            incYC *= -1
        }
    }

    fun reboteM(ancho: Int, alto: Int) {
        x += incXM
        if (x <= -100 || x >= ancho) {
            incXM *= -1
        }
        y += incYM
        if (y <= -100 || y >= alto) {
            incYM *= -1
        }
    }

    fun reboteG(ancho: Int, alto: Int) {
        x += incXG
        if (x <= -100 || x >= ancho) {
            incXG *= -1
        }
        y += incYG
        if (y <= -100 || y >= alto) {
            incYG *= -1
        }
    }

    fun reboteMG(ancho: Int, alto: Int) {
        x += incXMG
        if (x <= -100 || x >= ancho) {
            incXMG *= -1
        }
        y += incYMG
        if (y <= -100 || y >= alto) {
            incYMG *= -1
        }
    }
}