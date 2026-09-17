package defpackage;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.AwbInfo;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ShotMetadata;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class eol implements ebq {
    final /* synthetic */ eom a;
    final /* synthetic */ lji b;
    final /* synthetic */ eon c;

    public eol(eon eonVar, eom eomVar, lji ljiVar) {
        this.c = eonVar;
        this.a = eomVar;
        this.b = ljiVar;
    }

    private final void b(HardwareBuffer hardwareBuffer, dmd dmdVar) {
        hardwareBuffer.close();
        this.a.e.a(dmdVar);
        this.c.b(this.a);
    }

    @Override // defpackage.ebq
    public final void a(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        ovd ovdVar = ovl.a;
        this.b.a();
        int size = this.a.j.size();
        eom eomVar = this.a;
        int i = eomVar.l;
        if (size > i) {
            ((lie) eomVar.j.get(i)).close();
        } else {
            ((oug) ((oug) eon.a.b().g(ovl.a, "KeplerController")).G(1297)).p("Image token for %dth callback not found.", this.a.l);
        }
        this.a.i.open();
        synchronized (this.c) {
            if (!this.c.i.containsKey(this.a.a)) {
                hardwareBuffer.close();
                this.a.a.a();
                return;
            }
            try {
                if (this.a.l == 0) {
                    eon eonVar = this.c;
                    lig ligVar = new lig(hardwareBuffer.getWidth(), hardwareBuffer.getHeight());
                    eom eomVar2 = this.a;
                    int iD = brg.d(eomVar2.a.c.a.a, eonVar.j, eonVar.h);
                    eos eosVar = eonVar.e;
                    FileOutputStream fileOutputStreamE = eomVar2.d.e();
                    lic licVarB = lic.b(iD);
                    jtx jtxVar = eosVar.d;
                    fix fixVar = eosVar.a;
                    Executor executor = eosVar.b;
                    ddf ddfVar = eosVar.c;
                    ddi ddiVar = ddm.a;
                    ddfVar.f();
                    eomVar2.n = new eot(jtxVar, fixVar, executor, fileOutputStreamE, ligVar, licVarB, null, null);
                    FrameMetadata frameMetadataF = shotMetadata.f();
                    long jFrameMetadata_wb_get = GcamModuleJNI.FrameMetadata_wb_get(frameMetadataF.a, frameMetadataF);
                    AwbInfo awbInfo = jFrameMetadata_wb_get == 0 ? null : new AwbInfo(jFrameMetadata_wb_get, false);
                    this.a.g.o(new AwbInfo(GcamModuleJNI.new_AwbInfo__SWIG_1(AwbInfo.a(awbInfo), awbInfo), true));
                    AeResults aeResultsE = shotMetadata.e();
                    this.a.h.o(new hkm(aeResultsE.a(0), aeResultsE.a(1), null));
                }
                eot eotVar = this.a.n;
                if (eotVar == null) {
                    b(hardwareBuffer, new dmd("Encoder not available."));
                    return;
                }
                eotVar.b(hardwareBuffer, TimeUnit.NANOSECONDS.convert(this.a.m, TimeUnit.MILLISECONDS));
                eom eomVar3 = this.a;
                int i2 = eomVar3.l + 1;
                eomVar3.l = i2;
                eomVar3.m += this.c.b;
                if (i2 == eomVar3.c) {
                    plk.af(eotVar.a(), new eok(this), this.c.d);
                }
            } catch (IOException e) {
                ((oug) ((oug) ((oug) eon.a.b().g(ovl.a, "KeplerController")).h(e)).G((char) 1295)).o("Encoder creation failed");
                b(hardwareBuffer, new dmd("Failed to create encoder.", e));
            }
        }
    }
}
