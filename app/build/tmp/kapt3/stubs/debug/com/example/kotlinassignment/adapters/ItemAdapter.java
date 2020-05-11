package com.example.kotlinassignment.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0016\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/kotlinassignment/adapters/ItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/kotlinassignment/adapters/ItemAdapter$MyHolder;", "rows", "", "Lcom/example/kotlinassignment/models/Row;", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setImage", "url", "", "view", "Landroid/widget/ImageView;", "MyHolder", "app_debug"})
public final class ItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.kotlinassignment.adapters.ItemAdapter.MyHolder> {
    private final java.util.List<com.example.kotlinassignment.models.Row> rows = null;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.kotlinassignment.adapters.ItemAdapter.MyHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.kotlinassignment.adapters.ItemAdapter.MyHolder holder, int position) {
    }
    
    public final void setImage(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView view) {
    }
    
    public ItemAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kotlinassignment.models.Row> rows, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/example/kotlinassignment/adapters/ItemAdapter$MyHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/kotlinassignment/adapters/ItemAdapter;Landroid/view/View;)V", "image", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getImage", "()Landroid/widget/ImageView;", "image$delegate", "Lkotlin/Lazy;", "tv_description", "Landroid/widget/TextView;", "getTv_description", "()Landroid/widget/TextView;", "tv_title", "getTv_title", "getView", "()Landroid/view/View;", "app_debug"})
    public final class MyHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tv_title = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tv_description = null;
        private final kotlin.Lazy image$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View view = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTv_title() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTv_description() {
            return null;
        }
        
        public final android.widget.ImageView getImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
        
        public MyHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}