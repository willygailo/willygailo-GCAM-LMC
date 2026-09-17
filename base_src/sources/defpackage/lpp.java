package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageReader;
import android.os.Handler;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class lpp implements pys {
    private final qkg a;
    private final qkg b;

    public lpp(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        ojc ojcVar;
        mag magVarA;
        long j;
        lua luaVar;
        luj lujVar;
        opc opcVar;
        String string;
        luj lujVarA = ((lul) this.a).get();
        oom oomVar = ((lpn) this.b).get().g;
        lujVarA.c.e("createStreamMap");
        opc opcVarD = ope.D();
        opc opcVarD2 = ope.D();
        opc opcVarD3 = ope.D();
        otj it = oomVar.iterator();
        while (it.hasNext()) {
            lnz lnzVar = (lnz) it.next();
            lvs lvsVar = (lvs) lnzVar.b.e(lujVarA.b.a);
            boolean zContains = lujVarA.f.contains(lvsVar);
            if (!lvsVar.equals(lujVarA.b.a) && !zContains) {
                if (lujVarA.f.isEmpty()) {
                    string = "";
                } else {
                    String strValueOf = String.valueOf(lujVarA.f);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 33);
                    sb.append(" or one of its physical cameras: ");
                    sb.append(strValueOf);
                    string = sb.toString();
                }
                lis lisVar = lujVarA.d;
                String str = lvsVar.a;
                String strValueOf2 = String.valueOf(lujVarA.b.a);
                String strValueOf3 = String.valueOf(lnzVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 81 + String.valueOf(strValueOf2).length() + String.valueOf(string).length() + String.valueOf(strValueOf3).length());
                sb2.append("Stream configuration is invalid. Camera-");
                sb2.append(str);
                sb2.append(" does not match ");
                sb2.append(strValueOf2);
                sb2.append(string);
                sb2.append(". ");
                sb2.append(strValueOf3);
                sb2.append(" will not be available.");
                lisVar.h(sb2.toString());
            } else if (lnzVar.a == loa.IMAGE_READER) {
                lue lueVar = lujVarA.a;
                lig ligVar = lnzVar.d;
                int i = lnzVar.e;
                int iMax = Math.max(3, Math.min(lnzVar.f + 2, lujVarA.g));
                ojc ojcVar2 = lnzVar.g;
                lap lapVar = new lap();
                String strAO = mip.aO(i, ligVar.a);
                lis lisVarA = lueVar.b.a(strAO);
                mip mipVar = lueVar.i;
                Handler handlerBW = mip.bW(lapVar, strAO);
                otj otjVar = it;
                boolean z = lueVar.f.f && ojcVar2.g();
                opc opcVar2 = opcVarD3;
                int iIntValue = ((Integer) lueVar.e.m(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE, 0)).intValue();
                if (z) {
                    long jLongValue = ((Long) ojcVar2.c()).longValue();
                    mae maeVar = lueVar.a;
                    int i2 = ligVar.a;
                    int i3 = ligVar.b;
                    obr.aR(true, "Usage flags are not available on Android P or lower.");
                    ojcVar = ojcVar2;
                    magVarA = lws.a(new lvg(ImageReader.newInstance(i2, i3, i, iMax, jLongValue), true));
                } else {
                    ojcVar = ojcVar2;
                    if (ojcVar.g()) {
                        String hexString = Long.toHexString(((Long) ojcVar.c()).longValue());
                        StringBuilder sb3 = new StringBuilder(String.valueOf(hexString).length() + 60);
                        sb3.append("Ignoring flags (");
                        sb3.append(hexString);
                        sb3.append("). They are not supported on the current OS.");
                        lisVarA.h(sb3.toString());
                    }
                    magVarA = lws.a(new lvg(ImageReader.newInstance(ligVar.a, ligVar.b, i, iMax), ((lvh) ((lws) lueVar.a).a).a.e));
                }
                lapVar.c(magVarA);
                if (iIntValue != 1) {
                    zContains = zContains;
                    j = 0;
                    lisVarA.f("Using fuzzy timestamp matching.");
                    luaVar = new lua(0L, 8333333L);
                } else if (z && ojcVar.g() && (((Long) ojcVar.c()).longValue() & 65536) != 0) {
                    long j2 = -lueVar.h.a;
                    StringBuilder sb4 = new StringBuilder(80);
                    sb4.append("Using fuzzy timestamp matching with an initial offset of: ");
                    sb4.append(j2);
                    sb4.append("ns");
                    lisVarA.f(sb4.toString());
                    zContains = zContains;
                    luaVar = new lua(j2, 8333333L);
                    j = 0;
                } else {
                    lisVarA.f("Using exact timestamp matching.");
                    j = 0;
                    luaVar = new lua(0L, 0L);
                }
                long jS = mip.S(i, ligVar);
                if (jS > j) {
                    try {
                        if (lueVar.e.g(i, ligVar) < 67000000) {
                            int iB = oxh.B(((Byte) lueVar.e.m(CameraCharacteristics.REQUEST_PIPELINE_MAX_DEPTH, (byte) 2)).byteValue(), 2, 8);
                            int iA = (int) ((lueVar.g.a() / 2) / jS);
                            if (iB > iA) {
                                iB = iA;
                            }
                            long j3 = ((long) iB) * jS;
                            Locale locale = Locale.ROOT;
                            lujVar = lujVarA;
                            opcVar = opcVarD;
                            double d = j3;
                            Double.isNaN(d);
                            double d2 = jS;
                            Double.isNaN(d2);
                            lisVarA.f(String.format(locale, "Reserved %6.2f MiB(%6.2f MiB/image * %s) to estimate HAL memory usage.", Double.valueOf(d / 1048576.0d), Double.valueOf(d2 / 1048576.0d), Integer.valueOf(iB)));
                            lxu lxuVarD = lueVar.g.d(j3);
                            if (lxuVarD != null) {
                                lapVar.c(lxuVarD);
                            }
                        } else {
                            lujVar = lujVarA;
                            opcVar = opcVarD;
                        }
                    } catch (IllegalArgumentException e) {
                    }
                } else {
                    lujVar = lujVarA;
                    opcVar = opcVarD;
                }
                final lug lugVar = new lug(magVarA, lapVar, new lam(handlerBW), lisVarA, lueVar.c, lueVar.d, luaVar);
                magVarA.i(new maf() { // from class: lud
                    @Override // defpackage.maf
                    public final void a() {
                        lugVar.a();
                    }
                }, handlerBW);
                luj lujVar2 = lujVar;
                lujVar2.h.c(lugVar);
                ltw ltwVar = new ltw(lnzVar, (lvs) lnzVar.b.e(lujVar2.b.a), lugVar, lugVar.a.c() - 2, zContains);
                opcVarD = opcVar;
                opcVarD.d(ltwVar);
                opcVarD2 = opcVarD2;
                opcVarD2.d(ltwVar);
                lrx lrxVar = lujVar2.e;
                String str2 = ltwVar.f.a;
                int iA2 = ltwVar.a();
                lig ligVar2 = ltwVar.c;
                lrxVar.c(str2, "buffered", iA2, ligVar2.a, ligVar2.b, ltwVar.e);
                lujVarA = lujVar2;
                it = otjVar;
                opcVarD3 = opcVar2;
            } else {
                luj lujVar3 = lujVarA;
                opc opcVar3 = opcVarD3;
                otj otjVar2 = it;
                lty ltyVar = new lty(lnzVar, (lvs) lnzVar.b.e(lujVar3.b.a), lnzVar.d, lnzVar.e, zContains);
                opcVarD.d(ltyVar);
                opcVar3.d(ltyVar);
                lrx lrxVar2 = lujVar3.e;
                String str3 = ltyVar.f.a;
                int i4 = lnzVar.e;
                lig ligVar3 = lnzVar.d;
                lrxVar2.c(str3, "external", i4, ligVar3.a, ligVar3.b, 0);
                opcVarD3 = opcVar3;
                it = otjVar2;
                lujVarA = lujVar3;
            }
        }
        luj lujVar4 = lujVarA;
        opc opcVar4 = opcVarD3;
        ope opeVarF = opcVarD.f();
        if (opeVarF.isEmpty()) {
            lujVar4.d.d("No streams available, camera configuration will fail!");
        }
        luk lukVar = new luk(opeVarF, opcVarD2.f(), opcVar4.f());
        lujVar4.c.f();
        return lukVar;
    }
}
