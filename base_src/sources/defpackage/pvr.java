package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class pvr {
    public static final String a = pvr.class.getSimpleName();
    public final PackageManager b;

    public pvr(PackageManager packageManager) {
        packageManager.getClass();
        this.b = packageManager;
    }

    public final String a(String str, String str2) {
        try {
            Resources resourcesForApplication = this.b.getResourcesForApplication(str);
            return resourcesForApplication.getString(resourcesForApplication.getIdentifier(str2, "string", str));
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(a, String.format("Application package name '%s' not found.", str));
            return null;
        } catch (Resources.NotFoundException e2) {
            Log.w(a, String.format("String resource name '%s' not found in package '%s'.", str2, str));
            return null;
        }
    }

    public final String b() {
        return true != c("com.google.vr.apps.ornament", "com.google.vr.apps.ornament.measure.MeasureMainActivity") ? "com.google.vr.apps.ornament.measure" : "com.google.vr.apps.ornament";
    }

    public final boolean c(String str, String str2) {
        Intent intent = new Intent();
        intent.setClassName(str, str2);
        return this.b.resolveActivity(intent, 0) != null;
    }

    public final Drawable d() {
        try {
            Resources resourcesForApplication = this.b.getResourcesForApplication("com.google.vr.apps.ornament");
            return resourcesForApplication.getDrawable(resourcesForApplication.getIdentifier("playground_mode_icon", "drawable", "com.google.vr.apps.ornament"), null);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(a, String.format("Application package name '%s' not found.", "com.google.vr.apps.ornament"));
            return null;
        } catch (Resources.NotFoundException e2) {
            Log.w(a, String.format("Drawable resource name '%s' not found in package '%s'.", "playground_mode_icon", "com.google.vr.apps.ornament"));
            return null;
        }
    }
}
