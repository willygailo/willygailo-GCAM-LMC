package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ba;
import defpackage.et;
import defpackage.eu;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ba(6);
    public MediaDescription a;
    private final String b;
    private final CharSequence c;
    private final CharSequence d;
    private final CharSequence e;
    private final Bitmap f;
    private final Uri g;
    private final Bundle h;
    private final Uri i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.b = str;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = charSequence3;
        this.f = bitmap;
        this.g = uri;
        this.h = bundle;
        this.i = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.c) + ", " + ((Object) this.d) + ", " + ((Object) this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescriptionC = this.a;
        if (mediaDescriptionC == null) {
            MediaDescription.Builder builderB = et.b();
            et.n(builderB, this.b);
            et.p(builderB, this.c);
            et.o(builderB, this.d);
            et.j(builderB, this.e);
            et.l(builderB, this.f);
            et.m(builderB, this.g);
            et.k(builderB, this.h);
            eu.b(builderB, this.i);
            mediaDescriptionC = et.c(builderB);
            this.a = mediaDescriptionC;
        }
        mediaDescriptionC.writeToParcel(parcel, i);
    }
}
