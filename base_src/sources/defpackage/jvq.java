package defpackage;

import android.widget.VideoView;

/* JADX INFO: loaded from: classes2.dex */
public final class jvq {
    public final jvy a;
    public final VideoView b;
    public final Runnable c;
    public boolean d;

    public jvq(jvy jvyVar) {
        jvyVar.getClass();
        this.a = jvyVar;
        VideoView videoView = ((jwd) jvyVar).f;
        videoView.getClass();
        this.b = videoView;
        this.d = false;
        this.c = new jvp(this);
    }
}
