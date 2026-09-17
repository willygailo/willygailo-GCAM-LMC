package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CaptureResult;
import com.google.android.apps.camera.debugui.DebugCanvasView;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class djy extends mip {
    private final dju a;

    public djy(dju djuVar, ddf ddfVar) {
        this.a = djuVar;
        ddi ddiVar = ddl.a;
        ddfVar.b();
        ddfVar.b();
        ddfVar.b();
    }

    @Override // defpackage.mip
    public final void b(lzv lzvVar) {
        dju djuVar = this.a;
        Rect rect = (Rect) lzvVar.d(CaptureResult.SCALER_CROP_REGION);
        rect.getClass();
        DebugCanvasView debugCanvasView = djuVar.b;
        if (debugCanvasView == null) {
            ((oug) ((oug) dju.a.c()).G((char) 792)).o("UI view not yet initialized");
        } else {
            ljm ljmVar = debugCanvasView.d;
            Rect rect2 = ljmVar.b;
            if (rect2 != null && rect.equals(rect2)) {
                Matrix matrix = ljmVar.a;
            }
            String.valueOf(String.valueOf(rect)).length();
            ljmVar.b = rect;
            if (debugCanvasView.d()) {
                debugCanvasView.d.a().mapRect(debugCanvasView.c, new RectF(rect));
            }
        }
        if (kdd.h != null && lzvVar.d(kdd.h) != null) {
            try {
                byte[] bArr = (byte[]) lzvVar.d(kdd.h);
                if (bArr == null) {
                    this.a.a();
                    return;
                }
            } catch (IOException e) {
            }
        }
        this.a.a();
    }
}
