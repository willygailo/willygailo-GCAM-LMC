package defpackage;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes.dex */
public final class fei extends fcr {
    public final int e;
    private final int f;

    public fei() {
        int iA = a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", "precision mediump float;                            \nuniform float uBrightness;                          \nuniform float uAlpha;                               \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  gl_FragColor = texture2D( sTexture, vTexCoord);   \n  gl_FragColor.rgb *= uBrightness * uAlpha;         \n  gl_FragColor.a = gl_FragColor.a * uAlpha;         \n}                                                   \n");
        this.d = iA;
        this.a = h(iA, "aPosition");
        this.b = h(this.d, "aTextureCoord");
        this.c = i(this.d, "uMvpMatrix");
        int i = i(this.d, "uBrightness");
        this.e = i;
        int i2 = i(this.d, "uAlpha");
        this.f = i2;
        c();
        GLES20.glUniform1f(i, 0.5f);
        GLES20.glUniform1f(i2, 0.5f);
    }

    public final void j(float f) {
        GLES20.glUniform1f(this.f, f);
    }
}
