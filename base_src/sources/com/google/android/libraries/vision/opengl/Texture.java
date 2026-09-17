package com.google.android.libraries.vision.opengl;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;

/* JADX INFO: loaded from: classes.dex */
public class Texture {
    private boolean generated;
    private int height;
    private int name;
    private int type;
    private int width;

    public Texture(int i, int i2) {
        this(i, i2, 3553);
    }

    public Texture(int i, int i2, int i3) {
        this.name = -1;
        this.type = -1;
        this.width = -1;
        this.height = -1;
        this.generated = false;
        this.name = createTexture(i3);
        this.type = i3;
        this.width = i;
        this.height = i2;
        this.generated = true;
    }

    public Texture(int i, int i2, int i3, int i4) {
        this.generated = false;
        this.name = i4;
        this.type = i3;
        this.width = i;
        this.height = i2;
    }

    public Texture(Bitmap bitmap) {
        this.name = -1;
        this.width = -1;
        this.height = -1;
        this.generated = false;
        this.type = 3553;
        this.width = bitmap.getWidth();
        this.height = bitmap.getHeight();
        int iCreateTexture = createTexture(this.type);
        this.name = iCreateTexture;
        this.generated = true;
        GLES20.glBindTexture(this.type, iCreateTexture);
        GLUtils.texImage2D(this.type, 0, bitmap, 0);
    }

    private static int createTexture(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(i, iArr[0]);
        GLES20.glTexParameteri(i, 10242, 33071);
        GLES20.glTexParameteri(i, 10243, 33071);
        GLES20.glTexParameteri(i, 10240, 9729);
        GLES20.glTexParameteri(i, 10241, 9729);
        return iArr[0];
    }

    public void allocate() {
        GLES20.glTexImage2D(this.type, 0, 6408, this.width, this.height, 0, 6408, 5121, null);
    }

    public void bind() {
        int i = this.name;
        if (i < 0) {
            return;
        }
        GLES20.glBindTexture(this.type, i);
    }

    public void delete() {
        int i = this.name;
        if (i < 0 || !this.generated) {
            return;
        }
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
        this.name = -1;
        this.width = -1;
        this.height = -1;
    }

    public int getHeight() {
        return this.height;
    }

    public int getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public int getWidth() {
        return this.width;
    }

    public void unbind() {
        GLES20.glBindTexture(this.type, 0);
    }
}
