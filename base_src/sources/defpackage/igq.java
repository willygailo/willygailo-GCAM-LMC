package defpackage;

import android.content.Context;
import com.google.babelfish.device.avenh.l2l.speechenhancer2.jni.SpeechEnhancerJniWrapperRealtime;
import com.google.googlex.gcam.BufferUtils;
import j$.time.Duration;
import j$.util.Optional;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class igq implements ihb {
    public static final ouj a = ouj.h("com/google/android/apps/camera/speechenhancer/SpeechEnhancerControllerImpl");
    private static final Duration n = Duration.ofMillis(25);
    public final Context b;
    public final ddf c;
    public final phv d;
    public final phv e;
    public final Object f;
    public final ljf g;
    public final List h;
    public igp i;
    public Path j;
    public igz k;
    public ihk l;
    public final mip m;
    private igx o;

    static {
        Duration.ofMillis(500L);
    }

    public igq(Context context, ddf ddfVar, ljf ljfVar) {
        phv phvVarJ = plk.J(Executors.newFixedThreadPool(50));
        phv phvVarJ2 = plk.J(mip.bM("SEnhWorker"));
        this.f = new Object();
        this.h = new ArrayList();
        this.i = igp.UNINITIALIZED;
        this.b = context;
        this.c = ddfVar;
        this.g = ljfVar;
        this.d = phvVarJ;
        this.e = phvVarJ2;
        this.m = new ign(this);
    }

    public static final void j(Runnable runnable, phv phvVar) {
        plk.af(phvVar.submit(runnable), new igo(0), pgr.INSTANCE);
    }

    @Override // defpackage.ihb
    public final lie a(final iha ihaVar) {
        if (this.h.contains(ihaVar)) {
            return new jmf(3);
        }
        this.h.add(ihaVar);
        return new lie() { // from class: igg
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                igq igqVar = this.a;
                igqVar.h.remove(ihaVar);
            }
        };
    }

    @Override // defpackage.ihb
    public final Duration b() {
        return n;
    }

    @Override // defpackage.ihb
    public final void c() {
        synchronized (this.f) {
            if (this.i.equals(igp.PROCESSING)) {
                j(new igh(this, 1), this.e);
            }
        }
    }

    @Override // defpackage.ihb
    public final void d(igz igzVar) {
        this.k = igzVar;
        this.o = new igx(igzVar.a);
    }

    @Override // defpackage.ihb
    public final void e() {
        synchronized (this.f) {
            if (this.i.equals(igp.UNINITIALIZED)) {
                j(new igh(this, 0), this.e);
            }
        }
    }

    @Override // defpackage.ihb
    public final void f(ByteBuffer byteBuffer, final int i, final int i2, final int i3, long j, final ojc ojcVar) {
        final long nanos;
        synchronized (this.f) {
            if (this.i.equals(igp.PROCESSING)) {
                igx igxVar = this.o;
                long j2 = igxVar.b;
                if (j2 == Long.MIN_VALUE) {
                    igxVar.b = j;
                    nanos = 0;
                } else {
                    nanos = (((long) igxVar.a) * (j - j2)) / Duration.ofSeconds(1L).toNanos();
                }
                final ByteBuffer byteBufferC = BufferUtils.c(byteBuffer);
                j(new Runnable() { // from class: igj
                    @Override // java.lang.Runnable
                    public final void run() {
                        Integer num;
                        Integer num2;
                        igq igqVar = this.a;
                        int i4 = i3;
                        int i5 = i;
                        int i6 = i2;
                        ByteBuffer byteBuffer2 = byteBufferC;
                        long j3 = nanos;
                        ojc ojcVar2 = ojcVar;
                        int i7 = i4 % 180;
                        int i8 = i7 == 0 ? i5 : i6;
                        if (i7 == 0) {
                            i5 = i6;
                        }
                        ihl ihlVar = new ihl(null);
                        ihlVar.b = Integer.valueOf(i8);
                        ihlVar.c = Integer.valueOf(i5);
                        ohl ohlVar = ohl.MONOCHROME;
                        if (ohlVar == null) {
                            throw new NullPointerException("Null colorspace");
                        }
                        ihlVar.d = ohlVar;
                        if (byteBuffer2 == null) {
                            throw new NullPointerException("Null imageBuffer");
                        }
                        ihlVar.a = byteBuffer2;
                        ihlVar.f = ojc.i(Long.valueOf(j3));
                        ihlVar.e = 0;
                        ihlVar.g = ojcVar2;
                        ByteBuffer byteBuffer3 = ihlVar.a;
                        if (byteBuffer3 == null || (num = ihlVar.b) == null || ihlVar.c == null || ihlVar.d == null || ihlVar.e == null) {
                            StringBuilder sb = new StringBuilder();
                            if (ihlVar.a == null) {
                                sb.append(" imageBuffer");
                            }
                            if (ihlVar.b == null) {
                                sb.append(" widthPixels");
                            }
                            if (ihlVar.c == null) {
                                sb.append(" heightPixels");
                            }
                            if (ihlVar.d == null) {
                                sb.append(" colorspace");
                            }
                            if (ihlVar.e == null) {
                                sb.append(" rotationDegrees");
                            }
                            String strValueOf = String.valueOf(sb);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
                            sb2.append("Missing required properties:");
                            sb2.append(strValueOf);
                            throw new IllegalStateException(sb2.toString());
                        }
                        ihm ihmVar = new ihm(byteBuffer3, num.intValue(), ihlVar.c.intValue(), ihlVar.d, ihlVar.e.intValue(), ihlVar.f, ihlVar.g);
                        igqVar.g.e("SEController#provideVideoFrame");
                        ogs ogsVar = igqVar.l.a;
                        ohx ohxVar = new ohx(null);
                        ohxVar.f = Optional.empty();
                        ohxVar.g = Optional.empty();
                        ByteBuffer byteBuffer4 = ihmVar.a;
                        if (byteBuffer4 == null) {
                            throw new NullPointerException("Null imageBuffer");
                        }
                        ohxVar.a = byteBuffer4;
                        ohxVar.b = Integer.valueOf(ihmVar.b);
                        ohxVar.c = Integer.valueOf(ihmVar.c);
                        ohl ohlVar2 = ihmVar.d;
                        if (ohlVar2 == null) {
                            throw new NullPointerException("Null colorspace");
                        }
                        ohxVar.d = ohlVar2;
                        ohxVar.e = Integer.valueOf(ihmVar.e);
                        ohxVar.f = Optional.ofNullable((Long) ihmVar.f.f());
                        ohxVar.g = Optional.ofNullable(null);
                        ByteBuffer byteBuffer5 = ohxVar.a;
                        if (byteBuffer5 != null && (num2 = ohxVar.b) != null && ohxVar.c != null && ohxVar.d != null && ohxVar.e != null) {
                            ogsVar.d(new ohy(byteBuffer5, num2.intValue(), ohxVar.c.intValue(), ohxVar.d, ohxVar.e.intValue(), ohxVar.f, ohxVar.g));
                            igqVar.g.f();
                            return;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        if (ohxVar.a == null) {
                            sb3.append(" imageBuffer");
                        }
                        if (ohxVar.b == null) {
                            sb3.append(" widthPixels");
                        }
                        if (ohxVar.c == null) {
                            sb3.append(" heightPixels");
                        }
                        if (ohxVar.d == null) {
                            sb3.append(" colorspace");
                        }
                        if (ohxVar.e == null) {
                            sb3.append(" rotationDegrees");
                        }
                        String strValueOf2 = String.valueOf(sb3);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(strValueOf2).length() + 28);
                        sb4.append("Missing required properties:");
                        sb4.append(strValueOf2);
                        throw new IllegalStateException(sb4.toString());
                    }
                }, this.e);
            }
        }
    }

    @Override // defpackage.ihb
    public final void g() {
        synchronized (this.f) {
            boolean z = true;
            if (!this.i.equals(igp.PREINITIALIZED) && !this.i.equals(igp.STOPPED)) {
                z = false;
            }
            obr.aT(z, "Cannot start from %s", this.i);
        }
        j(new Runnable() { // from class: igi
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                phv phvVar;
                Path path;
                Integer num;
                Optional optionalEmpty;
                igq igqVar = this.a;
                igqVar.g.e("SEController#createInstance");
                ohc ohcVar = new ohc(null);
                boolean z2 = true;
                ohcVar.h = 1;
                ohcVar.c();
                ohcVar.j = 1;
                ohcVar.b = Optional.empty();
                ohcVar.g = false;
                ohcVar.b(16000.0f);
                ohcVar.a(1);
                ohcVar.a = Optional.empty();
                ohcVar.k = 1;
                ohcVar.h = 2;
                ohcVar.c();
                Path path2 = igqVar.j;
                if (path2 == null) {
                    throw new NullPointerException("Null modelDirectory");
                }
                ohcVar.d = path2;
                ohcVar.a = Optional.of(igqVar.m);
                phv phvVar2 = igqVar.d;
                if (phvVar2 == null) {
                    throw new NullPointerException("Null listeningExecutorService");
                }
                ohcVar.c = phvVar2;
                ohcVar.b(igqVar.k.a);
                ohcVar.a(igqVar.k.b);
                int i2 = ohcVar.h;
                if (i2 == 0 || (i = ohcVar.i) == 0 || ohcVar.j == 0 || (phvVar = ohcVar.c) == null || (path = ohcVar.d) == null || (num = ohcVar.e) == null || ohcVar.f == null || ohcVar.g == null || ohcVar.k == 0) {
                    StringBuilder sb = new StringBuilder();
                    if (ohcVar.h == 0) {
                        sb.append(" speechEnhancerMode");
                    }
                    if (ohcVar.i == 0) {
                        sb.append(" rawAudioInterfaceType");
                    }
                    if (ohcVar.j == 0) {
                        sb.append(" processedAudioInterfaceType");
                    }
                    if (ohcVar.c == null) {
                        sb.append(" listeningExecutorService");
                    }
                    if (ohcVar.d == null) {
                        sb.append(" modelDirectory");
                    }
                    if (ohcVar.e == null) {
                        sb.append(" numberOfChannels");
                    }
                    if (ohcVar.f == null) {
                        sb.append(" sampleRate");
                    }
                    if (ohcVar.g == null) {
                        sb.append(" skipInitGoogle");
                    }
                    if (ohcVar.k == 0) {
                        sb.append(" environmentType");
                    }
                    String strValueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(strValueOf);
                    throw new IllegalStateException(sb2.toString());
                }
                ohd ohdVar = new ohd(i2, i, ohcVar.a, ohcVar.b, phvVar, path, num.intValue(), ohcVar.f.floatValue(), ohcVar.g.booleanValue(), ohcVar.k);
                boolean z3 = ohdVar.j != 1 || ohdVar.a.isPresent();
                obr.aG(z3, "Callback must be set.");
                boolean z4 = ohdVar.i != 1 || ohdVar.b.isPresent();
                obr.aG(z4, "The 'raw audio interface type' has been set to 'input stream', but input stream wasn't provided.");
                obr.aG(ohdVar.d != null, "Model directory must be set.");
                try {
                    ogv ogvVar = new ogv();
                    ogvVar.b = ohdVar;
                    obr.aR(ogvVar.b != null, "SpeechEnhancerParams must be set before calling build().");
                    ohd ohdVar2 = ogvVar.b;
                    ogy ogyVar = new ogy(ohdVar2.j, ohdVar2.a);
                    ohd ohdVar3 = ogvVar.b;
                    int i3 = ohdVar3.h;
                    Path path3 = ohdVar3.d;
                    int i4 = ohdVar3.e;
                    float f = ohdVar3.f;
                    boolean z5 = ohdVar3.g;
                    ohg ohgVar = new ohg();
                    boolean z6 = i3 == 2;
                    if (i3 == 0) {
                        throw null;
                    }
                    ohgVar.a = z6;
                    ohgVar.b = path3;
                    ohgVar.c = i4;
                    ohgVar.d = f;
                    ohgVar.e = ogyVar;
                    ohgVar.f = z5;
                    obr.aR(ohgVar.b != null, "Avenh model directory must be set before calling build().");
                    obr.aR(ohgVar.e != null, "Callback must be set before calling build().");
                    SpeechEnhancerJniWrapperRealtime speechEnhancerJniWrapperRealtime = new SpeechEnhancerJniWrapperRealtime(ohgVar.a, ohgVar.b, ohgVar.c, ohgVar.d, ohgVar.e, ohgVar.f, null);
                    speechEnhancerJniWrapperRealtime.initialize();
                    ohn speechEnhancerModelInfo = speechEnhancerJniWrapperRealtime.getSpeechEnhancerModelInfo();
                    oha ohaVar = new oha(speechEnhancerJniWrapperRealtime);
                    ohp ohpVarA = ohq.a();
                    ohpVarA.b(speechEnhancerModelInfo.a);
                    ohq ohqVarA = ohpVarA.a();
                    ohv ohvVar = new ohv();
                    ohvVar.c = 1;
                    ohvVar.a = ohqVarA;
                    ohvVar.d = ohaVar;
                    ohvVar.b = ogvVar.c;
                    if (ohvVar.d == null) {
                        z2 = false;
                    }
                    obr.aG(z2, "Callback must be set before calling build().");
                    ohw ohwVar = new ohw(ohvVar.c, ohvVar.a, ohvVar.d, ohvVar.b);
                    PipedInputStream pipedInputStream = new PipedInputStream(((int) ogv.a.getSeconds()) * ((int) speechEnhancerModelInfo.b) * speechEnhancerModelInfo.d * speechEnhancerModelInfo.c);
                    PipedOutputStream pipedOutputStream = new PipedOutputStream(pipedInputStream);
                    ogyVar.a = Optional.of(pipedOutputStream);
                    optionalEmpty = Optional.of(new ohb(ogvVar.b, ohwVar, pipedInputStream, pipedOutputStream, speechEnhancerJniWrapperRealtime));
                    ojc ojcVarI = optionalEmpty.isPresent() ? ojc.i(new ihk((ogs) optionalEmpty.get())) : oih.a;
                    igqVar.g.f();
                    if (!ojcVarI.g()) {
                        throw new okf("Create speech enhancer instance failed.");
                    }
                    igqVar.l = (ihk) ojcVarI.c();
                    try {
                        igqVar.l.a.b();
                        igqVar.l.a.e(igqVar.k.c);
                        int i5 = igqVar.k.d;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i5 == 2) {
                            igqVar.l.a.h();
                        } else {
                            ddf ddfVar = igqVar.c;
                            ddi ddiVar = dcu.a;
                            ddfVar.d();
                        }
                        synchronized (igqVar.f) {
                            igqVar.i = igp.INITIALIZED;
                        }
                        synchronized (igqVar.f) {
                            if (igqVar.i.equals(igp.INITIALIZED)) {
                                igqVar.l.a.f();
                                igqVar.i = igp.STARTED;
                            }
                        }
                    } catch (Exception e) {
                        ((oug) ((oug) ((oug) igq.a.b()).h(e)).G((char) 2899)).o("Initialize speech enhancer failed.");
                    }
                } catch (IOException e2) {
                    ((oug) ((oug) ((oug) ogt.a.b()).h(e2)).G((char) 3682)).o("Failed to create SpeechEnhancerImpl instance.");
                    optionalEmpty = Optional.empty();
                }
            }
        }, this.e);
    }

    @Override // defpackage.ihb
    public final void h() {
        synchronized (this.f) {
            if (this.i.equals(igp.STARTED) || this.i.equals(igp.PROCESSING)) {
                this.i = igp.STOPPED;
                j(new igh(this, 2), this.e);
                this.o.b = Long.MIN_VALUE;
            }
        }
    }

    @Override // defpackage.ihb
    public final boolean i(ByteBuffer byteBuffer) {
        synchronized (this.f) {
            if (this.i.equals(igp.STARTED)) {
                this.i = igp.PROCESSING;
            } else if (!this.i.equals(igp.PROCESSING)) {
                return false;
            }
            final ByteBuffer byteBufferC = BufferUtils.c(byteBuffer);
            j(new Runnable() { // from class: igk
                @Override // java.lang.Runnable
                public final void run() {
                    igq igqVar = this.a;
                    ByteBuffer byteBuffer2 = byteBufferC;
                    igqVar.g.e("SEController#provideAudio");
                    igqVar.l.a.c(byteBuffer2);
                    igqVar.g.f();
                }
            }, this.e);
            return true;
        }
    }
}
