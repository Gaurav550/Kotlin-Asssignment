package com.example.kotlinassignment.singleton;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/example/kotlinassignment/singleton/RetrofitObject;", "", "()V", "BASE_URL", "", "retrofitInstance", "Lretrofit2/Retrofit;", "getRetrofitInstance", "()Lretrofit2/Retrofit;", "setRetrofitInstance", "(Lretrofit2/Retrofit;)V", "getApi", "Lcom/example/kotlinassignment/interfaces/RetrofitServiceInterface;", "kotlin.jvm.PlatformType", "app_debug"})
public final class RetrofitObject {
    @org.jetbrains.annotations.NotNull()
    private static retrofit2.Retrofit retrofitInstance;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://dl.dropboxusercontent.com/";
    public static final com.example.kotlinassignment.singleton.RetrofitObject INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit getRetrofitInstance() {
        return null;
    }
    
    public final void setRetrofitInstance(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit p0) {
    }
    
    public final com.example.kotlinassignment.interfaces.RetrofitServiceInterface getApi() {
        return null;
    }
    
    private RetrofitObject() {
        super();
    }
}