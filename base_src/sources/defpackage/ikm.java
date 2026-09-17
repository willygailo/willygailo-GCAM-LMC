package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ikm {
    public final Context a;
    public final int b;

    public ikm(Context context, ddf ddfVar) {
        this.a = context;
        this.b = true != ddfVar.k(ddl.ay) ? 0 : 2132083558;
    }

    public ikm(Context context, ddf ddfVar, byte[] bArr) {
        this.a = context;
        this.b = true != ddfVar.k(ddl.ay) ? 0 : 2132083558;
    }

    public static final ie e(id idVar) {
        ie ieVarB = idVar.b();
        ieVarB.setCancelable(false);
        ieVarB.setCanceledOnTouchOutside(false);
        return ieVarB;
    }

    private final id f(String str, String str2, DialogInterface.OnClickListener onClickListener) {
        nyj nyjVar = new nyj(this.a, this.b);
        nyjVar.t(str);
        nyjVar.m(str2);
        nyjVar.r(this.a.getResources().getString(R.string.video_storage_full_error_free_up_space), new DialogInterface.OnClickListener() { // from class: ikl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ikm ikmVar = this.a;
                ikmVar.a.startActivity(new Intent("android.os.storage.action.MANAGE_STORAGE"));
            }
        });
        nyjVar.o(this.a.getResources().getString(R.string.dialog_dismiss), onClickListener);
        return nyjVar;
    }

    public final id a(String str, String str2, DialogInterface.OnClickListener onClickListener) {
        nyj nyjVar = new nyj(this.a, this.b);
        nyjVar.t(str);
        nyjVar.m(str2);
        nyjVar.r(this.a.getResources().getString(R.string.dialog_ok), onClickListener);
        return nyjVar;
    }

    public final ie b(DialogInterface.OnClickListener onClickListener) {
        return e(f(this.a.getResources().getString(R.string.device_out_of_storage_title), this.a.getResources().getString(R.string.device_out_of_storage_body), onClickListener));
    }

    public final ie c(DialogInterface.OnClickListener onClickListener) {
        return e(f(this.a.getResources().getString(R.string.device_out_of_storage_title), this.a.getResources().getString(R.string.device_out_of_storage_body), onClickListener));
    }

    public final ie d(DialogInterface.OnClickListener onClickListener) {
        return e(f(this.a.getResources().getString(R.string.video_storage_full_error_recording_dialog_title), this.a.getResources().getString(R.string.device_out_of_storage_body), onClickListener));
    }
}
