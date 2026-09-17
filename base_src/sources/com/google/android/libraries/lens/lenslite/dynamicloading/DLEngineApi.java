package com.google.android.libraries.lens.lenslite.dynamicloading;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.media.Image;
import android.os.Handler;
import com.google.android.libraries.lens.lenslite.api.DownloadListener;
import com.google.android.libraries.lens.lenslite.api.DownloadParam;
import com.google.android.libraries.lens.lenslite.api.ImageProxy;
import com.google.android.libraries.lens.lenslite.api.KeyguardDismisser;
import com.google.android.libraries.lens.lenslite.api.LinkEventListener;
import com.google.android.libraries.lens.lenslite.api.LinkHighResBitmapRequester;
import com.google.android.libraries.lens.lenslite.api.LoggingListener;
import com.google.android.libraries.lens.lenslite.api.ModelInfoListener;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface DLEngineApi {
    void cancel();

    long getHostApiVersion();

    void getModelInfo(DownloadParam downloadParam, ModelInfoListener modelInfoListener);

    void invalidate();

    long onNewBitmap(Bitmap bitmap, int i);

    long onNewImage(Image image, int i);

    long onNewImage(ImageProxy imageProxy, int i);

    void restart();

    void setActivity(Activity activity);

    void setAlertDialogBuilder(AlertDialog.Builder builder);

    void setEventListener(LinkEventListener linkEventListener, Handler handler);

    void setKeyguardDismisser(KeyguardDismisser keyguardDismisser);

    void setLinkHighResBitmapRequester(LinkHighResBitmapRequester linkHighResBitmapRequester);

    void setLoggingListener(LoggingListener loggingListener);

    void setPointOfInterest(PointF pointF);

    void setResultListener(DLLinkResultListener dLLinkResultListener);

    void shutdown();

    void start();

    void startDownload(List list, DownloadListener downloadListener);

    String startLinkLogging(String str, int i);

    void stop();

    void stopLinkLogging();
}
