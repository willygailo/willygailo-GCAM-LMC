package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class kfx extends kgc {
    final /* synthetic */ Context a;
    final /* synthetic */ GoogleSignInOptions b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfx(kim kimVar, Context context, GoogleSignInOptions googleSignInOptions) {
        super(kimVar);
        this.a = context;
        this.b = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ kiv a(Status status) {
        return new kfs(null, status);
    }

    @Override // defpackage.kji
    protected final /* bridge */ /* synthetic */ void b(khz khzVar) {
        kgi kgiVar = (kgi) ((kfv) khzVar).u();
        kfw kfwVar = new kfw(this);
        GoogleSignInOptions googleSignInOptions = this.b;
        Parcel parcelA = kgiVar.a();
        bmp.e(parcelA, kfwVar);
        bmp.c(parcelA, googleSignInOptions);
        kgiVar.z(R.styleable.AppCompatTheme_switchStyle, parcelA);
    }
}
