package defpackage;

import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.WindowManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fck {
    public final Handler a;
    public final awl b;
    public boolean c;
    public fde e;
    private axn f;
    private final SurfaceTexture g = new SurfaceTexture(100);
    public boolean d = false;

    public fck(awl awlVar, Handler handler) {
        this.b = awlVar;
        this.a = handler;
    }

    public final synchronized axn a(WindowManager windowManager, ddf ddfVar, fde fdeVar, boolean z) {
        awu awuVar;
        int[] iArr;
        this.e = fdeVar;
        this.c = true;
        awl awlVar = this.b;
        if (awlVar != null && awlVar.g().a() != 1) {
            awy awyVarE = this.b.e();
            this.b.k(false);
            if (z) {
                axh axhVarF = this.b.f();
                if (fcn.a(ddfVar, awyVarE) == awv.AUTO) {
                    this.d = true;
                }
                axhVarF.s = fcn.a(ddfVar, awyVarE);
                if (awyVarE.e(awu.OFF)) {
                    awuVar = awu.OFF;
                } else if (awyVarE.e(awu.AUTO)) {
                    awuVar = awu.AUTO;
                } else {
                    if (!awyVarE.e(awu.NO_FLASH)) {
                        ((oug) ((oug) fcn.a.b()).G((char) 1635)).o("no supported flash mode found, need OFF, AUTO or NO_FLASH!");
                        throw new IllegalStateException("no supported flash mode found!");
                    }
                    awuVar = awu.NO_FLASH;
                }
                axhVarF.r = awuVar;
                aww awwVar = aww.AUTO;
                axhVarF.t = (awwVar == null || !awyVarE.h.contains(awwVar)) ? aww.NO_SCENE_MODE : aww.AUTO;
                axhVarF.d();
                fcl fclVarA = fcm.a(awyVarE);
                axn axnVar = fclVarA.a;
                this.f = axnVar;
                axhVarF.l(axnVar);
                ArrayList<int[]> arrayList = new ArrayList(awyVarE.b);
                if (arrayList.isEmpty()) {
                    ((oug) ((oug) fcn.a.b()).G((char) 1640)).o("No suppoted frame rates returned!");
                    iArr = null;
                } else {
                    int i = 400000;
                    for (int[] iArr2 : arrayList) {
                        int i2 = iArr2[0];
                        if (iArr2[1] >= 30000 && i2 <= 30000 && i2 < i) {
                            i = i2;
                        }
                    }
                    int i3 = -1;
                    int i4 = 0;
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        int[] iArr3 = (int[]) arrayList.get(i5);
                        int i6 = iArr3[0];
                        int i7 = iArr3[1];
                        if (i6 == i && i4 < i7) {
                            i3 = i5;
                            i4 = i7;
                        }
                    }
                    if (i3 >= 0) {
                        iArr = (int[]) arrayList.get(i3);
                    } else {
                        ((oug) ((oug) fcn.a.b()).G((char) 1639)).o("Can't find an appropriate frame rate range!");
                        iArr = null;
                    }
                }
                if (iArr == null || iArr.length <= 0) {
                    ((oug) ((oug) fcn.a.b()).G((char) 1638)).o("No supported frame rates returned!");
                } else {
                    axhVarF.j(iArr[0], iArr[1]);
                }
                axhVarF.z = new axn(0, 0);
                axhVarF.i(100);
                axhVarF.k(fclVarA.b);
                int iD = fcy.d(windowManager);
                awl awlVar2 = this.b;
                try {
                    awlVar2.h().a(new awe(awlVar2, iD));
                } catch (RuntimeException e) {
                    awlVar2.d().c().c(e);
                }
                this.b.m(axhVarF);
                float f = awyVarE.u;
                StringBuilder sb = new StringBuilder(40);
                sb.append("Field of view reported = ");
                sb.append(f);
                sb.toString();
            }
            this.b.l(this.g);
            if (this.c) {
                awl awlVar3 = this.b;
                axn axnVar2 = this.f;
                Handler handler = this.a;
                fde fdeVar2 = this.e;
                awlVar3.q(handler, null);
                int i8 = awlVar3.f().l;
                int bitsPerPixel = ImageFormat.getBitsPerPixel(i8);
                if (bitsPerPixel <= 0) {
                    StringBuilder sb2 = new StringBuilder(33);
                    sb2.append("Unknown image format: ");
                    sb2.append(i8);
                    throw new IllegalArgumentException(sb2.toString());
                }
                int iCeil = (int) Math.ceil(axnVar2.b() * axnVar2.a() * (bitsPerPixel / 8.0f));
                for (int i9 = 0; i9 < 3; i9++) {
                    awlVar3.i(new byte[iCeil]);
                }
                awlVar3.q(handler, fdeVar2);
            } else {
                this.b.p(this.a, this.e);
            }
            return this.f;
        }
        return null;
    }
}
