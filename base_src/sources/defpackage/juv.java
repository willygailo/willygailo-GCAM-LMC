package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.videoplayer.VideoPlayerActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class juv extends BroadcastReceiver {
    final /* synthetic */ VideoPlayerActivity a;

    public juv(VideoPlayerActivity videoPlayerActivity) {
        this.a = videoPlayerActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.finish();
    }
}
