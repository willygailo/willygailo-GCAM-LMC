package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class eem extends mip {
    private final lij a;
    private final lij b;
    private final int c;
    private final fjs d;
    private int g = 0;
    private long h = 0;

    public eem(lce lceVar, lce lceVar2, ddf ddfVar, lap lapVar, fjs fjsVar) {
        this.b = lceVar;
        this.a = lceVar2;
        this.c = ((Integer) ddfVar.a(ddm.x).e(1)).intValue();
        this.d = fjsVar;
        lapVar.c(new lie() { // from class: eel
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                this.a.h();
            }
        });
    }

    @Override // defpackage.mip
    public final void b(lzv lzvVar) {
        Integer num;
        Boolean bool = (Boolean) lzvVar.d(kdd.c);
        if (bool == null || !bool.booleanValue()) {
            h();
        } else {
            if (this.h == 0) {
                this.h = SystemClock.uptimeMillis();
            }
            this.g = 0;
            this.a.fB(true);
        }
        if (kdd.p == null || (num = (Integer) lzvVar.d(kdd.p)) == null) {
            return;
        }
        this.b.fB(Boolean.valueOf(num.intValue() == 2));
    }

    public final void h() {
        if (this.h != 0) {
            this.d.r((int) (SystemClock.uptimeMillis() - this.h));
            this.h = 0L;
        }
        int i = this.g + 1;
        this.g = i;
        if (i == this.c) {
            this.a.fB(false);
        }
    }
}
