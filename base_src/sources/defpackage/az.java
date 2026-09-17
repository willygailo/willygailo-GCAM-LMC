package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class az implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ba(1);
    final int[] a;
    final ArrayList b;
    final int[] c;
    final int[] d;
    final int e;
    final String f;
    final int g;
    final int h;
    final CharSequence i;
    final int j;
    final CharSequence k;
    final ArrayList l;
    final ArrayList m;
    final boolean n;

    public az(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }

    public az(ay ayVar) {
        int size = ayVar.d.size();
        this.a = new int[size * 6];
        if (!ayVar.j) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            dc dcVar = (dc) ayVar.d.get(i);
            int i3 = i2 + 1;
            this.a[i2] = dcVar.a;
            ArrayList arrayList = this.b;
            bu buVar = dcVar.b;
            arrayList.add(buVar != null ? buVar.k : null);
            int[] iArr = this.a;
            int i4 = i3 + 1;
            iArr[i3] = dcVar.c ? 1 : 0;
            int i5 = i4 + 1;
            iArr[i4] = dcVar.d;
            int i6 = i5 + 1;
            iArr[i5] = dcVar.e;
            int i7 = i6 + 1;
            iArr[i6] = dcVar.f;
            iArr[i7] = dcVar.g;
            this.c[i] = dcVar.h.ordinal();
            this.d[i] = dcVar.i.ordinal();
            i++;
            i2 = i7 + 1;
        }
        this.e = ayVar.i;
        this.f = ayVar.l;
        this.g = ayVar.c;
        this.h = ayVar.m;
        this.i = ayVar.n;
        this.j = ayVar.o;
        this.k = ayVar.p;
        this.l = ayVar.q;
        this.m = ayVar.r;
        this.n = ayVar.s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }
}
