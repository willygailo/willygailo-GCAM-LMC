package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.Fix.Pref;
import com.Helper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class aap {
    public static void a(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, null);
    }

    public static void b(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, null);
    }

    public static Object c(ExecutorService executorService, Callable callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException e3) {
            throw new InterruptedException("timeout");
        }
    }

    public static Intent d(boolean z, boolean z2, boolean z3, long[] jArr) {
        Intent intent;
        Intent intent2;
        if (Pref.MenuValue("pref_photos_gallery_key") != 0) {
            if (z2) {
                if (z) {
                    intent2 = new Intent("com.google.android.apps.photos.mars.api.ACTION_REVIEW_SECURE");
                    intent2.putExtra("com.google.android.apps.photos.api.secure_mode", true);
                } else {
                    intent2 = new Intent("com.google.android.apps.photos.mars.api.ACTION_REVIEW");
                }
                if (jArr.length != 0) {
                    intent2.putExtra("com.google.android.apps.photos.api.secure_mode_ids", jArr);
                }
            } else if (z) {
                intent2 = new Intent("android.provider.action.REVIEW_SECURE");
                intent2.putExtra("com.google.android.apps.photos.api.secure_mode", true);
                if (jArr.length != 0) {
                    intent2.putExtra("com.google.android.apps.photos.api.secure_mode_ids", jArr);
                }
            } else {
                intent2 = new Intent("android.provider.action.REVIEW");
            }
            if (z3) {
                intent2.addFlags(268435456);
            }
            intent2.setPackage("com.google.android.apps.photos");
            intent2.addFlags(1);
            return intent2;
        }
        if (z2) {
            if (z) {
                intent = new Intent("com.google.android.apps.photos.mars.api.ACTION_REVIEW_SECURE");
                intent.putExtra("com.google.android.apps.photos.api.secure_mode", true);
            } else {
                intent = new Intent("com.google.android.apps.photos.mars.api.ACTION_REVIEW");
            }
            if (jArr.length != 0) {
                intent.putExtra("com.google.android.apps.photos.api.secure_mode_ids", jArr);
            }
        } else if (z) {
            intent = new Intent("com.google.android.apps.photos.action.SECURE_REVIEW");
            intent.putExtra("com.google.android.apps.photos.api.secure_mode", true);
            if (jArr.length != 0) {
                intent.putExtra("com.google.android.apps.photos.api.secure_mode_ids", jArr);
            }
        } else {
            intent = new Intent("com.android.camera.action.REVIEW");
        }
        if (z3) {
            intent.addFlags(268435456);
        }
        intent.setPackage(Helper.sAppsPhotosGallery);
        intent.addFlags(1);
        return intent;
    }

    public static lnv e() {
        lnu lnuVarA = lnv.a();
        lnuVarA.c(1);
        lnuVarA.b(2);
        lnuVarA.e(1);
        return lnuVarA.a();
    }

    public static lnv f() {
        lnu lnuVarA = lnv.a();
        lnuVarA.c(2);
        lnuVarA.b(2);
        lnuVarA.e(1);
        return lnuVarA.a();
    }

    public static lnv g() {
        lnu lnuVarA = lnv.a();
        lnuVarA.c(3);
        lnuVarA.b(3);
        lnuVarA.e(1);
        return lnuVarA.a();
    }
}
