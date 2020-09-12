package info.sanaebadi.mykuya.util

import android.app.Activity
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import info.sanaebadi.mykuya.R
import info.sanaebadi.mykuya.global.MykuyaApplication

fun ViewGroup.inflate(layoutRes: Int): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, false)
}

fun ImageView.loadUrl(url: String) {
    Glide.with(context).load(url).apply(RequestOptions().error(R.mipmap.ic_launcher)).into(this)
}

fun ImageView.loadCircleImage(url: String) {
    Glide.with(context).load(url).apply(
        RequestOptions.circleCropTransform()
            .error(R.mipmap.ic_launcher_round)
    ).into(this)
}

fun isLollipopOrAbove(func: () -> Unit) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        func()
    }
}

val Activity.placeApplication: MykuyaApplication
    get() = application as MykuyaApplication

val Fragment.placeApplication: MykuyaApplication
    get() = activity?.application as MykuyaApplication