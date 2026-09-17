package com.google.android.apps.camera.legacy.app.activity;

import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import defpackage.bqe;

/* JADX INFO: loaded from: classes.dex */
public class SecureCameraActivity extends CameraActivity {
    @Override // com.google.android.apps.camera.legacy.app.activity.main.CameraActivity, defpackage.etd, defpackage.fio, defpackage.by, defpackage.ub, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (isVoiceInteractionRoot()) {
            return;
        }
        bqe.f(getIntent());
    }
}
