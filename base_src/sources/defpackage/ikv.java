package defpackage;

import android.content.Context;
import android.provider.MediaStore;
import com.Fix.Pref;
import com.google.android.apps.camera.bottombar.DLock$GestureListener;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class ikv implements pys {
    private final qkg a;

    public ikv(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mbj get() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Integer num;
        Context contextA = ((emp) this.a).a();
        Locale locale = Locale.US;
        String cfgFileName = Pref.MenuValue("pref_date_key") == 0 ? "yyyyMMdd_HHmmss_'lmc_8.4'" : "d MMM HH:mm.'lmc_8.4'";
        if (Pref.MenuValue("pref_xmlfilename_key") == 0) {
            cfgFileName = DLock$GestureListener.getCfgFileName(cfgFileName);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(cfgFileName, locale);
        DesugarTimeZone.getTimeZone("UTC");
        mbi mbiVar = new mbi();
        mbiVar.a = "IMG_";
        mbiVar.b = "IMG_";
        mbiVar.c = "VID_";
        mbiVar.d = "_tmp.";
        mbiVar.c();
        mbiVar.b();
        mbiVar.a(4);
        mbiVar.d(false);
        mbiVar.e(false);
        mbiVar.j = simpleDateFormat;
        mbiVar.g();
        mbiVar.n = "";
        mbiVar.h();
        mbiVar.f();
        mbiVar.q = true;
        mbiVar.r = 0L;
        mbiVar.l = contextA;
        String stringValue = Pref.getStringValue("prefix_key");
        mbiVar.a = stringValue;
        mbiVar.b = stringValue;
        mbiVar.c = stringValue;
        mbiVar.d = "_PXL_";
        mbiVar.c();
        mbiVar.b();
        mbiVar.a(2);
        mbiVar.d(true);
        mbiVar.e(true);
        mbiVar.g();
        mbiVar.n = "media";
        mbiVar.h();
        mbiVar.f();
        Context context = mbiVar.l;
        if (context == null) {
            throw new IllegalStateException("Property \"storageContext\" has not been set");
        }
        mcb mcbVarA = mcc.a(context);
        mcbVarA.g(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        mcbVarA.h(MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        mcbVarA.c = "_display_name";
        mcbVarA.f();
        mcbVarA.b();
        mcbVarA.f = "relative_path";
        mcbVarA.c();
        mcbVarA.d(1);
        mcbVarA.e(3);
        mbiVar.p = mcbVarA.a();
        if (mbiVar.k == null) {
            mbiVar.k = orw.a;
        }
        String str6 = mbiVar.a;
        if (str6 != null && (str = mbiVar.b) != null && (str2 = mbiVar.c) != null && (str3 = mbiVar.d) != null && (str4 = mbiVar.e) != null && (str5 = mbiVar.f) != null && (num = mbiVar.g) != null && mbiVar.h != null && mbiVar.i != null && mbiVar.j != null && mbiVar.l != null && mbiVar.m != null && mbiVar.n != null && mbiVar.o != null && mbiVar.p != null && mbiVar.q != null && mbiVar.r != null && mbiVar.s != null) {
            return new mbj(str6, str, str2, str3, str4, str5, num.intValue(), mbiVar.h.booleanValue(), mbiVar.i.booleanValue(), mbiVar.j, mbiVar.k, mbiVar.l, mbiVar.m, mbiVar.n, mbiVar.o, mbiVar.p, mbiVar.q.booleanValue(), mbiVar.r.longValue(), mbiVar.s.longValue());
        }
        StringBuilder sb = new StringBuilder();
        if (mbiVar.a == null) {
            sb.append(" filenameDefaultPrefix");
        }
        if (mbiVar.b == null) {
            sb.append(" filenameImagePrefix");
        }
        if (mbiVar.c == null) {
            sb.append(" filenameVideoPrefix");
        }
        if (mbiVar.d == null) {
            sb.append(" filenameTmpPrefix");
        }
        if (mbiVar.e == null) {
            sb.append(" filenameBurstTagPrefix");
        }
        if (mbiVar.f == null) {
            sb.append(" filenameBurstPrimaryTag");
        }
        if (mbiVar.g == null) {
            sb.append(" filenameBurstDigitCount");
        }
        if (mbiVar.h == null) {
            sb.append(" filenameBurstTagRequired");
        }
        if (mbiVar.i == null) {
            sb.append(" filenameBurstUseGroupTag");
        }
        if (mbiVar.j == null) {
            sb.append(" filenameGroupFormat");
        }
        if (mbiVar.l == null) {
            sb.append(" storageContext");
        }
        if (mbiVar.m == null) {
            sb.append(" storageCacheSubpath");
        }
        if (mbiVar.n == null) {
            sb.append(" storageDataSubpath");
        }
        if (mbiVar.o == null) {
            sb.append(" storageDcimSubpath");
        }
        if (mbiVar.p == null) {
            sb.append(" defaultContentResolverApi");
        }
        if (mbiVar.q == null) {
            sb.append(" notifyChangeOnPublish");
        }
        if (mbiVar.r == null) {
            sb.append(" notifyChangeTimeoutMs");
        }
        if (mbiVar.s == null) {
            sb.append(" storageAutoPublishTimeoutMs");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }
}
