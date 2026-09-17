package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class mqb {
    public static int a = -1;
    public final int b;
    public final mri c;
    public final mqk d;
    public final Map e = new HashMap();
    public final Map f = new HashMap();
    public final List g = new ArrayList();
    public boolean h = true;
    public final mrd i;

    public mqb(int i, mri mriVar, mqk mqkVar, mrd mrdVar, byte[] bArr) {
        boolean z = true;
        obr.aF(mriVar.a.b == mrdVar.b);
        if (mqkVar != null && mqkVar.a.b != mrdVar.b) {
            z = false;
        }
        obr.aF(z);
        this.b = i;
        this.c = mriVar;
        this.d = mqkVar;
        this.i = mrdVar;
    }

    public static mpy a(mri mriVar) {
        obr.aF(mriVar.c >= 3);
        return new mpy(5, mriVar, null);
    }

    public static mpy b(mri mriVar, mqk mqkVar) {
        obr.aF(mqkVar.b % 3 == 0);
        return new mpy(4, mriVar, mqkVar);
    }

    public final void c(String str, int i) {
        obr.aF(i < this.c.b.length);
        this.f.put(str, Integer.valueOf(i));
    }

    public final void d(mqg mqgVar) {
        obr.aF(mqgVar.b == this.i.b);
        this.g.add(new mpz(this, mqgVar, "uImgTex"));
    }

    public final void e(String str, mrf mrfVar) {
        obr.aF(mrfVar.b == this.i.b);
        this.g.add(new mpz(this, mrfVar, str));
    }

    public final void f(String str, float f) {
        this.e.put(str, new mpw(str, f));
    }

    public final void g(String str, float[] fArr) {
        this.e.put(str, new mpt(str, fArr, 0));
    }

    public final void h(int i) {
        this.e.put("weightLen", new mpv(i));
    }

    public final void i(float[] fArr) {
        this.e.put("uTransform", new mpt(fArr, 1));
    }

    public final void j(mrd mrdVar) {
        obr.aF(mrdVar.b == this.i.b);
        mrdVar.e(gdr.g, new mpu(this)).h(mmg.a);
    }
}
