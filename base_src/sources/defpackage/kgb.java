package defpackage;

import android.os.Parcel;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class kgb extends kgc {
    public kgb(kim kimVar) {
        super(kimVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ kiv a(Status status) {
        return status;
    }

    @Override // defpackage.kji
    protected final /* bridge */ /* synthetic */ void b(khz khzVar) {
        kfv kfvVar = (kfv) khzVar;
        kgi kgiVar = (kgi) kfvVar.u();
        kga kgaVar = new kga(this);
        GoogleSignInOptions googleSignInOptions = kfvVar.a;
        Parcel parcelA = kgiVar.a();
        bmp.e(parcelA, kgaVar);
        bmp.c(parcelA, googleSignInOptions);
        kgiVar.z(R.styleable.AppCompatTheme_textAppearanceListItem, parcelA);
    }
}
