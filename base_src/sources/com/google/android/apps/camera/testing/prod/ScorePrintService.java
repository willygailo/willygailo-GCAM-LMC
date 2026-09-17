package com.google.android.apps.camera.testing.prod;

import android.app.IntentService;
import android.content.Intent;
import defpackage.inb;
import defpackage.ind;
import defpackage.mip;
import defpackage.oug;
import defpackage.ouj;

/* JADX INFO: loaded from: classes.dex */
public class ScorePrintService extends IntentService {
    private static final ouj a = ouj.h("com/google/android/apps/camera/testing/prod/ScorePrintService");

    public ScorePrintService() {
        super("CAM_ScorePrintService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        if (intent == null) {
            ((oug) ((oug) a.c()).G((char) 3017)).o("No intent is given.");
            return;
        }
        ind indVar = (ind) ((inb) getApplication()).e(new mip()).a.get();
        if (indVar == null) {
            ((oug) ((oug) a.c()).G((char) 3016)).o("The service isn't enabled.");
        } else {
            indVar.a(intent);
        }
    }
}
