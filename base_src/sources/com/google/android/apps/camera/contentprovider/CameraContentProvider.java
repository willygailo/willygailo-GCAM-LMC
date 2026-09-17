package com.google.android.apps.camera.contentprovider;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Size;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.bcl;
import defpackage.der;
import defpackage.det;
import defpackage.deu;
import defpackage.dev;
import defpackage.dws;
import defpackage.dwz;
import defpackage.dxa;
import defpackage.dxv;
import defpackage.dxx;
import defpackage.dxy;
import defpackage.ljf;
import defpackage.mip;
import defpackage.oih;
import defpackage.ojc;
import defpackage.oug;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class CameraContentProvider extends ContentProvider {
    private deu a;
    private ProviderInfo b;
    private volatile det c;

    private final det b() {
        det detVarA = this.c;
        if (detVarA == null) {
            synchronized (this) {
                detVarA = this.c;
                if (detVarA == null) {
                    ProviderInfo providerInfo = this.b;
                    providerInfo.getClass();
                    dev devVar = new dev(this, providerInfo);
                    HasCameraContentProviderComponent hasCameraContentProviderComponent = (HasCameraContentProviderComponent) getContext();
                    hasCameraContentProviderComponent.getClass();
                    der derVarCameraContentProviderComponent = hasCameraContentProviderComponent.cameraContentProviderComponent(devVar);
                    derVarCameraContentProviderComponent.b().a();
                    detVarA = derVarCameraContentProviderComponent.a();
                    this.c = detVarA;
                }
            }
        }
        return detVarA;
    }

    protected final void a() {
        deu deuVar = this.a;
        if (deuVar != null) {
            String callingPackage = getCallingPackage();
            callingPackage.getClass();
            if (deuVar.a(callingPackage)) {
                return;
            }
        }
        throw new SecurityException();
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        this.b = providerInfo;
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        a();
        if (!TextUtils.equals("version", str)) {
            return super.call(str, str2, bundle);
        }
        b();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("version", 3);
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 1;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert not allowed on the CameraContentProvider");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Trace.beginSection("GCA_CameraContentProvider#onCreate");
        Context context = getContext();
        context.getClass();
        HasCameraContentProviderComponent hasCameraContentProviderComponent = (HasCameraContentProviderComponent) getContext();
        hasCameraContentProviderComponent.getClass();
        hasCameraContentProviderComponent.initAppComponent();
        this.a = new deu(context, new HashSet(Arrays.asList(context.getResources().getStringArray(R.array.exp_entries))));
        Trace.endSection();
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpenPipeHelper;
        int i;
        a();
        Trace.beginSection("GCA_SpecialTypes#openFile");
        det detVarB = b();
        if (!"r".equals(str)) {
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unsupported mode: ".concat(strValueOf) : new String("Unsupported mode: "));
        }
        switch (detVarB.b.match(uri)) {
            case 3:
                i = R.dimen.photos_oemapi_badge_icon_size;
                parcelFileDescriptorOpenPipeHelper = detVarB.a(uri, i);
                Trace.endSection();
                return parcelFileDescriptorOpenPipeHelper;
            case 4:
                i = R.dimen.photos_oemapi_interact_icon_size;
                parcelFileDescriptorOpenPipeHelper = detVarB.a(uri, i);
                Trace.endSection();
                return parcelFileDescriptorOpenPipeHelper;
            case 5:
                i = R.dimen.photos_oemapi_dialog_icon_size;
                parcelFileDescriptorOpenPipeHelper = detVarB.a(uri, i);
                Trace.endSection();
                return parcelFileDescriptorOpenPipeHelper;
            case 6:
            case 7:
            default:
                String strValueOf2 = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf2).length() + 21);
                sb.append("Unrecognized format: ");
                sb.append(strValueOf2);
                throw new IllegalArgumentException(sb.toString());
            case 8:
                try {
                    final dxv dxvVar = detVarB.e;
                    int i2 = dxv.b + 1;
                    dxv.b = i2;
                    StringBuilder sb2 = new StringBuilder(14);
                    sb2.append("[r");
                    sb2.append(i2);
                    sb2.append("]");
                    String string = sb2.toString();
                    long id = ContentUris.parseId(uri);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 24);
                    sb3.append(string);
                    sb3.append("[m");
                    sb3.append(id);
                    sb3.append("] ");
                    final String string2 = sb3.toString();
                    ojc ojcVarI = oih.a;
                    String queryParameter = uri.getQueryParameter("width");
                    String queryParameter2 = uri.getQueryParameter("height");
                    if (queryParameter != null && queryParameter2 != null) {
                        ojcVarI = ojc.i(new Size(Integer.parseInt(queryParameter), Integer.parseInt(queryParameter2)));
                    }
                    ojc ojcVarA = dxvVar.e.a(id);
                    if (!ojcVarA.g()) {
                        ((oug) ((oug) dxv.a.b()).G((char) 986)).r("%s ProcessingMedia does not exist in ProcessingMediaManager", string2);
                        throw new dxy("ProcessingMedia does not exist in ProcessingMediaManager");
                    }
                    bcl bclVarA = ((dws) ojcVarA.c()).a();
                    if (bclVarA == null) {
                        ((oug) ((oug) dxv.a.b()).G((char) 985)).r("%s DrawableResource is not set in ProcessingMedia", string2);
                        throw new dxy("DrawableResource is not set in ProcessingMedia");
                    }
                    ljf ljfVar = dxvVar.c;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(string2).length() + 45);
                    sb4.append("CAM_ProcessingMedia");
                    sb4.append(string2);
                    sb4.append("BitmapDrawable.getBitmap()");
                    ljfVar.e(sb4.toString());
                    Bitmap bitmapEu = mip.eu((Drawable) bclVarA.c());
                    dxvVar.c.f();
                    if (ojcVarI.g()) {
                        ljf ljfVar2 = dxvVar.c;
                        String strValueOf3 = String.valueOf(ojcVarI.c());
                        StringBuilder sb5 = new StringBuilder(String.valueOf(string2).length() + 50 + String.valueOf(strValueOf3).length());
                        sb5.append("CAM_ProcessingMedia");
                        sb5.append(string2);
                        sb5.append("Bitmap.createScaledBitmap#size=");
                        sb5.append(strValueOf3);
                        ljfVar2.e(sb5.toString());
                        Size size = (Size) ojcVarI.c();
                        int width = bitmapEu.getWidth();
                        int height = bitmapEu.getHeight();
                        int width2 = size.getWidth();
                        int height2 = size.getHeight();
                        if (width > width2 || height > height2) {
                            if (width / height > width2 / height2) {
                                height2 = (height * width2) / width;
                            } else {
                                width2 = (width * height2) / height;
                            }
                            bitmapEu = Bitmap.createScaledBitmap(bitmapEu, width2, height2, false);
                        }
                        dxvVar.c.f();
                    }
                    ljf ljfVar3 = dxvVar.c;
                    StringBuilder sb6 = new StringBuilder(String.valueOf(string2).length() + 45);
                    sb6.append("CAM_ProcessingMedia");
                    sb6.append(string2);
                    sb6.append("BitmapSerializer.serialize");
                    ljfVar3.e(sb6.toString());
                    try {
                        try {
                            dxx dxxVar = dxvVar.d;
                            if (!ojcVarI.g()) {
                                dxxVar = dxvVar.f;
                            }
                            final ByteArrayOutputStream byteArrayOutputStreamA = dxxVar.a(bitmapEu);
                            dxvVar.c.f();
                            parcelFileDescriptorOpenPipeHelper = detVarB.a.openPipeHelper(Uri.EMPTY, "", Bundle.EMPTY, "", new ContentProvider.PipeDataWriter() { // from class: dxu
                                @Override // android.content.ContentProvider.PipeDataWriter
                                public final void writeDataToPipe(ParcelFileDescriptor parcelFileDescriptor, Uri uri2, String str2, Bundle bundle, Object obj) {
                                    ljf ljfVar4;
                                    dxv dxvVar2 = dxvVar;
                                    String str3 = string2;
                                    ByteArrayOutputStream byteArrayOutputStream = byteArrayOutputStreamA;
                                    FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                                    ljf ljfVar5 = dxvVar2.c;
                                    String strValueOf4 = String.valueOf(fileDescriptor);
                                    StringBuilder sb7 = new StringBuilder(String.valueOf(str3).length() + 52 + String.valueOf(strValueOf4).length());
                                    sb7.append("CAM_ProcessingMedia");
                                    sb7.append(str3);
                                    sb7.append("ByteArrayOutputStream.writeTo#fd=");
                                    sb7.append(strValueOf4);
                                    ljfVar5.e(sb7.toString());
                                    try {
                                        try {
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileDescriptor));
                                            try {
                                                byteArrayOutputStream.writeTo(bufferedOutputStream);
                                                bufferedOutputStream.close();
                                                ljfVar4 = dxvVar2.c;
                                            } catch (Throwable th) {
                                                try {
                                                    bufferedOutputStream.close();
                                                } catch (Throwable th2) {
                                                }
                                                throw th;
                                            }
                                        } catch (IOException e) {
                                            ((oug) ((oug) ((oug) dxv.a.b()).h(e)).G(988)).o("Error when writeTo the ParcelFileDescriptor");
                                            ljfVar4 = dxvVar2.c;
                                        }
                                        ljfVar4.f();
                                    } catch (Throwable th3) {
                                        dxvVar2.c.f();
                                        throw th3;
                                    }
                                }
                            });
                            Trace.endSection();
                            return parcelFileDescriptorOpenPipeHelper;
                        } catch (IOException e) {
                            throw new dxy(e);
                        }
                    } catch (Throwable th) {
                        dxvVar.c.f();
                        throw th;
                    }
                } catch (dxy e2) {
                    String strValueOf4 = String.valueOf(uri);
                    String message = e2.getMessage();
                    StringBuilder sb7 = new StringBuilder(String.valueOf(strValueOf4).length() + 35 + String.valueOf(message).length());
                    sb7.append("Cannot load thumbnail for URI= ");
                    sb7.append(strValueOf4);
                    sb7.append(" ex=");
                    sb7.append(message);
                    throw new FileNotFoundException(sb7.toString());
                }
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        dwz dwzVar;
        a();
        Trace.beginSection("GCA_SpecialTypes#query");
        det detVarB = b();
        detVarB.c.e("SpecialTypesQuery");
        dxa dxaVar = detVarB.d;
        switch (dxaVar.d.match(uri)) {
            case 1:
                dwzVar = dxaVar.a;
                break;
            case 2:
                dwzVar = dxaVar.b;
                break;
            case 7:
            case 8:
                dwzVar = dxaVar.c;
                break;
            default:
                String strValueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 18);
                sb.append("Unrecognized uri: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
        }
        Cursor cursorA = dwzVar.a(uri, strArr);
        detVarB.c.f();
        Trace.endSection();
        return cursorA;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Update not allowed on the CameraContentProvider");
    }
}
