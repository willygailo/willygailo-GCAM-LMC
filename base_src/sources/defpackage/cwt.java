package defpackage;

import android.content.SharedPreferences;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import j$.util.DesugarArrays;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class cwt {
    public final CameraFatalErrorTrackerDatabase a;
    public final jtx b;
    private final SharedPreferences c;

    public cwt(SharedPreferences sharedPreferences, CameraFatalErrorTrackerDatabase cameraFatalErrorTrackerDatabase, jtx jtxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = sharedPreferences;
        this.a = cameraFatalErrorTrackerDatabase;
        this.b = jtxVar;
    }

    public final void a() {
        if (this.c.getBoolean("pref_key_reboot_completed", false)) {
            CameraFatalErrorTrackerDatabase cameraFatalErrorTrackerDatabase = this.a;
            Runnable runnable = new Runnable() { // from class: cwr
                @Override // java.lang.Runnable
                public final void run() {
                    final cwt cwtVar = this.a;
                    cxm cxmVarS = cwtVar.a.s();
                    cxr cxrVar = (cxr) cxmVarS;
                    cxrVar.a.g();
                    ake akeVarE = cxrVar.d.e();
                    cxrVar.a.h();
                    try {
                        akeVarE.a();
                        ((cxr) cxmVarS).a.j();
                        cxrVar.a.i();
                        cxrVar.d.f(akeVarE);
                        cxf cxfVarR = cwtVar.a.r();
                        cxk cxkVar = (cxk) cxfVarR;
                        cxkVar.a.g();
                        ake akeVarE2 = cxkVar.d.e();
                        cxkVar.a.h();
                        try {
                            akeVarE2.a();
                            ((cxk) cxfVarR).a.j();
                            cxkVar.a.i();
                            cxkVar.d.f(akeVarE2);
                            DesugarArrays.stream(cxy.values()).forEach(new Consumer() { // from class: cws
                                @Override // j$.util.function.Consumer
                                public final void accept(Object obj) {
                                    cwt cwtVar2 = cwtVar;
                                    cxy cxyVar = (cxy) obj;
                                    cxt cxtVarT = cwtVar2.a.t();
                                    int iM = cwtVar2.b.m();
                                    if (cxyVar == cxy.BACK_UNOPENABLE || cxyVar == cxy.FRONT_UNOPENABLE || cxyVar == cxy.UNOPENABLE) {
                                        iM = cwtVar2.b.o();
                                    }
                                    cxx cxxVar = (cxx) cxtVarT;
                                    cxxVar.a.g();
                                    ake akeVarE3 = cxxVar.b.e();
                                    akf akfVar = cxxVar.c;
                                    akeVarE3.e(1, cxyVar.ordinal());
                                    akeVarE3.e(2, iM);
                                    cxxVar.a.h();
                                    try {
                                        akeVarE3.a();
                                        ((cxx) cxtVarT).a.j();
                                    } finally {
                                        cxxVar.a.i();
                                        cxxVar.b.f(akeVarE3);
                                    }
                                }

                                @Override // j$.util.function.Consumer
                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer.CC.$default$andThen(this, consumer);
                                }
                            });
                        } catch (Throwable th) {
                            cxkVar.a.i();
                            cxkVar.d.f(akeVarE2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        cxrVar.a.i();
                        cxrVar.d.f(akeVarE);
                        throw th2;
                    }
                }
            };
            cameraFatalErrorTrackerDatabase.h();
            try {
                runnable.run();
                cameraFatalErrorTrackerDatabase.j();
                cameraFatalErrorTrackerDatabase.i();
                this.c.edit().putBoolean("pref_key_reboot_completed", false).apply();
            } catch (Throwable th) {
                cameraFatalErrorTrackerDatabase.i();
                throw th;
            }
        }
    }
}
