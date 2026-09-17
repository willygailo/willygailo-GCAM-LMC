package defpackage;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class ckd {
    public final int A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final lvs a;
    public final lvs b;
    public final cjo c;
    public final ldz d;
    public final leb e;
    public final ojc f;
    public final lig g;
    public final leh h;
    public final ojc i;
    public final ojc j;
    public final ojc k;
    public final ojc l;
    public final boolean m;
    public final Range n;
    public final Range o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final oom v;
    public final oom w;
    public final oom x;
    public final lwd y;
    public final hsr z;

    public ckd() {
    }

    public ckd(lvs lvsVar, lvs lvsVar2, cjo cjoVar, ldz ldzVar, leb lebVar, ojc ojcVar, lig ligVar, leh lehVar, ojc ojcVar2, ojc ojcVar3, ojc ojcVar4, ojc ojcVar5, boolean z, Range range, Range range2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, oom oomVar, oom oomVar2, oom oomVar3, lwd lwdVar, hsr hsrVar, int i, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.a = lvsVar;
        this.b = lvsVar2;
        this.c = cjoVar;
        this.d = ldzVar;
        this.e = lebVar;
        this.f = ojcVar;
        this.g = ligVar;
        this.h = lehVar;
        this.i = ojcVar2;
        this.j = ojcVar3;
        this.k = ojcVar4;
        this.l = ojcVar5;
        this.m = z;
        this.n = range;
        this.o = range2;
        this.p = z2;
        this.q = z3;
        this.r = z4;
        this.s = z5;
        this.t = z6;
        this.u = z7;
        this.v = oomVar;
        this.w = oomVar2;
        this.x = oomVar3;
        this.y = lwdVar;
        this.z = hsrVar;
        this.A = i;
        this.B = z8;
        this.C = z9;
        this.D = z10;
        this.E = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckd) {
            ckd ckdVar = (ckd) obj;
            if (this.a.equals(ckdVar.a) && this.b.equals(ckdVar.b) && this.c.equals(ckdVar.c) && this.d.equals(ckdVar.d) && this.e.equals(ckdVar.e) && this.f.equals(ckdVar.f) && this.g.equals(ckdVar.g) && this.h.equals(ckdVar.h) && this.i.equals(ckdVar.i) && this.j.equals(ckdVar.j) && this.k.equals(ckdVar.k) && this.l.equals(ckdVar.l) && this.m == ckdVar.m && this.n.equals(ckdVar.n) && this.o.equals(ckdVar.o) && this.p == ckdVar.p && this.q == ckdVar.q && this.r == ckdVar.r && this.s == ckdVar.s && this.t == ckdVar.t && this.u == ckdVar.u && obr.an(this.v, ckdVar.v) && obr.an(this.w, ckdVar.w) && obr.an(this.x, ckdVar.x) && this.y.equals(ckdVar.y) && this.z.equals(ckdVar.z) && this.A == ckdVar.A && this.B == ckdVar.B && this.C == ckdVar.C && this.D == ckdVar.D && this.E == ckdVar.E) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.a.b ^ 1000003) * 1000003) ^ this.b.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ (true != this.p ? 1237 : 1231)) * 1000003) ^ (true != this.q ? 1237 : 1231)) * 1000003) ^ (true != this.r ? 1237 : 1231)) * 1000003) ^ (true != this.s ? 1237 : 1231)) * 1000003) ^ (true != this.t ? 1237 : 1231)) * 1000003) ^ (true != this.u ? 1237 : 1231)) * 1000003) ^ this.v.hashCode()) * 1000003) ^ this.w.hashCode()) * 1000003) ^ this.x.hashCode()) * 1000003) ^ this.y.hashCode()) * 1000003) ^ this.z.hashCode()) * 1000003) ^ this.A) * 1000003) ^ (true != this.B ? 1237 : 1231)) * 1000003) ^ (true != this.C ? 1237 : 1231)) * 1000003) ^ (true != this.D ? 1237 : 1231)) * 1000003) ^ (true == this.E ? 1231 : 1237);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.e);
        String strValueOf6 = String.valueOf(this.f);
        String strValueOf7 = String.valueOf(this.g);
        String strValueOf8 = String.valueOf(this.h);
        String strValueOf9 = String.valueOf(this.i);
        String strValueOf10 = String.valueOf(this.j);
        String strValueOf11 = String.valueOf(this.k);
        String strValueOf12 = String.valueOf(this.l);
        boolean z = this.m;
        String strValueOf13 = String.valueOf(this.n);
        String strValueOf14 = String.valueOf(this.o);
        boolean z2 = this.p;
        boolean z3 = this.q;
        boolean z4 = this.r;
        boolean z5 = this.s;
        boolean z6 = this.t;
        boolean z7 = this.u;
        String strValueOf15 = String.valueOf(this.v);
        String strValueOf16 = String.valueOf(this.w);
        String strValueOf17 = String.valueOf(this.x);
        String strValueOf18 = String.valueOf(this.y);
        String strValueOf19 = String.valueOf(this.z);
        int i = this.A;
        boolean z8 = this.B;
        boolean z9 = this.C;
        boolean z10 = this.D;
        boolean z11 = this.E;
        int length = String.valueOf(strValueOf).length() + 720 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length() + String.valueOf(strValueOf4).length() + String.valueOf(strValueOf5).length() + String.valueOf(strValueOf6).length() + String.valueOf(strValueOf7).length() + String.valueOf(strValueOf8).length() + String.valueOf(strValueOf9).length() + String.valueOf(strValueOf10).length() + String.valueOf(strValueOf11).length() + String.valueOf(strValueOf12).length() + String.valueOf(strValueOf13).length() + String.valueOf(strValueOf14).length() + String.valueOf(strValueOf15).length() + String.valueOf(strValueOf16).length();
        int length2 = String.valueOf(strValueOf17).length();
        StringBuilder sb = new StringBuilder(length + length2 + String.valueOf(strValueOf18).length() + String.valueOf(strValueOf19).length());
        sb.append("CaptureSessionConfig{cameraId=");
        sb.append(strValueOf);
        sb.append(", streamCameraId=");
        sb.append(strValueOf2);
        sb.append(", camcorderCharacteristics=");
        sb.append(strValueOf3);
        sb.append(", captureRate=");
        sb.append(strValueOf4);
        sb.append(", videoResolution=");
        sb.append(strValueOf5);
        sb.append(", snapshotSize=");
        sb.append(strValueOf6);
        sb.append(", previewSize=");
        sb.append(strValueOf7);
        sb.append(", videoEncoderProfile=");
        sb.append(strValueOf8);
        sb.append(", audioEncoderProfile=");
        sb.append(strValueOf9);
        sb.append(", uri=");
        sb.append(strValueOf10);
        sb.append(", maxDuration=");
        sb.append(strValueOf11);
        sb.append(", maxFileSize=");
        sb.append(strValueOf12);
        sb.append(", shouldRecordLocationIfPermitted=");
        sb.append(z);
        sb.append(", previewFpsRange=");
        sb.append(strValueOf13);
        sb.append(", recordFpsRange=");
        sb.append(strValueOf14);
        sb.append(", useContinuousAutoFocusOnDuringRecording=");
        sb.append(z2);
        sb.append(", shouldUnlockAfAeWithSceneChange=");
        sb.append(z3);
        sb.append(", shouldDetectFace=");
        sb.append(z4);
        sb.append(", shouldVideoStabilizationOn=");
        sb.append(z5);
        sb.append(", useOpticalStabilization=");
        sb.append(z6);
        sb.append(", useLlv=");
        sb.append(z7);
        sb.append(", allSupportedCaptureRates=");
        sb.append(strValueOf15);
        sb.append(", supportedCaptureRates=");
        sb.append(strValueOf16);
        sb.append(", supportedVideoResolutions=");
        sb.append(strValueOf17);
        sb.append(", cameraFacing=");
        sb.append(strValueOf18);
        sb.append(", captureSessionType=");
        sb.append(strValueOf19);
        sb.append(", sessionId=");
        sb.append(i);
        sb.append(", useMediaCodec=");
        sb.append(z8);
        sb.append(", topShotEnabled=");
        sb.append(z9);
        sb.append(", shouldSupportSpeechMode=");
        sb.append(z10);
        sb.append(", viewfinderEffectEnabled=");
        sb.append(z11);
        sb.append("}");
        return sb.toString();
    }
}
