package defpackage;

import android.media.SoundPool;

/* JADX INFO: loaded from: classes2.dex */
final class ifv implements phh {
    final /* synthetic */ int a;
    final /* synthetic */ int[] b;
    final /* synthetic */ float c;
    final /* synthetic */ ifx d;

    public ifv(ifx ifxVar, int i, int[] iArr, float f) {
        this.d = ifxVar;
        this.a = i;
        this.b = iArr;
        this.c = f;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        ((oug) ((oug) ifx.a.b()).G(2877)).t("Sound resource %d failed to load: %s", this.a, th);
        this.d.g(this.a);
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ifw ifwVar;
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            ((oug) ((oug) ifx.a.b()).G(2878)).p("Sound resource %d failed to load.", this.a);
            this.d.g(this.a);
            return;
        }
        synchronized (this.d.b) {
            ifx ifxVar = this.d;
            if (!ifxVar.d && (ifwVar = (ifw) ifxVar.c.get(this.a)) != null) {
                int[] iArr = this.b;
                SoundPool soundPoolF = this.d.f();
                int i = ifwVar.b;
                float f = this.c;
                iArr[0] = soundPoolF.play(i, f, f, 0, 0, 1.0f);
                this.d.e.add(Integer.valueOf(this.b[0]));
            }
        }
    }
}
