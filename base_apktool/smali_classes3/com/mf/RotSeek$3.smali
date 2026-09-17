.class Lcom/mf/RotSeek$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mf/RotSeek;->setProgress(IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mf/RotSeek;


# direct methods
.method constructor <init>(Lcom/mf/RotSeek;)V
    .locals 0

    iput-object p1, p0, Lcom/mf/RotSeek$3;->this$0:Lcom/mf/RotSeek;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/mf/RotSeek$3;->this$0:Lcom/mf/RotSeek;

    invoke-static {v0}, Lcom/mf/RotSeek;->access$1100(Lcom/mf/RotSeek;)Landroid/widget/SeekBar$OnSeekBarChangeListener;

    move-result-object v0

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/mf/RotSeek$3;->this$0:Lcom/mf/RotSeek;

    invoke-static {v2}, Lcom/mf/RotSeek;->access$700(Lcom/mf/RotSeek;)I

    move-result v2

    const/4 v3, 0x1

    invoke-interface {v0, v1, v2, v3}, Landroid/widget/SeekBar$OnSeekBarChangeListener;->onProgressChanged(Landroid/widget/SeekBar;IZ)V

    return-void
.end method
