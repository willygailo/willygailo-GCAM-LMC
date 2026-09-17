package defpackage;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.hardware.camera2.CameraManager;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.debugui.DebugCanvasView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bno implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final /* synthetic */ int f;

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i) {
        this.f = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, byte[] bArr) {
        this.f = i;
        this.c = qkgVar;
        this.d = qkgVar2;
        this.e = qkgVar3;
        this.b = qkgVar4;
        this.a = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, byte[] bArr, byte[] bArr2) {
        this.f = i;
        this.a = qkgVar;
        this.e = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.b = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, char[] cArr) {
        this.f = i;
        this.e = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
        this.c = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, char[] cArr, byte[] bArr) {
        this.f = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, float[] fArr) {
        this.f = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
        this.e = qkgVar4;
        this.d = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, int[] iArr) {
        this.f = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.d = qkgVar3;
        this.a = qkgVar4;
        this.e = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, short[] sArr) {
        this.f = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.e = qkgVar4;
        this.c = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, boolean[] zArr) {
        this.f = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.e = qkgVar3;
        this.d = qkgVar4;
        this.b = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, byte[][] bArr) {
        this.f = i;
        this.a = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.c = qkgVar4;
        this.e = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, char[][] cArr) {
        this.f = i;
        this.d = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
        this.e = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, float[][] fArr) {
        this.f = i;
        this.c = qkgVar;
        this.e = qkgVar2;
        this.a = qkgVar3;
        this.d = qkgVar4;
        this.b = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, int[][] iArr) {
        this.f = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
        this.e = qkgVar4;
        this.d = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, short[][] sArr) {
        this.f = i;
        this.d = qkgVar;
        this.c = qkgVar2;
        this.e = qkgVar3;
        this.b = qkgVar4;
        this.a = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, boolean[][] zArr) {
        this.f = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, byte[][][] bArr) {
        this.f = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, char[][][] cArr) {
        this.f = i;
        this.e = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.b = qkgVar4;
        this.c = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, float[][][] fArr) {
        this.f = i;
        this.a = qkgVar;
        this.e = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.b = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, int[][][] iArr) {
        this.f = i;
        this.a = qkgVar;
        this.e = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.b = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, short[][][] sArr) {
        this.f = i;
        this.e = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
        this.d = qkgVar5;
    }

    public bno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, boolean[][][] zArr) {
        this.f = i;
        this.a = qkgVar;
        this.e = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.b = qkgVar5;
    }

    public static bno a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        return new bno(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, 0);
    }

    public static bno b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        return new bno(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, 3, (short[]) null);
    }

    public static bno c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        return new bno(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, 4, (int[]) null);
    }

    public static bno d(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        return new bno(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, 8, (char[][]) null);
    }

    public static bno e(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        return new bno(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, 13, (byte[][][]) null);
    }

    public static bno f(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        return new bno(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, 20, (char[]) null, (byte[]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        Object objH;
        switch (this.f) {
            case 0:
                return new bnn((lap) this.a.get(), (dyx) this.b.get(), ((gjo) this.c).get(), (Executor) this.d.get(), ((liq) this.e).get());
            case 1:
                return new mbg(this.c, this.d, this.e, this.b, this.a, null, null, null);
            case 2:
                final bzo bzoVar = (bzo) this.e.get();
                final bzn bznVar = (bzn) this.d.get();
                final jdy jdyVar = (jdy) this.b.get();
                ddf ddfVar = (ddf) this.a.get();
                final bqg bqgVar = ((etg) this.c).get();
                if (ddfVar.k(ddl.aP)) {
                    final byte[] bArr = null;
                    final byte[] bArr2 = null;
                    objH = ope.H(new iho(bzoVar, bznVar, bqgVar, bArr, bArr2) { // from class: bzi
                        public final /* synthetic */ bzo a;
                        public final /* synthetic */ bzn b;
                        public final /* synthetic */ bqg c;

                        @Override // java.lang.Runnable
                        public final void run() {
                            jdy jdyVar2 = this.d;
                            final bzo bzoVar2 = this.a;
                            final bzn bznVar2 = this.b;
                            bqg bqgVar2 = this.c;
                            bzd bzdVar = new bzd() { // from class: bzh
                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                /* JADX WARN: Code duplicated, block: B:193:0x0420  */
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.bzd
                                public final void a(long j, bzs bzsVar) {
                                    float f;
                                    bzo bzoVar3 = bzoVar2;
                                    bzn bznVar3 = bznVar2;
                                    List list = bzoVar3.c;
                                    Long lValueOf = Long.valueOf(j);
                                    list.add(lValueOf);
                                    bzoVar3.d.add(Long.valueOf(bzoVar3.e.a()));
                                    poy poyVarM = pdl.p.m();
                                    String string = bznVar3.b.a.toString();
                                    if (poyVarM.c) {
                                        poyVarM.m();
                                        poyVarM.c = false;
                                    }
                                    pdl pdlVar = (pdl) poyVarM.b;
                                    string.getClass();
                                    pdlVar.a |= 1;
                                    pdlVar.b = string;
                                    int iIndexOf = bznVar3.b.c.indexOf(lValueOf) + 1;
                                    if (poyVarM.c) {
                                        poyVarM.m();
                                        poyVarM.c = false;
                                    }
                                    pdl pdlVar2 = (pdl) poyVarM.b;
                                    int i = 2;
                                    int i2 = pdlVar2.a | 2;
                                    pdlVar2.a = i2;
                                    pdlVar2.c = iIndexOf;
                                    pdlVar2.d = 0;
                                    int i3 = 4;
                                    int i4 = i2 | 4;
                                    pdlVar2.a = i4;
                                    long j2 = bzsVar.a;
                                    int i5 = i4 | 8;
                                    pdlVar2.a = i5;
                                    pdlVar2.e = j2;
                                    long j3 = bzsVar.b;
                                    int i6 = i5 | 16;
                                    pdlVar2.a = i6;
                                    pdlVar2.f = j3;
                                    int i7 = bzsVar.c;
                                    int i8 = i6 | 32;
                                    pdlVar2.a = i8;
                                    pdlVar2.g = i7;
                                    int i9 = bzsVar.d;
                                    int i10 = i8 | 64;
                                    pdlVar2.a = i10;
                                    pdlVar2.h = i9;
                                    int i11 = bzsVar.e;
                                    int i12 = i10 | 128;
                                    pdlVar2.a = i12;
                                    pdlVar2.i = i11;
                                    float f2 = bzsVar.f;
                                    pdlVar2.a = i12 | 256;
                                    pdlVar2.j = f2;
                                    puc pucVar = bzsVar.g.i;
                                    if (pucVar == null) {
                                        pucVar = puc.i;
                                    }
                                    ptw ptwVar = pucVar.d;
                                    if (ptwVar == null) {
                                        ptwVar = ptw.b;
                                    }
                                    if (ptwVar.a.size() > 138) {
                                        puc pucVar2 = bzsVar.g.i;
                                        if (pucVar2 == null) {
                                            pucVar2 = puc.i;
                                        }
                                        ptw ptwVar2 = pucVar2.d;
                                        if (ptwVar2 == null) {
                                            ptwVar2 = ptw.b;
                                        }
                                        float fD = ptwVar2.a.d(138);
                                        if (poyVarM.c) {
                                            poyVarM.m();
                                            poyVarM.c = false;
                                        }
                                        pdl pdlVar3 = (pdl) poyVarM.b;
                                        pdlVar3.a |= 512;
                                        pdlVar3.l = fD;
                                    }
                                    puc pucVar3 = bzsVar.g.i;
                                    if (pucVar3 == null) {
                                        pucVar3 = puc.i;
                                    }
                                    if (pucVar3.i("v_sign")) {
                                        puc pucVar4 = bzsVar.g.i;
                                        if (pucVar4 == null) {
                                            pucVar4 = puc.i;
                                        }
                                        pqh pqhVar = pucVar4.c;
                                        if (!pqhVar.containsKey("v_sign")) {
                                            throw new IllegalArgumentException();
                                        }
                                        float f3 = ((pub) pqhVar.get("v_sign")).a;
                                        if (poyVarM.c) {
                                            poyVarM.m();
                                            poyVarM.c = false;
                                        }
                                        pdl pdlVar4 = (pdl) poyVarM.b;
                                        pdlVar4.a |= 1024;
                                        pdlVar4.m = f3;
                                    }
                                    puc pucVar5 = bzsVar.g.i;
                                    if (pucVar5 == null) {
                                        pucVar5 = puc.i;
                                    }
                                    if (pucVar5.i("stop")) {
                                        puc pucVar6 = bzsVar.g.i;
                                        if (pucVar6 == null) {
                                            pucVar6 = puc.i;
                                        }
                                        pqh pqhVar2 = pucVar6.c;
                                        if (!pqhVar2.containsKey("stop")) {
                                            throw new IllegalArgumentException();
                                        }
                                        float f4 = ((pub) pqhVar2.get("stop")).a;
                                        if (poyVarM.c) {
                                            poyVarM.m();
                                            poyVarM.c = false;
                                        }
                                        pdl pdlVar5 = (pdl) poyVarM.b;
                                        pdlVar5.a |= 2048;
                                        pdlVar5.n = f4;
                                    }
                                    puc pucVar7 = bzsVar.g.i;
                                    if (pucVar7 == null) {
                                        pucVar7 = puc.i;
                                    }
                                    if (pucVar7.i("thumbs_up")) {
                                        puc pucVar8 = bzsVar.g.i;
                                        if (pucVar8 == null) {
                                            pucVar8 = puc.i;
                                        }
                                        pqh pqhVar3 = pucVar8.c;
                                        if (!pqhVar3.containsKey("thumbs_up")) {
                                            throw new IllegalArgumentException();
                                        }
                                        float f5 = ((pub) pqhVar3.get("thumbs_up")).a;
                                        if (poyVarM.c) {
                                            poyVarM.m();
                                            poyVarM.c = false;
                                        }
                                        pdl pdlVar6 = (pdl) poyVarM.b;
                                        pdlVar6.a |= 4096;
                                        pdlVar6.o = f5;
                                    }
                                    pte pteVar = bzsVar.g.e;
                                    if (pteVar == null) {
                                        pteVar = pte.b;
                                    }
                                    for (ptd ptdVar : pteVar.a) {
                                        poy poyVarM2 = pdk.A.m();
                                        if ((ptdVar.a & 1) != 0) {
                                            ptb ptbVar = ptdVar.b;
                                            if (ptbVar == null) {
                                                ptbVar = ptb.f;
                                            }
                                            poy poyVarM3 = pdj.f.m();
                                            float f6 = ptbVar.b;
                                            if (poyVarM3.c) {
                                                poyVarM3.m();
                                                poyVarM3.c = false;
                                            }
                                            pdj pdjVar = (pdj) poyVarM3.b;
                                            int i13 = pdjVar.a | 1;
                                            pdjVar.a = i13;
                                            pdjVar.b = f6;
                                            float f7 = ptbVar.d;
                                            int i14 = i13 | i3;
                                            pdjVar.a = i14;
                                            pdjVar.d = f7;
                                            float f8 = ptbVar.c;
                                            int i15 = i14 | i;
                                            pdjVar.a = i15;
                                            pdjVar.c = f8;
                                            float f9 = ptbVar.e;
                                            pdjVar.a = i15 | 8;
                                            pdjVar.e = f9;
                                            pdj pdjVar2 = (pdj) poyVarM3.j();
                                            if (poyVarM2.c) {
                                                poyVarM2.m();
                                                poyVarM2.c = false;
                                            }
                                            pdk pdkVar = (pdk) poyVarM2.b;
                                            pdjVar2.getClass();
                                            pdkVar.b = pdjVar2;
                                            pdkVar.a |= 1;
                                        }
                                        if ((ptdVar.a & i) != 0) {
                                            float f10 = ptdVar.d;
                                            if (poyVarM2.c) {
                                                poyVarM2.m();
                                                poyVarM2.c = false;
                                            }
                                            pdk pdkVar2 = (pdk) poyVarM2.b;
                                            pdkVar2.a |= i;
                                            pdkVar2.c = f10;
                                        }
                                        if ((ptdVar.a & i3) != 0) {
                                            float f11 = ptdVar.e;
                                            if (poyVarM2.c) {
                                                poyVarM2.m();
                                                poyVarM2.c = false;
                                            }
                                            pdk pdkVar3 = (pdk) poyVarM2.b;
                                            pdkVar3.a |= i3;
                                            pdkVar3.d = f11;
                                        }
                                        if ((ptdVar.a & 8) != 0) {
                                            float f12 = ptdVar.f;
                                            if (poyVarM2.c) {
                                                poyVarM2.m();
                                                poyVarM2.c = false;
                                            }
                                            pdk pdkVar4 = (pdk) poyVarM2.b;
                                            pdkVar4.a |= 8;
                                            pdkVar4.e = f12;
                                        }
                                        if ((ptdVar.a & 16) != 0) {
                                            float f13 = ptdVar.g;
                                            if (poyVarM2.c) {
                                                poyVarM2.m();
                                                poyVarM2.c = false;
                                            }
                                            pdk pdkVar5 = (pdk) poyVarM2.b;
                                            pdkVar5.a |= 16;
                                            pdkVar5.f = f13;
                                        }
                                        if ((ptdVar.a & 128) != 0) {
                                            float f14 = ptdVar.k;
                                            if (poyVarM2.c) {
                                                poyVarM2.m();
                                                poyVarM2.c = false;
                                            }
                                            pdk pdkVar6 = (pdk) poyVarM2.b;
                                            pdkVar6.a |= 16777216;
                                            pdkVar6.z = f14;
                                        }
                                        String[] strArr = new String[19];
                                        strArr[0] = "face_landmark_motion_mean";
                                        strArr[1] = "face_landmark_motion_variance";
                                        strArr[i] = "eyes_visible";
                                        strArr[3] = "mouth_open";
                                        strArr[i3] = "frontal_gaze";
                                        strArr[5] = "smiling";
                                        strArr[6] = "amusement";
                                        strArr[7] = "contentment";
                                        strArr[8] = "elation";
                                        strArr[9] = "surprise";
                                        strArr[10] = "tongue_out";
                                        strArr[11] = "wink";
                                        strArr[12] = "puckered_lips";
                                        strArr[13] = "puffy_cheeks";
                                        strArr[14] = "pouting";
                                        strArr[15] = "dark_glasses";
                                        strArr[16] = "blurry";
                                        strArr[17] = "under_exposed";
                                        strArr[18] = "mouth_moving_score";
                                        ope opeVarG = ope.G(strArr);
                                        for (pta ptaVar : ptdVar.i) {
                                            if (opeVarG.contains(ptaVar.b)) {
                                                int i16 = ptaVar.a;
                                                if ((i16 & 4) != 0) {
                                                    f = ptaVar.c;
                                                } else if ((i16 & 8) != 0) {
                                                    f = ptaVar.d;
                                                }
                                                String str = ptaVar.b;
                                                switch (str) {
                                                    case "face_landmark_motion_mean":
                                                        if (poyVarM2.c) {
                                                            poyVarM2.m();
                                                            poyVarM2.c = false;
                                                        }
                                                        pdk pdkVar7 = (pdk) poyVarM2.b;
                                                        pdkVar7.a |= 32;
                                                        pdkVar7.g = f;
                                                        break;
                                                    case "face_landmark_motion_variance":
                                                        if (poyVarM2.c) {
                                                            poyVarM2.m();
                                                            poyVarM2.c = false;
                                                        }
                                                        pdk pdkVar8 = (pdk) poyVarM2.b;
                                                        pdkVar8.a |= 64;
                                                        pdkVar8.h = f;
                                                        break;
                                                    case "eyes_visible":
                                                        if (poyVarM2.c) {
                                                            poyVarM2.m();
                                                            poyVarM2.c = false;
                                                        }
                                                        pdk pdkVar9 = (pdk) poyVarM2.b;
                                                        pdkVar9.a |= 128;
                                                        pdkVar9.i = f;
                                                        break;
                                                    case "mouth_open":
                                                        if (poyVarM2.c) {
                                                            poyVarM2.m();
                                                            poyVarM2.c = false;
                                                        }
                                                        pdk pdkVar10 = (pdk) poyVarM2.b;
                                                        pdkVar10.a |= 256;
                                                        pdkVar10.j = f;
                                                        break;
                                                    case "frontal_gaze":
                                                        if (poyVarM2.c) {
                                                            poyVarM2.m();
                                                            poyVarM2.c = false;
                                                        }
                                                        pdk pdkVar11 = (pdk) poyVarM2.b;
                                                        pdkVar11.a |= 512;
                                                        pdkVar11.k = f;
                                                        break;
                                                    case "smiling":
                                                        if (poyVarM2.c) {
                                                            poyVarM2.m();
                                                            poyVarM2.c = false;
                                                        }
                                                        pdk pdkVar12 = (pdk) poyVarM2.b;
                                                        pdkVar12.a |= 1024;
                                                        pdkVar12.l = f;
                                                        break;
                                                    case "amusement":
                                                        if (poyVarM2.c) {
                                                            poyVarM2.m();
                                                            poyVarM2.c = false;
                                                        }
                                                        pdk pdkVar13 = (pdk) poyVarM2.b;
                                                        pdkVar13.a |= 2048;
                                                        pdkVar13.m = f;
                                                        break;
                                                    case "contentment":
                                                        if (poyVarM2.c) {
                                                            poyVarM2.m();
                                                            poyVarM2.c = false;
                                                        }
                                                        pdk pdkVar14 = (pdk) poyVarM2.b;
                                                        pdkVar14.a |= 4096;
                                                        pdkVar14.n = f;
                                                        break;
                                                    case "elation":
                                                        if (poyVarM2.c) {
                                                            poyVarM2.m();
                                                            poyVarM2.c = false;
                                                        }
                                                        pdk pdkVar15 = (pdk) poyVarM2.b;
                                                        pdkVar15.a |= 8192;
                                                        pdkVar15.o = f;
                                                        break;
                                                    case "surprise":
                                                        if (poyVarM2.c) {
                                                            poyVarM2.m();
                                                            poyVarM2.c = false;
                                                        }
                                                        pdk pdkVar16 = (pdk) poyVarM2.b;
                                                        pdkVar16.a |= 16384;
                                                        pdkVar16.p = f;
                                                        break;
                                                    case "tongue_out":
                                                        if (poyVarM2.c) {
                                                            poyVarM2.m();
                                                            poyVarM2.c = false;
                                                        }
                                                        pdk pdkVar17 = (pdk) poyVarM2.b;
                                                        pdkVar17.a |= 32768;
                                                        pdkVar17.q = f;
                                                        break;
                                                    case "wink":
                                                        if (poyVarM2.c) {
                                                            poyVarM2.m();
                                                            poyVarM2.c = false;
                                                        }
                                                        pdk pdkVar18 = (pdk) poyVarM2.b;
                                                        pdkVar18.a |= 65536;
                                                        pdkVar18.r = f;
                                                        break;
                                                    case "puckered_lips":
                                                        if (poyVarM2.c) {
                                                            poyVarM2.m();
                                                            poyVarM2.c = false;
                                                        }
                                                        pdk pdkVar19 = (pdk) poyVarM2.b;
                                                        pdkVar19.a |= 131072;
                                                        pdkVar19.s = f;
                                                        break;
                                                    case "puffy_cheeks":
                                                        if (poyVarM2.c) {
                                                            poyVarM2.m();
                                                            poyVarM2.c = false;
                                                        }
                                                        pdk pdkVar20 = (pdk) poyVarM2.b;
                                                        pdkVar20.a |= 262144;
                                                        pdkVar20.t = f;
                                                        break;
                                                    case "pouting":
                                                        if (poyVarM2.c) {
                                                            poyVarM2.m();
                                                            poyVarM2.c = false;
                                                        }
                                                        pdk pdkVar21 = (pdk) poyVarM2.b;
                                                        pdkVar21.a |= 524288;
                                                        pdkVar21.u = f;
                                                        break;
                                                    case "dark_glasses":
                                                        if (poyVarM2.c) {
                                                            poyVarM2.m();
                                                            poyVarM2.c = false;
                                                        }
                                                        pdk pdkVar22 = (pdk) poyVarM2.b;
                                                        pdkVar22.a |= 1048576;
                                                        pdkVar22.v = f;
                                                        break;
                                                    case "blurry":
                                                        if (poyVarM2.c) {
                                                            poyVarM2.m();
                                                            poyVarM2.c = false;
                                                        }
                                                        pdk pdkVar23 = (pdk) poyVarM2.b;
                                                        pdkVar23.a |= 2097152;
                                                        pdkVar23.w = f;
                                                        break;
                                                    case "under_exposed":
                                                        if (poyVarM2.c) {
                                                            poyVarM2.m();
                                                            poyVarM2.c = false;
                                                        }
                                                        pdk pdkVar24 = (pdk) poyVarM2.b;
                                                        pdkVar24.a |= 4194304;
                                                        pdkVar24.x = f;
                                                        break;
                                                    case "mouth_moving_score":
                                                        if (poyVarM2.c) {
                                                            poyVarM2.m();
                                                            poyVarM2.c = false;
                                                        }
                                                        pdk pdkVar25 = (pdk) poyVarM2.b;
                                                        pdkVar25.a |= 8388608;
                                                        pdkVar25.y = f;
                                                        break;
                                                    default:
                                                        String strValueOf = String.valueOf(str);
                                                        throw new AssertionError(strValueOf.length() != 0 ? "Unexpected face attribute: ".concat(strValueOf) : new String("Unexpected face attribute: "));
                                                }
                                            }
                                        }
                                        pdk pdkVar26 = (pdk) poyVarM2.j();
                                        if (poyVarM.c) {
                                            poyVarM.m();
                                            poyVarM.c = false;
                                        }
                                        pdl pdlVar7 = (pdl) poyVarM.b;
                                        pdkVar26.getClass();
                                        ppm ppmVar = pdlVar7.k;
                                        if (!ppmVar.c()) {
                                            pdlVar7.k = ppd.B(ppmVar);
                                        }
                                        pdlVar7.k.add(pdkVar26);
                                        i3 = 4;
                                        i = 2;
                                    }
                                    bznVar3.a.U(27, null, (pdl) poyVarM.j(), null, null);
                                }
                            };
                            synchronized (jdyVar2.h) {
                                jdyVar2.h.add(bzdVar);
                            }
                            byte[] bArr3 = null;
                            bqgVar2.i().c(new lie(bzdVar, bArr3, bArr3) { // from class: bzc
                                public final /* synthetic */ bzd a;

                                @Override // defpackage.lie, java.lang.AutoCloseable
                                public final void close() {
                                    jdy jdyVar3 = this.b;
                                    bzd bzdVar2 = this.a;
                                    synchronized (jdyVar3.h) {
                                        jdyVar3.h.remove(bzdVar2);
                                    }
                                }
                            });
                        }
                    });
                } else {
                    objH = orx.a;
                }
                qmd.ae(objH);
                return objH;
            case 3:
                final ghx ghxVar = ((gjo) this.b).get();
                final ddf ddfVar2 = (ddf) this.a.get();
                final lap lapVar = (lap) this.d.get();
                final ojc ojcVar = (ojc) this.e.get();
                final bza bzaVar = ((bzb) this.c).get();
                return aas.d(new Runnable() { // from class: bzj
                    @Override // java.lang.Runnable
                    public final void run() {
                        ddf ddfVar3 = ddfVar2;
                        ghx ghxVar2 = ghxVar;
                        ojc ojcVar2 = ojcVar;
                        bza bzaVar2 = bzaVar;
                        lap lapVar2 = lapVar;
                        if (ddfVar3.k(ddl.aP) && ghxVar2.k() == lwd.FRONT && ojcVar2.g()) {
                            lnx lnxVar = (lnx) ojcVar2.c();
                            lce lceVar = (lce) bzaVar2.a.get();
                            lceVar.getClass();
                            lda ldaVar = (lda) bzaVar2.b.get();
                            ldaVar.getClass();
                            jdy jdyVar2 = (jdy) bzaVar2.c.get();
                            jdyVar2.getClass();
                            bzu bzuVar = (bzu) bzaVar2.d.get();
                            bzuVar.getClass();
                            qkg qkgVar = bzaVar2.e;
                            Executor executor = (Executor) bzaVar2.f.get();
                            executor.getClass();
                            lnc lncVar = (lnc) bzaVar2.g.get();
                            lncVar.getClass();
                            lco lcoVar = (lco) bzaVar2.h.get();
                            lcoVar.getClass();
                            pkr pkrVar = ((pks) bzaVar2.i).get();
                            bzv bzvVar = (bzv) bzaVar2.j.get();
                            bzvVar.getClass();
                            pyn pynVar = ((pyv) bzaVar2.k).get();
                            pynVar.getClass();
                            ljf ljfVar = (ljf) bzaVar2.l.get();
                            ljfVar.getClass();
                            byz byzVar = new byz(lceVar, ldaVar, jdyVar2, bzuVar, qkgVar, executor, lncVar, lcoVar, pkrVar, bzvVar, pynVar, ljfVar, lnxVar, null);
                            lapVar2.c(byzVar);
                            byzVar.f.execute(new byx(byzVar, 0));
                        }
                    }
                }, "autotimer");
            case 4:
                return new bzv((jth) this.d.get(), (lzb) this.b.get(), ((gjp) this.c).get(), (jug) this.a.get(), (ddf) this.e.get());
            case 5:
                return new cqb((cmm) this.c.get(), (cka) this.a.get(), (jng) this.e.get(), (cvo) this.d.get(), ((cqd) this.b).get());
            case 6:
                lzi lziVar = (lzi) this.a.get();
                lzh lzhVar = (lzh) this.c.get();
                hwx hwxVar = (hwx) this.b.get();
                return new dep(lziVar, lzhVar, hwxVar, ((deo) this.d).get());
            case 7:
                return new dfx(((emd) this.a).get(), (dfl) this.d.get(), lzg.c(), (dfr) this.b.get(), (hpu) this.c.get(), ((ikx) this.e).get());
            case 8:
                final ddf ddfVar3 = (ddf) this.c.get();
                final dju djuVar = (dju) this.a.get();
                return aas.d(new Runnable() { // from class: djz
                    @Override // java.lang.Runnable
                    public final void run() {
                        ddf ddfVar4 = ddfVar3;
                        dju djuVar2 = djuVar;
                        ddi ddiVar = ddl.a;
                        ddfVar4.b();
                        djuVar2.c = false;
                        DebugCanvasView debugCanvasView = djuVar2.b;
                        if (debugCanvasView == null) {
                            ((oug) ((oug) dju.a.c()).G((char) 810)).o("UI view not yet initialized");
                        } else {
                            debugCanvasView.setVisibility(4);
                        }
                    }
                }, "doverlay");
            case 9:
                CameraManager cameraManager = ((emu) this.d).get();
                pyn pynVarA = pyr.a(this.c);
                return new dkl(cameraManager, pynVarA, (Executor) this.b.get(), ((cxd) this.a).get());
            case 10:
                return new dky(((dkv) this.c).get(), ((dla) this.a).get(), (lda) this.b.get(), ((dgb) this.e).get(), (Executor) this.d.get());
            case 11:
                return new dlg((dll) this.b.get(), ((etg) this.a).get(), ((etf) this.c).get(), ((dlj) this.d).get(), (lar) this.e.get());
            case 12:
                bqg bqgVar2 = ((etg) this.c).get();
                ljf ljfVar = (ljf) this.e.get();
                Context context = ((emd) this.a).get();
                ddf ddfVar4 = (ddf) this.d.get();
                lda ldaVar = (lda) this.b.get();
                lap lapVarI = bqgVar2.i();
                dmn dmnVar = new dmn(context, ljfVar, ddfVar4, ldaVar);
                lapVarI.c(dmnVar);
                return dmnVar;
            case 13:
                boolean zBooleanValue = ((Boolean) this.c.get()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) this.b.get()).booleanValue();
                ojc ojcVarB = ((ewk) this.a).b();
                jtx jtxVar = (jtx) this.d.get();
                lap lapVar2 = (lap) this.e.get();
                if (!zBooleanValue || !zBooleanValue2 || !ojcVarB.g()) {
                    return oih.a;
                }
                final mpi mpiVarH = jtxVar.h("vesper_ad_postprocess");
                jws jwsVarA = ((dou) ojcVarB.c()).a();
                lapVar2.c(jwsVarA);
                lapVar2.c(new lie() { // from class: dny
                    @Override // defpackage.lie, java.lang.AutoCloseable
                    public final void close() {
                        mpiVarH.close();
                    }
                });
                return ojc.i(jwsVarA);
            case 14:
                final dsz dszVar = (dsz) this.e.get();
                final dqx dqxVar = (dqx) this.a.get();
                final dqx dqxVar2 = (dqx) this.d.get();
                final dqx dqxVar3 = (dqx) this.b.get();
                dqv dqvVarA = ((dsa) this.c).a();
                drp drpVarB = dru.b(dszVar);
                drpVarB.c = dqvVarA;
                drpVarB.d(new drs() { // from class: drw
                    @Override // defpackage.drs
                    public final void a(long j, lzv lzvVar) {
                        dszVar.g(j, (dqxVar.a(j) * 0.15f) + (dqxVar2.a(j) * 0.25f) + (dqxVar3.a(j) * 0.6f));
                    }
                });
                return drpVarB.a();
            case 15:
                ((dut) this.e).get();
                ((dus) this.b).get();
                return new duy(((dur) this.a).get(), ((duu) this.c).get(), ((duv) this.d).get());
            case 16:
                Context context2 = ((duq) this.a).get();
                Resources resources = ((dut) this.e).get();
                duy duyVar = (duy) this.c.get();
                duj dujVar = ((duu) this.d).get();
                FocusIndicatorView focusIndicatorView = ((dus) this.b).get();
                ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(context2, R.animator.active_focus_scan_inner_splash_diameter_scale_up);
                valueAnimator.addUpdateListener(duyVar.a());
                ValueAnimator valueAnimator2 = (ValueAnimator) AnimatorInflater.loadAnimator(context2, R.animator.active_focus_scan_inner_splash_opacity_fade_in);
                valueAnimator2.addUpdateListener(duyVar.b());
                ValueAnimator valueAnimator3 = (ValueAnimator) AnimatorInflater.loadAnimator(context2, R.animator.active_focus_scan_inner_splash_opacity_fade_out);
                valueAnimator3.addUpdateListener(duyVar.b());
                ValueAnimator valueAnimator4 = (ValueAnimator) AnimatorInflater.loadAnimator(context2, R.animator.active_focus_scan_outer_ring_diameter_scale_down);
                valueAnimator4.addUpdateListener(duyVar.c());
                ValueAnimator valueAnimator5 = (ValueAnimator) AnimatorInflater.loadAnimator(context2, R.animator.active_focus_scan_outer_ring_opacity_fade_in);
                valueAnimator5.addUpdateListener(duyVar.d());
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5);
                animatorSet.addListener(new duz(resources, dujVar, focusIndicatorView));
                animatorSet.addListener(new jse());
                return mip.ej(animatorSet);
            case 17:
                Context context3 = ((duq) this.a).get();
                Resources resources2 = ((dut) this.e).get();
                duy duyVar2 = (duy) this.c.get();
                duj dujVar2 = ((duu) this.d).get();
                FocusIndicatorView focusIndicatorView2 = ((dus) this.b).get();
                ValueAnimator valueAnimator6 = (ValueAnimator) AnimatorInflater.loadAnimator(context3, R.animator.focus_lock_hold_inner_splash_diameter_scale_up);
                valueAnimator6.addUpdateListener(duyVar2.a());
                ValueAnimator valueAnimator7 = (ValueAnimator) AnimatorInflater.loadAnimator(context3, R.animator.focus_lock_hold_inner_splash_opacity_fade_in);
                valueAnimator7.addUpdateListener(duyVar2.b());
                ValueAnimator valueAnimator8 = (ValueAnimator) AnimatorInflater.loadAnimator(context3, R.animator.focus_lock_hold_outer_ring_opacity_fade_in);
                valueAnimator8.addUpdateListener(duyVar2.d());
                ValueAnimator valueAnimator9 = (ValueAnimator) AnimatorInflater.loadAnimator(context3, R.animator.focus_lock_hold_outer_ring_thickness_scale_up);
                valueAnimator9.addUpdateListener(new dux(duyVar2, 4));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(valueAnimator6).with(valueAnimator7).with(valueAnimator8).with(valueAnimator9);
                animatorSet2.addListener(new dvc(resources2, dujVar2, focusIndicatorView2));
                animatorSet2.addListener(new jse());
                return mip.ej(animatorSet2);
            case 18:
                Context context4 = ((duq) this.a).get();
                Resources resources3 = ((dut) this.e).get();
                duy duyVar3 = (duy) this.c.get();
                duj dujVar3 = ((duu) this.d).get();
                FocusIndicatorView focusIndicatorView3 = ((dus) this.b).get();
                ValueAnimator valueAnimator10 = (ValueAnimator) AnimatorInflater.loadAnimator(context4, R.animator.active_focus_scan_inner_splash_diameter_scale_up);
                valueAnimator10.addUpdateListener(duyVar3.a());
                ValueAnimator valueAnimator11 = (ValueAnimator) AnimatorInflater.loadAnimator(context4, R.animator.active_focus_scan_inner_splash_opacity_fade_in);
                valueAnimator11.addUpdateListener(duyVar3.b());
                ValueAnimator valueAnimator12 = (ValueAnimator) AnimatorInflater.loadAnimator(context4, R.animator.active_focus_scan_inner_splash_opacity_fade_out);
                valueAnimator12.addUpdateListener(duyVar3.b());
                ValueAnimator valueAnimator13 = (ValueAnimator) AnimatorInflater.loadAnimator(context4, R.animator.active_focus_scan_outer_ring_diameter_scale_down);
                valueAnimator13.addUpdateListener(duyVar3.c());
                ValueAnimator valueAnimator14 = (ValueAnimator) AnimatorInflater.loadAnimator(context4, R.animator.active_focus_scan_outer_ring_opacity_fade_in);
                valueAnimator14.addUpdateListener(duyVar3.d());
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(valueAnimator10, valueAnimator11, valueAnimator12, valueAnimator13, valueAnimator14);
                animatorSet3.addListener(new dva(resources3, dujVar3, focusIndicatorView3));
                animatorSet3.addListener(new jse());
                return mip.ej(animatorSet3);
            case 19:
                Context context5 = ((duq) this.a).get();
                Resources resources4 = ((dut) this.e).get();
                duy duyVar4 = (duy) this.c.get();
                duj dujVar4 = ((duu) this.d).get();
                FocusIndicatorView focusIndicatorView4 = ((dus) this.b).get();
                ValueAnimator valueAnimator15 = (ValueAnimator) AnimatorInflater.loadAnimator(context5, R.animator.passive_focus_scan_outer_ring_diameter_scale_down);
                valueAnimator15.addUpdateListener(duyVar4.c());
                ValueAnimator valueAnimator16 = (ValueAnimator) AnimatorInflater.loadAnimator(context5, R.animator.passive_focus_scan_outer_ring_opacity_fade_in);
                valueAnimator16.addUpdateListener(duyVar4.d());
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(valueAnimator15, valueAnimator16);
                animatorSet4.addListener(new dvb(resources4, dujVar4, focusIndicatorView4));
                animatorSet4.addListener(new jse());
                return mip.ej(animatorSet4);
            default:
                return new eem((lce) this.b.get(), (lce) this.c.get(), (ddf) this.a.get(), (lap) this.d.get(), (fjs) this.e.get());
        }
    }
}
