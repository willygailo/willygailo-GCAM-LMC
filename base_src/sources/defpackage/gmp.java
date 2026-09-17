package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gmp implements gmm {
    public final Object a = new Object();
    public final Map b = new HashMap();
    public final gmr c;

    public gmp(gmr gmrVar) {
        this.c = gmrVar;
    }

    private final gmo f(long j) {
        synchronized (this.a) {
            Map map = this.b;
            Long lValueOf = Long.valueOf(j);
            if (!map.containsKey(lValueOf)) {
                return new gmo();
            }
            gmo gmoVar = (gmo) this.b.get(lValueOf);
            gmoVar.getClass();
            return gmoVar;
        }
    }

    @Override // defpackage.gmm
    public final void a(mad madVar) {
        synchronized (this.a) {
            long jD = madVar.d();
            gmo gmoVarF = f(jD);
            Map map = gmoVarF.b;
            Long lValueOf = Long.valueOf(jD);
            obr.aR(!map.containsKey(lValueOf), "Image already added");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fcy.e(madVar);
                gmoVarF.b.put(lValueOf, byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // defpackage.gmm
    public final void b(long j) {
        synchronized (this.a) {
            gmo gmoVarF = f(j);
            obr.aR(!gmoVarF.f.g(), "Base frame already selected!");
            gmoVarF.f = ojc.i(Long.valueOf(j));
        }
    }

    @Override // defpackage.gmm
    public final void c(long j, pht phtVar) {
        synchronized (this.a) {
            f(j).c.put(Long.valueOf(j), phtVar);
        }
    }

    @Override // defpackage.gmm
    public final void d(mad madVar) {
        synchronized (this.a) {
            long jD = madVar.d();
            gmo gmoVarF = f(jD);
            Map map = gmoVarF.a;
            Long lValueOf = Long.valueOf(jD);
            obr.aR(!map.containsKey(lValueOf), "Image already added");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fcy.e(madVar);
                gmoVarF.a.put(lValueOf, byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // defpackage.gmm
    public final gmn e(String str) {
        obr.aF(!str.isEmpty());
        return new gmn(this, new gmo());
    }
}
