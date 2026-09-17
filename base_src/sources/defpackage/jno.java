package defpackage;

import android.hardware.HardwareBuffer;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class jno implements jws {
    public final mpi a;
    private final mqk b;
    private final mri c;
    private final mrg d;
    private final ljf e;
    private final jnn f;
    private mrf g;
    private mrf h;
    private mor i;
    private final float[] j = new float[128];
    private final float[] k = new float[128];
    private final float[] l = new float[128];
    private final float[] m = new float[128];
    private final mrd n;
    private final mrd o;

    public jno(mpi mpiVar, jnn jnnVar, ljf ljfVar) {
        this.a = mpiVar;
        this.d = mrg.a(mpiVar);
        this.f = jnnVar;
        this.e = ljfVar;
        dxz dxzVar = new dxz(mpiVar, 12);
        this.b = dxzVar.a();
        this.c = mri.e(dxzVar.a, mrj.b(dxzVar.d), mrj.a(dxzVar.c));
        this.n = f(mpiVar, "#version 320 es\nprecision highp float;\nuniform sampler2D uImgTex;\nuniform int weightLen;\nuniform float weight[128];\nuniform float offsetX[128];\nuniform float offsetY[128];\nin vec2 texCoord;\nout vec4 outColor;\nvoid main() {\n  vec4 fc = texture(uImgTex, texCoord) * weight[0];\n  for (int i = 1; i < weightLen; i++) {\n    fc += texture(uImgTex, texCoord + vec2(offsetX[i], offsetY[i])) * weight[i];\n  }\n  for (int i = 1; i < weightLen; i++) {\n    fc += texture(uImgTex, texCoord - vec2(offsetX[i], offsetY[i])) * weight[i];\n  }\n  outColor = fc;\n}\n");
        this.o = f(mpiVar, "#version 320 es\n#extension GL_EXT_YUV_target : require\nprecision highp float;\nuniform float fade;\nuniform sampler2D uImgTex;\nin vec2 texCoord;\nlayout(yuv) out vec4 outColor;\nvoid main() {\n  outColor =     vec4(rgb_2_yuv(texture(uImgTex, texCoord).xyz * fade, itu_601_full_range), 1.0);\n}");
    }

    private final void e() {
        if (this.g == null) {
            obr.aQ(this.h == null);
            return;
        }
        this.e.e("closeTextures");
        mrf mrfVar = this.g;
        mrfVar.getClass();
        mrfVar.close();
        mrf mrfVar2 = this.h;
        mrfVar2.getClass();
        mrfVar2.close();
        this.g = null;
        this.h = null;
        this.e.f();
    }

    private static mrd f(mpi mpiVar, String str) {
        mrd mrdVarH = mrd.h(mpiVar, "#version 320 es\nin vec4 aPosition;\nin vec2 aTexCoord;\nuniform float zoomFactor;\nout vec2 texCoord;\nvoid main() {\n  texCoord = aTexCoord;\n  gl_Position = vec4(zoomFactor * aPosition.xyz, aPosition.w);\n}");
        mrd mrdVarB = mrd.b(mpiVar, str);
        mqm mqmVarI = mrd.i(mpiVar);
        mqmVarI.a(mwp.g(mrdVarH));
        mqmVarI.a(mwp.g(mrdVarB));
        return mqmVarI.b();
    }

    @Override // defpackage.jws
    public final jwt a() {
        return jwt.BLUR;
    }

    @Override // defpackage.jws
    public final /* synthetic */ String b() {
        return mip.dL(this);
    }

    @Override // defpackage.jws
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.jws, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        e();
        this.n.close();
        this.o.close();
        this.d.close();
    }

    /* JADX WARN: Code duplicated, block: B:203:0x039f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x03b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x03c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x03cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:? A[Catch: all -> 0x03a5, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x03a5, blocks: (B:86:0x02fd, B:170:0x03a4), top: B:207:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:279:? A[Catch: all -> 0x03b7, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #15 {all -> 0x03b7, blocks: (B:87:0x0300, B:180:0x03b6), top: B:228:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:281:? A[Catch: all -> 0x03c7, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #24 {all -> 0x03c7, blocks: (B:88:0x0303, B:190:0x03c6), top: B:242:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:283:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:52:0x0183  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c8 A[Catch: all -> 0x019b, TryCatch #36 {all -> 0x019b, blocks: (B:53:0x0185, B:62:0x01bf, B:64:0x01c8, B:65:0x01c9, B:68:0x01da), top: B:260:0x0185 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01da A[Catch: all -> 0x019b, TRY_LEAVE, TryCatch #36 {all -> 0x019b, blocks: (B:53:0x0185, B:62:0x01bf, B:64:0x01c8, B:65:0x01c9, B:68:0x01da), top: B:260:0x0185 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x02e9 A[Catch: all -> 0x0328, TryCatch #6 {all -> 0x0328, blocks: (B:78:0x02df, B:80:0x02e9, B:81:0x02ec, B:96:0x0313, B:102:0x031d, B:108:0x0327, B:75:0x0262, B:73:0x0212, B:71:0x01f6), top: B:212:0x01f6, inners: #26, #35, #38 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [mqb] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2, types: [mrd] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r23v0, types: [mpo, mrd] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r30v0, types: [lnx] */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v2, types: [mad] */
    /* JADX WARN: Type inference failed for: r31v0, types: [lmr] */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v2, types: [android.hardware.HardwareBuffer] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [mrg] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v18, types: [mqb] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v23, types: [mqb] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v4, types: [mpo] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // defpackage.jws
    public final /* synthetic */ void d(lmr lmrVar, lnx lnxVar, lmr lmrVar2) throws Throwable {
        Throwable th;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        Throwable th5;
        Throwable th6;
        Throwable th7;
        Throwable th8;
        ?? r3;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int iB;
        float fB;
        float fA;
        int i;
        ?? r10;
        ?? r23;
        float[] fArr;
        float f;
        float f2;
        int i2;
        int i3;
        mrd mrdVarM;
        mrd mrdVarM2;
        mrd mrdVarM3;
        float fExp;
        String str = "offsetX";
        String str2 = "weight";
        String str3 = "uImgTex";
        mad madVarD = lmrVar.d(lnxVar);
        try {
            try {
                mad madVarD2 = lmrVar2.d(lnxVar);
                try {
                    try {
                        madVarD.getClass();
                        madVarD2.getClass();
                        mpi mpiVar = this.a;
                        HardwareBuffer hardwareBufferF = madVarD.f();
                        try {
                            try {
                                HardwareBuffer hardwareBufferF2 = madVarD2.f();
                                try {
                                    try {
                                        hardwareBufferF.getClass();
                                        EGLImage eGLImage = new EGLImage(hardwareBufferF);
                                        try {
                                            try {
                                                hardwareBufferF2.getClass();
                                                EGLImage eGLImage2 = new EGLImage(hardwareBufferF2);
                                                try {
                                                    try {
                                                        mqg mqgVarB = mqg.b(mpiVar, eGLImage);
                                                        try {
                                                            try {
                                                                ?? K = mrd.k(mpiVar, eGLImage2);
                                                                try {
                                                                    madVarD.d();
                                                                    try {
                                                                        ljf ljfVar = this.e;
                                                                        try {
                                                                            String strValueOf = String.valueOf(this.f.b.d);
                                                                            try {
                                                                                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 15);
                                                                                sb.append("Launch: radius=");
                                                                                sb.append(strValueOf);
                                                                                ljfVar.e(sb.toString());
                                                                                obr.aQ(((Boolean) this.f.a.d).booleanValue());
                                                                                jnn jnnVar = this.f;
                                                                                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                                                                                try {
                                                                                    long j2 = jnnVar.f;
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (j2 == 0) {
                                                                                                                try {
                                                                                                                    if (jnnVar.g == 0) {
                                                                                                                        jnnVar.f = millis;
                                                                                                                        j = millis;
                                                                                                                    }
                                                                                                                    if (millis >= j) {
                                                                                                                        z = true;
                                                                                                                    } else {
                                                                                                                        z = false;
                                                                                                                    }
                                                                                                                    obr.aF(z);
                                                                                                                    jnnVar.g = millis;
                                                                                                                    jnnVar.a();
                                                                                                                    z2 = !((Boolean) this.f.a.d).booleanValue();
                                                                                                                    if (this.g == null) {
                                                                                                                        try {
                                                                                                                            this.e.e("allocateTextures");
                                                                                                                            if (this.g == null) {
                                                                                                                                z3 = true;
                                                                                                                            } else {
                                                                                                                                z3 = false;
                                                                                                                            }
                                                                                                                            obr.aQ(z3);
                                                                                                                            if (this.h == null) {
                                                                                                                                z4 = true;
                                                                                                                            } else {
                                                                                                                                z4 = false;
                                                                                                                            }
                                                                                                                            obr.aQ(z4);
                                                                                                                            mme mmeVar = mqgVarB.g().a;
                                                                                                                            float f3 = this.f.e;
                                                                                                                            mor morVar = new mor(new mme(Math.round(mmeVar.b() * f3), Math.round(mmeVar.a() * f3)));
                                                                                                                            this.g = mrf.g(this.a, morVar);
                                                                                                                            this.h = mrf.g(this.a, morVar);
                                                                                                                            this.i = morVar;
                                                                                                                            this.e.f();
                                                                                                                        } catch (Throwable th9) {
                                                                                                                            th8 = th9;
                                                                                                                            r3 = K;
                                                                                                                            try {
                                                                                                                                r3.close();
                                                                                                                                throw th8;
                                                                                                                            } catch (Throwable th10) {
                                                                                                                                throw th8;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    this.e.e("prep");
                                                                                                                    mrf mrfVar = this.g;
                                                                                                                    mrfVar.getClass();
                                                                                                                    mrf mrfVar2 = this.h;
                                                                                                                    mrfVar2.getClass();
                                                                                                                    iB = oxh.B(((Integer) this.f.b.d).intValue(), 1, 128);
                                                                                                                    mor morVar2 = this.i;
                                                                                                                    morVar2.getClass();
                                                                                                                    fB = 1.0f / morVar2.a.b();
                                                                                                                    mor morVar3 = this.i;
                                                                                                                    morVar3.getClass();
                                                                                                                    fA = 1.0f / morVar3.a.a();
                                                                                                                    i = 0;
                                                                                                                    r10 = K;
                                                                                                                    while (i < iB) {
                                                                                                                        r23 = r10;
                                                                                                                        try {
                                                                                                                            String str4 = str3;
                                                                                                                            float f4 = i;
                                                                                                                            this.k[i] = fB * f4;
                                                                                                                            this.l[i] = f4 * fA;
                                                                                                                            i++;
                                                                                                                            r10 = r23;
                                                                                                                            str3 = str4;
                                                                                                                        } catch (Throwable th11) {
                                                                                                                            th8 = th11;
                                                                                                                            r3 = r23;
                                                                                                                            r3.close();
                                                                                                                            throw th8;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    String str5 = str3;
                                                                                                                    r23 = r10;
                                                                                                                    fArr = this.m;
                                                                                                                    f = 2.0f / iB;
                                                                                                                    f2 = 0.0f;
                                                                                                                    i2 = 0;
                                                                                                                    while (i2 < iB) {
                                                                                                                        float f5 = i2 * f;
                                                                                                                        String str6 = str;
                                                                                                                        String str7 = str2;
                                                                                                                        fExp = (float) Math.exp((-(f5 * f5)) / 2.0f);
                                                                                                                        fArr[i2] = fExp;
                                                                                                                        if (i2 != 0) {
                                                                                                                            fExp += fExp;
                                                                                                                        }
                                                                                                                        f2 += fExp;
                                                                                                                        i2++;
                                                                                                                        str = str6;
                                                                                                                        str2 = str7;
                                                                                                                    }
                                                                                                                    String str8 = str;
                                                                                                                    String str9 = str2;
                                                                                                                    for (i3 = 0; i3 < iB; i3++) {
                                                                                                                        fArr[i3] = fArr[i3] / f2;
                                                                                                                    }
                                                                                                                    this.e.f();
                                                                                                                    K = "downscale";
                                                                                                                    this.e.e("downscale");
                                                                                                                    mrdVarM = mrd.m(mwp.f(mrfVar));
                                                                                                                    K = this.d;
                                                                                                                    K.d(mqgVarB, mrdVarM);
                                                                                                                    mrdVarM.close();
                                                                                                                    this.e.f();
                                                                                                                    K = "hblur";
                                                                                                                    this.e.e("hblur");
                                                                                                                    mrdVarM2 = mrd.m(mwp.f(mrfVar2));
                                                                                                                    K = mqb.b(this.c, this.b).a(this.n);
                                                                                                                    K.c("aPosition", 0);
                                                                                                                    K.c("aTexCoord", 1);
                                                                                                                    K.f("zoomFactor", 1.0f);
                                                                                                                    K.h(iB);
                                                                                                                    K.g(str9, this.m);
                                                                                                                    K.g(str8, this.k);
                                                                                                                    K.g("offsetY", this.j);
                                                                                                                    K.e(str5, mrfVar);
                                                                                                                    K.j(mrdVarM2);
                                                                                                                    mrdVarM2.close();
                                                                                                                    this.e.f();
                                                                                                                    K = "vblur";
                                                                                                                    this.e.e("vblur");
                                                                                                                    mrdVarM3 = mrd.m(mwp.f(mrfVar));
                                                                                                                    K = mqb.b(this.c, this.b).a(this.n);
                                                                                                                    K.c("aPosition", 0);
                                                                                                                    K.c("aTexCoord", 1);
                                                                                                                    K.f("zoomFactor", 1.0f);
                                                                                                                    K.h(iB);
                                                                                                                    K.g(str9, this.m);
                                                                                                                    K.g(str8, this.j);
                                                                                                                    K.g("offsetY", this.l);
                                                                                                                    K.e(str5, mrfVar2);
                                                                                                                    K.j(mrdVarM3);
                                                                                                                    mrdVarM3.close();
                                                                                                                    this.e.f();
                                                                                                                    this.e.e("upscale");
                                                                                                                    ?? A = mqb.b(this.c, this.b).a(this.o);
                                                                                                                    A.c("aPosition", 0);
                                                                                                                    A.c("aTexCoord", 1);
                                                                                                                    A.f("zoomFactor", ((Float) this.f.c.d).floatValue());
                                                                                                                    A.f("fade", ((Float) this.f.d.d).floatValue());
                                                                                                                    A.e(str5, mrfVar2);
                                                                                                                    A.j(r23);
                                                                                                                    this.e.f();
                                                                                                                    if (z2) {
                                                                                                                        e();
                                                                                                                    }
                                                                                                                    this.e.f();
                                                                                                                    r23.close();
                                                                                                                    mqgVarB.close();
                                                                                                                    eGLImage2.close();
                                                                                                                    eGLImage.close();
                                                                                                                    hardwareBufferF2.close();
                                                                                                                    hardwareBufferF.close();
                                                                                                                    madVarD2.close();
                                                                                                                    madVarD.close();
                                                                                                                    return;
                                                                                                                } catch (Throwable th12) {
                                                                                                                    th8 = th12;
                                                                                                                    r3 = K;
                                                                                                                    r3.close();
                                                                                                                    throw th8;
                                                                                                                }
                                                                                                            }
                                                                                                            K = mqb.b(this.c, this.b).a(this.n);
                                                                                                            K.c("aPosition", 0);
                                                                                                            K.c("aTexCoord", 1);
                                                                                                            K.f("zoomFactor", 1.0f);
                                                                                                            K.h(iB);
                                                                                                            K.g(str9, this.m);
                                                                                                            K.g(str8, this.j);
                                                                                                            K.g("offsetY", this.l);
                                                                                                            K.e(str5, mrfVar2);
                                                                                                            K.j(mrdVarM3);
                                                                                                            mrdVarM3.close();
                                                                                                            this.e.f();
                                                                                                            this.e.e("upscale");
                                                                                                            ?? A2 = mqb.b(this.c, this.b).a(this.o);
                                                                                                            A2.c("aPosition", 0);
                                                                                                            A2.c("aTexCoord", 1);
                                                                                                            A2.f("zoomFactor", ((Float) this.f.c.d).floatValue());
                                                                                                            A2.f("fade", ((Float) this.f.d.d).floatValue());
                                                                                                            A2.e(str5, mrfVar2);
                                                                                                            A2.j(r23);
                                                                                                            this.e.f();
                                                                                                            if (z2) {
                                                                                                                e();
                                                                                                            }
                                                                                                            this.e.f();
                                                                                                            r23.close();
                                                                                                            mqgVarB.close();
                                                                                                            eGLImage2.close();
                                                                                                            eGLImage.close();
                                                                                                            hardwareBufferF2.close();
                                                                                                            hardwareBufferF.close();
                                                                                                            madVarD2.close();
                                                                                                            madVarD.close();
                                                                                                            return;
                                                                                                        } catch (Throwable th13) {
                                                                                                            try {
                                                                                                                mrdVarM3.close();
                                                                                                                throw th13;
                                                                                                            } catch (Throwable th14) {
                                                                                                                throw th13;
                                                                                                            }
                                                                                                        }
                                                                                                        K = mqb.b(this.c, this.b).a(this.n);
                                                                                                        K.c("aPosition", 0);
                                                                                                        K.c("aTexCoord", 1);
                                                                                                        K.f("zoomFactor", 1.0f);
                                                                                                        K.h(iB);
                                                                                                        K.g(str9, this.m);
                                                                                                        K.g(str8, this.k);
                                                                                                        K.g("offsetY", this.j);
                                                                                                        K.e(str5, mrfVar);
                                                                                                        K.j(mrdVarM2);
                                                                                                        mrdVarM2.close();
                                                                                                        this.e.f();
                                                                                                        K = "vblur";
                                                                                                        this.e.e("vblur");
                                                                                                        mrdVarM3 = mrd.m(mwp.f(mrfVar));
                                                                                                    } catch (Throwable th15) {
                                                                                                        try {
                                                                                                            mrdVarM2.close();
                                                                                                            throw th15;
                                                                                                        } catch (Throwable th16) {
                                                                                                            throw th15;
                                                                                                        }
                                                                                                    }
                                                                                                    K = this.d;
                                                                                                    K.d(mqgVarB, mrdVarM);
                                                                                                    mrdVarM.close();
                                                                                                    this.e.f();
                                                                                                    K = "hblur";
                                                                                                    this.e.e("hblur");
                                                                                                    mrdVarM2 = mrd.m(mwp.f(mrfVar2));
                                                                                                } catch (Throwable th17) {
                                                                                                    th = th17;
                                                                                                    th8 = th;
                                                                                                    r3 = K;
                                                                                                    r3.close();
                                                                                                    throw th8;
                                                                                                }
                                                                                            } catch (Throwable th18) {
                                                                                                try {
                                                                                                    mrdVarM.close();
                                                                                                    throw th18;
                                                                                                } catch (Throwable th19) {
                                                                                                    throw th18;
                                                                                                }
                                                                                            }
                                                                                            fArr = this.m;
                                                                                            f = 2.0f / iB;
                                                                                            f2 = 0.0f;
                                                                                            i2 = 0;
                                                                                            while (i2 < iB) {
                                                                                                float f6 = i2 * f;
                                                                                                String str10 = str;
                                                                                                String str11 = str2;
                                                                                                fExp = (float) Math.exp((-(f6 * f6)) / 2.0f);
                                                                                                fArr[i2] = fExp;
                                                                                                if (i2 != 0) {
                                                                                                    fExp += fExp;
                                                                                                }
                                                                                                f2 += fExp;
                                                                                                i2++;
                                                                                                str = str10;
                                                                                                str2 = str11;
                                                                                            }
                                                                                            String str12 = str;
                                                                                            String str13 = str2;
                                                                                            while (i3 < iB) {
                                                                                                fArr[i3] = fArr[i3] / f2;
                                                                                            }
                                                                                            this.e.f();
                                                                                            K = "downscale";
                                                                                            this.e.e("downscale");
                                                                                            mrdVarM = mrd.m(mwp.f(mrfVar));
                                                                                        } catch (Throwable th20) {
                                                                                            th = th20;
                                                                                            K = r23;
                                                                                        }
                                                                                        obr.aF(z);
                                                                                        jnnVar.g = millis;
                                                                                        jnnVar.a();
                                                                                        z2 = !((Boolean) this.f.a.d).booleanValue();
                                                                                        if (this.g == null) {
                                                                                            this.e.e("allocateTextures");
                                                                                            if (this.g == null) {
                                                                                                z3 = true;
                                                                                            } else {
                                                                                                z3 = false;
                                                                                            }
                                                                                            obr.aQ(z3);
                                                                                            if (this.h == null) {
                                                                                                z4 = true;
                                                                                            } else {
                                                                                                z4 = false;
                                                                                            }
                                                                                            obr.aQ(z4);
                                                                                            mme mmeVar2 = mqgVarB.g().a;
                                                                                            float f7 = this.f.e;
                                                                                            mor morVar4 = new mor(new mme(Math.round(mmeVar2.b() * f7), Math.round(mmeVar2.a() * f7)));
                                                                                            this.g = mrf.g(this.a, morVar4);
                                                                                            this.h = mrf.g(this.a, morVar4);
                                                                                            this.i = morVar4;
                                                                                            this.e.f();
                                                                                        }
                                                                                        this.e.e("prep");
                                                                                        mrf mrfVar3 = this.g;
                                                                                        mrfVar3.getClass();
                                                                                        mrf mrfVar4 = this.h;
                                                                                        mrfVar4.getClass();
                                                                                        iB = oxh.B(((Integer) this.f.b.d).intValue(), 1, 128);
                                                                                        mor morVar5 = this.i;
                                                                                        morVar5.getClass();
                                                                                        fB = 1.0f / morVar5.a.b();
                                                                                        mor morVar6 = this.i;
                                                                                        morVar6.getClass();
                                                                                        fA = 1.0f / morVar6.a.a();
                                                                                        i = 0;
                                                                                        r10 = K;
                                                                                        while (i < iB) {
                                                                                            r23 = r10;
                                                                                            String str14 = str3;
                                                                                            float f8 = i;
                                                                                            this.k[i] = fB * f8;
                                                                                            this.l[i] = f8 * fA;
                                                                                            i++;
                                                                                            r10 = r23;
                                                                                            str3 = str14;
                                                                                        }
                                                                                        String str15 = str3;
                                                                                        r23 = r10;
                                                                                    } catch (Throwable th21) {
                                                                                        th = th21;
                                                                                        K = K;
                                                                                        th8 = th;
                                                                                        r3 = K;
                                                                                        r3.close();
                                                                                        throw th8;
                                                                                    }
                                                                                    j = j2;
                                                                                    if (millis >= j) {
                                                                                        z = true;
                                                                                    } else {
                                                                                        z = false;
                                                                                    }
                                                                                } catch (Throwable th22) {
                                                                                    th = th22;
                                                                                }
                                                                            } catch (Throwable th23) {
                                                                                th = th23;
                                                                                th8 = th;
                                                                                r3 = K;
                                                                                r3.close();
                                                                                throw th8;
                                                                            }
                                                                        } catch (Throwable th24) {
                                                                            th = th24;
                                                                            th8 = th;
                                                                            r3 = K;
                                                                            r3.close();
                                                                            throw th8;
                                                                        }
                                                                    } catch (Throwable th25) {
                                                                        th = th25;
                                                                        th8 = th;
                                                                        r3 = K;
                                                                        r3.close();
                                                                        throw th8;
                                                                    }
                                                                } catch (Throwable th26) {
                                                                    th = th26;
                                                                }
                                                            } catch (Throwable th27) {
                                                                th = th27;
                                                                th7 = th;
                                                                try {
                                                                    mqgVarB.close();
                                                                    throw th7;
                                                                } catch (Throwable th28) {
                                                                    throw th7;
                                                                }
                                                            }
                                                        } catch (Throwable th29) {
                                                            th = th29;
                                                            th7 = th;
                                                            mqgVarB.close();
                                                            throw th7;
                                                        }
                                                    } catch (Throwable th30) {
                                                        th = th30;
                                                        th6 = th;
                                                        try {
                                                            eGLImage2.close();
                                                            throw th6;
                                                        } catch (Throwable th31) {
                                                            throw th6;
                                                        }
                                                    }
                                                } catch (Throwable th32) {
                                                    th = th32;
                                                    th6 = th;
                                                    eGLImage2.close();
                                                    throw th6;
                                                }
                                            } catch (Throwable th33) {
                                                th = th33;
                                                th5 = th;
                                                try {
                                                    eGLImage.close();
                                                    throw th5;
                                                } catch (Throwable th34) {
                                                    throw th5;
                                                }
                                            }
                                        } catch (Throwable th35) {
                                            th = th35;
                                            th5 = th;
                                            eGLImage.close();
                                            throw th5;
                                        }
                                    } catch (Throwable th36) {
                                        th = th36;
                                        th4 = th;
                                        if (hardwareBufferF2 != null) {
                                            throw th4;
                                        }
                                        try {
                                            hardwareBufferF2.close();
                                            throw th4;
                                        } catch (Throwable th37) {
                                            throw th4;
                                        }
                                    }
                                } catch (Throwable th38) {
                                    th = th38;
                                    th4 = th;
                                    if (hardwareBufferF2 != null) {
                                        throw th4;
                                    }
                                    hardwareBufferF2.close();
                                    throw th4;
                                }
                            } catch (Throwable th39) {
                                th = th39;
                                th3 = th;
                                if (lmrVar2 != 0) {
                                    throw th3;
                                }
                                try {
                                    lmrVar2.close();
                                    throw th3;
                                } catch (Throwable th40) {
                                    throw th3;
                                }
                            }
                        } catch (Throwable th41) {
                            th = th41;
                            lmrVar2 = hardwareBufferF;
                            th3 = th;
                            if (lmrVar2 != 0) {
                                throw th3;
                            }
                            lmrVar2.close();
                            throw th3;
                        }
                    } catch (Throwable th42) {
                        th = th42;
                        th2 = th;
                        if (lnxVar != 0) {
                            throw th2;
                        }
                        try {
                            lnxVar.close();
                            throw th2;
                        } catch (Throwable th43) {
                            throw th2;
                        }
                    }
                } catch (Throwable th44) {
                    th = th44;
                    lnxVar = madVarD2;
                    th2 = th;
                    if (lnxVar != 0) {
                        throw th2;
                    }
                    lnxVar.close();
                    throw th2;
                }
            } catch (Throwable th45) {
                th = th45;
                th = th;
                if (lmrVar != null) {
                    throw th;
                }
                try {
                    lmrVar.close();
                    throw th;
                } catch (Throwable th46) {
                    throw th;
                }
            }
        } catch (Throwable th47) {
            th = th47;
            lmrVar = madVarD;
            th = th;
            if (lmrVar != null) {
                throw th;
            }
            lmrVar.close();
            throw th;
        }
    }
}
