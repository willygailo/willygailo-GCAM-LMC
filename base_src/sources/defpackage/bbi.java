package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bbi {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public aya c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public azt h;
    public Map i;
    public Class j;
    public boolean k;
    public boolean l;
    public azp m;
    public ayc n;
    public bbr o;
    public boolean p;
    public boolean q;
    public bbw r;

    final azx a(Class cls) {
        azx azxVar = (azx) this.i.get(cls);
        if (azxVar == null) {
            for (Map.Entry entry : this.i.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    azxVar = (azx) entry.getValue();
                    break;
                }
            }
        }
        if (azxVar != null) {
            return azxVar;
        }
        if (!this.i.isEmpty() || !this.p) {
            return bgj.b;
        }
        String strValueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + R.styleable.AppCompatTheme_tooltipFrameBackground);
        sb.append("Missing transformation for ");
        sb.append(strValueOf);
        sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
        throw new IllegalArgumentException(sb.toString());
    }

    final bcj b(Class cls) {
        bcj bcjVar;
        ayi ayiVar = this.c.c;
        Class cls2 = this.g;
        Class cls3 = this.j;
        bkj bkjVar = ayiVar.d;
        bmd bmdVar = (bmd) bkjVar.c.getAndSet(null);
        if (bmdVar == null) {
            bmdVar = new bmd();
        }
        bmdVar.a(cls, cls2, cls3);
        synchronized (bkjVar.b) {
            bcjVar = (bcj) bkjVar.b.get(bmdVar);
        }
        bkjVar.c.set(bmdVar);
        bkj bkjVar2 = ayiVar.d;
        if (bkj.a.equals(bcjVar)) {
            return null;
        }
        if (bcjVar != null) {
            return bcjVar;
        }
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : ayiVar.b.b(cls, cls2)) {
            for (Class cls5 : ayiVar.h.q(cls4, cls3)) {
                arrayList.add(new bbn(cls, cls4, cls5, ayiVar.b.a(cls, cls4), ayiVar.h.p(cls4, cls5), ayiVar.e));
            }
        }
        bcj bcjVar2 = arrayList.isEmpty() ? null : new bcj(cls, cls2, cls3, arrayList, ayiVar.e);
        bkj bkjVar3 = ayiVar.d;
        synchronized (bkjVar3.b) {
            bkjVar3.b.put(new bmd(cls, cls2, cls3), bcjVar2 != null ? bcjVar2 : bkj.a);
        }
        return bcjVar2;
    }

    final bct c() {
        return this.c.b;
    }

    final bdk d() {
        return this.r.a();
    }

    final List e() {
        int i;
        if (!this.l) {
            this.l = true;
            this.b.clear();
            List listF = f();
            int size = listF.size();
            for (int i2 = 0; i2 < size; i2++) {
                bff bffVar = (bff) listF.get(i2);
                if (this.b.contains(bffVar.a)) {
                    i = 0;
                } else {
                    this.b.add(bffVar.a);
                    i = 0;
                }
                while (i < bffVar.b.size()) {
                    if (!this.b.contains(bffVar.b.get(i))) {
                        this.b.add((azp) bffVar.b.get(i));
                    }
                    i++;
                }
            }
        }
        return this.b;
    }

    final List f() {
        if (!this.k) {
            this.k = true;
            this.a.clear();
            List listC = this.c.c.c(this.d);
            int size = listC.size();
            for (int i = 0; i < size; i++) {
                bff bffVarA = ((bfg) listC.get(i)).a(this.d, this.e, this.f, this.h);
                if (bffVarA != null) {
                    this.a.add(bffVarA);
                }
            }
        }
        return this.a;
    }

    final List g(File file) {
        return this.c.c.c(file);
    }

    final boolean h(Class cls) {
        return b(cls) != null;
    }
}
