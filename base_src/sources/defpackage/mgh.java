package defpackage;

import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.apps.camera.bottombar.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mgh implements mgk, mgg {
    private final String a;
    private final ojc b;
    private final /* synthetic */ int c;
    private final odu d;

    public mgh(odu oduVar, String str, ojc ojcVar, int i, byte[] bArr, byte[] bArr2) {
        this.c = i;
        this.d = oduVar;
        this.a = str;
        this.b = ojcVar;
    }

    public mgh(odu oduVar, ojc ojcVar, String str, int i, byte[] bArr, byte[] bArr2) {
        this.c = i;
        this.d = oduVar;
        this.b = ojcVar;
        this.a = str;
    }

    private static void c(List list, String str, int i, String str2) {
        if (oje.d(str2)) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", str);
        contentValues.put("data1", str2);
        contentValues.put("data2", Integer.valueOf(i));
        list.add(contentValues);
    }

    private static void d(Intent intent, String str, String str2) {
        obr.aR(!oje.d(str), "Must have valid field name");
        if (oje.d(str2)) {
            return;
        }
        intent.putExtra(str, str2);
    }

    @Override // defpackage.mgg
    public final Intent a() {
        String strConcat;
        switch (this.c) {
            case 0:
                if (!this.b.g() || ((mij) this.b.c()).equals(mij.c)) {
                    String strValueOf = String.valueOf(this.a);
                    strConcat = strValueOf.length() != 0 ? "geo:0,0?q=".concat(strValueOf) : new String("geo:0,0?q=");
                } else {
                    mij mijVar = (mij) this.b.c();
                    double d = mijVar.a;
                    double d2 = mijVar.b;
                    StringBuilder sb = new StringBuilder(R.styleable.AppCompatTheme_textAppearanceListItemSmall);
                    sb.append("geo:");
                    sb.append(d);
                    sb.append(",");
                    sb.append(d2);
                    sb.append("?q=");
                    sb.append(d);
                    sb.append(",");
                    sb.append(d2);
                    strConcat = sb.toString();
                }
                return new Intent("android.intent.action.VIEW", Uri.parse(strConcat));
            default:
                if (!this.b.g() || ((mii) this.b.c()).a.isEmpty()) {
                    nmk.a.d(this, "No contact object present in ResultInfo. Defaulting to sending limited information with Intent. This should not happen", new Object[0]);
                    Intent intent = new Intent("android.intent.action.INSERT");
                    intent.setType("vnd.android.cursor.dir/contact");
                    intent.putExtra("name", this.a);
                    return intent;
                }
                Intent intent2 = new Intent("android.intent.action.INSERT");
                intent2.setType("vnd.android.cursor.dir/contact");
                mii miiVar = (mii) this.b.c();
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = miiVar.b.iterator();
                while (it.hasNext()) {
                    c(arrayList, "vnd.android.cursor.item/email_v2", 2, (String) it.next());
                }
                Iterator it2 = miiVar.c.iterator();
                while (it2.hasNext()) {
                    c(arrayList, "vnd.android.cursor.item/phone_v2", 3, (String) it2.next());
                }
                if (!miiVar.e.isEmpty()) {
                    c(arrayList, "vnd.android.cursor.item/website", 5, miiVar.e);
                }
                if (!miiVar.d.isEmpty()) {
                    c(arrayList, "vnd.android.cursor.item/postal-address_v2", 2, miiVar.d);
                }
                if (!miiVar.g.isEmpty()) {
                    c(arrayList, "vnd.android.cursor.item/organization", 1, miiVar.g);
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("data", arrayList);
                }
                d(intent2, "name", ((mii) this.b.c()).a);
                d(intent2, "notes", ((mii) this.b.c()).f);
                return intent2;
        }
    }

    @Override // defpackage.mgk
    public final void b() {
        switch (this.c) {
            case 0:
                this.d.b(a());
                break;
            default:
                this.d.b(a());
                break;
        }
    }
}
