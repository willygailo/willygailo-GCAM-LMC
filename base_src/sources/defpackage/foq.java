package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.common.io.ByteStreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class foq implements phh {
    final /* synthetic */ fot a;
    final /* synthetic */ fos b;
    final /* synthetic */ fou c;

    public foq(fou fouVar, fot fotVar, fos fosVar) {
        this.c = fouVar;
        this.a = fotVar;
        this.b = fosVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        if (this.a.o.b().isCancelled()) {
            fou.k(this.a, th, this.b);
        } else {
            this.c.d(this.a, th, this.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x033e  */
    /* JADX WARN: Code duplicated, block: B:93:0x034c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x038e: MOVE (r1 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]), block:B:108:0x038e */
    /* JADX WARN: Type inference failed for: r0v44, types: [miz] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [foq] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [fos] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [fos] */
    /* JADX WARN: Type inference failed for: r2v0, types: [fou] */
    /* JADX WARN: Type inference failed for: r2v1, types: [fou] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22, types: [fou] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.phh
    public final void b(Object obj) {
        Throwable th;
        fos fosVar;
        ?? r18;
        ?? r19;
        ?? r1 = this;
        ?? r2 = r1.c;
        fot fotVar = r1.a;
        fos fosVar2 = r1.b;
        ddf ddfVar = r2.l;
        ddi ddiVar = ddr.a;
        ddfVar.c();
        frf frfVarA = fotVar.d.a();
        long j = frfVarA.d - frfVarA.c;
        if (fotVar.p) {
            r2.h(fotVar, fosVar2, j);
            return;
        }
        try {
            FileOutputStream fileOutputStreamE = fosVar2.e.a.e();
            final OutputStream outputStreamM = fosVar2.b.g() ? ((ExifInterface) fosVar2.b.c()).m(fileOutputStreamE) : fileOutputStreamE;
            try {
                try {
                    obr.aQ(fotVar.h.isDone());
                    obr.aQ(fotVar.s.isDone());
                    long jLongValue = ((Long) plk.ae(fotVar.h)).longValue() - ((Long) plk.ae(fotVar.s)).longValue();
                    if (jLongValue < 0) {
                        ((oug) ((oug) fou.a.b()).G(1804)).q("Negative shutter presentation timestamp detected (%d). Resetting to 0.", jLongValue);
                        jLongValue = 0;
                    }
                    if (r2.l.k(dds.K)) {
                        r2.o.a(fotVar.c.a);
                    }
                    try {
                        try {
                            FileInputStream fileInputStreamD = fotVar.c.a.d();
                            try {
                                boolean zF = r2.f(fotVar.p);
                                if (zF) {
                                    fosVar2.e.a.h("MP");
                                } else {
                                    fosVar2.e.a.h("MV");
                                }
                                int i = true != zF ? 1 : 2;
                                ojd ojdVarD = mde.d(fosVar2.d, fosVar2.b.g() ? (ast) mde.c(((ExifInterface) fosVar2.b.c()).bA).f() : null);
                                mix mixVar = new mix();
                                mixVar.d = i;
                                mixVar.b = 1;
                                mixVar.c = jLongValue;
                                mixVar.a = new mjb((ast) ojdVarD.a, (ast) ojdVarD.b);
                                mixVar.e = new miy(fosVar2.d);
                                mixVar.g = new Object() { // from class: miz
                                    public final void a(miy miyVar, ast astVar, ast astVar2, miw miwVar) throws IOException {
                                        OutputStream outputStream = outputStreamM;
                                        mde.p(miyVar.a, outputStream, astVar, astVar2);
                                        try {
                                            ByteStreams.copy(ByteStreams.limit(miwVar.b, miwVar.a), outputStream);
                                            miwVar.b.close();
                                            outputStream.flush();
                                        } catch (Throwable th2) {
                                            miwVar.b.close();
                                            throw th2;
                                        }
                                    }
                                };
                                mixVar.f = new miw((int) fotVar.c.a.a(), fileInputStreamD);
                                miy miyVar = mixVar.e;
                                miyVar.getClass();
                                miw miwVar = mixVar.f;
                                miwVar.getClass();
                                mjc mjcVar = mixVar.a;
                                mjcVar.getClass();
                                miz mizVar = mixVar.g;
                                mizVar.getClass();
                                int i2 = mixVar.b;
                                int i3 = mixVar.d;
                                long j2 = mixVar.c;
                                try {
                                    if (new AtomicBoolean(false).getAndSet(true)) {
                                        throw new IllegalStateException("Executed command more than once. This is unexpected");
                                    }
                                    try {
                                        switch (i3) {
                                            case 1:
                                                r19 = r2;
                                                fosVar = fosVar2;
                                                try {
                                                    ast astVarA = mjcVar.a();
                                                    ast astVarB = mjcVar.b();
                                                    int i4 = miwVar.a;
                                                    asv.a.c("http://ns.google.com/photos/1.0/camera/", "GCamera");
                                                    astVarA.c("http://ns.google.com/photos/1.0/camera/", "MicroVideo", 1);
                                                    astVarA.c("http://ns.google.com/photos/1.0/camera/", "MicroVideoVersion", Integer.valueOf(i2));
                                                    astVarA.c("http://ns.google.com/photos/1.0/camera/", "MicroVideoOffset", Integer.valueOf(i4));
                                                    astVarA.c("http://ns.google.com/photos/1.0/camera/", "MicroVideoPresentationTimestampUs", Long.valueOf(j2));
                                                    mizVar.a(miyVar, astVarA, astVarB, miwVar);
                                                    r19 = r19;
                                                    fotVar.c.b();
                                                    fileInputStreamD.close();
                                                    outputStreamM.close();
                                                    try {
                                                        fileInputStreamD.close();
                                                        try {
                                                            outputStreamM.close();
                                                            r1 = fosVar;
                                                            try {
                                                                r1.c.e(r1.e.a.a());
                                                                boolean z = fps.a;
                                                                boolean z2 = fps.a;
                                                                boolean z3 = fps.a;
                                                                boolean z4 = fps.a;
                                                                boolean z5 = fps.a;
                                                                r1.e.c();
                                                                r19.p.removeCallbacksAndMessages(fotVar.a);
                                                                if (fotVar.l.getAndSet(true)) {
                                                                    ((oug) ((oug) fou.a.c()).G((char) 1828)).o("Failed to encode microvideo before timeout fired!");
                                                                    return;
                                                                }
                                                                ((iik) r1.c).l = fou.i(fotVar, System.currentTimeMillis());
                                                                obr.aQ(!fotVar.n.isDone());
                                                                fotVar.n.o(r1.a);
                                                                fotVar.c.b();
                                                                return;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                r2 = r19;
                                                                r2.d(fotVar, th, r1);
                                                                r1.e.b();
                                                                fotVar.c.b();
                                                                return;
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            r1 = fosVar;
                                                        }
                                                    } catch (Exception e) {
                                                        e = e;
                                                        throw new RuntimeException(e);
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        Throwable th5 = th;
                                                        try {
                                                            outputStreamM.close();
                                                            throw th5;
                                                        } catch (Throwable th6) {
                                                            throw th5;
                                                        }
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    r18 = r19;
                                                    th = th;
                                                    fileInputStreamD.close();
                                                    throw th;
                                                }
                                                break;
                                            case 2:
                                                try {
                                                    ast astVarA2 = mjcVar.a();
                                                    ast astVarB2 = mjcVar.b();
                                                    mlp mlpVarA = mlq.a();
                                                    mlpVarA.b = "Primary";
                                                    mlpVarA.c(0);
                                                    mlpVarA.b(0);
                                                    mlpVarA.a = "image/jpeg";
                                                    mlq mlqVarA = mlpVarA.a();
                                                    mlp mlpVarA2 = mlq.a();
                                                    mlpVarA2.b = "MotionPhoto";
                                                    mlpVarA2.a = "video/mp4";
                                                    mlpVarA2.c(0);
                                                    mlpVarA2.b(miwVar.a);
                                                    mlq mlqVarA2 = mlpVarA2.a();
                                                    ?? r110 = r2;
                                                    try {
                                                        mlq[] mlqVarArr = {mlqVarA, mlqVarA2};
                                                        int i5 = 0;
                                                        for (int i6 = 2; i5 < i6; i6 = 2) {
                                                            String strAE = i5 == 0 ? mip.aE(mlqVarArr[0]) : mip.aF(mlqVarArr[i5]);
                                                            if (!strAE.isEmpty()) {
                                                                String strValueOf = String.valueOf(strAE);
                                                                throw new ass(strValueOf.length() != 0 ? "Container items have bad values: ".concat(strValueOf) : new String("Container items have bad values: "), 5);
                                                            }
                                                            i5++;
                                                        }
                                                        jdy jdyVar = new jdy((byte[]) null);
                                                        for (int i7 = 0; i7 < 2; i7++) {
                                                            jdyVar.e(mlqVarArr[i7]);
                                                        }
                                                        asv.a.c("http://ns.google.com/photos/1.0/camera/", "Camera");
                                                        fosVar = fosVar2;
                                                        try {
                                                            astVarA2.c("http://ns.google.com/photos/1.0/camera/", "MotionPhoto", 1);
                                                            astVarA2.c("http://ns.google.com/photos/1.0/camera/", "MotionPhotoVersion", Integer.valueOf(i2));
                                                            astVarA2.c("http://ns.google.com/photos/1.0/camera/", "MotionPhotoPresentationTimestampUs", Long.valueOf(j2));
                                                            asv.a.c("http://ns.google.com/photos/1.0/container/", "Container");
                                                            atx atxVar = new atx();
                                                            atxVar.q();
                                                            atxVar.t();
                                                            astVarA2.d("http://ns.google.com/photos/1.0/container/", "Directory", null, atxVar);
                                                            synchronized (jdyVar) {
                                                                int i8 = 1;
                                                                for (mlq mlqVar : jdyVar.h) {
                                                                    String strG = gh.g("Directory", i8);
                                                                    mlq.b(astVarA2, strG);
                                                                    String strValueOf2 = String.valueOf(strG);
                                                                    String strValueOf3 = String.valueOf(gh.h("http://ns.google.com/photos/1.0/container/", "Item"));
                                                                    String strConcat = strValueOf3.length() != 0 ? strValueOf2.concat(strValueOf3) : new String(strValueOf2);
                                                                    asv.a.c("http://ns.google.com/photos/1.0/container/item/", "Item");
                                                                    mlq.b(astVarA2, strConcat);
                                                                    mlq.f(astVarA2, strConcat, "Mime", mlqVar.a);
                                                                    mlq.f(astVarA2, strConcat, "Semantic", mlqVar.b);
                                                                    mlq.f(astVarA2, strConcat, "Length", Integer.toString(mlqVar.c));
                                                                    mlq.f(astVarA2, strConcat, "Padding", Integer.toString(mlqVar.d));
                                                                    i8++;
                                                                }
                                                                break;
                                                            }
                                                            mizVar.a(miyVar, astVarA2, astVarB2, miwVar);
                                                            r19 = r110;
                                                            fotVar.c.b();
                                                            fileInputStreamD.close();
                                                            outputStreamM.close();
                                                            fileInputStreamD.close();
                                                            outputStreamM.close();
                                                            r1 = fosVar;
                                                            r1.c.e(r1.e.a.a());
                                                            boolean z6 = fps.a;
                                                            boolean z7 = fps.a;
                                                            boolean z8 = fps.a;
                                                            boolean z9 = fps.a;
                                                            boolean z10 = fps.a;
                                                            r1.e.c();
                                                            r19.p.removeCallbacksAndMessages(fotVar.a);
                                                            if (fotVar.l.getAndSet(true)) {
                                                                ((oug) ((oug) fou.a.c()).G((char) 1828)).o("Failed to encode microvideo before timeout fired!");
                                                                return;
                                                            }
                                                            ((iik) r1.c).l = fou.i(fotVar, System.currentTimeMillis());
                                                            obr.aQ(!fotVar.n.isDone());
                                                            fotVar.n.o(r1.a);
                                                            fotVar.c.b();
                                                            return;
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            fileInputStreamD.close();
                                                            throw th;
                                                        }
                                                    } catch (ass e2) {
                                                        e = e2;
                                                        throw new IOException("XMP serialization encountered an issue.", e);
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        r18 = r110;
                                                        th = th;
                                                    }
                                                } catch (ass e3) {
                                                    e = e3;
                                                    throw new IOException("XMP serialization encountered an issue.", e);
                                                }
                                                break;
                                            default:
                                                try {
                                                    StringBuilder sb = new StringBuilder(45);
                                                    sb.append("Bad xmp format version requested: ");
                                                    sb.append(i3);
                                                    throw new IOException(sb.toString());
                                                } catch (ass e4) {
                                                    e = e4;
                                                    throw new IOException("XMP serialization encountered an issue.", e);
                                                }
                                        }
                                    } catch (ass e5) {
                                        e = e5;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                            }
                            th = th;
                            try {
                                fileInputStreamD.close();
                            } catch (Throwable th12) {
                            }
                            try {
                                throw th;
                            } catch (Exception e6) {
                                e = e6;
                                throw new RuntimeException(e);
                            }
                        } catch (Exception e7) {
                            e = e7;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                    }
                } catch (Throwable th14) {
                    th = th14;
                }
            } catch (Throwable th15) {
                th = th15;
            }
        } catch (Throwable th16) {
            th = th16;
            r1 = fosVar2;
        }
    }
}
