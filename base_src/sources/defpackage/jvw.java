package defpackage;

import android.media.MediaPlayer;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
class jvw extends jvr {
    final /* synthetic */ jvx b;

    public jvw(jvx jvxVar) {
        this.b = jvxVar;
    }

    @Override // defpackage.jvr, defpackage.ihs, defpackage.iht
    public final void f() {
        jvx jvxVar = this.b;
        Uri uri = jvxVar.h;
        if (uri != null) {
            jvxVar.e.setVideoURI(uri);
        }
        this.b.e.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: jvu
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                jvw jvwVar = this.a;
                jvwVar.b.c();
                jvwVar.b.f.a();
            }
        });
        this.b.e.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: jvv
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                jvw jvwVar = this.a;
                mediaPlayer.setLooping(jvwVar.b.k);
                jvx jvxVar2 = jvwVar.b;
                if (jvxVar2.j) {
                    jvxVar2.i();
                } else {
                    jvxVar2.gs();
                }
            }
        });
    }

    @Override // defpackage.jvr
    public void gs() {
        jvx jvxVar = this.b;
        jvxVar.d.a(jvxVar.e.getDuration());
        jvx jvxVar2 = this.b;
        jvxVar2.e.seekTo(jvxVar2.i);
        jvx jvxVar3 = this.b;
        jvxVar3.d.b(jvxVar3.i);
        this.b.f.a();
    }

    @Override // defpackage.jvr
    public void i() {
        jvx jvxVar = this.b;
        jvxVar.d.a(jvxVar.e.getDuration());
        jvx jvxVar2 = this.b;
        jvxVar2.e.seekTo(jvxVar2.i);
        jvx jvxVar3 = this.b;
        jvxVar3.d.b(jvxVar3.i);
        this.b.f.b();
    }
}
