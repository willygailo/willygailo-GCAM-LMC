package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fnl implements mcx {
    private final /* synthetic */ int c;
    public static final /* synthetic */ fnl b = new fnl(1);
    public static final /* synthetic */ fnl a = new fnl(0);

    private /* synthetic */ fnl(int i) {
        this.c = i;
    }

    @Override // defpackage.mcx
    public final long a() {
        switch (this.c) {
            case 0:
                return 0L;
            default:
                return SystemClock.elapsedRealtimeNanos();
        }
    }
}
