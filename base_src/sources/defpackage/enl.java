package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import com.google.android.GoogleCameraEngR18F1.R;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class enl {
    public enl() {
    }

    public enl(byte[] bArr) {
        ddi ddiVar = dee.a;
        ddi ddiVar2 = ddl.a;
    }

    public static long A(Uri uri) {
        return Long.parseLong(Uri.decode(uri.getLastPathSegment()));
    }

    public static oom B(byte[] bArr) {
        try {
            ooh oohVarE = oom.e();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.order(ByteOrder.nativeOrder());
            int i = byteBufferWrap.getInt();
            for (int i2 = 0; i2 < i; i2++) {
                dwo dwoVar = new dwo();
                dwoVar.a = Integer.valueOf(byteBufferWrap.getInt());
                int i3 = byteBufferWrap.getInt();
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < i3; i4++) {
                    arrayList.add(Float.valueOf(byteBufferWrap.getFloat()));
                }
                dwoVar.b = oom.j(oom.j(arrayList));
                for (int i5 = 0; i5 < 6 - i3; i5++) {
                    byteBufferWrap.getFloat();
                }
                dwoVar.c = Float.valueOf(byteBufferWrap.getFloat());
                Integer num = dwoVar.a;
                if (num != null && dwoVar.b != null && dwoVar.c != null) {
                    dwp dwpVar = new dwp(num.intValue(), dwoVar.b, dwoVar.c.floatValue());
                    obr.aF(dwpVar.b.size() == 4);
                    oohVarE.g(dwpVar);
                }
                StringBuilder sb = new StringBuilder();
                if (dwoVar.a == null) {
                    sb.append(" id");
                }
                if (dwoVar.b == null) {
                    sb.append(" toneProbabilities");
                }
                if (dwoVar.c == null) {
                    sb.append(" toneConfidence");
                }
                String strValueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(strValueOf);
                throw new IllegalStateException(sb2.toString());
            }
            return oohVarE.f();
        } catch (BufferUnderflowException e) {
            return oom.l();
        }
    }

    public static void C(lda ldaVar, ddf ddfVar) {
        if (((Boolean) ldaVar.fA()).booleanValue()) {
            ddg ddgVar = ddd.a;
            ddfVar.d();
        } else {
            ddg ddgVar2 = ddd.a;
            ddfVar.d();
        }
    }

    public static long D(long j) {
        return ((j + 500000) / 1000000) * 1000000;
    }

    public static final void E(Canvas canvas, Drawable drawable, float f, float f2) {
        int width = canvas.getWidth();
        canvas.save();
        float f3 = width;
        float f4 = (f3 - f) / 2.0f;
        canvas.translate(f4, f4);
        float f5 = f / f3;
        canvas.scale(f5, f5);
        if (f2 > 0.0f) {
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            int i = (int) (f2 * (1.0f - f5));
            if (i < 3) {
                i = 3;
            }
            gradientDrawable.setStroke(i, -1);
        }
        drawable.draw(canvas);
        canvas.restore();
    }

    public static boolean F(gxm gxmVar, nez nezVar) {
        return gxmVar.c() && nezVar.a;
    }

    public static void G(gxm gxmVar, ddf ddfVar, nez nezVar) {
        if (F(gxmVar, nezVar)) {
            return;
        }
        ddg ddgVar = dea.a;
        ddfVar.c();
    }

    public static dte H(dqw dqwVar) {
        return new dte(dqwVar);
    }

    public static drt I(final hnp hnpVar, final dsz dszVar, dqv dqvVar) {
        drp drpVarB = dru.b(dszVar);
        drpVarB.c = dqvVar;
        drpVarB.d(new drs() { // from class: drv
            @Override // defpackage.drs
            public final void a(long j, lzv lzvVar) {
                dszVar.g(j, hnpVar.a(lzvVar));
            }
        });
        return drpVarB.a();
    }

    public static final dqw J(String str, ArrayList arrayList, ArrayList arrayList2) {
        dqw[] dqwVarArr = (dqw[]) arrayList.toArray(new dqw[0]);
        return new dqw(str, dqwVarArr);
    }

    public static void K(dqt dqtVar, lvp lvpVar) {
        dqtVar.c(lvpVar);
    }

    public static final pte L(hjz hjzVar, float f, float f2) {
        Map map = hjzVar.C;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            hjy[] hjyVarArr = hjzVar.p;
            if (i >= hjyVarArr.length) {
                break;
            }
            hjy hjyVar = hjyVarArr[i];
            dwp dwpVar = (dwp) map.get(Integer.valueOf(hjyVar.i));
            Rect rect = hjyVar.a;
            poy poyVarM = ptb.f.m();
            float f3 = rect.left * f;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ptb ptbVar = (ptb) poyVarM.b;
            ptbVar.a |= 1;
            ptbVar.b = f3;
            float f4 = rect.right * f;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ptb ptbVar2 = (ptb) poyVarM.b;
            ptbVar2.a |= 4;
            ptbVar2.d = f4;
            float f5 = rect.top * f2;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ptb ptbVar3 = (ptb) poyVarM.b;
            ptbVar3.a |= 2;
            ptbVar3.c = f5;
            float f6 = rect.bottom * f2;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ptb ptbVar4 = (ptb) poyVarM.b;
            ptbVar4.a |= 8;
            ptbVar4.e = f6;
            ptb ptbVar5 = (ptb) poyVarM.j();
            ArrayList arrayList2 = new ArrayList();
            O(1, hjyVar.c, arrayList2, f, f2);
            O(2, hjyVar.d, arrayList2, f, f2);
            O(46, hjyVar.e, arrayList2, f, f2);
            O(10, hjyVar.f, arrayList2, f, f2);
            O(241, hjyVar.g, arrayList2, f, f2);
            O(242, hjyVar.h, arrayList2, f, f2);
            ppa ppaVar = (ppa) ptd.l.m();
            if (ppaVar.c) {
                ppaVar.m();
                ppaVar.c = false;
            }
            ptd ptdVar = (ptd) ppaVar.b;
            ptbVar5.getClass();
            ptdVar.b = ptbVar5;
            int i2 = ptdVar.a | 1;
            ptdVar.a = i2;
            int i3 = hjyVar.b;
            int i4 = i2 | 2;
            ptdVar.a = i4;
            ptdVar.d = i3 / 100.0f;
            float f7 = hjyVar.j;
            int i5 = i4 | 16;
            ptdVar.a = i5;
            ptdVar.g = f7;
            float f8 = hjyVar.k;
            int i6 = i5 | 8;
            ptdVar.a = i6;
            ptdVar.f = f8;
            float f9 = hjyVar.l;
            ptdVar.a = i6 | 4;
            ptdVar.e = f9;
            ppm ppmVar = ptdVar.c;
            if (!ppmVar.c()) {
                ptdVar.c = ppd.B(ppmVar);
            }
            pnl.e(arrayList2, ptdVar.c);
            poy poyVarM2 = puj.i.m();
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            puj pujVar = (puj) poyVarM2.b;
            pujVar.a |= 4;
            pujVar.d = 0.0f;
            int i7 = hjyVar.i;
            if (i7 != -1) {
                long j = i7;
                if (ppaVar.c) {
                    ppaVar.m();
                    ppaVar.c = false;
                }
                ptd ptdVar2 = (ptd) ppaVar.b;
                int i8 = ptdVar2.a | 64;
                ptdVar2.a = i8;
                ptdVar2.j = j;
                int i9 = hjyVar.i;
                ptdVar2.a = i8 | 128;
                ptdVar2.k = i9;
                if (dwpVar != null) {
                    poy poyVarM3 = puk.d.m();
                    oom oomVar = dwpVar.b;
                    if (poyVarM3.c) {
                        poyVarM3.m();
                        poyVarM3.c = false;
                    }
                    puk pukVar = (puk) poyVarM3.b;
                    ppj ppjVar = pukVar.b;
                    if (!ppjVar.c()) {
                        pukVar.b = ppd.v(ppjVar);
                    }
                    pnl.e(oomVar, pukVar.b);
                    float f10 = dwpVar.c;
                    if (poyVarM3.c) {
                        poyVarM3.m();
                        poyVarM3.c = false;
                    }
                    puk pukVar2 = (puk) poyVarM3.b;
                    pukVar2.a |= 1;
                    pukVar2.c = f10;
                    puk pukVar3 = (puk) poyVarM3.j();
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    puj pujVar2 = (puj) poyVarM2.b;
                    pukVar3.getClass();
                    pujVar2.g = pukVar3;
                    pujVar2.a |= 32;
                }
            }
            ppaVar.av(puj.j, (puj) poyVarM2.j());
            arrayList.add((ptd) ppaVar.j());
            i++;
        }
        poy poyVarM4 = pte.b.m();
        if (poyVarM4.c) {
            poyVarM4.m();
            poyVarM4.c = false;
        }
        pte pteVar = (pte) poyVarM4.b;
        ppm ppmVar2 = pteVar.a;
        if (!ppmVar2.c()) {
            pteVar.a = ppd.B(ppmVar2);
        }
        pnl.e(arrayList, pteVar.a);
        return (pte) poyVarM4.j();
    }

    public static PointF M(Point point, Rect rect) {
        return new PointF((point.x - rect.left) / rect.width(), (point.y - rect.top) / rect.height());
    }

    public static RectF N(Rect rect, Rect rect2) {
        PointF pointFM = M(new Point(rect.left, rect.top), rect2);
        PointF pointFM2 = M(new Point(rect.right, rect.bottom), rect2);
        return new RectF(pointFM.x, pointFM.y, pointFM2.x, pointFM2.y);
    }

    private static final void O(int i, PointF pointF, ArrayList arrayList, float f, float f2) {
        if (pointF == null || pointF.x < -1000.0f) {
            return;
        }
        poy poyVarM = ptc.e.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        ptc ptcVar = (ptc) poyVarM.b;
        ptcVar.d = i - 1;
        ptcVar.a |= 8;
        float f3 = f * pointF.x;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        ptc ptcVar2 = (ptc) poyVarM.b;
        ptcVar2.a |= 1;
        ptcVar2.b = f3;
        float f4 = f2 * pointF.y;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        ptc ptcVar3 = (ptc) poyVarM.b;
        ptcVar3.a |= 2;
        ptcVar3.c = f4;
        arrayList.add((ptc) poyVarM.j());
    }

    public static Object a(qkg qkgVar) {
        b();
        return qkgVar.get();
    }

    public static synchronized void b() {
        lil.a(enl.class);
    }

    public static final ByteBuffer c(int i, int i2, mac macVar) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i * i2);
        mto.a.copyBytes2D(macVar.getBuffer(), byteBufferAllocateDirect, i, i2, 0, 0, macVar.getPixelStride(), 1, macVar.getRowStride(), i);
        return byteBufferAllocateDirect;
    }

    public static boolean d(ddf ddfVar, dei deiVar) {
        return deiVar == dei.ENG || deiVar == dei.FISHFOOD || ddfVar.k(ddq.a);
    }

    public static void e(lar larVar, fhi fhiVar, fik fikVar) {
        larVar.getClass();
        fikVar.getClass();
        if (lar.d()) {
            fhiVar.g(fikVar);
        } else {
            larVar.execute(new fim(fhiVar, fikVar));
        }
    }

    public static void f(lar larVar, fhv fhvVar, fik fikVar) {
        larVar.getClass();
        fhvVar.getClass();
        fikVar.getClass();
        if (lar.d()) {
            fhvVar.e(fikVar);
        } else {
            larVar.execute(new fin(fhvVar, fikVar));
        }
    }

    public static int s(int i) {
        return i - 1;
    }

    public static Object t() {
        return new Object();
    }

    public static String u(int i, Context context, boolean z) {
        int i2;
        switch (i - 1) {
            case 2:
                i2 = true == z ? R.string.imax_stopped_too_much_horizontal_tilt : R.string.imax_stopped_too_much_vertical_tilt;
                break;
            case 3:
                i2 = R.string.imax_stopped_too_much_roll;
                break;
            case 4:
                i2 = R.string.imax_stopped_backtracking;
                break;
            default:
                i2 = R.string.imax_stopped_too_fast;
                break;
        }
        return context.getString(i2);
    }

    public static int v(int i) {
        switch (i - 1) {
            case 1:
                return 7;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            default:
                return 2;
        }
    }

    public static void w(CaptureRequest.Key key, Object obj, opc opcVar) {
        if (key != null) {
            opcVar.d(mip.be(key, obj));
        }
    }

    public static void x(ddf ddfVar, lpc lpcVar) {
        if (kda.g != null) {
            ojc ojcVarA = ddfVar.a(ddm.a);
            if (ojcVarA.g()) {
                int i = ew.f()[((Integer) ojcVarA.c()).intValue()];
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                switch (i2) {
                    case 1:
                    case 2:
                    case 3:
                        lpcVar.d(kda.g, 2);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public static boolean y() {
        return (kda.g == null || kda.h == null || kda.i == null || kda.j == null) ? false : true;
    }

    public static final kfm z(eni eniVar, int i, int i2, float f, boolean z, String str) {
        return new kfm(eniVar, i, i2, f, z, str);
    }

    public final synchronized void g() {
    }

    public final synchronized void h() {
    }

    public final synchronized void i() {
    }

    public final synchronized void j() {
    }

    public final synchronized void k() {
    }

    public final synchronized void l() {
    }

    public final synchronized void m() {
    }

    public final synchronized void n() {
    }

    public final synchronized void o() {
    }

    public final synchronized void p() {
    }

    public final synchronized void q() {
    }

    public final synchronized void r() {
    }
}
