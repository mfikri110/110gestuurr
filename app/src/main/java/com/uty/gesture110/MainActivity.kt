package com.uty.gesture110

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Build
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.annotation.RequiresApi
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.view.MotionEventCompat as MotionEventCompact1

@RequiresApi(Build.VERSION_CODES.M)
class MainActivity : AppCompatActivity(),GestureDetector.OnContextClickListener,GestureDetector.OnDoubleTapListener,
    GestureDetector.OnGestureListener {
    override fun onContextClick(e: MotionEvent?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    var gDetector:GestureDetectorCompat?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.gDetector=GestureDetectorCompat(this,this)
        gDetector?.setOnDoubleTapListener(this)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        this.gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }
    override fun onDown(event: MotionEvent): Boolean{
        gesture_status.text="onDown"
        return true
    }
    override fun onFling(event1: MotionEvent, event2: MotionEvent, velocityX: Float, velocityY:Float):Boolean{
        gesture_status.text="OnFling"
        return true
    }

    override fun onLongPress(event: MotionEvent){
        gesture_status.text="onLongPress"
    }
    override fun onScroll(el:MotionEvent,e2:MotionEvent,distanceX:Float,distanceY: Float):Boolean{
        gesture_status.text="onScroll"
        return true
    }
    override fun onShowPress(event: MotionEvent){
        gesture_status.text="onShowPress"
    }
    override fun onSingleTapUp(event: MotionEvent): Boolean {
        gesture_status.text="onSingleTapUp"
        return true
    }

    override fun onDoubleTap(e: MotionEvent?): Boolean {
        gesture_status.text="onDoubletap"
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
        gesture_status.text="onDoubleTapEvent"
        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
        gesture_status.text="onSingletapconfirmed"
        return true
    }
}

