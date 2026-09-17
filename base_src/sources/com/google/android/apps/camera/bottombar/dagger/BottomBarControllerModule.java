package com.google.android.apps.camera.bottombar.dagger;

import com.google.android.apps.camera.bottombar.BottomBarController;
import defpackage.ddf;
import defpackage.img;
import defpackage.jns;
import defpackage.ojc;

/* JADX INFO: loaded from: classes.dex */
public class BottomBarControllerModule {
    public BottomBarController provideBottomBarController(jns jnsVar, img imgVar, ddf ddfVar) {
        return new BottomBarController(jnsVar.f, imgVar, ojc.i(ddfVar));
    }
}
