package defpackage;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes.dex */
public final class fej extends fcr {
    private int e;

    public fej() {
        this.e = 0;
        int iA = a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", "precision highp float;                            \nuniform float uAlphaFactor;                         \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  vec4 texcolor;                                    \n  texcolor = texture2D( sTexture, vTexCoord );      \n  texcolor.a = uAlphaFactor;                        \n  gl_FragColor = texcolor;                          \n}                                                   \n");
        this.d = iA;
        this.a = h(iA, "aPosition");
        this.b = h(this.d, "aTextureCoord");
        this.c = i(this.d, "uMvpMatrix");
        this.e = i(this.d, "uAlphaFactor");
        c();
        GLES20.glUniform1f(this.e, 0.9f);
    }

    public final void j(float f) {
        GLES20.glUniform1f(this.e, f);
    }
}
