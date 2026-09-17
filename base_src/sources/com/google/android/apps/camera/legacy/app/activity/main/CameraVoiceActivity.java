package com.google.android.apps.camera.legacy.app.activity.main;

import defpackage.bqe;

/* JADX INFO: loaded from: classes.dex */
public class CameraVoiceActivity extends CameraActivity {
    @Override // com.google.android.apps.camera.legacy.app.activity.main.CameraActivity
    protected final boolean n() {
        return true;
    }

    @Override // defpackage.etd, defpackage.fio, defpackage.by, android.app.Activity
    protected final void onPause() {
        bqe.f(getIntent());
        super.onPause();
    }
}
