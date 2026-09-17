package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class hls {
    public hls() {
    }

    public hls(ddf ddfVar) {
        ddi ddiVar = ddl.a;
        ddfVar.b();
    }

    public static void a() {
        lil.a(hls.class);
    }

    public static final float b(hkn hknVar, Collection collection) {
        Iterator it = collection.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            hkn hknVar2 = (hkn) it.next();
            if (hknVar != hknVar2) {
                long jAbs = Math.abs(TimeUnit.MILLISECONDS.convert(hknVar.a - hknVar2.a, TimeUnit.NANOSECONDS));
                if (jAbs < j) {
                    j = jAbs;
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            return 0.0f;
        }
        return j;
    }

    public static int c(int i) {
        return i - 1;
    }

    public static int d(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 2;
        }
    }

    public static int e(int i) {
        return i - 1;
    }

    public static int f(int i) {
        return i - 1;
    }

    public static int g(int i) {
        return i - 1;
    }

    public static int h(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown aspect ratio ");
                sb.append(i);
                throw new RuntimeException(sb.toString());
        }
    }

    public static void i(hsa hsaVar) {
        hsaVar.S(null);
    }

    public static void j() {
        throw new UnsupportedOperationException("Only used by Burst and Photosphere sessions");
    }

    @Deprecated
    public static pht k() {
        throw new UnsupportedOperationException("Not supported for CaptureSessions unless overridden");
    }

    public static void l(UUID uuid, boolean z, String str, boolean z2, ast astVar) {
        try {
            asv.a.c("http://ns.google.com/photos/1.0/creations/", "GCreations");
            asv.a.c("http://ns.google.com/photos/1.0/camera/", "GCamera");
            astVar.c("http://ns.google.com/photos/1.0/creations/", "CameraBurstID", uuid.toString());
            astVar.c("http://ns.google.com/photos/1.0/camera/", "BurstID", uuid.toString());
            if (z) {
                astVar.c("http://ns.google.com/photos/1.0/camera/", "BurstPrimary", "1");
            }
            if (z2) {
                String[] strArr = mcy.b;
                for (int i = 0; i < 2; i++) {
                    astVar.g("DisableAutoCreation", new atx(512), strArr[i], new atx());
                }
            }
            if (dxh.NONE.c().equals(str)) {
                return;
            }
            mde.k(astVar, str);
        } catch (ass e) {
            throw new RuntimeException(e);
        }
    }
}
