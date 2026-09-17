package defpackage;

import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public final class emt implements pys {
    private final qkg a;

    public emt(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AudioManager get() {
        AudioManager audioManager = (AudioManager) ((emr) this.a.get()).a(emr.c);
        qmd.ae(audioManager);
        return audioManager;
    }
}
