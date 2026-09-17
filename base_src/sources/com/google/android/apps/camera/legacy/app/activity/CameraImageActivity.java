package com.google.android.apps.camera.legacy.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import com.google.android.apps.camera.legacy.app.activity.main.CameraVoiceActivity;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import defpackage.bmw;
import defpackage.bng;
import defpackage.bqq;
import defpackage.btq;
import defpackage.cax;
import defpackage.cly;
import defpackage.cpk;
import defpackage.cso;
import defpackage.ddf;
import defpackage.dei;
import defpackage.dug;
import defpackage.edj;
import defpackage.emb;
import defpackage.emd;
import defpackage.eme;
import defpackage.emj;
import defpackage.emk;
import defpackage.enf;
import defpackage.eng;
import defpackage.etd;
import defpackage.ete;
import defpackage.etf;
import defpackage.etg;
import defpackage.eti;
import defpackage.etj;
import defpackage.euv;
import defpackage.ewb;
import defpackage.fjs;
import defpackage.hgg;
import defpackage.hug;
import defpackage.hvh;
import defpackage.hvp;
import defpackage.irk;
import defpackage.iwa;
import defpackage.jcw;
import defpackage.jho;
import defpackage.jrl;
import defpackage.jtx;
import defpackage.khx;
import defpackage.lqv;
import defpackage.obr;
import defpackage.ojc;
import defpackage.ojz;
import defpackage.pyr;
import defpackage.qkg;

/* JADX INFO: loaded from: classes.dex */
public class CameraImageActivity extends etd {
    private boolean o = false;

    @Override // android.app.Activity
    public final boolean isVoiceInteractionRoot() {
        return super.isVoiceInteractionRoot() || this.o;
    }

    @Override // defpackage.etd, defpackage.fio, defpackage.by, defpackage.ub, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        euv euvVarD = ((CameraApp) getApplicationContext()).d();
        ete eteVarL = l();
        emb embVarK = k();
        eteVarL.getClass();
        embVarK.getClass();
        ewb ewbVar = ((ewb) euvVarD).d;
        emd emdVarB = emd.b(embVarK);
        eme emeVarB = eme.b(embVarK);
        qkg qkgVarB = pyr.b(bmw.c(ewbVar.bI, pyr.b(bmw.d(pyr.b(bng.b(ewbVar.F, ewbVar.w, etg.a(eteVarL))), ewbVar.G))));
        eti etiVarA = eti.a(eteVarL);
        etj etjVarA = etj.a(eteVarL);
        hvp hvpVarB = hvp.b(ewbVar.cw, ewbVar.az);
        qkg qkgVarB2 = pyr.b(iwa.a(emdVarB, emeVarB, ewbVar.o, qkgVarB, ewbVar.k, ewbVar.i, pyr.b(edj.c(etiVarA, emdVarB, emeVarB, pyr.b(cly.a(etjVarA, emdVarB, hvpVarB, ewbVar.cO, ewbVar.cP, ewbVar.cQ, ewbVar.cR, ewbVar.cS, ewbVar.cT, ewbVar.i, ewbVar.t, ewbVar.o, ewbVar.l)), pyr.b(hgg.b(emeVarB, ewbVar.bJ)), ewbVar.az))));
        hvh hvhVarB = hvh.b(ewbVar.v, ewbVar.ac, ewbVar.i);
        cpk cpkVarB = cpk.b(ewbVar.az, ewbVar.cZ, ewbVar.i);
        qkg qkgVarB3 = pyr.b(bmw.b(emk.a(embVarK), ewbVar.o));
        qkg qkgVarB4 = pyr.b(cax.c(emdVarB, qkgVarB3, emeVarB, ewbVar.t, ewbVar.r, ewbVar.aw, ewbVar.i));
        qkg qkgVarB5 = pyr.b(cso.a(ewbVar.o, etf.a(eteVarL), emeVarB));
        jho jhoVarB = jho.b(emeVarB, etiVarA, ewbVar.ac, hvhVarB, ewbVar.az, cpkVarB, ewbVar.cp, hvpVarB, pyr.b(btq.a(ewbVar.ac, ewbVar.o, pyr.b(bqq.b(ewbVar.o, ewbVar.bF, qkgVarB4, ewbVar.aw, ewbVar.r, qkgVarB5)), pyr.b(cax.b(pyr.b(cax.a(emdVarB, qkgVarB3, emeVarB, ewbVar.t, ewbVar.r, ewbVar.aw, ewbVar.i)), ewbVar.o, ewbVar.bF, ewbVar.aw, ewbVar.t, ewbVar.r, qkgVarB5)), ewbVar.bF, ewbVar.aw, ewbVar.aS, emj.b(embVarK))));
        boolean z = ewbVar.z();
        boolean zX = ewbVar.x();
        boolean zY = ewbVar.y();
        jcw jcwVar = (jcw) qkgVarB2.get();
        jtx jtxVarA = irk.a((ddf) ewbVar.i.get());
        Activity activity = embVarK.a;
        fjs fjsVar = (fjs) ewbVar.t.get();
        khx khxVar = (khx) ewbVar.ck.get();
        lqv lqvVar = (lqv) ewbVar.db.get();
        hug hugVar = (hug) ewbVar.az.get();
        ojz ojzVarAu = obr.au(new enf(z, zX, zY, jtxVarA, activity, null));
        dei deiVarA = dug.a();
        Intent intent = new Intent(getIntent());
        boolean z2 = false;
        if (deiVarA.equals(dei.ENG) && intent.getBooleanExtra("gca_eng_fake_viroot", false)) {
            z2 = true;
        }
        this.o = z2;
        if (isVoiceInteractionRoot()) {
            intent.setClass(this, CameraVoiceActivity.class);
        } else {
            intent.setClass(this, CameraActivity.class);
        }
        intent.addFlags(268435456);
        getIntent().getAction();
        isVoiceInteractionRoot();
        ojc ojcVarC = eng.c(eng.b(intent, activity, ojzVarAu, lqvVar), intent, jcwVar, jhoVarB, jtxVarA, activity, fjsVar, khxVar, ojzVarAu, hugVar, lqvVar);
        eng.a(intent, true ^ ojcVarC.g(), activity, hugVar);
        activity.setIntent(intent);
        if (!ojcVarC.g() || !eng.d((jrl) ojcVarC.c(), jcwVar, jhoVarB, jtxVarA, activity, fjsVar, khxVar)) {
            activity.startActivity(intent);
        }
        finish();
    }
}
