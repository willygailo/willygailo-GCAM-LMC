package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.IconCompat;
import com.google.lens.sdk.LensApi;
import defpackage.aks;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(aks aksVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.b = aksVar.a(iconCompat.b, 1);
        byte[] bArr = iconCompat.d;
        if (aksVar.s(2)) {
            int i = aksVar.d.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                bArr = new byte[i];
                aksVar.d.readByteArray(bArr);
            }
        }
        iconCompat.d = bArr;
        iconCompat.e = aksVar.b(iconCompat.e, 3);
        iconCompat.f = aksVar.a(iconCompat.f, 4);
        iconCompat.g = aksVar.a(iconCompat.g, 5);
        iconCompat.h = (ColorStateList) aksVar.b(iconCompat.h, 6);
        iconCompat.j = aksVar.e(iconCompat.j, 7);
        iconCompat.k = aksVar.e(iconCompat.k, 8);
        iconCompat.i = PorterDuff.Mode.valueOf(iconCompat.j);
        switch (iconCompat.b) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                parcelable = iconCompat.e;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.c = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                parcelable = iconCompat.e;
                if (parcelable != null) {
                    iconCompat.c = parcelable;
                } else {
                    byte[] bArr2 = iconCompat.d;
                    iconCompat.c = bArr2;
                    iconCompat.b = 3;
                    iconCompat.f = 0;
                    iconCompat.g = bArr2.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                iconCompat.c = new String(iconCompat.d, Charset.forName("UTF-16"));
                if (iconCompat.b == 2 && iconCompat.k == null) {
                    iconCompat.k = ((String) iconCompat.c).split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.c = iconCompat.d;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, aks aksVar) {
        iconCompat.j = iconCompat.i.name();
        switch (iconCompat.b) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                iconCompat.e = (Parcelable) iconCompat.c;
                break;
            case 1:
            case 5:
                iconCompat.e = (Parcelable) iconCompat.c;
                break;
            case 2:
                iconCompat.d = ((String) iconCompat.c).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.d = (byte[]) iconCompat.c;
                break;
            case 4:
            case 6:
                iconCompat.d = iconCompat.c.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.b;
        if (i != -1) {
            aksVar.h(i, 1);
        }
        byte[] bArr = iconCompat.d;
        if (bArr != null) {
            aksVar.p(2);
            aksVar.d.writeInt(bArr.length);
            aksVar.d.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.e;
        if (parcelable != null) {
            aksVar.i(parcelable, 3);
        }
        int i2 = iconCompat.f;
        if (i2 != 0) {
            aksVar.h(i2, 4);
        }
        int i3 = iconCompat.g;
        if (i3 != 0) {
            aksVar.h(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.h;
        if (colorStateList != null) {
            aksVar.i(colorStateList, 6);
        }
        String str = iconCompat.j;
        if (str != null) {
            aksVar.j(str, 7);
        }
        String str2 = iconCompat.k;
        if (str2 != null) {
            aksVar.j(str2, 8);
        }
    }
}
