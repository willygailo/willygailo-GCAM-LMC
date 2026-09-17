package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.Fix.Pref;
import com.SDE.LensValue;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.lens.sdk.LensApi;
import j$.util.function.Consumer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class iwa implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final /* synthetic */ int h;

    public iwa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i) {
        this.h = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
    }

    public iwa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, byte[] bArr) {
        this.h = i;
        this.c = qkgVar;
        this.e = qkgVar2;
        this.g = qkgVar3;
        this.a = qkgVar4;
        this.d = qkgVar5;
        this.f = qkgVar6;
        this.b = qkgVar7;
    }

    public iwa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, char[] cArr) {
        this.h = i;
        this.g = qkgVar;
        this.c = qkgVar2;
        this.e = qkgVar3;
        this.f = qkgVar4;
        this.d = qkgVar5;
        this.a = qkgVar6;
        this.b = qkgVar7;
    }

    public iwa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, float[] fArr) {
        this.h = i;
        this.e = qkgVar;
        this.d = qkgVar2;
        this.g = qkgVar3;
        this.c = qkgVar4;
        this.f = qkgVar5;
        this.b = qkgVar6;
        this.a = qkgVar7;
    }

    public iwa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, int[] iArr) {
        this.h = i;
        this.f = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
        this.b = qkgVar4;
        this.e = qkgVar5;
        this.g = qkgVar6;
        this.d = qkgVar7;
    }

    public iwa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, short[] sArr) {
        this.h = i;
        this.c = qkgVar;
        this.g = qkgVar2;
        this.e = qkgVar3;
        this.a = qkgVar4;
        this.d = qkgVar5;
        this.f = qkgVar6;
        this.b = qkgVar7;
    }

    public iwa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, boolean[] zArr) {
        this.h = i;
        this.f = qkgVar;
        this.c = qkgVar2;
        this.g = qkgVar3;
        this.d = qkgVar4;
        this.b = qkgVar5;
        this.a = qkgVar6;
        this.e = qkgVar7;
    }

    public iwa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, byte[][] bArr) {
        this.h = i;
        this.e = qkgVar;
        this.f = qkgVar2;
        this.b = qkgVar3;
        this.d = qkgVar4;
        this.g = qkgVar5;
        this.a = qkgVar6;
        this.c = qkgVar7;
    }

    public iwa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, char[][] cArr) {
        this.h = i;
        this.e = qkgVar;
        this.g = qkgVar2;
        this.b = qkgVar3;
        this.f = qkgVar4;
        this.d = qkgVar5;
        this.c = qkgVar6;
        this.a = qkgVar7;
    }

    public iwa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, short[][] sArr) {
        this.h = i;
        this.e = qkgVar;
        this.c = qkgVar2;
        this.g = qkgVar3;
        this.b = qkgVar4;
        this.f = qkgVar5;
        this.d = qkgVar6;
        this.a = qkgVar7;
    }

    public static iwa a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7) {
        return new iwa(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, 3, (short[]) null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:25:0x0106  */
    /* JADX WARN: Code duplicated, block: B:26:0x010d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0111  */
    /* JADX WARN: Code duplicated, block: B:29:0x0118  */
    /* JADX WARN: Code duplicated, block: B:31:0x011c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0127  */
    /* JADX WARN: Code duplicated, block: B:37:0x0131  */
    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        lso lsoVar;
        switch (this.h) {
            case 0:
                return new ivz(((emh) this.a).get(), (Consumer) this.b.get(), (bue) this.c.get(), (huf) this.d.get(), (lar) this.e.get(), (ddf) this.f.get(), ((etg) this.g).get());
            case 1:
                return new imf((ddf) this.c.get(), (hug) this.e.get(), (lda) this.g.get(), ((ing) this.a).a(), (imt) this.d.get(), (bui) this.f.get(), (lar) this.b.get());
            case 2:
                jns jnsVar = ((jnw) this.g).get();
                ddf ddfVar = (ddf) this.c.get();
                ojc ojcVarA = ((evv) this.e).a();
                jty jtyVar = (jty) this.f.get();
                jrh jrhVar = (jrh) this.d.get();
                kas kasVar = ((iwi) this.a).get();
                Handler handler = (Handler) this.b.get();
                boolean zK = ddfVar.k(ddl.aw);
                boolean zK2 = ddfVar.k(ddr.o);
                boolean zK3 = ddfVar.k(ddl.ay);
                if (zK) {
                    ShutterButton shutterButton = jnsVar.f.getShutterButton();
                    obr.ao(shutterButton);
                    ddfVar.e();
                    return new jjv(shutterButton, handler, ojcVarA, jtyVar, jnsVar.o, zK2, zK3, jrhVar, kasVar);
                }
                ShutterButton shutterButton2 = jnsVar.f.getShutterButton();
                obr.ao(shutterButton2);
                ddfVar.e();
                return new jlh(shutterButton2, handler, ojcVarA, jtyVar, zK2, zK3, jrhVar, kasVar);
            case 3:
                final Context context = ((emd) this.c).get();
                Activity activity = ((eme) this.g).get();
                lar larVar = (lar) this.e.get();
                Executor executor = (Executor) this.a.get();
                final ljf ljfVar = (ljf) this.d.get();
                return new jcw(activity, larVar, executor, (ddf) this.f.get(), (hnx) this.b.get(), new ojz() { // from class: jcm
                    @Override // defpackage.ojz
                    public final Object a() {
                        ljf ljfVar2 = ljfVar;
                        Context context2 = context;
                        try {
                            ljfVar2.e("LensUtil.LensApi");
                            return new LensApi(context2.getApplicationContext());
                        } finally {
                            ljfVar2.f();
                        }
                    }
                });
            case 4:
                jhh jhhVar = new jhh(((emd) this.f).get(), ((eej) this.c).b(), (hub) this.a.get(), (elw) this.b.get(), (Executor) this.e.get(), ((etg) this.g).get(), (ddf) this.d.get());
                jgv jgvVar = new jgv();
                jgvVar.f = jhhVar.d;
                jgvVar.e = jhhVar.d.getResources().getString(R.string.af_ae_lock);
                jgvVar.a = true;
                jgvVar.i = 2;
                jgvVar.h = jhhVar.h;
                jhhVar.i = jgvVar.a();
                jgvVar.e = jhhVar.d.getResources().getString(R.string.update_camera_to_use_lens);
                jgvVar.a = false;
                jgvVar.i = 7;
                jgvVar.h = jhhVar.h;
                jgvVar.a();
                jgvVar.e = jhhVar.d.getResources().getString(R.string.thermal_flash_disabled_chip_text);
                jgvVar.a = false;
                jgvVar.i = 11;
                jgvVar.h = jhhVar.h;
                jhhVar.j = jgvVar.a();
                jgvVar.e = jhhVar.d.getResources().getString(R.string.thermal_video_quality_chip_text);
                jgvVar.a = false;
                jgvVar.i = 11;
                jgvVar.h = jhhVar.h;
                jhhVar.k = jgvVar.a();
                jgvVar.e = jhhVar.d.getResources().getString(R.string.thermal_recording_stopped_chip_text);
                jgvVar.a = false;
                jgvVar.i = 11;
                jgvVar.h = jhhVar.h;
                jhhVar.l = jgvVar.a();
                jgvVar.e = jhhVar.d.getResources().getString(R.string.thermal_recording_disasbled_chip_text);
                jgvVar.a = false;
                jgvVar.i = 11;
                jgvVar.h = jhhVar.h;
                jhhVar.m = jgvVar.a();
                jgvVar.e = jhhVar.d.getResources().getString(R.string.thermal_ev_controls_limited_chip_text);
                jgvVar.a = false;
                jgvVar.b = 4000;
                jgvVar.i = 11;
                jgvVar.h = jhhVar.h;
                jhhVar.n = jgvVar.a();
                return jhhVar;
            case 5:
                lpr lprVar = (lpr) this.f.get();
                lnf lnfVar = ((lpn) this.c).get();
                lvq lvqVar = ((lhr) this.g).get();
                luk lukVar = (luk) this.d.get();
                lxx lxxVar = (lxx) this.b.get();
                return new lpf(lprVar, lnfVar, lvqVar, lukVar, lxxVar);
            case 6:
                lzh lzhVar = (lzh) this.e.get();
                lnf lnfVar2 = ((lpn) this.d).get();
                qkg qkgVar = this.g;
                qkg qkgVar2 = this.c;
                qkg qkgVar3 = this.f;
                qkg qkgVar4 = this.b;
                qkg qkgVar5 = this.a;
                int iMenuValue = Pref.MenuValue(LensValue.SetLensValue("pref_stream_opmode_key"));
                if (iMenuValue != 0) {
                    if (iMenuValue != 1) {
                        if (iMenuValue == 2) {
                            lsoVar = (lso) qkgVar3.get();
                        } else {
                            if (iMenuValue == 3) {
                                if (lzhVar.b) {
                                    lsoVar = (lso) qkgVar2.get();
                                }
                            } else if (iMenuValue != 4) {
                                if (!lzhVar.e) {
                                    if (lnfVar2.b.equals(lnp.HIGH_SPEED)) {
                                        lsoVar = (lso) qkgVar5.get();
                                    } else if (lzhVar.c) {
                                        lsoVar = (lso) qkgVar3.get();
                                    } else if (lzhVar.b) {
                                        lsoVar = (lso) qkgVar2.get();
                                    }
                                }
                            }
                            if (lzhVar.a) {
                                int i = Build.VERSION.SDK_INT;
                                StringBuilder sb = new StringBuilder(28);
                                sb.append("Unsupported SDK: ");
                                sb.append(i);
                                throw new IllegalStateException(sb.toString());
                            }
                            lsoVar = (lso) qkgVar.get();
                        }
                    }
                    lsoVar = (lso) qkgVar4.get();
                } else if (lnfVar2.b.equals(lnp.HIGH_SPEED)) {
                    lsoVar = (lso) qkgVar5.get();
                } else if (lzhVar.c) {
                    lsoVar = (lso) qkgVar3.get();
                } else if (lzhVar.b) {
                    lsoVar = (lso) qkgVar2.get();
                } else {
                    if (lzhVar.a) {
                        int i2 = Build.VERSION.SDK_INT;
                        StringBuilder sb2 = new StringBuilder(28);
                        sb2.append("Unsupported SDK: ");
                        sb2.append(i2);
                        throw new IllegalStateException(sb2.toString());
                    }
                    lsoVar = (lso) qkgVar.get();
                }
                qmd.ae(lsoVar);
                return lsoVar;
            case 7:
                return new maz((mch) this.e.get(), (man) this.f.get(), (maq) this.b.get(), ((ikv) this.d).get(), (Executor) this.g.get(), (ljf) this.a.get(), ((liq) this.c).get());
            case 8:
                mxm mxmVar = ((mxn) this.e).get();
                Context contextA = ((emp) this.g).a();
                phw phwVar = (phw) this.b.get();
                pyn pynVarA = pyr.a(this.f);
                qkg qkgVar6 = this.d;
                return new mxz(mxmVar, contextA, phwVar, pynVarA, qkgVar6, this.a);
            default:
                return new nbm(((mxn) this.e).get(), ((emp) this.c).a(), (mwe) this.g.get(), (Executor) this.b.get(), pyr.a(this.f), ((ncf) this.d).get(), this.a);
        }
    }
}
