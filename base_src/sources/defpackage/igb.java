package defpackage;

import android.view.View;
import com.google.android.apps.camera.bottombar.R;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class igb implements gto {
    public final ihg a;
    public final huf b;
    private final boolean c;
    private final boolean d;
    private final gtm e;
    private final lda f;
    private final Executor g;
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final bqg i;

    public igb(ihg ihgVar, boolean z, boolean z2, lda ldaVar, huf hufVar, Executor executor, bqg bqgVar) {
        this.a = ihgVar;
        this.c = z;
        this.d = z2;
        this.b = hufVar;
        this.g = executor;
        this.i = bqgVar;
        this.e = z2 ? gtm.COCKTAIL_PARTY_BACK : gtm.COCKTAIL_PARTY_FRONT;
        this.f = lcz.b(ldaVar, eto.t, imd.b);
    }

    @Override // defpackage.gto
    public final int a(gtv gtvVar) {
        gtv gtvVar2 = gtv.UNKNOWN;
        switch (gtvVar.ordinal()) {
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return com.google.android.GoogleCameraEngR18F1.R.string.speech_enhance_on_desc;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return com.google.android.GoogleCameraEngR18F1.R.string.speech_enhance_off_desc;
            default:
                return 0;
        }
    }

    @Override // defpackage.gto
    public final int b(gtv gtvVar) {
        gtv gtvVar2 = gtv.UNKNOWN;
        switch (gtvVar.ordinal()) {
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return com.google.android.GoogleCameraEngR18F1.R.drawable.gm_filled_record_voice_over_white_24;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return com.google.android.GoogleCameraEngR18F1.R.drawable.gm_filled_voice_over_off_white_24;
            default:
                return 0;
        }
    }

    @Override // defpackage.gto
    public final int c(gtv gtvVar) {
        gtv gtvVar2 = gtv.UNKNOWN;
        switch (gtvVar.ordinal()) {
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return com.google.android.GoogleCameraEngR18F1.R.string.speech_enhance_on;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return com.google.android.GoogleCameraEngR18F1.R.string.speech_enhance_off;
            default:
                return 0;
        }
    }

    @Override // defpackage.gto
    public final gtm d() {
        return this.e;
    }

    @Override // defpackage.gto
    public final gtp e() {
        return new gtp() { // from class: ifz
            @Override // defpackage.gtp
            public final void a(gtv gtvVar, boolean z) {
                final ihg ihgVar = this.a.a;
                if (z) {
                    ihgVar.a();
                    return;
                }
                lar.a();
                ius iusVar = ihgVar.a;
                View viewInflate = View.inflate(ihgVar.b, com.google.android.GoogleCameraEngR18F1.R.layout.speech_btmsheet_disabled_content, null);
                viewInflate.findViewById(com.google.android.GoogleCameraEngR18F1.R.id.learn_more_about_speech_enhance).setOnClickListener(new View.OnClickListener() { // from class: ihe
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ihgVar.a();
                    }
                });
                iusVar.g(10, com.google.android.GoogleCameraEngR18F1.R.string.speech_btmsheet_not_available_title, viewInflate, null, ihgVar.b);
            }
        };
    }

    @Override // defpackage.gto
    public final lda f() {
        return this.f;
    }

    @Override // defpackage.gto
    public final oom g() {
        return oom.n(gtv.COCKTAIL_PARTY_OFF, gtv.COCKTAIL_PARTY_ON);
    }

    @Override // defpackage.gto
    public final void h(gts gtsVar, boolean z) {
        boolean z2 = z && gtv.COCKTAIL_PARTY_ON.equals(this.f.fA());
        String str = true != this.d ? "Front" : "Back";
        String strConcat = str.length() != 0 ? "SpeechEnhance".concat(str) : new String("SpeechEnhance");
        if (z2) {
            gtsVar.b.n(false);
            gtsVar.l(strConcat, true);
        } else {
            gtsVar.l(strConcat, false);
            gtsVar.g();
        }
    }

    @Override // defpackage.gto
    public final boolean i(gtn gtnVar) {
        htl htlVar;
        if (!gtnVar.C()) {
            return true;
        }
        gtg gtgVar = (gtg) gtnVar;
        if (!gtgVar.ar || !htg.FPS_30.equals(gtnVar.c())) {
            if (gtgVar.ar) {
                return false;
            }
            htl htlVar2 = htl.RES_1080P;
            lwd lwdVar = lwd.FRONT;
            htg htgVar = htg.FPS_AUTO;
            switch (((htl) gtgVar.L.fA()).ordinal()) {
                case 1:
                    htlVar = htl.RES_2160P;
                    break;
                default:
                    htlVar = htl.RES_1080P;
                    break;
            }
            if (!htlVar2.equals(htlVar) || !htg.FPS_30.equals(gtnVar.c())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    @Override // defpackage.gto
    public final boolean j(gtn gtnVar) {
        boolean z;
        if (this.c) {
            gtg gtgVar = (gtg) gtnVar;
            if (jrl.VIDEO.equals((jrl) gtgVar.b.fA()) && (gtgVar.ar ^ this.d)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z || !this.h.compareAndSet(false, true) || ((Boolean) this.b.c(htu.u)).booleanValue()) {
            return z;
        }
        final gtv gtvVar = (gtv) this.f.fA();
        this.i.i().c(this.f.a(new lij() { // from class: iga
            @Override // defpackage.lij
            public final void fB(Object obj) {
                igb igbVar = this.a;
                if (((gtv) obj).equals(gtvVar) || ((Boolean) igbVar.b.c(htu.u)).booleanValue()) {
                    return;
                }
                igbVar.a.a();
            }
        }, this.g));
        return true;
    }

    @Override // defpackage.gto
    public final void k() {
    }

    @Override // defpackage.gto
    public final void l() {
    }
}
