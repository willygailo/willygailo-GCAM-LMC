package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
final class bgg implements ImageDecoder.OnHeaderDecodedListener {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ azd d;
    final /* synthetic */ bhb e;
    final /* synthetic */ azu f;
    final /* synthetic */ bgh g;

    public bgg(bgh bghVar, int i, int i2, boolean z, azd azdVar, bhb bhbVar, azu azuVar) {
        this.g = bghVar;
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = azdVar;
        this.e = bhbVar;
        this.f = azuVar;
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.g.a.b(this.a, this.b, this.c, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == azd.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new bgf());
        Size size = imageInfo.getSize();
        int width = this.a;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.b;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fA = this.e.a(size.getWidth(), size.getHeight(), width, height);
        imageDecoder.setTargetSize(Math.round(size.getWidth() * fA), Math.round(fA * size.getHeight()));
        azu azuVar = this.f;
        if (azuVar != null) {
            imageDecoder.setTargetColorSpace(ColorSpace.get((azuVar == azu.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
