package qiuxiang.android_window

import android.content.Intent

class AndroidWindowApi(private val window: AndroidWindow) : Pigeon.AndroidWindowApi {
    override fun resize(width: Long, height: Long) {
        window.setLayout(width.toInt(), height.toInt())
    }

    override fun setPosition(x: Long, y: Long) {
        window.setPosition(x.toInt(), y.toInt())
    }

    override fun dragStart() {
        window.dragStart()
    }

    override fun dragEnd() {
        window.dragEnd()
    }

    override fun close() {
        window.service.stopSelf()
    }

    override fun launchApp() {
        window.app?.activity?.let {
            val intent = Intent(window.service, it.javaClass)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            window.service.startActivity(intent)
        }
    }

    override fun position(): MutableMap<Any, Any> {
        return window.position()
    }

    override fun post(data: MutableMap<Any, Any>?, result: Pigeon.Result<MutableMap<Any, Any>>?) {
        window.app?.mainMessenger?.let {
            Pigeon.MainHandler(it).handler(data) { response -> result?.success(response) }
        }
    }
}