package com.google.android.libraries.lens.lenslite.api;

import android.graphics.Bitmap;
import android.media.Image;
import defpackage.obr;
import defpackage.oih;
import defpackage.ojc;

/* JADX INFO: loaded from: classes.dex */
public final class LinkImage {
    private final ojc height;
    private final int linkImageType;
    private final ojc rotation;
    private final ojc width;
    private ojc bitmap = oih.a;
    private ojc image = oih.a;
    private ojc imageProxy = oih.a;

    private LinkImage(ojc ojcVar, ojc ojcVar2, ojc ojcVar3, int i) {
        this.width = ojcVar;
        this.height = ojcVar2;
        this.rotation = ojcVar3;
        this.linkImageType = i;
    }

    public static LinkImage create(Bitmap bitmap, int i) {
        LinkImage linkImage = new LinkImage(ojc.i(Integer.valueOf(bitmap.getWidth())), ojc.i(Integer.valueOf(bitmap.getHeight())), ojc.i(Integer.valueOf(i)), 1);
        linkImage.bitmap = ojc.i(bitmap);
        return linkImage;
    }

    public static LinkImage create(Image image, int i) {
        LinkImage linkImage = new LinkImage(ojc.i(Integer.valueOf(image.getWidth())), ojc.i(Integer.valueOf(image.getHeight())), ojc.i(Integer.valueOf(i)), 2);
        linkImage.image = ojc.i(image);
        return linkImage;
    }

    public static LinkImage create(ImageProxy imageProxy, int i) {
        LinkImage linkImage = new LinkImage(ojc.i(Integer.valueOf(imageProxy.getWidth())), ojc.i(Integer.valueOf(imageProxy.getHeight())), ojc.i(Integer.valueOf(i)), 3);
        linkImage.imageProxy = ojc.i(imageProxy);
        return linkImage;
    }

    public void close() {
        if (this.image.g()) {
            ((Image) this.image.c()).close();
        } else if (this.imageProxy.g()) {
            ((ImageProxy) this.imageProxy.c()).close();
        }
    }

    public ojc getBitmap() {
        return this.bitmap;
    }

    public int getHeight() {
        obr.aQ(this.height.g());
        return ((Integer) this.height.c()).intValue();
    }

    public ojc getImage() {
        return this.image;
    }

    public ojc getImageProxy() {
        return this.imageProxy;
    }

    public int getRotation() {
        obr.aQ(this.height.g());
        return ((Integer) this.rotation.c()).intValue();
    }

    public int getType() {
        return this.linkImageType;
    }

    public int getWidth() {
        obr.aQ(this.width.g());
        return ((Integer) this.width.c()).intValue();
    }
}
