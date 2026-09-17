package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes2.dex */
public final class kni extends kno {
    public static final Parcelable.Creator CREATOR = new sk(15);
    final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public kni(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, this.a);
        mip.cH(parcel, 2, this.b, i);
        mip.cA(parcel, 3, this.c);
        mip.cH(parcel, 4, this.d, i);
        mip.cv(parcel, iCt);
    }
}
