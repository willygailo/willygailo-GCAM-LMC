package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class bij {
    private static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (a) {
                return jr.b(theme != null ? new us(context2, theme) : context2, i);
            }
        } catch (Resources.NotFoundException e) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return aar.a(context2, i);
        } catch (NoClassDefFoundError e3) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return ei.d(context2.getResources(), i, theme);
    }
}
