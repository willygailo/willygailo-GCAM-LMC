package defpackage;

import android.content.ContentProvider;
import android.content.Context;
import android.content.UriMatcher;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.GoogleCameraEngR18F1.R;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class det {
    public final ContentProvider a;
    public final UriMatcher b;
    public final ljf c;
    public final dxa d;
    public final dxv e;
    private final Context f;
    private final khx g;

    public det(ContentProvider contentProvider, Context context, dxa dxaVar, khx khxVar, dxv dxvVar, UriMatcher uriMatcher, ljf ljfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = contentProvider;
        this.f = context;
        this.d = dxaVar;
        this.g = khxVar;
        this.e = dxvVar;
        this.b = uriMatcher;
        this.c = ljfVar;
    }

    public final ParcelFileDescriptor a(Uri uri, int i) throws Throwable {
        Bitmap bitmapCreateBitmap;
        ParcelFileDescriptor parcelFileDescriptor;
        int i2 = Integer.parseInt(uri.getPathSegments().get(1));
        khx khxVar = this.g;
        int dimensionPixelSize = this.f.getResources().getDimensionPixelSize(i);
        BufferedOutputStream bufferedOutputStream = null;
        Drawable drawable = khxVar.a.getResources().getDrawable(i2, null);
        if (drawable == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("resource is not found for ");
            sb.append(i2);
            throw new FileNotFoundException(sb.toString());
        }
        if (drawable instanceof BitmapDrawable) {
            bitmapCreateBitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        }
        bitmapCreateBitmap.getClass();
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, dimensionPixelSize, dimensionPixelSize, false);
        if (i == R.dimen.photos_oemapi_dialog_icon_size) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight(), bitmapCreateScaledBitmap.getConfig());
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            Paint paint = new Paint();
            paint.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
            canvas2.drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, paint);
            bitmapCreateScaledBitmap = bitmapCreateBitmap2;
        }
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        try {
            ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[0];
            parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[1];
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
                try {
                    bitmapCreateScaledBitmap.compress(compressFormat, 100, bufferedOutputStream2);
                    bufferedOutputStream2.close();
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException e) {
                    }
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException e2) {
                        }
                    }
                    return parcelFileDescriptor2;
                } catch (IOException e3) {
                    e = e3;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e4) {
                            e = e4;
                        }
                    }
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException e5) {
                            e = e5;
                        }
                    }
                    String message = e.getMessage();
                    if (message != null) {
                        throw new FileNotFoundException(message);
                    }
                    throw new FileNotFoundException();
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e6) {
                        }
                    }
                    if (parcelFileDescriptor == null) {
                        throw th;
                    }
                    try {
                        parcelFileDescriptor.close();
                        throw th;
                    } catch (IOException e7) {
                        throw th;
                    }
                }
            } catch (IOException e8) {
                e = e8;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e9) {
            e = e9;
            parcelFileDescriptor = null;
        } catch (Throwable th3) {
            th = th3;
            parcelFileDescriptor = null;
        }
    }
}
