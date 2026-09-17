package com.google.android.apps.camera.legacy.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import defpackage.jri;
import defpackage.jrl;
import defpackage.oit;
import defpackage.ojc;
import defpackage.oug;
import defpackage.ouj;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class CameraDeepLinkActivity extends Activity {
    private static final ouj a = ouj.h("com/google/android/apps/camera/legacy/app/activity/CameraDeepLinkActivity");
    private boolean b;

    private final void a() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.GoogleCamera"));
        intent.setPackage("com.android.vending");
        startActivity(intent);
        this.b = true;
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = false;
        Intent intent = new Intent(this, (Class<?>) CameraActivity.class);
        intent.setAction("android.media.action.STILL_IMAGE_CAMERA");
        intent.addFlags(268435456);
        Uri data = getIntent().getData();
        if (data == null) {
            ((oug) ((oug) a.c()).G((char) 1496)).o("Received intent to launch DeepLinkActivity with null intentUri");
            startActivity(intent);
            this.b = true;
            return;
        }
        for (String str : data.getQueryParameterNames()) {
            if ("mode".equalsIgnoreCase(str)) {
                String queryParameter = data.getQueryParameter(str);
                queryParameter.getClass();
                ojc ojcVarA = oit.a(jrl.class, queryParameter.toUpperCase(Locale.ROOT));
                if (!ojcVarA.g() || !jri.e((jrl) ojcVarA.c())) {
                    ((oug) ((oug) a.c()).G((char) 1497)).r("Unsupported mode '%s', perhaps you need to upgrade", queryParameter);
                    a();
                    return;
                } else {
                    if (!"android.media.action.STILL_IMAGE_CAMERA".equals(intent.getAction())) {
                        throw new UnsupportedOperationException("Unreachable: only still-image modes supported");
                    }
                    intent.putExtra("android.intent.extra.STILL_IMAGE_MODE", ((jrl) ojcVarA.c()).toString());
                }
            } else if ("timer".equalsIgnoreCase(str)) {
                String queryParameter2 = data.getQueryParameter(str);
                queryParameter2.getClass();
                intent.putExtra("android.intent.extra.TIMER_DURATION_SECONDS", Integer.parseInt(queryParameter2));
            } else if (!"use-front-camera".equalsIgnoreCase(str)) {
                ((oug) ((oug) a.c()).G(1495)).y("Unknown query parameter %s, with value %s", str, data.getQueryParameter(str));
                a();
                return;
            } else {
                String queryParameter3 = data.getQueryParameter(str);
                queryParameter3.getClass();
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", Boolean.parseBoolean(queryParameter3));
            }
        }
        startActivity(intent);
        this.b = true;
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        if (this.b) {
            finish();
        }
    }
}
