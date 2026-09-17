package defpackage;

import android.media.MediaFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class lfg implements Comparable {
    private final int f;
    public boolean a = false;
    public volatile boolean b = false;
    private int e = -1;
    public boolean c = true;
    public MediaFormat d = null;

    public lfg(int i) {
        this.f = i;
    }

    public final int a() {
        if (this.a) {
            return this.e;
        }
        throw new IllegalStateException("Track is not yet added");
    }

    public final void b() {
        this.c = false;
    }

    public final void c(int i) {
        if (this.f == 3) {
            throw new IllegalStateException("This track is forbidden.");
        }
        this.e = i;
        this.a = true;
        this.b = false;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return a() - ((lfg) obj).a();
    }

    public final boolean d() {
        return this.f == 3;
    }

    public final boolean e() {
        switch (this.f - 1) {
            case 0:
                return this.a;
            case 1:
                return this.b || this.a;
            default:
                return true;
        }
    }
}
