.class Lcom/mf/RotSeek$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mf/RotSeek;->handleAutoScroll()V
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

    iput-object p1, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    const/4 v7, 0x1

    const/4 v6, 0x0

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3}, Lcom/mf/RotSeek;->access$000(Lcom/mf/RotSeek;)Z

    move-result v3

    if-nez v3, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3}, Lcom/mf/RotSeek;->access$100(Lcom/mf/RotSeek;)I

    move-result v3

    iget-object v4, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v4}, Lcom/mf/RotSeek;->access$200(Lcom/mf/RotSeek;)I

    move-result v4

    sub-int/2addr v3, v4

    add-int/lit8 v0, v3, -0x1

    mul-int/lit8 v1, v0, -0x1

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3}, Lcom/mf/RotSeek;->access$300(Lcom/mf/RotSeek;)I

    move-result v3

    if-gt v1, v3, :cond_4

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3}, Lcom/mf/RotSeek;->access$400(Lcom/mf/RotSeek;)I

    move-result v3

    if-lt v1, v3, :cond_4

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "scroll pos:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " max:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v5}, Lcom/mf/RotSeek;->access$300(Lcom/mf/RotSeek;)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " min:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v5}, Lcom/mf/RotSeek;->access$400(Lcom/mf/RotSeek;)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/mf/RotSeek;->access$500(Lcom/mf/RotSeek;Ljava/lang/String;)V

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3}, Lcom/mf/RotSeek;->access$200(Lcom/mf/RotSeek;)I

    move-result v3

    if-gez v3, :cond_2

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3}, Lcom/mf/RotSeek;->access$200(Lcom/mf/RotSeek;)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    if-gez v3, :cond_2

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    iget-object v4, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v4}, Lcom/mf/RotSeek;->access$200(Lcom/mf/RotSeek;)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v3, v4}, Lcom/mf/RotSeek;->access$202(Lcom/mf/RotSeek;I)I

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    iget-object v4, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v4}, Lcom/mf/RotSeek;->access$100(Lcom/mf/RotSeek;)I

    move-result v4

    iget-object v5, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v5}, Lcom/mf/RotSeek;->access$200(Lcom/mf/RotSeek;)I

    move-result v5

    sub-int/2addr v4, v5

    invoke-static {v3, v4}, Lcom/mf/RotSeek;->access$102(Lcom/mf/RotSeek;I)I

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3}, Lcom/mf/RotSeek;->access$600(Lcom/mf/RotSeek;)V

    :goto_1
    if-eqz v2, :cond_1

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3}, Lcom/mf/RotSeek;->access$800(Lcom/mf/RotSeek;)V

    :cond_1
    :goto_2
    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3}, Lcom/mf/RotSeek;->access$1000(Lcom/mf/RotSeek;)V

    goto/16 :goto_0

    :cond_2
    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3}, Lcom/mf/RotSeek;->access$200(Lcom/mf/RotSeek;)I

    move-result v3

    if-lez v3, :cond_3

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3}, Lcom/mf/RotSeek;->access$200(Lcom/mf/RotSeek;)I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-lez v3, :cond_3

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    iget-object v4, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v4}, Lcom/mf/RotSeek;->access$200(Lcom/mf/RotSeek;)I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-static {v3, v4}, Lcom/mf/RotSeek;->access$202(Lcom/mf/RotSeek;I)I

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    iget-object v4, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v4}, Lcom/mf/RotSeek;->access$100(Lcom/mf/RotSeek;)I

    move-result v4

    iget-object v5, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v5}, Lcom/mf/RotSeek;->access$200(Lcom/mf/RotSeek;)I

    move-result v5

    sub-int/2addr v4, v5

    invoke-static {v3, v4}, Lcom/mf/RotSeek;->access$102(Lcom/mf/RotSeek;I)I

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3}, Lcom/mf/RotSeek;->access$600(Lcom/mf/RotSeek;)V

    goto :goto_1

    :cond_3
    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3}, Lcom/mf/RotSeek;->access$600(Lcom/mf/RotSeek;)V

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3, v6}, Lcom/mf/RotSeek;->access$202(Lcom/mf/RotSeek;I)I

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    iget-object v4, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v4}, Lcom/mf/RotSeek;->access$700(Lcom/mf/RotSeek;)I

    move-result v4

    invoke-virtual {v3, v4, v7}, Lcom/mf/RotSeek;->setProgress(IZ)V

    const/4 v2, 0x0

    goto :goto_1

    :cond_4
    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3, v6}, Lcom/mf/RotSeek;->access$002(Lcom/mf/RotSeek;Z)Z

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3, v6}, Lcom/mf/RotSeek;->access$202(Lcom/mf/RotSeek;I)I

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3}, Lcom/mf/RotSeek;->access$300(Lcom/mf/RotSeek;)I

    move-result v3

    if-le v1, v3, :cond_5

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    iget-object v4, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v4}, Lcom/mf/RotSeek;->access$900(Lcom/mf/RotSeek;)[Ljava/lang/String;

    move-result-object v4

    array-length v4, v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v3, v4, v7}, Lcom/mf/RotSeek;->setProgress(IZ)V

    :goto_3
    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "scroll pos:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " max:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v5}, Lcom/mf/RotSeek;->access$300(Lcom/mf/RotSeek;)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " min:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v5}, Lcom/mf/RotSeek;->access$400(Lcom/mf/RotSeek;)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/mf/RotSeek;->access$500(Lcom/mf/RotSeek;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_5
    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3}, Lcom/mf/RotSeek;->access$400(Lcom/mf/RotSeek;)I

    move-result v3

    if-ge v1, v3, :cond_6

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-virtual {v3, v6, v7}, Lcom/mf/RotSeek;->setProgress(IZ)V

    goto :goto_3

    :cond_6
    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3}, Lcom/mf/RotSeek;->access$600(Lcom/mf/RotSeek;)V

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3}, Lcom/mf/RotSeek;->access$700(Lcom/mf/RotSeek;)I

    move-result v3

    iget-object v4, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v4}, Lcom/mf/RotSeek;->access$900(Lcom/mf/RotSeek;)[Ljava/lang/String;

    move-result-object v4

    array-length v4, v4

    add-int/lit8 v4, v4, -0x1

    if-le v3, v4, :cond_7

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    iget-object v4, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v4}, Lcom/mf/RotSeek;->access$900(Lcom/mf/RotSeek;)[Ljava/lang/String;

    move-result-object v4

    array-length v4, v4

    add-int/lit8 v4, v4, -0x1

    invoke-static {v3, v4}, Lcom/mf/RotSeek;->access$702(Lcom/mf/RotSeek;I)I

    :cond_7
    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3}, Lcom/mf/RotSeek;->access$700(Lcom/mf/RotSeek;)I

    move-result v3

    if-gez v3, :cond_8

    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v3, v6}, Lcom/mf/RotSeek;->access$702(Lcom/mf/RotSeek;I)I

    :cond_8
    iget-object v3, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    iget-object v4, p0, Lcom/mf/RotSeek$1;->this$0:Lcom/mf/RotSeek;

    invoke-static {v4}, Lcom/mf/RotSeek;->access$700(Lcom/mf/RotSeek;)I

    move-result v4

    invoke-virtual {v3, v4, v7}, Lcom/mf/RotSeek;->setProgress(IZ)V

    goto/16 :goto_3
.end method
