package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class ele {
    public Object b;
    public Object c;
    private final Object d;
    public float a = 0.0f;
    private int f = 4;
    private long e = SystemClock.elapsedRealtime();

    public ele(Object obj) {
        this.d = obj;
        this.b = obj;
        this.c = obj;
    }

    public final void a() {
        this.a = 0.0f;
        this.f = 4;
        Object obj = this.d;
        this.b = obj;
        this.c = obj;
        this.e = SystemClock.elapsedRealtime();
    }

    public final void b() {
        String str;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.e;
        this.e = jElapsedRealtime;
        int i = this.f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                float f = this.a + (j / 200.0f);
                this.a = f;
                if (f >= 1.0f) {
                    this.a = 1.0f;
                    if (this.c != this.b) {
                        this.f = 3;
                        return;
                    } else {
                        this.f = 2;
                        return;
                    }
                }
                return;
            case 1:
                if (this.c != this.b) {
                    this.f = 3;
                    return;
                }
                return;
            case 2:
                float f2 = this.a - (j / 200.0f);
                this.a = f2;
                Object obj = this.c;
                if (obj == this.b) {
                    this.f = 1;
                    return;
                } else {
                    if (f2 <= 0.0f) {
                        this.a = 0.0f;
                        this.f = 4;
                        this.b = obj;
                        return;
                    }
                    return;
                }
            case 3:
                Object obj2 = this.c;
                if (obj2 != this.d) {
                    this.b = obj2;
                    this.f = 1;
                    float f3 = this.a + (j / 200.0f);
                    this.a = f3;
                    if (f3 >= 1.0f) {
                        this.a = 1.0f;
                        return;
                    }
                    return;
                }
                return;
            default:
                switch (i) {
                    case 1:
                        str = "FADING_IN";
                        break;
                    case 2:
                        str = "FADED_IN";
                        break;
                    case 3:
                        str = "FADING_OUT";
                        break;
                    default:
                        str = "FADED_OUT";
                        break;
                }
                StringBuilder sb = new StringBuilder(str.length() + 21);
                sb.append("Unhandled FadeState: ");
                sb.append(str);
                throw new RuntimeException(sb.toString());
        }
    }
}
