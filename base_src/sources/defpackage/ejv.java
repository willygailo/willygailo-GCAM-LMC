package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ejv {
    public static final ouj a = ouj.h("com/google/android/apps/camera/imax/cyclops/audio/AudioRecorder");
    public final ejw b;
    private final ekr c;

    public ejv(ekr ekrVar, ejw ejwVar) {
        this.c = ekrVar;
        this.b = ejwVar;
    }

    public final void a() {
        this.c.a();
        ejw ejwVar = this.b;
        ejwVar.b = false;
        try {
            ejwVar.join(1000L);
        } catch (InterruptedException e) {
            ((oug) ((oug) ((oug) ejw.a.b()).h(e)).G((char) 1214)).r("%s", e.getMessage());
        }
    }
}
