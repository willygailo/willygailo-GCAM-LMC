package defpackage;

import android.media.AudioRecord;
import android.os.SystemClock;
import com.google.android.libraries.vision.opengl.Texture;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eib implements Runnable {
    public final /* synthetic */ eig a;
    private final /* synthetic */ int b;

    public /* synthetic */ eib(eig eigVar, int i) {
        this.b = i;
        this.a = eigVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                eig eigVar = this.a;
                eigVar.b.close();
                eigVar.o.close();
                break;
            case 1:
                this.a.h(true, 1);
                break;
            default:
                final eig eigVar2 = this.a;
                eigVar2.g.execute(new Runnable() { // from class: eic
                    /* JADX WARN: Code duplicated, block: B:39:0x00f0  */
                    /* JADX WARN: Code duplicated, block: B:41:0x00f4  */
                    /* JADX WARN: Code duplicated, block: B:43:0x00fd  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
                    /* JADX WARN: Code duplicated, block: B:46:0x0109  */
                    /* JADX WARN: Code duplicated, block: B:52:0x011a  */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ejt ejtVar;
                        eku ekuVar;
                        ekr ekrVar;
                        eky ekyVar;
                        ejv ejvVar;
                        AudioRecord audioRecord;
                        eig eigVar3 = eigVar2;
                        if (eigVar3.r.compareAndSet(1, 2)) {
                            eigVar3.I.b();
                            eigVar3.j.e("record#prepareToRecord");
                            eke ekeVar = eigVar3.b;
                            boolean zBooleanValue = ((Boolean) eigVar3.h.fA()).booleanValue();
                            String strB = eigVar3.I.b();
                            ekeVar.l.b(new ekd(ekeVar, 0));
                            if (ekeVar.e == null) {
                                ((oug) ((oug) eke.a.b().g(ovl.a, "ImaxCaptureModule")).G((char) 1217)).o("No devicePoseManger");
                            } else {
                                ekb ekbVar = ekeVar.c;
                                if (zBooleanValue) {
                                    try {
                                        ejtVar = new ejt();
                                    } catch (IOException e) {
                                        ((oug) ((oug) ((oug) ekb.a.b()).h(e)).G((char) 1216)).r("%s", e.getMessage());
                                        ejtVar = null;
                                    }
                                } else {
                                    ejtVar = null;
                                }
                                eks eksVar = new eks(strB, ejtVar != null ? 2 : 1);
                                ekbVar.e = false;
                                if (ejtVar != null) {
                                    ekr ekrVar2 = new ekr(ejtVar, eksVar);
                                    if (ekrVar2.b != ejtVar) {
                                        throw new IllegalArgumentException("The drainer does not use the same encoder as the recorder");
                                    }
                                    int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
                                    try {
                                        audioRecord = new AudioRecord(5, 44100, 16, 2, minBufferSize + minBufferSize);
                                    } catch (IllegalArgumentException e2) {
                                        ((oug) ((oug) ((oug) ejv.a.b()).h(e2)).G((char) 1210)).r("%s", e2.getMessage());
                                        audioRecord = null;
                                    }
                                    if (audioRecord == null || audioRecord.getState() != 1) {
                                        ((oug) ((oug) ejv.a.b()).G((char) 1209)).o("Audio recorder could not be initialized");
                                        audioRecord = null;
                                    }
                                    ekbVar.d = !ekrVar2.b() ? null : new ejv(ekrVar2, new ejw(ejtVar, audioRecord));
                                    if (ekbVar.d != null) {
                                        ekuVar = ekbVar.c;
                                        if (ekuVar != null) {
                                            ekrVar = new ekr(ekuVar, eksVar);
                                            if (ekrVar.b == ekuVar) {
                                                throw new IllegalArgumentException("The drainer does not use the same encoder as the recorder");
                                            }
                                            if (ekrVar.b()) {
                                                ekyVar = new eky(ekuVar, ekrVar);
                                            } else {
                                                ekyVar = null;
                                            }
                                            ekbVar.b = ekyVar;
                                            if (ekbVar.b == null && (ejvVar = ekbVar.d) != null) {
                                                ejvVar.a();
                                                ekbVar.d = null;
                                            }
                                        }
                                    }
                                } else {
                                    ekuVar = ekbVar.c;
                                    if (ekuVar != null) {
                                        ekrVar = new ekr(ekuVar, eksVar);
                                        if (ekrVar.b == ekuVar) {
                                            throw new IllegalArgumentException("The drainer does not use the same encoder as the recorder");
                                        }
                                        if (ekrVar.b()) {
                                            ekyVar = new eky(ekuVar, ekrVar);
                                        } else {
                                            ekyVar = null;
                                        }
                                        ekbVar.b = ekyVar;
                                        if (ekbVar.b == null) {
                                            ejvVar.a();
                                            ekbVar.d = null;
                                        }
                                    }
                                }
                            }
                            ejd ejdVar = eigVar3.o;
                            Texture previewAsTexture = eigVar3.b.d.getPreviewAsTexture();
                            ein einVar = ejdVar.k;
                            int i = ejdVar.c;
                            int i2 = ejdVar.b;
                            ddf ddfVar = einVar.a;
                            ddg ddgVar = ddn.a;
                            ddfVar.b();
                            eir eirVar = ejdVar.j;
                            eli eliVar = eirVar.a;
                            if (eliVar != null) {
                                eliVar.a();
                                eirVar.a = null;
                            }
                            eirVar.a = new eli();
                            eli eliVar2 = eirVar.a;
                            eij eijVar = eirVar.b;
                            int i3 = eijVar.j;
                            int i4 = eijVar.k;
                            float[] fArr = eiq.a;
                            eliVar2.b = previewAsTexture;
                            eliVar2.c = 10497;
                            eliVar2.getClass();
                            eliVar2.c(i3, i4);
                            eliVar2.a = mzi.g(eiq.a);
                            ejdVar.i.o = previewAsTexture;
                            eigVar3.j.g("record#startCapture");
                            eke ekeVar2 = eigVar3.b;
                            ekeVar2.b.b();
                            ekb ekbVar2 = ekeVar2.c;
                            ejv ejvVar2 = ekbVar2.d;
                            if (ejvVar2 != null) {
                                ejw ejwVar = ejvVar2.b;
                                ejwVar.b = true;
                                ejwVar.start();
                            }
                            eky ekyVar2 = ekbVar2.b;
                            if (ekyVar2 != null) {
                                ekyVar2.f = true;
                            }
                            ejo ejoVar = ekeVar2.d;
                            ejx ejxVar = ekeVar2.h;
                            float f = ejxVar.d;
                            int i5 = ejxVar.c;
                            boolean z = ejxVar.e;
                            ejoVar.setMetaData(f, i5, false, 0, false);
                            ekeVar2.d.startCapture();
                            synchronized (ekeVar2) {
                                ekeVar2.f = true;
                                ekeVar2.k = 0;
                                ekeVar2.j = 3.4028234663852886E38d;
                            }
                            eigVar3.j.f();
                            eigVar3.s.open();
                            if (eigVar3.q.get()) {
                                return;
                            }
                            ehw ehwVar = eigVar3.f;
                            ehwVar.r = eigVar3;
                            egp egpVar = ehwVar.b;
                            egpVar.c = false;
                            egpVar.b = Double.NaN;
                            egpVar.a = Double.NaN;
                            ehwVar.i = true;
                            ehwVar.i(false);
                            ehwVar.d = 0.0f;
                            mcu mcuVar = ehwVar.j;
                            ehwVar.m = SystemClock.elapsedRealtime();
                            ehwVar.k = ehwVar.c;
                            ehwVar.l.b();
                            ehwVar.e.set(true);
                            eigVar3.k.N();
                            eigVar3.r.set(3);
                        }
                    }
                });
                break;
        }
    }
}
