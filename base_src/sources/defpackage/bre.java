package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bre {
    public static final /* synthetic */ int a = 0;
    private static final Uri b = Uri.parse("https://support.google.com/nexus/topic/6012822");
    private static final Uri c = Uri.parse("http://www.google.com/policies/privacy/");
    private static final Uri d = Uri.parse("http://www.google.com/policies/terms/");

    public static final void a(String str, Context context) {
        kij kijVar = new kij(context);
        kpa kpaVar = new kpa();
        kpaVar.b = String.valueOf(str).concat(".USER_INITIATED_FEEDBACK_REPORT");
        kpaVar.a = context.getString(R.string.feedback_description_empty);
        kpb kpbVarA = kpaVar.a();
        kim kimVar = kijVar.j;
        System.nanoTime();
        kij kijVar2 = ((kkh) kimVar).a;
        kow kowVar = new kow(kimVar, kpbVarA);
        kimVar.b(kowVar);
        mip.dw(kowVar);
    }

    public static final void b(Context context, Activity activity) {
        new kpn(activity).a(d("android_default", context));
    }

    public static final void c(Context context, Activity activity) {
        new kpn(activity).a(d("fix_camera_app_1", context));
    }

    private static final Intent d(String str, Context context) {
        GoogleHelp googleHelp = new GoogleHelp(16, str, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 3, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, 200, null, false);
        googleHelp.q = b;
        googleHelp.a(0, context.getResources().getString(R.string.privacy_policy), new Intent("android.intent.action.VIEW", c));
        googleHelp.a(1, context.getResources().getString(R.string.open_source_licenses), new Intent(context, (Class<?>) LicenseMenuActivity.class));
        googleHelp.a(2, context.getResources().getString(R.string.terms_of_service), new Intent("android.intent.action.VIEW", d));
        return new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", googleHelp);
    }
}
