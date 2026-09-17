.class Lcom/hdrindicator/HDRProgress$1;
.super Ljava/lang/Object;
.source "HDRProgress.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hdrindicator/HDRProgress;->updateProgress(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$finalProgress:F


# direct methods
.method constructor <init>(F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput p1, p0, Lcom/hdrindicator/HDRProgress$1;->val$finalProgress:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    invoke-static {}, Lcom/hdrindicator/HDRProgress;->access$000()Lcom/hdrindicator/HDRProgress;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/hdrindicator/HDRProgress;->access$000()Lcom/hdrindicator/HDRProgress;

    move-result-object v0

    iget v1, p0, Lcom/hdrindicator/HDRProgress$1;->val$finalProgress:F

    const/high16 v2, 0x42c80000    # 100.0f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/hdrindicator/HDRProgress;->setProgress(FZ)V

    :cond_0
    return-void
.end method
