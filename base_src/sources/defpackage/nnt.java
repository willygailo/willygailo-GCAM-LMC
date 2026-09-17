package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class nnt implements qcn {
    final /* synthetic */ nnu a;

    public nnt(nnu nnuVar) {
        this.a = nnuVar;
    }

    @Override // defpackage.qcn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ova ovaVar;
        String str;
        String str2;
        nna nnaVar = (nna) obj;
        nnu nnuVar = this.a;
        nnaVar.getClass();
        ovk ovkVar = nnuVar.a;
        switch (nnaVar.e - 2) {
            case 0:
                ovaVar = (ovg) ovkVar.b();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                ovaVar = ovi.b;
                break;
            case 14:
                ovaVar = (ovg) ovkVar.c();
                break;
            case 15:
                ovaVar = (ovg) ovkVar.b();
                break;
            case 16:
                ovaVar = (ovg) ovkVar.b();
                break;
            case 17:
                ovaVar = (ovg) ovkVar.b();
                break;
            case 18:
                ovaVar = (ovg) ovkVar.b();
                break;
            case 19:
                ovaVar = (ovg) ovkVar.b();
                break;
            case 20:
                ovaVar = (ovg) ovkVar.b();
                break;
            case 21:
                ovaVar = (ovg) ovkVar.b();
                break;
            case 22:
                ovaVar = (ovg) ovkVar.b();
                break;
            case 23:
                ovaVar = (ovg) ovkVar.b();
                break;
            case 24:
                ovaVar = (ovg) ovkVar.b();
                break;
            case 25:
                ovaVar = (ovg) ovkVar.b();
                break;
            case 26:
                ovaVar = (ovg) ovkVar.b();
                break;
            case 27:
                ovaVar = (ovg) ovkVar.b();
                break;
            case 28:
                ovaVar = (ovg) ovkVar.b();
                break;
            case 29:
                ovaVar = (ovg) ovkVar.b();
                break;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                ovaVar = (ovg) ovkVar.c();
                break;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                ovaVar = (ovg) ovkVar.c();
                break;
            case 32:
                ovaVar = (ovg) ovkVar.c();
                break;
            default:
                ovaVar = (ovg) ovkVar.b();
                break;
        }
        ovg ovgVar = (ovg) ovaVar.h(nnaVar.d);
        switch (nnaVar.e) {
            case 2:
                str = "UNKNOWN_F250_LOG_REASON";
                break;
            case 3:
                str = "SUCCESS";
                break;
            case 4:
                str = "SUCCESS_PARTIAL_UPLOAD_WORK_CANCELLED";
                break;
            case 5:
                str = "SUCCESS_PARTIAL_UPLOAD_WORK_ENQUEUED";
                break;
            case 6:
                str = "SUCCESS_PARTIAL_AUTO_WORK_ENQUEUED";
                break;
            case 7:
                str = "SUCCESS_PARTIAL_UPLOAD_ATTACHMENT";
                break;
            case 8:
                str = "SUCCESS_PARTIAL_UPLOAD_RESOURCE";
                break;
            case 9:
                str = "SUCCESS_PARTIAL_AIRLOCK_FILES_DELETED";
                break;
            case 10:
                str = "SUCCESS_PARTIAL_UPLOAD_INVALID_FAILED";
                break;
            case 11:
                str = "SUCCESS_PARTIAL_UPLOAD_PAUSED";
                break;
            case 12:
                str = "SUCCESS_PARTIAL_AUTO_UPLOAD_ENQUEUED";
                break;
            case 13:
                str = "SUCCESS_PARTIAL_AUTO_EXPIRE_DELETED";
                break;
            case 14:
                str = "UPLOAD_BACKGROUND_START";
                break;
            case 15:
                str = "AUTO_BACKGROUND_START";
                break;
            case 16:
                str = "ERROR_AUTHENTICATION_RECOVERABLE";
                break;
            case 17:
                str = "ERROR_AUTHENTICATION_PERMANENT";
                break;
            case 18:
                str = "ERROR_QUERY";
                break;
            case 19:
                str = "ERROR_INSERT";
                break;
            case 20:
                str = "ERROR_UPDATE";
                break;
            case 21:
                str = "ERROR_BAD_STATUS";
                break;
            case 22:
                str = "ERROR_SAVE_ON_DEVICE";
                break;
            case 23:
                str = "ERROR_DELETE_ON_DEVICE";
                break;
            case 24:
                str = "ERROR_ENQUEUE_WORK";
                break;
            case 25:
                str = "ERROR_PARTIAL_QUERY_WORK";
                break;
            case 26:
                str = "ERROR_PARTIAL_UPLOAD_CANCELED";
                break;
            case 27:
                str = "ERROR_PARTIAL_UPLOAD_INVALID_URL";
                break;
            case 28:
                str = "ERROR_PARTIAL_UPLOAD_SERVER_ISSUE";
                break;
            case 29:
                str = "ERROR_UPLOAD_SERVER_FAILURE";
                break;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                str = "ERROR_UPLOAD_DATA_FAILURE";
                break;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                str = "ERROR_UPLOAD_UNSPECIFIED";
                break;
            case 32:
                str = "ERROR_UPLOAD_IGNORABLE";
                break;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                str = "ERROR_AUTO_IGNORABLE";
                break;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                str = "ERROR_UPLOAD_TOO_FREQUENT_ERRORS_PAUSING";
                break;
            default:
                str = "UNRECOGNIZED";
                break;
        }
        pje pjeVar = new pje(str);
        ohh ohhVar = nnaVar.f;
        prl prlVar = nnaVar.a;
        psf.c(prlVar);
        long j = prlVar.a;
        int i = prlVar.b;
        StringBuilder sb = new StringBuilder();
        sb.append(((SimpleDateFormat) psf.c.get()).format(new Date(j * 1000)));
        if (i != 0) {
            sb.append(".");
            long j2 = i;
            if (j2 % 1000000 == 0) {
                str2 = String.format(Locale.ENGLISH, "%1$03d", Long.valueOf(j2 / 1000000));
            } else {
                str2 = j2 % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Long.valueOf(j2 / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(i));
            }
            sb.append(str2);
        }
        sb.append("Z");
        ovgVar.C("%s due to %s\nat %s\nResources: %s\nAnnotachments: %s", pjeVar, ohhVar, sb.toString(), nnaVar.b, nnaVar.c);
    }
}
