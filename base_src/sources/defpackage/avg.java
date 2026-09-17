package defpackage;

import android.hardware.Camera;

/* JADX INFO: loaded from: classes.dex */
final class avg {
    public final Camera.ShutterCallback a;
    public final Camera.PictureCallback b;
    public final Camera.PictureCallback c;
    public final Camera.PictureCallback d;

    public avg(Camera.ShutterCallback shutterCallback, Camera.PictureCallback pictureCallback, Camera.PictureCallback pictureCallback2, Camera.PictureCallback pictureCallback3) {
        this.a = shutterCallback;
        this.b = pictureCallback;
        this.c = pictureCallback2;
        this.d = pictureCallback3;
    }
}
