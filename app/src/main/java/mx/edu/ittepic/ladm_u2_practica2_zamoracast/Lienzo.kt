package mx.edu.ittepic.ladm_u2_practica2_zamoracast

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.media.MediaPlayer
import android.view.MotionEvent
import android.view.View

class Lienzo(p: MainActivity) : View(p) {

    var puntero = p
    var nrr = Math.random() + 8 * 5
    var circulo1 = FiguraGeometrica(900, 300, nrr.toInt() + 35)
    var circulo2 = FiguraGeometrica(200, 300, nrr.toInt() + 35)
    var circulo3 = FiguraGeometrica(100, 1950, nrr.toInt() + 35)
    var circulo4 = FiguraGeometrica(800, 1950, nrr.toInt() + 35)
    var circulo5 = FiguraGeometrica(1000, 1950, nrr.toInt() + 35)

    var circulo6 = FiguraGeometrica(600, 100, nrr.toInt() + 70)
    var circulo7 = FiguraGeometrica(100, 1500, nrr.toInt() + 70)
    var circulo8 = FiguraGeometrica(800, 1500, nrr.toInt() + 70)
    var circulo9 = FiguraGeometrica(800, 500, nrr.toInt() + 70)
    var circulo10 = FiguraGeometrica(700, 1000, nrr.toInt() + 70)

    var circulo11 = FiguraGeometrica(500, 1300, nrr.toInt() + 100)
    var circulo12 = FiguraGeometrica(100, 900, nrr.toInt() + 100)
    var circulo13 = FiguraGeometrica(500, 100, nrr.toInt() + 100)
    var circulo14 = FiguraGeometrica(500, 1950, nrr.toInt() + 100)
    var circulo15 = FiguraGeometrica(900, 500, nrr.toInt() + 100)

    var circulo16 = FiguraGeometrica(300, 300, nrr.toInt() + 135)
    var circulo17 = FiguraGeometrica(800, 100, nrr.toInt() + 135)
    var circulo18 = FiguraGeometrica(800, 800, nrr.toInt() + 135)
    var circulo19 = FiguraGeometrica(100, 900, nrr.toInt() + 135)
    var circulo20 = FiguraGeometrica(500, 1100, nrr.toInt() + 135)



    var punteroFiguraGeometrica: FiguraGeometrica? = null

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.rgb(135, 206, 235))

        //Dibujando un círculo rojo con contorno blanco
        paint.color = Color.RED
        paint.style = Paint.Style.FILL
        circulo1.pintar(canvas, paint)
        circulo2.pintar(canvas, paint)
        circulo3.pintar(canvas, paint)
        circulo4.pintar(canvas, paint)
        circulo5.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 15f
        circulo1.pintar(canvas, paint)
        circulo2.pintar(canvas, paint)
        circulo3.pintar(canvas, paint)
        circulo4.pintar(canvas, paint)
        circulo5.pintar(canvas, paint)
        //Dibujando un círculo AZUL rojo con contorno ROJO
        paint.color = Color.BLUE
        paint.style = Paint.Style.FILL
        circulo6.pintar(canvas, paint)
        circulo7.pintar(canvas, paint)
        circulo8.pintar(canvas, paint)
        circulo9.pintar(canvas, paint)
        circulo10.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.RED
        paint.strokeWidth = 15f
        circulo6.pintar(canvas, paint)
        circulo7.pintar(canvas, paint)
        circulo8.pintar(canvas, paint)
        circulo9.pintar(canvas, paint)
        circulo10.pintar(canvas, paint)

        //Dibujando un círculo VERDE Contorno AMARILLO
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        circulo11.pintar(canvas, paint)
        circulo12.pintar(canvas, paint)
        circulo13.pintar(canvas, paint)
        circulo14.pintar(canvas, paint)
        circulo15.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.YELLOW
        paint.strokeWidth = 15f
        circulo11.pintar(canvas, paint)
        circulo12.pintar(canvas, paint)
        circulo13.pintar(canvas, paint)
        circulo14.pintar(canvas, paint)
        circulo15.pintar(canvas, paint)
        //Dibujando un círculo DKGRAY Contorno LTGRAY
        paint.style = Paint.Style.FILL
        paint.color = Color.DKGRAY
        circulo16.pintar(canvas, paint)
        circulo17.pintar(canvas, paint)
        circulo18.pintar(canvas, paint)
        circulo19.pintar(canvas, paint)
        circulo20.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.LTGRAY
        paint.strokeWidth = 15f
        circulo16.pintar(canvas, paint)
        circulo17.pintar(canvas, paint)
        circulo18.pintar(canvas, paint)
        circulo19.pintar(canvas, paint)
        circulo20.pintar(canvas, paint)
    }

    fun animarCirculo() {
        circulo1.reboteC(width, height)
        circulo2.reboteC(width, height)
        circulo3.reboteC(width, height)
        circulo4.reboteC(width, height)
        circulo5.reboteC(width, height)

        circulo6.reboteM(width, height)
        circulo7.reboteM(width, height)
        circulo8.reboteM(width, height)
        circulo9.reboteM(width, height)
        circulo10.reboteM(width, height)

        circulo11.reboteG(width, height)
        circulo12.reboteG(width, height)
        circulo13.reboteG(width, height)
        circulo14.reboteG(width, height)
        circulo15.reboteG(width, height)

        circulo16.reboteMG(width, height)
        circulo17.reboteMG(width, height)
        circulo18.reboteMG(width, height)
        circulo19.reboteMG(width, height)
        circulo20.reboteMG(width, height)
        invalidate()
    }
}