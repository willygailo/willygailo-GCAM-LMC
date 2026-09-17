package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class abl {
    public static final xe a = new xe(16);
    public static final ExecutorService b;
    public static final Object c;
    public static final xf d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new abp(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new xf();
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0257  */
    /* JADX WARN: Code duplicated, block: B:134:0x0262  */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Throwable] */
    public static abk a(String str, Context context, abf abfVar, int i) throws Throwable {
        Cursor cursor;
        abm[] abmVarArr;
        boolean z;
        int i2;
        int length;
        Typeface typeface;
        Typeface typefaceBuild;
        List list;
        Typeface typeface2 = (Typeface) a.a(str);
        if (typeface2 != null) {
            return new abk(typeface2);
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            context.getResources();
            String str2 = abfVar.a;
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str2, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str2);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(abfVar.b)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str2 + ", but package was not " + abfVar.b);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, abe.a);
            List list2 = abfVar.d;
            int i3 = 0;
            loop1: while (true) {
                if (i3 >= list2.size()) {
                    providerInfoResolveContentProvider = null;
                    break;
                }
                ArrayList arrayList2 = new ArrayList((Collection) list2.get(i3));
                Collections.sort(arrayList2, abe.a);
                if (arrayList.size() == arrayList2.size()) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList.size()) {
                            break loop1;
                        }
                        list = list2;
                        if (!Arrays.equals((byte[]) arrayList.get(i4), (byte[]) arrayList2.get(i4))) {
                            break;
                        }
                        i4++;
                        list2 = list;
                    }
                } else {
                    list = list2;
                }
                i3++;
                list2 = list;
            }
            if (providerInfoResolveContentProvider == null) {
                z = true;
                abmVarArr = null;
            } else {
                String str3 = providerInfoResolveContentProvider.authority;
                ArrayList arrayList3 = new ArrayList();
                Uri uriBuild = new Uri.Builder().scheme("content").authority(str3).build();
                Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str3).appendPath("file").build();
                try {
                    Cursor cursorQuery = context.getContentResolver().query(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{abfVar.c}, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.getCount() > 0) {
                                int columnIndex = cursorQuery.getColumnIndex("result_code");
                                arrayList3 = new ArrayList();
                                int columnIndex2 = cursorQuery.getColumnIndex("_id");
                                int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                                int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                                int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                                int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                                while (cursorQuery.moveToNext()) {
                                    arrayList3.add(new abm(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0));
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    abmVarArr = (abm[]) arrayList3.toArray(new abm[0]);
                    z = false;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                }
            }
            if (z) {
                i2 = -2;
            } else if (abmVarArr == null || (length = abmVarArr.length) == 0) {
                i2 = 1;
            } else {
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        i2 = 0;
                        break;
                    }
                    int i6 = abmVarArr[i5].e;
                    if (i6 != 0) {
                        if (i6 >= 0) {
                            i2 = i6;
                            break;
                        }
                        i2 = -3;
                        break;
                    }
                    i5++;
                }
            }
            if (i2 != 0) {
                return new abk(i2);
            }
            xe xeVar = en.a;
            ContentResolver contentResolver = context.getContentResolver();
            try {
                FontFamily.Builder builder = null;
                for (abm abmVar : abmVarArr) {
                    try {
                        typeface = null;
                        try {
                            try {
                                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(abmVar.a, "r", null);
                                if (parcelFileDescriptorOpenFileDescriptor == null) {
                                    continue;
                                } else {
                                    try {
                                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(abmVar.c).setSlant(abmVar.d ? 1 : 0).setTtcIndex(abmVar.b).build();
                                        if (builder == null) {
                                            builder = new FontFamily.Builder(fontBuild);
                                        } else {
                                            builder.addFont(fontBuild);
                                        }
                                        try {
                                            parcelFileDescriptorOpenFileDescriptor.close();
                                        } catch (IOException e) {
                                        }
                                    } catch (Throwable th3) {
                                        try {
                                            parcelFileDescriptorOpenFileDescriptor.close();
                                        } catch (Throwable th4) {
                                        }
                                        throw th3;
                                    }
                                }
                            } catch (Exception e2) {
                                typefaceBuild = typeface;
                                if (typefaceBuild != null) {
                                    return new abk(-3);
                                }
                                a.b(str, typefaceBuild);
                                return new abk(typefaceBuild);
                            }
                        } catch (IOException e3) {
                        }
                    } catch (IOException e4) {
                    }
                }
                typefaceBuild = builder == null ? null : new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(1 != (i & 1) ? 400 : 700, (i & 2) != 0 ? 1 : 0)).build();
            } catch (Exception e5) {
                typeface = null;
            }
            if (typefaceBuild != null) {
                return new abk(-3);
            }
            a.b(str, typefaceBuild);
            return new abk(typefaceBuild);
        } catch (PackageManager.NameNotFoundException e6) {
            return new abk(-1);
        }
    }

    public static String b(abf abfVar, int i) {
        return abfVar.e + "-" + i;
    }
}
