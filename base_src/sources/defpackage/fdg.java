package defpackage;

import android.view.WindowManager;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class fdg implements awc {
    final /* synthetic */ fdj a;

    public fdg(fdj fdjVar) {
        this.a = fdjVar;
    }

    @Override // defpackage.awc
    public final void a(byte[] bArr) {
        fdj fdjVar = this.a;
        fdjVar.r = false;
        fck fckVar = fdjVar.c;
        WindowManager windowManagerN = fdjVar.J.n();
        fdj fdjVar2 = this.a;
        if (fckVar.a(windowManagerN, fdjVar2.q, fdjVar2.I, false) != null) {
            this.a.g();
            fdj fdjVar3 = this.a;
            fdjVar3.s = false;
            fdjVar3.c.b.r(fdjVar3.H, new fdf(this));
        }
        fdj fdjVar4 = this.a;
        float[] fArrF = fdjVar4.g.f();
        float[] fArr = {fArrF[0], fArrF[1], fArrF[2], fArrF[4], fArrF[5], fArrF[6], fArrF[8], fArrF[9], fArrF[10]};
        String str = new String();
        float f = 0.0f;
        for (int i = 0; i < 9; i++) {
            float f2 = fArr[i];
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16);
            sb.append(str);
            sb.append(f2);
            sb.append(" ");
            str = sb.toString();
            f += fArr[i];
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16);
        sb2.append(str);
        sb2.append(f);
        sb2.append("\n");
        try {
            fdjVar4.o.write(sb2.toString());
            fdjVar4.o.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        fdj fdjVar5 = this.a;
        fdjVar5.y.post(new fdi(fdjVar5, bArr));
        if (fcz.d() == fcz.e()) {
            this.a.b.c();
            if (this.a.x == null || fcz.e() != 1) {
                fet fetVar = this.a.w;
                if (fetVar != null) {
                    fetVar.a(null);
                }
            } else {
                this.a.x.a(null);
            }
        }
        fet fetVar2 = this.a.B;
        if (fetVar2 != null) {
            fetVar2.a(null);
        }
    }
}
